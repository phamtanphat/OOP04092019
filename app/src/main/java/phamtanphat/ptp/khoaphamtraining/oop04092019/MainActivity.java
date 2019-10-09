package phamtanphat.ptp.khoaphamtraining.oop04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    Integer mValue = 0;
    Button mBtnCong,mBtnTru,mReset;
    TextView mTxtKetqua;
    OnListenerValue onListenerValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnCong = findViewById(R.id.buttonCong);
        mBtnTru = findViewById(R.id.buttonTru);
        mReset = findViewById(R.id.buttonReset);
        mTxtKetqua = findViewById(R.id.textviewKetqua);


        mBtnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              onListenerValue.onListenInteger(1);
            }
        });
        mBtnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onListenerValue.onListenInteger(-1);
            }
        });
        mReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onListenerValue.onListenInteger(0);
            }
        });
        getValue(new OnListenerValue() {
            @Override
            public void onListenInteger(Integer integer) {
                Log.d("BBB",integer + " ");
            }
        });

    }
   public void getValue(OnListenerValue onListenerValue){
        this.onListenerValue = onListenerValue;
   }
}
