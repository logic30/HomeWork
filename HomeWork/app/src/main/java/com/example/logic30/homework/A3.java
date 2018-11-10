package com.example.logic30.homework;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
public class A3 extends Activity {
    private View.OnClickListener btnBack2_click =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
    public class PowerGen {
        public String GetPower() {

            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i < 39; i++) {
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
    public class PowerGen2 {
        public String GetPower2() {
            int i = 0;

            i = (int)(Math.random()*8)+1;
            String s="";
            s=String.valueOf(i);
            return s;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a3);
        TextView lblnums = findViewById(R.id.lblnums);
        lblnums.setText((new A3.PowerGen()).GetPower());
        TextView lblnums2 = findViewById(R.id.lblnums2);
        lblnums2.setText((new A3.PowerGen2()).GetPower2());

        InitialComponent();
    }
    private void InitialComponent() {
        btnBack2 = findViewById(R.id.btnBack2);
        btnBack2.setOnClickListener(btnBack2_click);
    }
    Button btnBack2;
}
