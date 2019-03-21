package org.impactfin.mobilebanking.models

import org.impactfin.mobilebanking.models.beneficiary.Beneficiary
import org.impactfin.mobilebanking.models.templates.account.AccountOptionsTemplate

/**
 * Created by dilpreet on 23/6/17.
 */

data class AccountOptionAndBeneficiary(
        val accountOptionsTemplate: AccountOptionsTemplate,
        val beneficiaryList: List<Beneficiary>)
