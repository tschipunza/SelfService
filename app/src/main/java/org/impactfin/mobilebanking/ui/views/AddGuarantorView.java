package org.impactfin.mobilebanking.ui.views;

/*
 * Created by saksham on 23/July/2018
 */

import org.impactfin.mobilebanking.models.guarantor.GuarantorApplicationPayload;
import org.impactfin.mobilebanking.models.guarantor.GuarantorTemplatePayload;
import org.impactfin.mobilebanking.ui.views.base.MVPView;

public interface AddGuarantorView extends MVPView {

    void updatedSuccessfully(String message);
    void submittedSuccessfully(String message, GuarantorApplicationPayload payload);
    void showGuarantorUpdation(GuarantorTemplatePayload template);
    void showGuarantorApplication(GuarantorTemplatePayload template);
    void showError(String message);

}
