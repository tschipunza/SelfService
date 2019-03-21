package org.impactfin.mobilebanking.ui.views;

import org.impactfin.mobilebanking.models.accounts.loan.LoanWithAssociations;
import org.impactfin.mobilebanking.ui.views.base.MVPView;

/**
 * Created by dilpreet on 4/3/17.
 */

public interface LoanAccountsTransactionView extends MVPView {

    void showUserInterface();

    void showLoanTransactions(LoanWithAssociations loanWithAssociations);

    void showEmptyTransactions(LoanWithAssociations loanWithAssociations);

    void showErrorFetchingLoanAccountsDetail(String message);
}
