package com.example.viewmodelexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.viewmodelexample.model.Ciudad;
import com.example.viewmodelexample.model.ListCiudad;
import com.example.viewmodelexample.modelView.CiudadViewModel;

import java.util.List;

public class SecondActivity extends AppCompatActivity {
    // Componentes de actividad
    Button button1, button2;
    TextView result;
    CiudadViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initComponents();
        viewModel= viewModel.getInstance();
        viewModel.addCity(new Ciudad("España",300,9));

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
                Intent goToThirdActivity = new Intent(v.getContext(),ThirdActivity.class);
                startActivity(goToThirdActivity);
            }
        });
    }
}
