package org.impactfin.mobilebanking.injection.component;

import org.impactfin.mobilebanking.injection.PerActivity;
import org.impactfin.mobilebanking.injection.module.ActivityModule;
import org.impactfin.mobilebanking.ui.activities.HomeActivity;
import org.impactfin.mobilebanking.ui.activities.SplashActivity;
import org.impactfin.mobilebanking.ui.fragments.AccountOverviewFragment;
import org.impactfin.mobilebanking.ui.fragments.AddGuarantorFragment;
import org.impactfin.mobilebanking.ui.fragments.BeneficiaryAddOptionsFragment;
import org.impactfin.mobilebanking.ui.activities.PassCodeActivity;
import org.impactfin.mobilebanking.ui.fragments.BeneficiaryApplicationFragment;
import org.impactfin.mobilebanking.ui.fragments.BeneficiaryDetailFragment;
import org.impactfin.mobilebanking.ui.fragments.BeneficiaryListFragment;
import org.impactfin.mobilebanking.ui.fragments.GuarantorDetailFragment;
import org.impactfin.mobilebanking.ui.fragments.GuarantorListFragment;
import org.impactfin.mobilebanking.ui.fragments.HelpFragment;
import org.impactfin.mobilebanking.ui.fragments.HomeOldFragment;
import org.impactfin.mobilebanking.ui.fragments.LoanAccountTransactionFragment;
import org.impactfin.mobilebanking.ui.fragments.LoanAccountWithdrawFragment;
import org.impactfin.mobilebanking.ui.fragments.LoanAccountsDetailFragment;
import org.impactfin.mobilebanking.ui.activities.LoginActivity;
import org.impactfin.mobilebanking.ui.fragments.LoanApplicationFragment;
import org.impactfin.mobilebanking.ui.fragments.NotificationFragment;
import org.impactfin.mobilebanking.ui.fragments.QrCodeImportFragment;
import org.impactfin.mobilebanking.ui.fragments.RegistrationFragment;
import org.impactfin.mobilebanking.ui.fragments.RegistrationVerificationFragment;
import org.impactfin.mobilebanking.ui.fragments.SavingAccountsDetailFragment;
import org.impactfin.mobilebanking.ui.fragments.AccountsFragment;
import org.impactfin.mobilebanking.ui.fragments.HomeFragment;
import org.impactfin.mobilebanking.ui.fragments.ClientAccountsFragment;
import org.impactfin.mobilebanking.ui.fragments.ClientChargeFragment;
import org.impactfin.mobilebanking.ui.fragments.LoanAccountSummaryFragment;
import org.impactfin.mobilebanking.ui.fragments.LoanRepaymentScheduleFragment;
import org.impactfin.mobilebanking.ui.fragments.RecentTransactionsFragment;
import org.impactfin.mobilebanking.ui.fragments.SavingAccountsTransactionFragment;
import org.impactfin.mobilebanking.ui.fragments.SavingsAccountApplicationFragment;
import org.impactfin.mobilebanking.ui.fragments.SavingsAccountWithdrawFragment;
import org.impactfin.mobilebanking.ui.fragments.SavingsMakeTransferFragment;
import org.impactfin.mobilebanking.ui.fragments.ThirdPartyTransferFragment;
import org.impactfin.mobilebanking.ui.fragments.TransferProcessFragment;
import org.impactfin.mobilebanking.ui.fragments.UpdatePasswordFragment;
import org.impactfin.mobilebanking.ui.fragments.UserProfileFragment;

import dagger.Component;

/**
 * @author ishan
 * @since 08/07/16
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(LoginActivity loginActivity);

    void inject(HomeActivity homeActivity);

    void inject(PassCodeActivity passCodeActivity);

    void inject(HomeFragment homeFragment);

    void inject(ClientAccountsFragment clientAccountsFragment);

    void inject(RecentTransactionsFragment recentTransactionsFragment);

    void inject(ClientChargeFragment clientChargeFragment);

    void inject(SavingAccountsDetailFragment savingAccountsDetailActivity);

    void inject(LoanAccountsDetailFragment loanAccountsDetailActivity);

    void inject(AccountsFragment accountsFragment);

    void inject(LoanAccountSummaryFragment loanAccountSummaryFragment);

    void inject(LoanAccountTransactionFragment loanAccountTransactionFragment);

    void inject(LoanRepaymentScheduleFragment loanRepaymentScheduleFragment);

    void inject(LoanApplicationFragment loanApplicationFragment);

    void inject(LoanAccountWithdrawFragment loanAccountWithdrawFragment);

    void inject(SavingAccountsTransactionFragment savingAccountsTransactionFragment);

    void inject(SavingsMakeTransferFragment savingsMakeTransferFragment);

    void inject(BeneficiaryAddOptionsFragment beneficiaryAddOptionsFragment);

    void inject(BeneficiaryListFragment beneficiaryListFragment);

    void inject(BeneficiaryApplicationFragment beneficiaryApplicationFragment);

    void inject(BeneficiaryDetailFragment beneficiaryDetailFragment);

    void inject(ThirdPartyTransferFragment thirdPartyTransferFragment);

    void inject(TransferProcessFragment transferProcessFragment);

    void inject(UserProfileFragment userProfileFragment);

    void inject(HelpFragment helpFragment);

    void inject(RegistrationFragment registrationFragment);

    void inject(RegistrationVerificationFragment registrationVerificationFragment);

    void inject(AccountOverviewFragment accountOverviewFragment);

    void inject(HomeOldFragment homeOldFragment);

    void inject(NotificationFragment notificationFragment);
    
    void inject(QrCodeImportFragment qrCodeImportFragment);

    void inject(SplashActivity splashActivity);

    void inject(AddGuarantorFragment addGuarantorFragment);

    void inject(GuarantorListFragment guarantorListFragment);

    void inject(GuarantorDetailFragment guarantorDetailFragment);

    void inject(UpdatePasswordFragment updatePasswordFragment);

    void inject(SavingsAccountApplicationFragment savingsAccountApplicationFragment);

    void inject(SavingsAccountWithdrawFragment savingsAccountWithdrawFragment);
}
