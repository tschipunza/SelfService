package org.impactfin.mobilebanking.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import org.impactfin.mobilebanking.R;
import org.impactfin.mobilebanking.models.accounts.loan.LoanWithAssociations;
import org.impactfin.mobilebanking.models.accounts.loan.LoanWithdraw;
import org.impactfin.mobilebanking.presenters.LoanAccountWithdrawPresenter;
import org.impactfin.mobilebanking.ui.activities.base.BaseActivity;
import org.impactfin.mobilebanking.ui.fragments.base.BaseFragment;
import org.impactfin.mobilebanking.ui.views.LoanAccountWithdrawView;
import org.impactfin.mobilebanking.utils.Constants;
import org.impactfin.mobilebanking.utils.DateHelper;
import org.impactfin.mobilebanking.utils.Toaster;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by dilpreet on 7/6/17.
 */

public class LoanAccountWithdrawFragment extends BaseFragment implements LoanAccountWithdrawView {

    @BindView(R.id.tv_client_name)
    TextView tvClientName;

    @BindView(R.id.tv_account_number)
    TextView tvAccountNumber;

    @BindView(R.id.et_withdraw_reason)
    EditText etWithdrawReason;

    @Inject
    LoanAccountWithdrawPresenter loanAccountWithdrawPresenter;

    View rootView;
    private LoanWithAssociations loanWithAssociations;


    public static LoanAccountWithdrawFragment
            newInstance(LoanWithAssociations loanWithAssociations) {
        LoanAccountWithdrawFragment fragment = new LoanAccountWithdrawFragment();
        Bundle args = new Bundle();
        args.putParcelable(Constants.LOAN_ACCOUNT, loanWithAssociations);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BaseActivity) getActivity()).getActivityComponent().inject(this);
        if (getArguments() != null) {
            loanWithAssociations = getArguments().getParcelable(Constants.LOAN_ACCOUNT);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_loan_withdraw, container, false);
        setToolbarTitle(getString(R.string.withdraw_loan));

        ButterKnife.bind(this, rootView);
        showUserInterface();

        loanAccountWithdrawPresenter.attachView(this);

        return rootView;
    }

    /**
     * Sets Basic Information about that Loan Application
     */
    private void showUserInterface() {
        tvClientName.setText(loanWithAssociations.getClientName());
        tvAccountNumber.setText(loanWithAssociations.getAccountNo());
    }

    /**
     * Sends a request to server to withdraw that Loan Account
     */
    @OnClick(R.id.btn_withdraw_loan)
    public void onLoanWithdraw() {
        LoanWithdraw loanWithdraw = new LoanWithdraw();
        loanWithdraw.setNote(etWithdrawReason.getText().toString());
        loanWithdraw.setWithdrawnOnDate(DateHelper
                .getDateAsStringFromLong(System.currentTimeMillis()));
        loanAccountWithdrawPresenter.withdrawLoanAccount(loanWithAssociations.getId(),
                loanWithdraw);
    }

    /**
     * Receives A confirmation after successfull withdrawing of Loan Application.
     */
    @Override
    public void showLoanAccountWithdrawSuccess() {
        Toaster.show(rootView, R.string.loan_application_withdrawn_successfully);
        getActivity().getSupportFragmentManager().popBackStack();
    }

    /**
     * Shows an error in {@link android.support.design.widget.Snackbar} if any error occurs during
     * withdrawing of Loan
     *
     * @param message Error Message displayed
     */
    @Override
    public void showLoanAccountWithdrawError(String message) {
        Toaster.show(rootView, message);
    }

    @Override
    public void showProgress() {
        showProgressBar();
    }

    @Override
    public void hideProgress() {
        hideProgressBar();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        hideProgress();
        loanAccountWithdrawPresenter.detachView();
    }
}
