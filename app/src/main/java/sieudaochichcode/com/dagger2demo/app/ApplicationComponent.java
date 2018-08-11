package sieudaochichcode.com.dagger2demo.app;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import sieudaochichcode.com.dagger2demo.annotations.ApplicationContext;
import sieudaochichcode.com.dagger2demo.database.DbHelper;
import sieudaochichcode.com.dagger2demo.database.DataManager;
import sieudaochichcode.com.dagger2demo.utils.SharedPrefsHelper;

/**
 * Created by tuanlq on 8/11/18
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(Dagger2DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getSharedPrefsHelper();

    DbHelper getDbHelper();
}
