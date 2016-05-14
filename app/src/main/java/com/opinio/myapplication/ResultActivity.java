package com.opinio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by cbqh46 on 5/14/2016.
 */
public class ResultActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coupon_screen);
        Button applyCoupon = (Button) findViewById(R.id.apply_coupon);
        applyCoupon.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if(R.id.apply_coupon == v.getId()){
            Toast.makeText(ResultActivity.this, "Applying coupon",
                    Toast.LENGTH_SHORT).show();
            finish();
        }

    }
}
