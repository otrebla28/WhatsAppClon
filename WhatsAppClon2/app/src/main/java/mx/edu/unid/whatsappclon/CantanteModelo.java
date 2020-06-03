package mx.edu.unid.whatsappclon;

public class CantanteModelo {
    private String cantante, nacionalidad;
    private int fotoCantante;

    public CantanteModelo() {
    }

    public CantanteModelo(String cantante, String nacionalidad, int fotoCantante) {
        this.cantante = cantante;
        this.nacionalidad = nacionalidad;
        this.fotoCantante = fotoCantante;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getFotoCantante() {
        return fotoCantante;
    }

    public void setFotoCantante(int fotoCantante) {
        this.fotoCantante = fotoCantante;
    }
}
