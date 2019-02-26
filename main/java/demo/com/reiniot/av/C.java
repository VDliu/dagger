package demo.com.reiniot.av;

import android.util.Log;

import javax.inject.Inject;

public class C {
    private static final String TAG = "C";

    @Inject
    public C(D d){
        Log.e(TAG, "craete C: " );
    }
}
