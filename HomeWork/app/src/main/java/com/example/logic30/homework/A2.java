package com.example.logic30.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
public class A2 extends Activity {
    public class CLottoGen {
        public String GetLottos() {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i < 50; i++) {
                list.add(i);
            }
            int[] nums = new int[6];
            for (int i = 0; i < 6; i++) {
                int index = (int) (Math.random() * list.size());
                nums[i] = list.get(index);
                list.remove(index);
            }
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length - 1; j++) {
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
            String s = "";
            for (int i : nums) {
                s += String.valueOf(i) + "  ";
            }
            return s;
        }
    }
    private View.OnClickListener btnBack1_click=new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            finish();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2);
        TextView lblLotto1 = findViewById(R.id.lblLotto1);
        lblLotto1.setText((new CLottoGen()).GetLottos());
        InitialComponent();
    }
    private void InitialComponent() {

        btnBack1 = findViewById(R.id.btnBack1);
        btnBack1.setOnClickListener(btnBack1_click);
    }
    Button btnBack1;
}
