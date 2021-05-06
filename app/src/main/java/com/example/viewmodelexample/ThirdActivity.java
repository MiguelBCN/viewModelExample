package com.example.viewmodelexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.viewmodelexample.model.Ciudad;
import com.example.viewmodelexample.modelView.CiudadViewModel;

public class ThirdActivity extends AppCompatActivity {
    // Componentes de actividad
    Button button1, button2;
    TextView result;
    CiudadViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initComponents();
       viewModel= viewModel.getInstance();
        viewModel.getCiudades().addCiudad(new Ciudad("Aldisa",200,9));
        result.setText(viewModel.getCiudades().toString());
    }

    private void initComponents() {
        button1 = findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        result= findViewById(R.id.textView);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToFirstActivity = new Intent(v.getContext(),MainActivity.class);
                startActivity(goToFirstActivity);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSecondActivity = new Intent(v.getContext(),SecondActivity.class);
                startActivity(goToSecondActivity);
            }
        });
    }
}