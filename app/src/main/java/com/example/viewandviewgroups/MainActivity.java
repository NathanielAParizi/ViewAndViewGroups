package com.example.viewandviewgroups;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.viewandviewgroups.Model.Person;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    private EditText editFirstName;
    private EditText editLastName;
    private EditText editAddress;
    private EditText editCity;
    private EditText editState;
    private EditText editZip;

    private TextView txtFirstName;
    private TextView txtLastName;
    private TextView txtAddress;
    private TextView txtCity;
    private TextView txtState;
    private TextView txtZip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFirstName = findViewById(R.id.edit_first_name);
        editLastName = findViewById(R.id.edit_last_name);
        editAddress = findViewById(R.id.edit_address);
        editCity = findViewById(R.id.edit_city);
        editState = findViewById(R.id.edit_state);
        editZip = findViewById(R.id.edit_zip);

        txtFirstName = findViewById(R.id.text_first_name);
        txtLastName = findViewById(R.id.text_last_name);
        txtAddress = findViewById(R.id.text_address);
        txtCity = findViewById(R.id.text_city);
        txtState = findViewById(R.id.text_state);
        txtZip = findViewById(R.id.text_zip);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Person person = new Person(editFirstName.getText().toString(),
                        editLastName.getText().toString(),
                        editAddress.getText().toString(),
                        editCity.getText().toString(),
                        editState.getText().toString(),
                        editZip.getText().toString());

                txtFirstName.setText(person.getmFirstName());
                txtLastName.setText(person.getmLastName());
                txtAddress.setText(person.getmStreetAddress());
                txtCity.setText(person.getmCity());
                txtState.setText(person.getmState());
                txtZip.setText(person.getmZip());

            }
        });

    }
}
