package com.example.leona.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.leona.myapplication.data.DBHelper;
import com.example.leona.myapplication.data.userDbUtils;

import java.util.ArrayList;
import java.util.List;

import static com.example.leona.myapplication.data.Contract.TABLE_USER.COLUMN_NAME_NAME;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private SQLiteDatabase db;
    private DBHelper helper;
    private TextView User;
    private TextView Welcome;
    Button submitButton;

    private String TAG= "userTest";


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_form);
        //***********spinners
        // Spinner element
        Spinner gSpinner = (Spinner) findViewById(R.id.gender_spinner);
        Spinner fSpinner = (Spinner) findViewById(R.id.ft_spinner);
        Spinner iSpinner = (Spinner) findViewById(R.id.inches_spinner);

        // Spinner click listener
        gSpinner.setOnItemSelectedListener(this);
        fSpinner.setOnItemSelectedListener(this);
        iSpinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        //Gender Options
        List<String> sex = new ArrayList<String>();
        sex.add("Choose your Gender");
        sex.add("M");
        sex.add("F");
        //height by feet options 8
        List<String> feet = new ArrayList<String>();
        feet.add("Choose your height by ft");
        feet.add("1");
        feet.add("2");
        feet.add("3");
        feet.add("4");
        feet.add("5");
        feet.add("6");
        feet.add("7");
        feet.add("8");
        //height by inches options
       List<String> inChes = new ArrayList<String>();
        inChes.add("Choose your height by inches");
        inChes.add("1");
        inChes.add("2");
        inChes.add("3");
        inChes.add("4");
        inChes.add("5");
        inChes.add("6");
        inChes.add("7");
        inChes.add("8");
        inChes.add("9");
        inChes.add("10");
        inChes.add("11");
        inChes.add("12");



        // Creating adapter for gender spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sex);
        // Creating adapter for foot spinner
        ArrayAdapter<String> dataFAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, feet);
        // Creating adapter for inches spinner
        ArrayAdapter<String> dataIAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, inChes);


        // Drop down layout style - list view with radio button for gender
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Drop down layout style - list view with radio button for foot
        dataFAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Drop down layout style - list view with radio button for inChes
        dataIAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);



        // attaching data adapter to spinner for gender
        gSpinner.setAdapter(dataAdapter);
        // attaching data adapter to spinner for foot
        fSpinner.setAdapter(dataFAdapter);
        // attaching data adapter to spinner for inches
        iSpinner.setAdapter(dataIAdapter);

        helper = new DBHelper(this);
        db = helper.getWritableDatabase();
        submitButton=(Button)findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Lets Get Started",Toast.LENGTH_LONG).show();
                // second activity will be open through here also find a way to save user info to be displayed
//                FragmentManager fm = getSupportFragmentManager();
//
//                UpdateToDoFragment frag = UpdateToDoFragment.newInstance(year, month, day, description, category, id);
//                frag.show(fm, "updatetodofragment");

//                Intent myIntent = new Intent(v.getContext(), main2.class);
//                startActivityForResult(myIntent, 0);
//
//
//                Log.i("Content "," Main layout ");

            }

        });
    }
//


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0)
    {
        // TODO Auto-generated method stub
    }

        //************************





//**********end of main activity****************************************
                                                                                                    }



