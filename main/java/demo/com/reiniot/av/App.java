package demo.com.reiniot.av;

import android.app.Application;

import demo.com.reiniot.av.compnentdependence.ApplicationComponent;
import demo.com.reiniot.av.compnentdependence.ApplicationModule;
import demo.com.reiniot.av.compnentdependence.DaggerApplicationComponent;

public class App extends Application {
    ApplicationComponent applicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
