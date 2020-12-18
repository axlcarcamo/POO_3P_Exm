/*
Universidad Tecnologica de Honduras
Catedratico      : Ing Walter Suazo.
Alumno           : Axel R. Carcamo.
Numero de cuentas: 201910060114
Examen           : 3 Parcial

*/

package examen;

public class Deportivo extends Zapato{
    private String tipoDeporte;

    public Deportivo() {
    }

    public Deportivo(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public Deportivo(String tipoDeporte, int talla, String color, String marca, String modelo, String TipoDeAjuste) {
        super(talla, color, marca, modelo, TipoDeAjuste);
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }


    
    
}
