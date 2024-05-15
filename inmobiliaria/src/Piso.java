public class Piso extends Edificio {
    boolean ascensor;
    int piso;
    final String tipo = "piso";   
    public Piso(int superficie, int precio, String ubicacion, String tipo, boolean ascensor, int piso){
        super(superficie, precio, ubicacion, tipo);
            this.ascensor=ascensor;
            this.piso=piso;  
    }

    public boolean isAscensor() {
        return this.ascensor;
    }

    public boolean getAscensor() {
        return this.ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }

    public int getPiso() {
        return this.piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        String ascensorText=" sin ascensor";
        if(isAscensor()){
            ascensorText=" con ascensor";
        }
        return getTipo()+ " de " + getSuperficie()  + "m2 (Planta " + getPiso() + ")" +  ascensorText + " en " + getUbicacion() + " | Precio: " + getPrecio() + "€";
    }

}
