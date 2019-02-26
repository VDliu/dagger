package demo.com.reiniot.av.daggerone;


import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule{
    private Context mContext    ;
    private Context mAppContext;

    public ActivityModule(Context context,Context applicationContext) {
        mContext = context;
        this.mAppContext = applicationContext;
    }


    @Named("Activity")
    @Provides
    public Context provideContext(){
        return mContext;
    }
    @Named("Application")
    @Provides
    public Context provideApplicationContext (){
        return mAppContext;
    }
}

