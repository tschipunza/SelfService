package org.impactfin.mobilebanking.ui.views;

import org.impactfin.mobilebanking.ui.views.base.MVPView;

/**
 * Created by dilpreet on 16/6/17.
 */

public interface BeneficiaryDetailView extends MVPView {

    void showUserInterface();

    void showBeneficiaryDeletedSuccessfully();

    void showError(String msg);
}
