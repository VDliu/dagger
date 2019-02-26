package demo.com.reiniot.av.compnentdependence;


import android.content.Context;

import dagger.Component;

//定义ApplicationComponent
@Component(modules={ApplicationModule.class})
public interface ApplicationComponent{
    @ContextLife("Application")
    Context getApplication();  // 对外提供ContextLife类型为"Application"的Context
}



