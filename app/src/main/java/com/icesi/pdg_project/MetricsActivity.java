package com.icesi.pdg_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.navigation.NavigationView;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class MetricsActivity extends AppCompatActivity  {

    private SpaceNavigationView navigation;
    private Spinner spinnerSG;
    private Dialog dialogSG;
    private Button selectSG;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metrics);

        dialogSG = new Dialog(this);
        navigation = findViewById(R.id.metrics_navigation);

        navigation.addSpaceItem(new SpaceItem("Clients", R.drawable.client));
        navigation.addSpaceItem(new SpaceItem("Diagrams", R.drawable.diagram));
        navigation.addSpaceItem(new SpaceItem("Metrics", R.drawable.metrics));
        navigation.addSpaceItem(new SpaceItem("Planification", R.drawable.money));

        configureNavigationDrawer();
        configureToolbar();

        navigation.changeCurrentItem(2);

        navigation.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Intent homeIntent = new Intent(MetricsActivity.this, HomeActivity.class);
                startActivity(homeIntent);
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

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(MetricsActivity.this, HomeActivity.class);
        startActivity(homeIntent);
    }

    public void showDialogSG(){
        dialogSG.setContentView(R.layout.dialog_subgroup_metrics);
        spinnerSG=dialogSG.findViewById(R.id.metrics_dialogsg_spinner_sg);
        selectSG=dialogSG.findViewById(R.id.metrics_dialogsg_select);
        selectSG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialogSG.dismiss();
            }
        });
        dialogSG.show();
    }

    private void configureToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
    }

    private void configureNavigationDrawer() {
        drawerLayout = findViewById(R.id.drawer);
        NavigationView navView = findViewById(R.id.menu_tool_metric);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.menu_sg) {
                    showDialogSG();
                }
                return false;
            }
        });
    }  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch(itemId) {
            // Android home
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;      // manage other entries if you have it ...
        }    return true;
    }

}
