package com.icesi.pdg_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class MetricsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private SpaceNavigationView navigation;
    private DrawerLayout toolbar;
    private ActionBarDrawerToggle mtoggle;
    private Spinner spinnerSG;
    private Dialog dialogSG;
    private Button selectSG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metrics);

        dialogSG = new Dialog(this);
        navigation = findViewById(R.id.metrics_navigation);
        toolbar = findViewById(R.id.drawer);
        mtoggle=new ActionBarDrawerToggle(this,toolbar,R.string.open,R.string.close);

        navigation.addSpaceItem(new SpaceItem("Clients", R.drawable.client));
        navigation.addSpaceItem(new SpaceItem("Diagrams", R.drawable.diagram));
        navigation.addSpaceItem(new SpaceItem("Metrics", R.drawable.metrics));
        navigation.addSpaceItem(new SpaceItem("Planification", R.drawable.money));

        toolbar.addDrawerListener(mtoggle);
        mtoggle.syncState();
        NavigationView nv = findViewById(R.id.menu_tool_metric);
        nv.setNavigationItemSelectedListener(this);

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(mtoggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId();

        if(id == R.id.menu_sg){
            Toast.makeText(this,"menu SG",Toast.LENGTH_LONG).show();
            showDialogSG();
        }
        if(id == R.id.menu_vx){
            Toast.makeText(this,"menu vx",Toast.LENGTH_LONG).show();
        }
        if(id == R.id.menu_vy){
            Toast.makeText(this,"menu vy",Toast.LENGTH_LONG).show();
        }

        return false;
    }
}
