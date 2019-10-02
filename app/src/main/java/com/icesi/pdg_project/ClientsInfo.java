package com.icesi.pdg_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.icesi.pdg_project.Entity.Client;

import java.util.ArrayList;
import java.util.HashMap;

public class ClientsInfo extends AppCompatActivity {

    private ArrayList<Client> clients;

    private TableLayout tableLayout;

    private Spinner spinnerClients;

    private HashMap<String, ArrayList<Client>> segmentedClients;

    private BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clients_info);
    }

    @Override
    protected void onResume() {
        super.onResume();

        clients = new ArrayList<>();
        segmentedClients = new HashMap<>();

        segmentedClients.put("clients", clients);





        initTestClients();
        initView();
        createColumns();
        fillDataIntoTable(clients);

    }


    private void initView() {
        navigation = findViewById(R.id.clients_navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menu_metric:
                        Intent clientsIntent = new Intent(ClientsInfo.this, MainActivity.class);
                        startActivity(clientsIntent);
                        break;
                }

                return false;
            }
        });
        navigation.getMenu().findItem(R.id.menu_client).setChecked(true);

        tableLayout = (TableLayout) findViewById(R.id.tableLayoutClients);
        spinnerClients = findViewById(R.id.clients_spinner_chooser);
        String[] segments = {" Clients ", " SegmentA ", " SegmentB "};
        spinnerClients.setAdapter(new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, segments));
    }


    private void initTestClients() {
        Client client = new Client();

        client.setCollege("zero");
        client.setIncome(31953);
        client.setOverage(0);
        client.setLeftover(6);
        client.setHouse(313378);
        client.setHandsetPrice(161);
        client.setOver15(0);
        client.setAverageCallDuration(4);
        client.setReportedSatisfaction("unsat");
        client.setReportedUsageLevel("little");

        clients.add(client);

        client = new Client();
        client.setCollege("one");
        client.setIncome(31953);
        client.setOverage(0);
        client.setLeftover(6);
        client.setHouse(313378);
        client.setHandsetPrice(161);
        client.setOver15(3);
        client.setAverageCallDuration(4);
        client.setReportedSatisfaction("unsat");
        client.setReportedUsageLevel("little");

        clients.add(client);

        client = new Client();
        client.setCollege("zero");
        client.setIncome(31953);
        client.setOverage(0);
        client.setLeftover(6);
        client.setHouse(313378);
        client.setHandsetPrice(161);
        client.setOver15(0);
        client.setAverageCallDuration(4);
        client.setReportedSatisfaction("unsat");
        client.setReportedUsageLevel("little");

        clients.add(client);

        client = new Client();
        client.setCollege("one");
        client.setIncome(31953);
        client.setOverage(0);
        client.setLeftover(6);
        client.setHouse(313378);
        client.setHandsetPrice(161);
        client.setOver15(3);
        client.setAverageCallDuration(4);
        client.setReportedSatisfaction("unsat");
        client.setReportedUsageLevel("little");

        clients.add(client);

        client = new Client();
        client.setCollege("zero");
        client.setIncome(31953);
        client.setOverage(0);
        client.setLeftover(6);
        client.setHouse(313378);
        client.setHandsetPrice(161);
        client.setOver15(0);
        client.setAverageCallDuration(4);
        client.setReportedSatisfaction("unsat");
        client.setReportedUsageLevel("little");

        clients.add(client);



    }

    private void createColumns() {
        TableRow tableRow = new TableRow(this);
        tableRow.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.FILL_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));

        // College
        TextView textViewCollege = new TextView(this);
        textViewCollege.setText("Universidad  ");
        textViewCollege.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewCollege.setPadding(5, 5, 5, 0);
        textViewCollege.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        tableRow.addView(textViewCollege);

        // Income
        TextView textViewIncome = new TextView(this);
        textViewIncome.setText("Ingresos  ");
        textViewIncome.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewIncome.setPadding(5, 5, 5, 0);
        textViewIncome.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        tableRow.addView(textViewIncome);

        // Overage
        TextView textViewOverage = new TextView(this);
        textViewOverage.setText("Sobrecargo promedio por mes  ");
        textViewOverage.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewOverage.setPadding(5, 5, 5, 0);
        textViewOverage.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        tableRow.addView(textViewOverage);

        // LeftOver
        TextView textViewLeftover = new TextView(this);
        textViewLeftover.setText("Promedio de minutos sobrantes por mes  ");
        textViewLeftover.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewLeftover.setPadding(5, 5, 5, 0);
        textViewLeftover.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        tableRow.addView(textViewLeftover);

        // House
        TextView textViewHouse = new TextView(this);
        textViewHouse.setText("Valor de la vivienda  ");
        textViewHouse.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewHouse.setPadding(5, 5, 5, 0);
        textViewHouse.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        tableRow.addView(textViewHouse);

        // Handset Price
        TextView textViewHandsetPrice = new TextView(this);
        textViewHandsetPrice.setText("Costo del celular  ");
        textViewHandsetPrice.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewHandsetPrice.setPadding(5, 5, 5, 0);
        textViewHandsetPrice.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        tableRow.addView(textViewHandsetPrice);

        // Average calls Over 15 minutes
        TextView textViewOver15 = new TextView(this);
        textViewOver15.setText("Promedio llamadas (>15 min) por mes  ");
        textViewOver15.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewOver15.setPadding(5, 5, 5, 0);
        textViewOver15.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        tableRow.addView(textViewOver15);

        // Average Call Duration
        TextView textViewAverageCallDuration = new TextView(this);
        textViewAverageCallDuration.setText("Duracion promedio de llamadas  ");
        textViewAverageCallDuration.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewAverageCallDuration.setPadding(5, 5, 5, 0);
        textViewAverageCallDuration.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        tableRow.addView(textViewAverageCallDuration);

        // Reported Satisfaction
        TextView textViewReportedSatisfaction = new TextView(this);
        textViewReportedSatisfaction.setText("Nivel de satisfacción reportada  ");
        textViewReportedSatisfaction.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewReportedSatisfaction.setPadding(5, 5, 5, 0);
        textViewReportedSatisfaction.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        tableRow.addView(textViewReportedSatisfaction);

        // Reported Usage Level
        TextView textViewReportedUsageLevel = new TextView(this);
        textViewReportedUsageLevel.setText("Nivel de uso reportado  ");
        textViewReportedUsageLevel.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewReportedUsageLevel.setPadding(5, 5, 5, 0);
        textViewReportedUsageLevel.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        tableRow.addView(textViewReportedUsageLevel);


        tableLayout.addView(tableRow, new TableLayout.LayoutParams(
                TableRow.LayoutParams.FILL_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));


    }

    private void fillDataIntoTable(ArrayList<Client> clientsToFill) {
        int size = clientsToFill.size();
        Client currentClient = null;
        for (int i = 0; i < size; i++) {
            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableRow.LayoutParams(
                    TableRow.LayoutParams.FILL_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT));

            currentClient = clientsToFill.get(i);

            // College
            TextView textViewCollege = new TextView(this);
            textViewCollege.setText(currentClient.getCollege());

            textViewCollege.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewCollege);

            // Income
            TextView textViewIncome = new TextView(this);
            textViewIncome.setText(currentClient.getIncome()+"");

            textViewIncome.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewIncome);

            // Overage
            TextView textViewOverage = new TextView(this);
            textViewOverage.setText(currentClient.getOverage()+"");

            textViewOverage.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewOverage);

            // LeftOver
            TextView textViewLeftover = new TextView(this);
            textViewLeftover.setText(currentClient.getLeftover()+"");

            textViewLeftover.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewLeftover);

            // House
            TextView textViewHouse = new TextView(this);
            textViewHouse.setText(currentClient.getHouse()+"");

            textViewHouse.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewHouse);

            // Handset Price
            TextView textViewHandsetPrice = new TextView(this);
            textViewHandsetPrice.setText(currentClient.getHandsetPrice()+"");

            textViewHandsetPrice.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewHandsetPrice);

            // Average calls Over 15 minutes
            TextView textViewOver15 = new TextView(this);
            textViewOver15.setText(currentClient.getOver15()+"");

            textViewOver15.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewOver15);

            // Average Call Duration
            TextView textViewAverageCallDuration = new TextView(this);
            textViewAverageCallDuration.setText(currentClient.getAverageCallDuration()+"");

            textViewAverageCallDuration.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewAverageCallDuration);

            // Reported Satisfaction
            TextView textViewReportedSatisfaction = new TextView(this);
            textViewReportedSatisfaction.setText(currentClient.getReportedSatisfaction());

            textViewReportedSatisfaction.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewReportedSatisfaction);

            // Reported Usage Level
            TextView textViewReportedUsageLevel = new TextView(this);
            textViewReportedUsageLevel.setText(currentClient.getReportedUsageLevel());

            textViewReportedUsageLevel.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewReportedUsageLevel);


            tableLayout.addView(tableRow, new TableLayout.LayoutParams(
                    TableRow.LayoutParams.FILL_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT));

        }
    }


}
