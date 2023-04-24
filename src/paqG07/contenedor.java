package paqG07;

import java.io.Serializable;
import java.util.Objects;

public class contenedor implements Serializable {
    private int numero_identificación;
    private int peso;
    private String descripción;
    private String empresa_remitente;
    private String empresa_receptora;
    private String país_procedencia;
    private int prioridad;
    private boolean aduanas;
    private String estado;

    public contenedor(int numero_identificación, int peso,String empresa_remitente, String empresa_receptora, String país_procedencia, int prioridad, boolean aduanas) {
        this.numero_identificación = numero_identificación;
        this.peso = peso;
        this.empresa_remitente = empresa_remitente;
        this.empresa_receptora = empresa_receptora;
        this.país_procedencia = país_procedencia;
        this.prioridad = prioridad;
        this.aduanas = aduanas;
    }

    public contenedor() {
    }

    public int getNumero_identificación() {
        return numero_identificación;
    }

    public void setNumero_identificación(int numero_identificación) {
        this.numero_identificación = numero_identificación;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getEmpresa_remitente() {
        return empresa_remitente;
    }

    public void setEmpresa_remitente(String empresa_remitente) {
        this.empresa_remitente = empresa_remitente;
    }

    public String getEmpresa_receptora() {
        return empresa_receptora;
    }

    public void setEmpresa_receptora(String empresa_receptora) {
        this.empresa_receptora = empresa_receptora;
    }

    public String getPaís_procedencia() {
        return país_procedencia;
    }

    public void setPaís_procedencia(String país_procedencia) {
        this.país_procedencia = país_procedencia;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isAduanas() {
        return aduanas;
    }

    public void setAduanas(boolean aduanas) {
        this.aduanas = aduanas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "contenedor{\n" +
                "numero_identificación=" + numero_identificación +
                ", \npeso=" + peso +
                ", \ndescripción='" + descripción + '\'' +
                ", \nempresa_remitente='" + empresa_remitente + '\'' +
                ", \nempresa_receptora='" + empresa_receptora + '\'' +
                ", \npaís_procedencia='" + país_procedencia + '\'' +
                ", \nprioridad=" + prioridad +
                ", \naduanas=" + aduanas +
                ", \nestado='" + estado + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        contenedor that = (contenedor) o;
        return numero_identificación == that.numero_identificación;
    }

    public void copiac(contenedor a){
        this.descripción = a.descripción;
        this.aduanas = a.aduanas;
        this.empresa_receptora = a.empresa_receptora;
        this.estado = a.estado;
        this.empresa_remitente = a.empresa_remitente;
        this.peso = a.peso;
        this.prioridad = a.prioridad;
        this.país_procedencia = a.país_procedencia;
        this.numero_identificación = a.numero_identificación;

    }

}
//