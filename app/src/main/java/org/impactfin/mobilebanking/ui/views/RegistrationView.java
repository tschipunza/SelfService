package org.impactfin.mobilebanking.ui.views;

import org.impactfin.mobilebanking.ui.views.base.MVPView;

/**
 * Created by dilpreet on 31/7/17.
 */

public interface RegistrationView extends MVPView {

    void showRegisteredSuccessfully();

    void showError(String msg);
}
