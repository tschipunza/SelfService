package org.impactfin.mobilebanking.presenters;

import android.content.Context;

import org.impactfin.mobilebanking.R;
import org.impactfin.mobilebanking.api.DataManager;
import org.impactfin.mobilebanking.injection.ApplicationContext;
import org.impactfin.mobilebanking.models.accounts.savings.SavingsWithAssociations;
import org.impactfin.mobilebanking.presenters.base.BasePresenter;
import org.impactfin.mobilebanking.ui.views.SavingAccountsDetailView;
import org.impactfin.mobilebanking.utils.Constants;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;


/**
 * @author Vishwajeet
 * @since 18/8/16.
 */

public class SavingAccountsDetailPresenter extends BasePresenter<SavingAccountsDetailView> {

    private final DataManager dataManager;
    private CompositeDisposable compositeDisposables;

    /**
     * Initialises the SavingAccountsDetailPresenter by automatically injecting an instance of
     * {@link DataManager} and {@link Context}.
     *
     * @param dataManager DataManager class that provides access to the data
     *                    via the API.
     * @param context     Context of the view attached to the presenter. In this case
     *                    it is that of an {@link android.support.v7.app.AppCompatActivity}
     */
    @Inject
    public SavingAccountsDetailPresenter(DataManager dataManager,
            @ApplicationContext Context context) {
        super(context);
        this.dataManager = dataManager;
        compositeDisposables = new CompositeDisposable();
    }

    @Override
    public void attachView(SavingAccountsDetailView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
        compositeDisposables.clear();
    }

    /**
     * Load details of a particular saving account from the server and notify the view
     * to display it. Notify the view, in case there is any error in fetching
     * the details from server.
     * @param accountId Id of Savings Account
     */
    public void loadSavingsWithAssociations(long accountId) {
        checkViewAttached();
        getMvpView().showProgress();
        compositeDisposables.add(dataManager.getSavingsWithAssociations(accountId,
                                                                        Constants.TRANSACTIONS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<SavingsWithAssociations>() {
                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        getMvpView().hideProgress();
                        getMvpView().showErrorFetchingSavingAccountsDetail(
                                context.getString(R.string.error_saving_account_details_loading));
                    }

                    @Override
                    public void onNext(SavingsWithAssociations savingAccount) {
                        getMvpView().hideProgress();
                        getMvpView().showSavingAccountsDetail(savingAccount);
                    }
                })
        );
    }
}
