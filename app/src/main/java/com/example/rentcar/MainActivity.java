package com.example.rentcar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    RadioButton radioBtn1, radioBtn2;
    CheckBox gpsChkBox, childSeatChkBox;
    EditText noOfDayToRentCar;

    ArrayAdapter<CarData> adapter;
    ArrayList<CarData> carlist =new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setList();
        initView();

        b();

    }

    private void initView() {
        spinner = findViewById(R.id.spinner);
        radioBtn1 =findViewById(R.id.radioBtn1);
        radioBtn2 =findViewById(R.id.radioBtn2);
        childSeatChkBox =findViewById(R.id.childSeatChkBox);
        gpsChkBox =findViewById(R.id.gpsChkBox);
        noOfDayToRentCar=findViewById(R.id.numberOfdaystoRent);


    }

    private void setList() {
        CarData carData = new CarData();
        carData.carName ="honda";
        carData.isTrue=true;
        carlist.add(carData);

        carData = new CarData();
        carData.carName ="car";
        carData.isTrue=true;
        carlist.add(carData);

        carData = new CarData();
        carData.carName ="honda";
        carData.isTrue=true;
        carlist.add(carData);

    }

    public  void b(){
        {

             adapter  =
                    new ArrayAdapter<CarData>(getApplicationContext(),  android.R.layout.simple_spinner_dropdown_item, carlist);
            adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);

            spinner.setAdapter(adapter);
            // Create an ArrayAdapter using the string array and a default spinner layout
          //  adapter = new ArrayAdapter<CharSequence>(this,
                  //  android.R.layout.simple_spinner_dropdown_item, carlist);

            // Specify the layout to use when the list of choices appears

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // Apply the adapter to the spinner


            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {






                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });

        }
    }
}
