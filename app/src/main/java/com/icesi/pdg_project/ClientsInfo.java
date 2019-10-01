package com.icesi.pdg_project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.icesi.pdg_project.Entity.Client;

import java.util.ArrayList;

public class ClientsInfo extends AppCompatActivity {

    private ArrayList<Client> clients;

    private TableLayout tableLayout;

    private Spinner spinnerClients;

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
        createColumns();
        fillDataIntoTable(clients);

    }


    private void initView() {

        tableLayout = (TableLayout) findViewById(R.id.tableLayoutClients);
        spinnerClients = findViewById(R.id.clients_spinner_chooser);
    }


    private void initTestClients() {
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

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

        clients.add(client);

        client.setAge(22);
        client.setGenre('m');
        client.setAvailableMinutes(200);
        client.setPlanDuration(60);
        client.setPlanPrice(45000);
        client.setSocialClass(2);

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

        // Age title
        TextView textViewAge = new TextView(this);
        textViewAge.setText("Edad                       k");
        textViewAge.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewAge.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewAge);

        // Genre Title
        TextView textViewGenre = new TextView(this);
        textViewGenre.setText("Género                   l");
        textViewGenre.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewGenre.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewGenre);

        // Social Class Title
        TextView textViewSocialClass = new TextView(this);
        textViewSocialClass.setText("Estrato             a");
        textViewSocialClass.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewSocialClass.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewSocialClass);

        //Plan Duration title
        TextView textViewPlanDuration = new TextView(this);
        textViewPlanDuration.setText("Duración Plan               ñ");
        textViewPlanDuration.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewPlanDuration.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewPlanDuration);

        //Available Minutes Plan Title
        TextView textViewAvailableMinutes = new TextView(this);
        textViewAvailableMinutes.setText("Minutos Disponibles Plan            t");
        textViewAvailableMinutes.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewAvailableMinutes.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewAvailableMinutes);

        // Plan Price title
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

        // Divider Age
        textViewAge = new TextView(this);
        textViewAge.setText("-----------");
        textViewAge.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewAge.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewAge);

        // Divider Genre
        textViewGenre = new TextView(this);
        textViewGenre.setText("-----------");
        textViewGenre.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewGenre.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewGenre);

        // Divider Social Class
        textViewSocialClass = new TextView(this);
        textViewSocialClass.setText("-----------");
        textViewSocialClass.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewSocialClass.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewSocialClass);

        // Divider Plan Duration
        textViewPlanDuration = new TextView(this);
        textViewPlanDuration.setText("-----------");
        textViewPlanDuration.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewPlanDuration.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewPlanDuration);

        // Divider Available Minutes
        textViewAvailableMinutes = new TextView(this);
        textViewAvailableMinutes.setText("-----------");
        textViewAvailableMinutes.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewAvailableMinutes.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewAvailableMinutes);

        // Divider Price Plan
        textViewPrice = new TextView(this);
        textViewPrice.setText("-----------");
        textViewPrice.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textViewPrice.setPadding(5, 5, 5, 0);
        tableRow.addView(textViewPrice);


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

            // Divider Age
            TextView textViewAge = new TextView(this);
            textViewAge.setText(currentClient.getAge()+"");
            textViewAge.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            textViewAge.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewAge);

            // Divider Genre
            TextView textViewGenre = new TextView(this);
            textViewGenre.setText(currentClient.getGenre() + "");
            textViewGenre.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            textViewGenre.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewGenre);

            // Divider Social Class
            TextView textViewSocialClass = new TextView(this);
            textViewSocialClass.setText(currentClient.getSocialClass()+"");
            textViewSocialClass.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            textViewSocialClass.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewSocialClass);

            // Divider Plan Duration
            TextView textViewPlanDuration = new TextView(this);
            textViewPlanDuration.setText(currentClient.getPlanDuration()+"");
            textViewPlanDuration.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            textViewPlanDuration.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewPlanDuration);

            // Divider Available Minutes
            TextView textViewAvailableMinutes = new TextView(this);
            textViewAvailableMinutes.setText(currentClient.getAvailableMinutes()+"");
            textViewAvailableMinutes.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            textViewAvailableMinutes.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewAvailableMinutes);

            // Divider Price Plan
            TextView textViewPrice = new TextView(this);
            textViewPrice.setText(currentClient.getPlanPrice() +"");
            textViewPrice.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            textViewPrice.setPadding(5, 5, 5, 0);
            tableRow.addView(textViewPrice);

            tableLayout.addView(tableRow, new TableLayout.LayoutParams(
                    TableRow.LayoutParams.FILL_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT));

        }
    }


}
