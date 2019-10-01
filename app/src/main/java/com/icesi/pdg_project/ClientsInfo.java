package com.icesi.pdg_project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.icesi.pdg_project.Entity.Client;

import java.util.ArrayList;

public class ClientsInfo extends AppCompatActivity {

    private ArrayList<Client> clients;

    private TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clients_info);
    }

    @Override
    protected void onResume() {
        super.onResume();

        clients = new ArrayList<>();
        initTestClients();
        initView();

    }


    private void initView() {
        tableLayout = (TableLayout) findViewById(R.id.tableLayoutClients);
    }


    private void initTestClients(){
        Client client = new Client();

        client.setAge(26);
        client.setGenre('f');
        client.setAvailableMinutes(100);
        client.setPlanDuration(30);
        client.setPlanPrice(30000);
        client.setSocialClass(3);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

    }

    private void createColumns() {
        TableRow tableRow = new TableRow(this);
        tableRow.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.FILL_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));

        // Id Column
        TextView textViewAge = new TextView(this);
        textViewAge.setText("Edad");
        textViewAge.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewAge.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewAge);

        // Name Column
        TextView textViewGenre = new TextView(this);
        textViewGenre.setText("Género");
        textViewGenre.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewGenre.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewGenre);

        // Name Column
        TextView textViewSocialClass = new TextView(this);
        textViewSocialClass.setText("Estrato");
        textViewSocialClass.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewSocialClass.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewSocialClass);

        TextView textViewPlanDuration = new TextView(this);
        textViewPlanDuration.setText("Duración Plan");
        textViewPlanDuration.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewPlanDuration.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewPlanDuration);


        TextView textViewAvailableMinutes = new TextView(this);
        textViewAvailableMinutes.setText("Minutos Disponibles Plan");
        textViewAvailableMinutes.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewAvailableMinutes.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewAvailableMinutes);

        // Price Column
        TextView textViewPrice = new TextView(this);
        textViewPrice.setText("Precio");
        textViewPrice.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewPrice.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewPrice);


        tableLayout.addView(tableRow, new TableLayout.LayoutParams(
                TableRow.LayoutParams.FILL_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));

        // Add Divider
        tableRow = new TableRow(this);
        tableRow.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.FILL_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));

        // Id Column
        textViewAge = new TextView(this);
        textViewAge.setText("-----------");
        textViewAge.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewAge.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewAge);

        // Name Column
        textViewGenre = new TextView(this);
        textViewGenre.setText("-----------");
        textViewGenre.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewGenre.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewGenre);

        // Name Column
        textViewSocialClass = new TextView(this);
        textViewSocialClass.setText("-----------");
        textViewSocialClass.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewSocialClass.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewSocialClass);

        // Price Column
        textViewPlanDuration = new TextView(this);
        textViewPlanDuration.setText("-----------");
        textViewPlanDuration.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewPlanDuration.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewPlanDuration);

        // Price Column
        textViewAvailableMinutes = new TextView(this);
        textViewAvailableMinutes.setText("-----------");
        textViewAvailableMinutes.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewAvailableMinutes.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewAvailableMinutes);

        // Price Column
        textViewPrice = new TextView(this);
        textViewPrice.setText("-----------");
        textViewPrice.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewPrice.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewPrice);



        tableLayout.addView(tableRow, new TableLayout.LayoutParams(
                TableRow.LayoutParams.FILL_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));

    }


}
