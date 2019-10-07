package com.icesi.pdg_project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class MetricsActivity extends AppCompatActivity  {

    private SpaceNavigationView navigation;
    private Spinner spinnerVariablesX;
    private Spinner spinnerVariablesY;
    private Spinner spinnerGroups;
    private GraphView graph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metrics);

        navigation = findViewById(R.id.metrics_navigation);

        graph =findViewById(R.id.metrics_graph);

        navigation.addSpaceItem(new SpaceItem("Clients", R.drawable.client));
        navigation.addSpaceItem(new SpaceItem("Diagrams", R.drawable.diagram));
        navigation.addSpaceItem(new SpaceItem("Metrics", R.drawable.metrics));
        navigation.addSpaceItem(new SpaceItem("Planification", R.drawable.money));


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

        findViewById(R.id.metrics_tv_bc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barChart();
            }
        });

        findViewById(R.id.metrics_tv_lg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lineGraph();
            }
        });

        findViewById(R.id.metrics_tv_sp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scaterPlot();
            }
        });

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


    }

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(MetricsActivity.this, HomeActivity.class);
        startActivity(homeIntent);
    }

    @Override
    protected void onResume(){
        super.onResume();
        initView();
    }

    private void initView() {
        spinnerVariablesX = findViewById(R.id.metrics_spinner_vx);
        spinnerVariablesY = findViewById(R.id.metrics_spinner_vy);
        spinnerGroups = findViewById(R.id.metrics_spinner_groups);
        String[] segments = {"College", "Income", "Overage per month", "House", "Handset Price, Calls over 15 min per month",
                "Average call duration", "Reported satisfaction level", "Reported usage level"};
        String[] segmentsTwo = {" Clients ", " SegmentA ", " SegmentB "};
        spinnerGroups.setAdapter(new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, segmentsTwo));
        spinnerVariablesX.setAdapter(new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, segments));
        spinnerVariablesY.setAdapter(new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, segments));

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

    }

    private void barChart(){
        graph.removeAllSeries();
        BarGraphSeries<DataPoint> series = new BarGraphSeries<>(new DataPoint[] {
                new DataPoint(0, -1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph.addSeries(series);

        // styling
        series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override
            public int get(DataPoint data) {
                return Color.rgb((int) data.getX()*255/4, (int) Math.abs(data.getY()*255/6), 100);
            }
        });

        series.setSpacing(50);

        // draw values on top
        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.RED);
        //series.setValuesOnTopSize(50);
    }

    private void lineGraph(){
        graph.removeAllSeries();
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph.addSeries(series);
    }

    private void scaterPlot(){
        graph.removeAllSeries();
        PointsGraphSeries<DataPoint> series = new PointsGraphSeries<>(new DataPoint[] {
                new DataPoint(0, -2),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph.addSeries(series);
        series.setShape(PointsGraphSeries.Shape.POINT);

        PointsGraphSeries<DataPoint> series2 = new PointsGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, -1),
                new DataPoint(1, 4),
                new DataPoint(2, 2),
                new DataPoint(3, 1),
                new DataPoint(4, 5)
        });
        graph.addSeries(series2);
        series2.setShape(PointsGraphSeries.Shape.RECTANGLE);
        series2.setColor(Color.RED);

        PointsGraphSeries<DataPoint> series3 = new PointsGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 0),
                new DataPoint(1, 3),
                new DataPoint(2, 1),
                new DataPoint(3, 0),
                new DataPoint(4, 4)
        });
        graph.addSeries(series3);
        series3.setShape(PointsGraphSeries.Shape.TRIANGLE);
        series3.setColor(Color.YELLOW);

        PointsGraphSeries<DataPoint> series4 = new PointsGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 2),
                new DataPoint(2, 0),
                new DataPoint(3, -1),
                new DataPoint(4, 3)
        });
        graph.addSeries(series4);
        series4.setColor(Color.GREEN);
        series4.setCustomShape(new PointsGraphSeries.CustomShape() {
            @Override
            public void draw(Canvas canvas, Paint paint, float x, float y, DataPointInterface dataPoint) {
                paint.setStrokeWidth(10);
                canvas.drawLine(x-20, y-20, x+20, y+20, paint);
                canvas.drawLine(x+20, y-20, x-20, y+20, paint);
            }
        });
    }


}
