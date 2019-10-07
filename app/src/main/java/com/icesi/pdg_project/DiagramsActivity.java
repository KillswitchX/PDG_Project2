package com.icesi.pdg_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.icesi.pdg_project.View.CustomView;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class DiagramsActivity extends AppCompatActivity {

    private SpaceNavigationView navigation;
    private CustomView cv;
    private Spinner spinnerVariablesOne;
    private Spinner spinnerVariablesTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagrams);

        cv = findViewById(R.id.diagrams_cv);

        findViewById(R.id.tv_insert_levelone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv.swapColorLevelOne();
            }
        });

        findViewById(R.id.tv_insert_leveltwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv.swapColorLevelTwo();
            }
        });

        navigation= findViewById(R.id.diagrams_navigation);

        navigation.addSpaceItem(new SpaceItem("Clients", R.drawable.client));
        navigation.addSpaceItem(new SpaceItem("Diagrams", R.drawable.diagram));
        navigation.addSpaceItem(new SpaceItem("Metrics", R.drawable.metrics));
        navigation.addSpaceItem(new SpaceItem("Planification", R.drawable.money));

        navigation.changeCurrentItem(1);

        navigation.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Intent homeIntent = new Intent(DiagramsActivity.this, HomeActivity.class);
                startActivity(homeIntent);
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                switch (itemName){
                    case "Planification":
                        Intent planificationIntent = new Intent(DiagramsActivity.this, PlanificationActivity.class);
                        startActivity(planificationIntent);
                        break;
                    case "Metrics":
                        Intent metricsIntent = new Intent(DiagramsActivity.this, MetricsActivity.class);
                        startActivity(metricsIntent);
                        break;
                    case "Clients":
                        Intent clientsIntent = new Intent(DiagramsActivity.this, ClientsInfo.class);
                        startActivity(clientsIntent);
                        break;

                }

            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {

            }
        });

        findViewById(R.id.diagrams_btn_sg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"All sub-groups were successfully created",Toast.LENGTH_LONG).show();
            }
        });

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(DiagramsActivity.this, HomeActivity.class);
        startActivity(homeIntent);
    }

    @Override
    protected void onResume(){
        super.onResume();
        initView();
    }

    private void initView() {
        spinnerVariablesOne = findViewById(R.id.diagrams_spinner_levelone);
        spinnerVariablesTwo = findViewById(R.id.diagrams_spinner_leveltwo);
        String[] segments = {"College", "Income", "Overage per month", "House", "Handset Price, Calls over 15 min per month",
                "Average call duration", "Reported satisfaction level", "Reported usage level"};
        spinnerVariablesOne.setAdapter(new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, segments));
        spinnerVariablesTwo.setAdapter(new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, segments));

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

    }

}
