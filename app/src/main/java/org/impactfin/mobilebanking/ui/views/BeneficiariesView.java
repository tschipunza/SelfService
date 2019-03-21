package org.impactfin.mobilebanking.ui.views;

import org.impactfin.mobilebanking.models.beneficiary.Beneficiary;
import org.impactfin.mobilebanking.ui.views.base.MVPView;

import java.util.List;

/**
 * Created by dilpreet on 14/6/17.
 */

public interface BeneficiariesView extends MVPView {

    void showUserInterface();

    void showError(String msg);

    void showBeneficiaryList(List<Beneficiary> beneficiaryList);
}
