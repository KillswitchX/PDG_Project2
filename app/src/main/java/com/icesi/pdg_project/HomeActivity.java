package com.icesi.pdg_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class HomeActivity extends AppCompatActivity {

    private SpaceNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        navigation = findViewById(R.id.home_navigation);


        navigation.addSpaceItem(new SpaceItem("Clients", R.drawable.client));
        navigation.addSpaceItem(new SpaceItem("Diagrams", R.drawable.diagram));
        navigation.addSpaceItem(new SpaceItem("Metrics", R.drawable.metrics));
        navigation.addSpaceItem(new SpaceItem("Planification", R.drawable.money));

        navigation.changeCurrentItem(4);

        navigation.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                switch (itemName){
                    case "Diagrams":
                        Intent diagramsIntent = new Intent(HomeActivity.this, DiagramsActivity.class);
                        startActivity(diagramsIntent);
                        break;
                    case "Metrics":
                        Intent metricsIntent = new Intent(HomeActivity.this, MetricsActivity.class);
                        startActivity(metricsIntent);
                        break;

                    case "Clients":
                        Intent clientsIntent = new Intent(HomeActivity.this, ClientsInfo.class);
                        startActivity(clientsIntent);
                        break;

                    case "Planification":
                        Intent planificationIntent = new Intent(HomeActivity.this, PlanificationActivity.class);
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
        showPopup();
    }

    private void showPopup(){


    }
}
