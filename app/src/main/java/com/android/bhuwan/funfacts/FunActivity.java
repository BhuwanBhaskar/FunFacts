package com.android.bhuwan.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunActivity extends AppCompatActivity {
    public final static String TAG = FunActivity.class.getSimpleName();
    FunBook mFunBook = new FunBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);
        final TextView showFun = (TextView) findViewById(R.id.fun_facts);
        final RelativeLayout bas = (RelativeLayout)findViewById(R.id.base);
        final Button funButton = (Button) findViewById(R.id.show_facts);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = mFunBook.getColor();
                bas.setBackgroundColor(color);
                funButton.setTextColor(color);
                showFun.setText(mFunBook.getFacts());

            }
        };
        funButton.setOnClickListener(listener);
        Toast.makeText(this,"Everytime same thing !!!",Toast.LENGTH_LONG).show();
        Log.d(TAG,"Activity Created");
    }

}