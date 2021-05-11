package com.example.viewmodelexample.modelView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.viewmodelexample.model.Ciudad;
import com.example.viewmodelexample.model.ListCiudad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CiudadViewModel extends ViewModel {
    private volatile static CiudadViewModel uniqueInstance;
    private ListCiudad ciudades;
    private MutableLiveData<ListCiudad> mData;

    private CiudadViewModel() {
        ciudades = new ListCiudad();
        mData = new MutableLiveData<ListCiudad>();


    }

    public static CiudadViewModel getInstance() {
        if (uniqueInstance == null) {
            synchronized (CiudadViewModel.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new CiudadViewModel();
                    // Load data from firebase
                }
            }
        }
        return uniqueInstance;
    }
    public LiveData<ListCiudad> getCiudadesLiveData(){
        if (mData == null) {
            mData = new MutableLiveData<ListCiudad>();
        }
        return mData;
    }
    public void addCity(Ciudad city){
        ciudades.addCity(city);
        mData.setValue(ciudades);
    }
    public void sortByNaneCity(){
        ciudades.sortCityByPoblacion();
        mData.setValue(ciudades);
    }

}
