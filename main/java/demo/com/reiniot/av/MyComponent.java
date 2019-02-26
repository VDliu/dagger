package demo.com.reiniot.av;

import dagger.Component;

@Component(modules = {MyModule.class})
public interface MyComponent {
    void inject(A a);
}
