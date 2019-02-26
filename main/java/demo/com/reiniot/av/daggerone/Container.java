package demo.com.reiniot.av.daggerone;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class Container {
    private static final String TAG = "Container";

    @Named("Activity")
    @Inject
    Context mContext;

    @Named("Application")
    @Inject
    Context mAppContext;

    Context ctx;
    Activity activity;

    public Container(Activity activity, Context application){
        ctx = application;
        this.activity = activity;
        Log.e(TAG, "init: activity_context =" + activity + ",ApplicationContext =" +ctx);
    }
    public void init(){
     DaggerActivityComponent.builder().activityModule(new ActivityModule(activity,ctx)).build().inject(this);
     Log.e(TAG, "injectd : activity_context =" + mContext + ",ApplicationContext =" +ctx);
    }
}
