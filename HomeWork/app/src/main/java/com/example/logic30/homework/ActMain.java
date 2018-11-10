package com.example.logic30.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActMain extends AppCompatActivity {

    private View.OnClickListener btnLotto_click=new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(ActMain.this,A2.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener btnPower_click=new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(ActMain.this,A3.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btnDwinner_click=new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(ActMain.this,A4.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btnInvoice_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(ActMain.this,A6.class);
            startActivity(intent);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        InitialComponent();
    }
    private void InitialComponent() {
        lblText=findViewById(R.id.lblText);
        btnLotto=findViewById(R.id.btnLotto);
        btnLotto.setOnClickListener(btnLotto_click);
        btnPower=findViewById(R.id.btnPower);
        btnPower.setOnClickListener(btnPower_click);
        btnDwinner=findViewById(R.id.btnDwinner);
        btnDwinner.setOnClickListener(btnDwinner_click);
        btnInvoice=findViewById(R.id.btnInvoice);
        btnInvoice.setOnClickListener(btnInvoice_click);

    }
    TextView lblText;
    Button btnLotto;
    Button btnPower;
    Button btnDwinner;
    Button btnInvoice;
}
