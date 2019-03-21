package org.impactfin.mobilebanking.models.accounts

import org.impactfin.mobilebanking.models.accounts.savings.SavingAccount

import java.util.ArrayList

/**
 * @author Vishwajeet
 * @since 13/08/16
 */
data class SavingAccountsListResponse (
    var savingsAccounts: List<SavingAccount> = ArrayList()
)
