package demo.com.reiniot.av.compnentdependence;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

public class ComponentContainer {
    private static final String TAG = "ComponentContainer";
    @Inject
    @ContextLife("Application")
    Context mApplicationContext;

    ApplicationComponent applicationComponent;

    public ComponentContainer(ApplicationComponent applicationComponent){
        this.applicationComponent = applicationComponent;
    }

    public void init(){
        DaggerActivityComponent.builder().applicationComponent(applicationComponent).build().inject(this);
        Log.e(TAG, "init: mApplicationContext = " + mApplicationContext );
    }
}
