package com.example.prisoners_new;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener  {
    CardView salary, report, statistic, news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();



    }
    public void initview(){
        salary = findViewById(R.id.salary);
        salary.setOnClickListener((View.OnClickListener) this);

        report = findViewById(R.id.report);
        report.setOnClickListener((View.OnClickListener) this);

        statistic = findViewById(R.id.statistic);
        statistic.setOnClickListener((View.OnClickListener) this);

        news = findViewById(R.id.news);
        news.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.salary:
                i = new Intent(this, salary.class);
                startActivity(i);
                break;
            case R.id.report:
                i = new Intent(this, salary.class);
                startActivity(i);
                break;
            case R.id.news:
                i = new Intent(this,  salary.class);
                startActivity(i);
                break;
            case R.id.statistic:
                i = new Intent(this,  salary.class);
                startActivity(i);
                break;

        }
    }

}
