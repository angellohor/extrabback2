package paqG07;
import paqG07.*;

import java.io.Serializable;

public class puerto implements Serializable {
    public almacen[] a = new almacen[3];

    public puerto() {
        a[0] = new almacen();
        a[1] = new almacen();
        a[2] = new almacen();
    }

    public boolean espacio(int num) {
        if (a[num].espacioa()){
            return true;
        } else return true;
    }

    public void apila(contenedor c) {
        if (a[0].apilacontenedor(c)) {
        } else if (a[1].apilacontenedor(c)) {
        } else if (a[2].apilacontenedor(c)) {
        }
    }

    public contenedor desapila(int hub, int colum) {
        contenedor desapilado = this.a[hub].desapilacontenedor(colum);
        return desapilado;
    }

    public contenedor muestra(int id){
        if (a[0].getcontainer(id)!=null) {
            return a[0].getcontainer(id);
        }else if (a[1].getcontainer(id)!=null) {
            return a[1].getcontainer(id);
        }else if (a[2].getcontainer(id)!=null) {
            return a[2].getcontainer(id);
        }else return null;
    }

    public int countp(String pais){
        return a[0].cuantosa(pais)+a[1].cuantosa(pais)+a[2].cuantosa(pais);
    }


}
