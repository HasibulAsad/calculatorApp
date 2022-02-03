package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText display;
    Button deletebtn, zerobtn, onebtn, twobtn, threebtn, fourbtn, fivebtn, sixbtn, sevenbtn, eightbtn, ninebtn, clearbtn, plusbtn, minusbtn, multiplybtn, dividebtn, dotbtn, bracketfirst, bracketsecond, equalbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.idedtdisplay);


    }

    public void updateTEXT(String strToAdd) {
        String oldText = display.getText().toString();
        int cursorpos = display.getSelectionStart();
        String leftstr = oldText.substring(0, cursorpos);
        String rightStr = oldText.substring(cursorpos);

        display.setText(String.format("%s%s%s", leftstr, strToAdd, rightStr));
        display.setSelection(cursorpos+ strToAdd.length());
        display.setShowSoftInputOnFocus(false);
    }

    public void zeroBTNpush(View view) {
        updateTEXT("0");
    }

    public void dotBtn(View view) {
        updateTEXT(".");
    }

    public void equalbtn(View view) {

    }

    public void onebtn(View view) {
        updateTEXT("1");
    }

    public void btntwo(View view) {
        updateTEXT("2");
    }

    public void btnthree(View view) {
        updateTEXT("3");
    }

    public void btndelete(View view) {

    }

    public void btndivide(View view) {
        updateTEXT("/");
    }

    public void btnbracketsecond(View view) {
        updateTEXT(")");
    }

    public void btnbracketfirst(View view) {
        updateTEXT("(");
    }

    public void btnclear(View view) {
        updateTEXT("");
    }

    public void btnmultiply(View view) {
        updateTEXT("*");
    }

    public void btnnine(View view) {
        updateTEXT("9");
    }

    public void btneight(View view) {
        updateTEXT("8");
    }

    public void btnseven(View view) {
        updateTEXT("7");
    }

    public void btnminus(View view) {
        updateTEXT("-");
    }

    public void btnsix(View view) {
        updateTEXT("6");
    }

    public void btnfive(View view) {
        updateTEXT("5");
    }

    public void fourbtn(View view) {
        updateTEXT("4");
    }

    public void plusbtn(View view) {
        updateTEXT("+");
    }
}