package com.mjnolan.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView m1, m2, m3, t1, t2, t3, error;
    Spinner spinner;
    EditText editText;
    Double input;

    private  static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Setup the dropdown options
        String[] arraySpinner = new String[] {
                "Metre", "Celsius", "Kilograms"
        };
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        m1 = (TextView) findViewById(R.id.m1);
        m2 = (TextView) findViewById(R.id.m2);
        m3 = (TextView) findViewById(R.id.m3);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        error = (TextView) findViewById(R.id.error);

        editText = (EditText) findViewById(R.id.editTextTextPersonName);

        error.setText("");
        m1.setText("");
        m2.setText("");
        m3.setText("");
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }

    public void measurePress(View v) {
        error.setText("");
        if (editText.getText().toString() != "") {
            if (spinner.getSelectedItem().toString() == "Metre") {
                try {
                    Double output;
                    input = Double.parseDouble(editText.getText().toString());

                    // Centimetre
                    output = input * 100;
                    m1.setText(df.format(output));
                    t1.setText("Centimetre");

                    // Foot
                    output = input * 3.280840;
                    m2.setText(df.format(output));
                    t2.setText("Foot");

                    // Inch
                    output = input * 39.37007874;
                    m3.setText(df.format(output));
                    t3.setText("Inch");
                } catch (NumberFormatException e) {
                    // Error
                    error.setText("Please enter decimal numbers only");
                    m1.setText("");
                    m2.setText("");
                    m3.setText("");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                }
            } else {
                // Error
                error.setText("Please select the correct conversion icon");
                m1.setText("");
                m2.setText("");
                m3.setText("");
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        }
    }

    public void tempraturePress(View v) {
        error.setText("");
        if (editText.getText().toString() != "") {
            if (spinner.getSelectedItem().toString() == "Celsius") {
                try {
                    Double output;
                    input = Double.parseDouble(editText.getText().toString());

                    // Fahrenheit
                    output = input * 33.8;
                    m1.setText(df.format(output));
                    t1.setText("Fahrenheit");

                    // Kelvin
                    output = input * 274.15;
                    m2.setText(df.format(output));
                    t2.setText("Kelvin");

                    // Blank
                    m3.setText("");
                    t3.setText("");
                } catch (NumberFormatException e) {
                    // Error
                    error.setText("Please enter decimal numbers only");
                    m1.setText("");
                    m2.setText("");
                    m3.setText("");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                }
            } else {
                // Error
                error.setText("Please select the correct conversion icon");
                m1.setText("");
                m2.setText("");
                m3.setText("");
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        }
    }

    public void weightPress(View v) {
        error.setText("");
        if (editText.getText().toString() != "") {
            if (spinner.getSelectedItem().toString() == "Kilograms") {
                try {
                    Double output;
                    input = Double.parseDouble(editText.getText().toString());

                    // Gram
                    output = input * 1000;
                    m1.setText(df.format(output));
                    t1.setText("Gram");

                    // Ounce(Oz)
                    output = input * 35.27396195;
                    m2.setText(df.format(output));
                    t2.setText("Ounce(Oz)");

                    // Pound(lb)
                    output = input * 2.205;
                    m3.setText(df.format(output));
                    t3.setText("Pound(lb)");
                } catch (NumberFormatException e) {
                    // Error
                    error.setText("Please enter decimal numbers only");
                    m1.setText("");
                    m2.setText("");
                    m3.setText("");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                }
            } else {
                // Error
                error.setText("Please select the correct conversion icon");
                m1.setText("");
                m2.setText("");
                m3.setText("");
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        }
    }

}