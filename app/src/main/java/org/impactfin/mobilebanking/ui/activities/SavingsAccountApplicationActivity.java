package org.impactfin.mobilebanking.ui.activities;

/*
 * Created by saksham on 30/June/2018
 */

import android.os.Bundle;

import org.impactfin.mobilebanking.R;
import org.impactfin.mobilebanking.ui.activities.base.BaseActivity;
import org.impactfin.mobilebanking.ui.enums.SavingsAccountState;
import org.impactfin.mobilebanking.ui.fragments.SavingsAccountApplicationFragment;

public class SavingsAccountApplicationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savings_account_application);
        setToolbarTitle(getString(R.string.apply_savings_account));
        showBackButton();
        replaceFragment(SavingsAccountApplicationFragment.newInstance(SavingsAccountState.CREATE,
                null), false, R.id.container);
    }
}
