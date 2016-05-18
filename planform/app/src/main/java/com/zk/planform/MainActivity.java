package com.zk.planform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private TextView arrow1,arrow2,arrow3;
    private ImageView arrow6,arrow7,arrow8,arrow9,arrow10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("俯视图");

        InitWidget();
    }

    private void InitWidget() {

            List<View> widgetList = new ArrayList<View>();
            arrow1 = (TextView) findViewById(R.id.arrow_1);
            arrow2 = (TextView) findViewById(R.id.arrow_2);

        arrow6 = (ImageView) findViewById(R.id.arrow_6);
        arrow7 = (ImageView) findViewById(R.id.arrow_7);
        arrow8 = (ImageView) findViewById(R.id.arrow_8);
        arrow9 = (ImageView) findViewById(R.id.arrow_9);
        arrow10= (ImageView) findViewById(R.id.arrow_10);

        widgetList.add(arrow1);
        widgetList.add(arrow2);
        widgetList.add(arrow6);
        widgetList.add(arrow7);
        widgetList.add(arrow8);
        widgetList.add(arrow9);
        widgetList.add(arrow10);

        for (int i = 0; i <widgetList.size() ; i++) {
            widgetList.get(i).setVisibility(View.INVISIBLE);
        }


    }
}
