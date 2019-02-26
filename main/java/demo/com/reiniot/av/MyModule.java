package demo.com.reiniot.av;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module(includes = {ClientModule.class})
public class MyModule {
    private static final String TAG = "MyModule";

    public MyModule(String name){
        Log.e(TAG, "MyModule: name =" + name );
    }

    @Provides
    public B provideB(C c){
        return new B(c);
    }

    @Provides
    public C provideC(D d){
        return new C(d);
    }

}
