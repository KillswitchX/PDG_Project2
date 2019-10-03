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


        navigation.addSpaceItem(new SpaceItem("Diagrams", R.drawable.diagram));
        navigation.addSpaceItem(new SpaceItem("Metrics", R.drawable.metrics));
        navigation.addSpaceItem(new SpaceItem("Clients", R.drawable.client));
        navigation.addSpaceItem(new SpaceItem("Planification", R.drawable.money));

        navigation.changeCurrentItem(0);

        navigation.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                switch (itemName){
                    case "Diagrams":

                    case "Metrics":
                        Intent metricsIntent = new Intent(MainActivity.this, MetricsActivity.class);
                        metricsIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        overridePendingTransition(0,0);
                        startActivity(metricsIntent);
                        break;

                    case "clients":

                    case "Planification":
                }

            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {

            }
        });


    }


}
