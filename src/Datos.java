/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cass
 */
public class Datos {
    private int dias;
    private double precioPorDia;
    private String tipoCliente;
    private double costoBase;
    private double cargoSeguro;
    private double subtotal;
    private double descuento;
    private double totalPagar;

    public Datos() {
        this.dias = 0;
        this.precioPorDia = 0.0;
        this.tipoCliente = "";
        this.costoBase = 0.0;
        this.cargoSeguro = 0.0;
        this.subtotal = 0.0;
        this.descuento = 0.0;
        this.totalPagar = 0.0;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public double getCargoSeguro() {
        return cargoSeguro;
    }

    public void setCargoSeguro(double cargoSeguro) {
        this.cargoSeguro = cargoSeguro;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }    
}
