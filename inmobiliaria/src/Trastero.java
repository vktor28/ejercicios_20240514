public class Trastero extends Edificio {
    boolean seguridad;
    final String tipo = "trastero";
    public Trastero (int superficie, int precio, String ubicacion, String tipo, boolean seguridad){
        super(superficie, precio, ubicacion, tipo);
        this.seguridad=seguridad;
    }
    public boolean isSeguridad() {
        return this.seguridad;
    }

    public boolean getSeguridad() {
        return this.seguridad;
    }

    public void setSeguridad(boolean seguridad) {
        this.seguridad = seguridad;
    }
    
    @Override
    public String toString() {
        String seguridadText="";
        if(isSeguridad()){
            seguridadText=" con seguridad";
        } 
        return getTipo() + " de " + getSuperficie() + "m2" +  seguridadText + " en " + getUbicacion() + " | Precio: " + getPrecio() + "€";
    }
}