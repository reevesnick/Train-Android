package train.com.train;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Neegbeah Reeves on 1/14/2015.
 */
public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();


        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "FvBWAnIuCio1UlmScHhEEhjy07PSeEe4ZyNyXr9T", "oSkfTEiEsn43rd7bFn3V3j8x5eAURU5Sqh1gB9kc");

    }
}
