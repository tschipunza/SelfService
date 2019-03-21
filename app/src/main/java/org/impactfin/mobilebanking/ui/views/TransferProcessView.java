package org.impactfin.mobilebanking.ui.views;

import org.impactfin.mobilebanking.ui.views.base.MVPView;

/**
 * Created by dilpreet on 1/7/17.
 */

public interface TransferProcessView extends MVPView {

    void showTransferredSuccessfully();

    void showError(String msg);
}
