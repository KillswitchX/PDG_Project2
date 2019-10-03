package com.icesi.pdg_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Space;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class MainActivity extends AppCompatActivity {

    private SpaceNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        navigation = findViewById(R.id.main_navigation);


        navigation.addSpaceItem(new SpaceItem("Clients", R.drawable.client));
        navigation.addSpaceItem(new SpaceItem("Diagrams", R.drawable.diagram));
        navigation.addSpaceItem(new SpaceItem("Metrics", R.drawable.metrics));
        navigation.addSpaceItem(new SpaceItem("Planification", R.drawable.money));

        navigation.changeCurrentItem(4);

        navigation.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                switch (itemName){
                    case "Diagrams":
                        Intent diagramsIntent = new Intent(MainActivity.this, DiagramsActivity.class);
                        startActivity(diagramsIntent);
                        break;
                    case "Metrics":
                        Intent metricsIntent = new Intent(MainActivity.this, MetricsActivity.class);
                        startActivity(metricsIntent);
                        break;
                    case "Clients":
                        Intent clientsIntent = new Intent(MainActivity.this, ClientsInfo.class);
                        startActivity(clientsIntent);
                        break;
                    case "Planification":
                        Intent planificationIntent = new Intent(MainActivity.this, PlanificationActivity.class);
                        startActivity(planificationIntent);
                        break;

                }

            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {


            }

        });


    }

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(homeIntent);
    }
}
