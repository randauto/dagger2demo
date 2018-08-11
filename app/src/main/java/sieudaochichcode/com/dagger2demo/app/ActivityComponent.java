package sieudaochichcode.com.dagger2demo.app;

import dagger.Component;
import sieudaochichcode.com.dagger2demo.MainActivity;
import sieudaochichcode.com.dagger2demo.annotations.PerActivity;

/**
 * Created by tuanlq on 8/11/18
 */
@PerActivity
@Component(modules = ActivityModule.class, dependencies = ApplicationComponent.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
