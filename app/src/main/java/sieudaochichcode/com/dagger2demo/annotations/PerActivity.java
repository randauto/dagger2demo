package sieudaochichcode.com.dagger2demo.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by tuanlq on 8/11/18
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
