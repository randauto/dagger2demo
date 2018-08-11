package sieudaochichcode.com.dagger2demo.database;

import android.content.Context;
import android.content.res.Resources;

import javax.inject.Inject;
import javax.inject.Singleton;

import sieudaochichcode.com.dagger2demo.annotations.ApplicationContext;
import sieudaochichcode.com.dagger2demo.database.DbHelper;
import sieudaochichcode.com.dagger2demo.model.User;
import sieudaochichcode.com.dagger2demo.utils.SharedPrefsHelper;

/**
 * Created by tuanlq on 8/11/18
 */
@Singleton
public class DataManager {
    private Context mContext;
    private DbHelper mDbHelper;
    private SharedPrefsHelper mSharedPrefsHelper;

    @Inject
    public DataManager(@ApplicationContext Context context, DbHelper dbHelper, SharedPrefsHelper sharedPrefsHelper) {
        this.mContext = context;
        this.mDbHelper = dbHelper;
        this.mSharedPrefsHelper = sharedPrefsHelper;
    }

    public void saveAccessToken(String accessToken) {
        mSharedPrefsHelper.put(SharedPrefsHelper.PREF_KEY_ACCESS_TOKEN, accessToken);
    }

    public String getAccessToken() {
        return mSharedPrefsHelper.get(SharedPrefsHelper.PREF_KEY_ACCESS_TOKEN, null);
    }

    public Long createUser(User user) throws Exception {
        return mDbHelper.insertUser(user);
    }

    public User getUser(Long userId) throws Resources.NotFoundException, NullPointerException {
        return mDbHelper.getUser(userId);
    }
}
