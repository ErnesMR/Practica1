package consola;

public class Consola {
    public String marca;
    public String tasaRefresco;
    public String potencia;
    public String tipo;
    public String modelo="PS 5";

    protected String refresco(){
        return "120gz";
    }

    protected String duracion(){
        return "10 años";
    }

    protected String ventas(){
        return modelo;
    }

    protected String jugabilidad(){
        return "Buena";
    }

    protected String produccion(){
        return "La produccion es elevada";
    }


}
