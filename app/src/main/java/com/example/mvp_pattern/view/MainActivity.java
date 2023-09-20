package com.example.mvp_pattern.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mvp_pattern.R;
import com.example.mvp_pattern.model.Americano;
import com.example.mvp_pattern.model.CafeLatte;
import com.example.mvp_pattern.model.TotalPrice;
import com.example.mvp_pattern.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView{

    TextView americano_count, total_result, latte_count;
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Americano americano = new Americano();
//        CafeLatte cafeLatte = new CafeLatte();
//        TotalPrice totalPrice = new TotalPrice();
//
        americano_count = findViewById(R.id.americano_count);
        latte_count = findViewById(R.id.latte_count);
        total_result = findViewById(R.id.total_result);

        presenter = new MainPresenter(this);

        findViewById(R.id.up_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                presenter.upAmericano();

            }
        });

        findViewById(R.id.down_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                presenter.downAmericano();
            }
        });


        findViewById(R.id.latte_up).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                presenter.upLatte();
            }
        });

        findViewById(R.id.latte_down).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                presenter.downLatte();
            }
        });

    }

    @Override
    public void setAmericanoCounterText(int quantity) {
        americano_count.setText(String.valueOf(quantity));
    }
    @Override
    public void setLatteCounterText(int quantity) {
        latte_count.setText(String.valueOf(quantity));
    }
    @Override
    public void setTotalPriceText(int totalPrice) {
        total_result.setText(String.valueOf(totalPrice));
    }



}