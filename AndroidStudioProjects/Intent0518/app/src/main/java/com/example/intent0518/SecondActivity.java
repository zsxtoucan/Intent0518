package com.example.intent0518;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        calBMI();
    }
    private void calBMI(){
        double height,weight,bmi;
        Bundle bundle = this.getIntent().getExtras();

        if (bundle != null){
            height=Double.parseDouble(bundle.getString("HEIGHT"));
            weight=Double.parseDouble(bundle.getString("WEIGHT"));
            height=height/100.00;
            bmi = weight/(height*height);
            TextView result = findViewById(R.id.textView3);
            result.setText("BMI = " + Double.toString(bmi));
        }
    }
    public void btnClose(View View) {
        finish();
    }
}
