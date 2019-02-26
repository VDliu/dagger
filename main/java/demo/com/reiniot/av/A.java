package demo.com.reiniot.av;

import android.util.Log;

import javax.inject.Inject;

public class A {
    private static final String TAG = "A";

    @Inject
    B b;

    public A(){
        Log.e(TAG, "Craete A: " );
    }

    public void init(){
        DaggerMyComponent.builder().myModule(new MyModule("")).clientModule(new ClientModule("")).build().inject(this);
    }
}
