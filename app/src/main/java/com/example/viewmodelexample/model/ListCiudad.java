package com.example.viewmodelexample.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListCiudad   {
    private List<Ciudad> mCiudades;

    public ListCiudad(List<Ciudad> mCiudades) {
        this.mCiudades = mCiudades;
    }
    public ListCiudad(){
        mCiudades= new ArrayList<>();
    }

    public List<Ciudad> getmCiudades() {
        return mCiudades;
    }

    public void setmCiudades(List<Ciudad> mCiudades) {
        this.mCiudades = mCiudades;
    }

    public void addCiudad(Ciudad ciudad){
        mCiudades.add(ciudad);
    }
    public int sizeCiudades(){
        return mCiudades.size();
    }
    public void deleteLastCityCiudad(){
        mCiudades.remove(sizeCiudades()-1);
    }

    public void turnZero(){
        for (int i = 0; i< sizeCiudades(); i++)
            mCiudades.get(i).setmPoblacion(0);
    }
    @Override
    public String toString(){
        String ciudades="";
        for (int i = 0; i< sizeCiudades(); i++)
            ciudades+=mCiudades.get(i).toString()+"\n";
        return ciudades;
    }
}
