package org.impactfin.mobilebanking.ui.activities;

import android.os.Bundle;
import org.impactfin.mobilebanking.R;
import org.impactfin.mobilebanking.ui.activities.base.BaseActivity;
import org.impactfin.mobilebanking.ui.fragments.SavingAccountsDetailFragment;
import org.impactfin.mobilebanking.utils.Constants;

/**
 * Created by Rajan Maurya on 05/03/17.
 */

public class SavingsAccountContainerActivity extends BaseActivity {

    private long savingsId;
    public static boolean transferSuccess = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        savingsId = getIntent().getExtras().getLong(Constants.SAVINGS_ID);

        replaceFragment(SavingAccountsDetailFragment.newInstance(savingsId), false, R.id.container);
        showBackButton();
    }

    @Override
    public void onBackPressed() {
        int count = getSupportFragmentManager().getBackStackEntryCount();
        if (count == 2 && transferSuccess == true) {
            getSupportFragmentManager().popBackStack();
            getSupportFragmentManager().popBackStack();
            transferSuccess = false;
        } else {
            super.onBackPressed();
        }
    }
}
