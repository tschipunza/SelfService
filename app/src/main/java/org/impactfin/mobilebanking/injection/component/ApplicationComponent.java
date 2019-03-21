package org.impactfin.mobilebanking.injection.component;

import android.app.Application;
import android.content.Context;

import org.impactfin.mobilebanking.api.BaseApiManager;
import org.impactfin.mobilebanking.api.DataManager;
import org.impactfin.mobilebanking.api.local.DatabaseHelper;
import org.impactfin.mobilebanking.api.local.PreferencesHelper;
import org.impactfin.mobilebanking.injection.ApplicationContext;
import org.impactfin.mobilebanking.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author ishan
 * @since 08/07/16
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();

    Application application();
    DataManager dataManager();
    PreferencesHelper prefManager();
    BaseApiManager baseApiManager();
    DatabaseHelper databaseHelper();

}
