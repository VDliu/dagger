package demo.com.reiniot.av.daggerone;

import dagger.Component;

//定义Component
@Component(modules={ActivityModule.class})
interface ActivityComponent {
    void inject(Container container);
}
