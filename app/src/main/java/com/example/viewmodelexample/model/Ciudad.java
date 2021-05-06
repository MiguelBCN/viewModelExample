package com.example.viewmodelexample.model;

public class Ciudad {
    private String mNombre;
    private int mPoblacion;
    private int mNumeroComunidades;

    public Ciudad(String mNombre, int mPoblacion, int mNumeroComunidades) {
        this.mNombre = mNombre;
        this.mPoblacion = mPoblacion;
        this.mNumeroComunidades = mNumeroComunidades;
    }

    public String getmNombre() {
        return mNombre;
    }

    public void setmNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    public int getmPoblacion() {
        return mPoblacion;
    }

    public void setmPoblacion(int mPoblacion) {
        this.mPoblacion = mPoblacion;
    }

    public int getmNumeroComunidades() {
        return mNumeroComunidades;
    }

    public void setmNumeroComunidades(int mNumeroComunidades) {
        this.mNumeroComunidades = mNumeroComunidades;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "mNombre='" + mNombre + '\'' +
                ", mPoblacion=" + mPoblacion +
                ", mNumeroComunidades=" + mNumeroComunidades +
                '}';
    }

}
