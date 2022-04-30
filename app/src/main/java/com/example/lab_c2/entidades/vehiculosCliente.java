package com.example.lab_c2.entidades;

public class vehiculosCliente {
    private int idV;
    private String placa;
    private String nombreVehiculo;
    private String fecchaInicio;
    private String fecchaFin;
    private String tiempoAlquiler;
    private String precioAlquiler;


    public int getIdV() {
        return idV;
    }

    public void setIdV(int idV) {
        this.idV = idV;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public String getFecchaInicio() {
        return fecchaInicio;
    }

    public void setFecchaInicio(String fecchaInicio) {
        this.fecchaInicio = fecchaInicio;
    }

    public String getFecchaFin() {
        return fecchaFin;
    }

    public void setFecchaFin(String fecchaFin) {
        this.fecchaFin = fecchaFin;
    }

    public String getTiempoAlquiler() {
        return tiempoAlquiler;
    }

    public void setTiempoAlquiler(String tiempoAlquiler) {
        this.tiempoAlquiler = tiempoAlquiler;
    }

    public String getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(String precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
}
