package demo.com.reiniot.av;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class ClientModule {
    private static final String TAG = "ClientModule";

    public ClientModule(String name){
        Log.e(TAG, "ClientModule: create" + name  );
    }
    @Provides
    public D provideD(){
        return new D();
    }
}
