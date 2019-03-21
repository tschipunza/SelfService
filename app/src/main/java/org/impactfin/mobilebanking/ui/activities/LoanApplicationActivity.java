package org.impactfin.mobilebanking.ui.activities;

import android.os.Bundle;

import org.impactfin.mobilebanking.R;
import org.impactfin.mobilebanking.ui.activities.base.BaseActivity;
import org.impactfin.mobilebanking.ui.enums.LoanState;
import org.impactfin.mobilebanking.ui.fragments.LoanApplicationFragment;

public class LoanApplicationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_application);
        if (savedInstanceState == null) {
            replaceFragment(LoanApplicationFragment.newInstance(LoanState.CREATE), false,
                    R.id.container);
        }
        showBackButton();
    }
}
