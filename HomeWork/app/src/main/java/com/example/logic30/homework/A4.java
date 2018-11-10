package com.example.logic30.homework;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class A4 extends Activity {
    private View.OnClickListener btnBack1_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
    public class DwinnerGen {
        public String GetDwinner() {

            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i < 25; i++) {
                list.add(i);
            }
            int[] nums = new int[12];
            for (int i = 0; i < 12; i++) {

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4);
        TextView lblDwinner = findViewById(R.id.lblDwinner);
        lblDwinner.setText((new A4.DwinnerGen()).GetDwinner());
        InitialComponent();
    }
    private void InitialComponent() {
        btnBack3 = findViewById(R.id.btnBack3);
        btnBack3.setOnClickListener(btnBack1_click);
    }
    Button btnBack3;
}
