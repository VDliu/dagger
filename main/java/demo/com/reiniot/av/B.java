package demo.com.reiniot.av;

import android.util.Log;

public class B {
    private static final String TAG = "B";

    public B(){
        Log.e(TAG, "crate B: ");
    }

    public B(C c){
        Log.e(TAG, "create B with C" );
    }
}
