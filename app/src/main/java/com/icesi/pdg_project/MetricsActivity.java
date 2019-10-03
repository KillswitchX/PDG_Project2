package com.icesi.pdg_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class MetricsActivity extends AppCompatActivity {

    private SpaceNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metrics);

        navigation = findViewById(R.id.metrics_navigation);



        navigation.addSpaceItem(new SpaceItem("Diagrams", R.drawable.diagram));
        navigation.addSpaceItem(new SpaceItem("Metrics", R.drawable.metrics));
        navigation.addSpaceItem(new SpaceItem("Clients", R.drawable.client));
        navigation.addSpaceItem(new SpaceItem("Planification", R.drawable.money));

        navigation.changeCurrentItem(1);

        navigation.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                switch (itemName){
                    case "Diagrams":
                        Intent diagramsIntent = new Intent(MetricsActivity.this, DiagramsActivity.class);
                        startActivity(diagramsIntent);
                        break;
                    case "Clients":
                        Intent clientsIntent = new Intent(MetricsActivity.this, ClientsInfo.class);

                        startActivity(clientsIntent);

                        break;
                    case "Planification":
                        Intent planificationIntent = new Intent(MetricsActivity.this, PlanificationActivity.class);
                        startActivity(planificationIntent);
                        break;

                }

            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {

            }
        });




    }

}
