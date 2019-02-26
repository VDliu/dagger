package demo.com.reiniot.av.compnentdependence;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import demo.com.reiniot.av.App;

@Module
public class ApplicationModule {
    private App mApplication;

    public ApplicationModule(App application) {
        mApplication = application;
    }

    //此處的ContextLife注解功能和Named注解一樣
    @Provides
    @ContextLife("Application")
    public Context provideApplicationContext() {
        return mApplication.getApplicationContext();
    }

}
