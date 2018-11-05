package com.example.logic30.homework;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class A6 extends Activity {


    private View.OnClickListener btn1_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String t =lblNumber.getText().toString();
            if(t.equals("輸入發票後3碼"))
                lblNumber.setText("1");

            else
                lblNumber.setText(lblNumber.getText().toString()+"1");
        }
    };
    private View.OnClickListener btn2_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String t =lblNumber.getText().toString();
            if(t.equals("輸入發票後3碼"))
                lblNumber.setText("2");
            else if(t.equals("72"))
                lblNumber.setText("16228722中獎:722");
            else if(t.equals("46"))
                lblNumber.setText("注意特獎:462");
            else if(t.equals("97"))
                lblNumber.setText("注意特別獎:972");


            else
                lblNumber.setText(lblNumber.getText().toString()+"2");
        }
    };
    private View.OnClickListener btn3_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String t =lblNumber.getText().toString();
            if(t.equals("輸入發票後3碼"))
                lblNumber.setText("3");
            else if(t.equals("16"))
                lblNumber.setText("中獎:163");
            else if(t.equals("98"))
                lblNumber.setText("中獎:983");
            else if(t.equals("00"))
                lblNumber.setText("91903003中獎:003");

            else
                lblNumber.setText(lblNumber.getText().toString()+"3");
        }
    };
    private View.OnClickListener btn4_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String t =lblNumber.getText().toString();
            if(t.equals("輸入發票後3碼"))
                lblNumber.setText("4");
            else if(t.equals("81"))
                lblNumber.setText("中獎:814");
            else
                lblNumber.setText(lblNumber.getText().toString()+"4");
        }
    };
    private View.OnClickListener btn5_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String t =lblNumber.getText().toString();
            if(t.equals("輸入發票後3碼"))
                lblNumber.setText("5");
            else
                lblNumber.setText(lblNumber.getText().toString()+"5");
        }
    };
    private View.OnClickListener btn6_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String t =lblNumber.getText().toString();
            if(t.equals("輸入發票後3碼"))
                lblNumber.setText("6");
            else
                lblNumber.setText(lblNumber.getText().toString()+"6");
        }
    };
    private View.OnClickListener btn7_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String t =lblNumber.getText().toString();
            if(t.equals("輸入發票後3碼"))
                lblNumber.setText("7");
            else
                lblNumber.setText(lblNumber.getText().toString()+"7");
        }
    };
    private View.OnClickListener btn8_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String t =lblNumber.getText().toString();
            if(t.equals("輸入發票後3碼"))
                lblNumber.setText("8");
            else if(t.equals("59"))
                lblNumber.setText("03270598中獎:598");
            else
                lblNumber.setText(lblNumber.getText().toString()+"8");
        }
    };
    private View.OnClickListener btn9_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String t =lblNumber.getText().toString();
            if(t.equals("輸入發票後3碼"))
                lblNumber.setText("9");
            else
                lblNumber.setText(lblNumber.getText().toString()+"9");
        }
    };
    private View.OnClickListener btn0_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String t =lblNumber.getText().toString();
            if(t.equals("輸入發票後3碼"))
                lblNumber.setText("0");
            else
                lblNumber.setText(lblNumber.getText().toString()+"0");
        }
    };
    private View.OnClickListener btnClear_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lblNumber.setText("");
        }
    };
    private View.OnClickListener btnBack4_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a6);
        //TextView lblnums = findViewById(R.id.lblNumber);
        //lblnums.setText((new A6.InvoiceGen()).GetInvoice());
        InitialComponent();
    }
    private void InitialComponent() {
        lblNumber = findViewById(R.id.lblNumber);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(btn1_click);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(btn2_click);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(btn3_click);
        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(btn4_click);
        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(btn5_click);
        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(btn6_click);
        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(btn7_click);
        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(btn8_click);
        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(btn9_click);
        btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(btn0_click);
        btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(btnClear_click);
        btnBack4 = findViewById(R.id.btnBack4);
        btnBack4.setOnClickListener(btnBack4_click);

    }
    TextView lblNumber;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnClear;
    Button btnBack4;

}
