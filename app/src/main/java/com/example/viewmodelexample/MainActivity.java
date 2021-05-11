package com.example.viewmodelexample;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.viewmodelexample.model.Ciudad;
import com.example.viewmodelexample.model.ListCiudad;
import com.example.viewmodelexample.modelView.CiudadViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Componentes de actividad
    Button button1, button2, button3;
    TextView result;
    CiudadViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        viewModel= viewModel.getInstance();
        viewModel.addCity(new Ciudad("Valencia",200,5));



        final Observer<ListCiudad> listObserver =  new Observer<ListCiudad>() {
            @Override
            public void onChanged(ListCiudad ciudades) {
                Log.d("live1", ciudades.toString());
                System.out.println("LOLOOLLOLOLOLOL");
                System.out.println(ciudades.toString());
                result.setText(ciudades.toString());
            }
        };
        viewModel.getCiudadesLiveData().observe(this, listObserver);
    }

    private void initComponents() {
        button1 = findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        result= findViewById(R.id.textView);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSecondActivity = new Intent(v.getContext(),SecondActivity.class);
                startActivity(goToSecondActivity);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToThirdActivity = new Intent(v.getContext(),ThirdActivity.class);
                startActivity(goToThirdActivity);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.sortByNaneCity();

            }
        });
    }
}