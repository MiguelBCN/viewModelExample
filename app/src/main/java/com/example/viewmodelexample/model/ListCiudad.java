package com.example.viewmodelexample.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public  class ListCiudad implements ListaCiudad {
    private List<Ciudad> ciudades;


    public ListCiudad(){
        this.ciudades=new ArrayList<>();
    }
    public ListCiudad(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public void addCity(Ciudad city) {
        ciudades.add(city);


    }

    @Override
    public void RemoveCity() {

    }

    @Override
    public void sortCityByName() {

    }

    @Override
    public void sortCityByPoblacion() {
        Collections.sort(ciudades, new Comparator<Ciudad>() {
            @Override
            public int compare(Ciudad o1, Ciudad o2) {
                if(o1.getmPoblacion() < o2.getmPoblacion()) return 1;
                if(o1.getmPoblacion() > o2.getmPoblacion()) return -1;

                return 0;
            }
        });

    }

    @Override
    public void removeAll() {

    }
    public String toString(){
        String listaCiudades="";
        for (Ciudad c: ciudades){
            listaCiudades+=c.toString()+"\n";
        }
        return listaCiudades;

    }
}
