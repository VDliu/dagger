package demo.com.reiniot.av.compnentdependence;


import dagger.Component;
import demo.com.reiniot.av.daggerone.ActivityModule;

//定义ActivityComponent
@Component(dependencies=ApplicationComponent.class, modules=ActivityModule.class)
interface ActivityComponent {
  void inject(ComponentContainer componentContainer);
}