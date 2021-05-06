package com.example.viewmodelexample.modelView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.viewmodelexample.model.Ciudad;
import com.example.viewmodelexample.model.ListCiudad;

import java.util.List;

public class CiudadViewModel extends ViewModel {
    private volatile static CiudadViewModel uniqueInstance;

    private Ciudad ciudad;
    public ListCiudad ciudades;
    private MutableLiveData<ListCiudad> mData;

    private CiudadViewModel() {
        ciudades = new ListCiudad();
        ciudad = new Ciudad("Barcelona", 500, 10);
    }

    public static CiudadViewModel getInstance() {
        if (uniqueInstance == null) {
            synchronized (CiudadViewModel.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new CiudadViewModel();
                }
            }
        }
        return uniqueInstance;
    }
    public LiveData<ListCiudad> getCiudadesLiveData(){
        if (mData == null) {
            mData = new MutableLiveData<>();
        }
        return mData;

    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public ListCiudad getCiudades() {
        return ciudades;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void setCiudades(ListCiudad ciudades) {
        this.ciudades = ciudades;
    }
}
