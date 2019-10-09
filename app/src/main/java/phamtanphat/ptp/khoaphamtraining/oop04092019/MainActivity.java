package phamtanphat.ptp.khoaphamtraining.oop04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnListenerValue{

    Integer mValue = 0;
    Button mBtnCong,mBtnTru,mReset;
    OnListenerValue onListenerValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnCong = findViewById(R.id.buttonCong);
        mBtnTru = findViewById(R.id.buttonTru);
        mReset = findViewById(R.id.buttonReset);

        onListenerValue = MainActivity.this;


        mBtnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              onListenerValue.onListenInteger(1);
            }
        });

    }

    @Override
    public void onListenInteger(Integer integer) {
        Log.d("BBB",integer + "");
    }
}
