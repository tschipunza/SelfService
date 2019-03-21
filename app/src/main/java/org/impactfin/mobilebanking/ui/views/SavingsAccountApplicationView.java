package org.impactfin.mobilebanking.ui.views;

/*
 * Created by saksham on 30/June/2018
 */

import org.impactfin.mobilebanking.models.templates.savings.SavingsAccountTemplate;
import org.impactfin.mobilebanking.ui.views.base.MVPView;

public interface SavingsAccountApplicationView extends MVPView {

    void showUserInterfaceSavingAccountApplication(SavingsAccountTemplate template);
    void showSavingsAccountApplicationSuccessfully();
    void showUserInterfaceSavingAccountUpdate(SavingsAccountTemplate template);
    void showSavingsAccountUpdateSuccessfully();
    void showError(String error);
    void showMessage(String showMessage);
}
