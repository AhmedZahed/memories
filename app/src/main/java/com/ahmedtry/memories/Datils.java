package com.ahmedtry.memories;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Datils extends AppCompatActivity {

    private TextView mTextViewDatil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datils);

        mTextViewDatil = findViewById(R.id.text_view_detail);
        String detils = getIntent().getStringExtra("send");
        if(detils != null ){
            mTextViewDatil.setText(detils);
        }


    }
    public void onClickReturn(View view){
        finish();
    }//دالة الرجوع
}