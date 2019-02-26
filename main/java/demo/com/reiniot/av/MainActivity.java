package demo.com.reiniot.av;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import demo.com.reiniot.av.compnentdependence.ComponentContainer;
import demo.com.reiniot.av.daggerone.Container;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         new A().init();
    }

    @Override
    protected void onResume() {
        super.onResume();
        new Container(this,this.getApplicationContext()).init();
        new ComponentContainer(((App)getApplication()).getApplicationComponent()).init();
    }
}
