package badebaba.tsc;

import com.firebase.client.Firebase;

/**
 * Created by badebaba on 8/11/2016.
 */

public class MyApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}