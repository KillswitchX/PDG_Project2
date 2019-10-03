package com.icesi.pdg_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class PlanificationActivity extends AppCompatActivity {

    private SpaceNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planification);


        navigation=findViewById(R.id.planification_navigation);
        navigation.addSpaceItem(new SpaceItem("Clients", R.drawable.client));
        navigation.addSpaceItem(new SpaceItem("Diagrams", R.drawable.diagram));
        navigation.addSpaceItem(new SpaceItem("Metrics", R.drawable.metrics));
        navigation.addSpaceItem(new SpaceItem("Planification", R.drawable.money));

        navigation.changeCurrentItem(3);

        navigation.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Intent homeIntent = new Intent(PlanificationActivity.this, HomeActivity.class);
                startActivity(homeIntent);
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                switch (itemName){
                    case "Diagrams":
                        Intent diagramsIntent = new Intent(PlanificationActivity.this, DiagramsActivity.class);
                        startActivity(diagramsIntent);
                        break;
                    case "Metrics":
                        Intent metricsIntent = new Intent(PlanificationActivity.this, MetricsActivity.class);
                        startActivity(metricsIntent);
                        break;
                    case "Clients":
                        Intent clientsIntent = new Intent(PlanificationActivity.this, ClientsInfo.class);
                        startActivity(clientsIntent);
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
        Intent homeIntent = new Intent(PlanificationActivity.this, HomeActivity.class);
        startActivity(homeIntent);
    }

}
