package com.example.makeitrain;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private TextView txtMoney;
    private TextView txtAlertMessage;

    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMoney = findViewById(R.id.tvMoney);
        txtAlertMessage = findViewById(R.id.tvRichMessage);
        txtAlertMessage.setVisibility(View.INVISIBLE);
    }

    public void showTag(View view) {
        Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_SHORT).show();
    }

    public void makeItRain(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        txtMoney.setText(String.valueOf(numberFormat.format(moneyCounter)));
        switch (moneyCounter) {
            case 10000:
                txtAlertMessage.setVisibility(View.VISIBLE);
                txtMoney.setTextColor(Color.RED);
                break;
            case 20000:
                txtAlertMessage.setVisibility(View.VISIBLE);
                txtMoney.setTextColor(Color.YELLOW);
                break;
            case 30000:
                txtAlertMessage.setVisibility(View.VISIBLE);
                txtMoney.setTextColor(Color.GREEN);
                break;
            default:
                break;
        }
        Log.d("MIR", "makeItRain: Tapped" + moneyCounter);
    }
}
