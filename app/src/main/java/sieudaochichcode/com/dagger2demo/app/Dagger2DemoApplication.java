package sieudaochichcode.com.dagger2demo.app;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import sieudaochichcode.com.dagger2demo.database.DataManager;

/**
 * Created by tuanlq on 8/11/18
 */
public class Dagger2DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static Dagger2DemoApplication get(Context context) {
        return (Dagger2DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
