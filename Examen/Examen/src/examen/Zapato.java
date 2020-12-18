/*
Universidad Tecnologica de Honduras
Catedratico      : Ing Walter Suazo.
Alumno           : Axel R. Carcamo.
Numero de cuentas: 201910060114
Examen           : 3 Parcial

*/

package examen;

public abstract class Zapato {
    private int talla;
    private String color;
    private String marca;
    private String modelo;
    private String TipoDeAjuste;


    public String getTipoDeAjuste() {
        return TipoDeAjuste;
    }

    public void setTipoDeAjuste(String TipoDeAjuste) {
        this.TipoDeAjuste = TipoDeAjuste;
    }

    public Zapato() {
    }

    public Zapato(int talla, String color,String marca, String modelo,String TipoDeAjuste   ) {
        this.talla = talla;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.TipoDeAjuste = TipoDeAjuste;
                
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
