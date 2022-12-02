
package cargasconsulta.extra3.entidades;

import cargasconsulta.extra3.enumeraciones.Cobertura;
import java.util.Date;
import java.util.List;


public class Poliza {
  private Cliente cliente;  
  private List<Vehiculos> vehiculos;
  private Integer poliza;
  private Date fechaInicio;
  private Date fechaFin;
  private Integer cuotas;
  private String formaPago;
  private Double montoTotalAsegutado;
  private boolean granizo;
  private Double montoGranizo;
  private Cobertura cobertura;

    public Poliza() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Integer getPoliza() {
        return poliza;
    }

    public void setPoliza(Integer poliza) {
        this.poliza = poliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Double getMontoTotalAsegutado() {
        return montoTotalAsegutado;
    }

    public void setMontoTotalAsegutado(Double montoTotalAsegutado) {
        this.montoTotalAsegutado = montoTotalAsegutado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public Double getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(Double montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }
  
  
 
}
