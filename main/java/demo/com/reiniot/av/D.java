package demo.com.reiniot.av;

import android.util.Log;

import javax.inject.Inject;

public class D {
    private static final String TAG = "D";

    @Inject
    public D(){
        Log.e(TAG, "craete D: " );
    }
}
