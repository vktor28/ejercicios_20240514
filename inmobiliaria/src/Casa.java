public class Casa extends Edificio {
    boolean adosada;
    final boolean oferta = true;
    public Casa(){
        super();
    }
    public Casa(String ubicacion, String tipo){
        super(ubicacion, tipo);

    }
    public Casa(int superficie, int precio, String ubicacion, String tipo, boolean adosada, boolean oferta){
        super(superficie, precio, ubicacion, tipo);
            this.adosada=adosada;  
    }
    public boolean isAdosada() {
        return this.adosada;
    }

    public boolean getAdosada() {
        return this.adosada;
    }

    public void setAdosada(boolean adosada) {
        this.adosada = adosada;
    }


    @Override
    public String toString() {
        String adosadaText="";
        String ofertaText="";
        if(isAdosada()){
             adosadaText=" adosada";
        } 
        if(oferta){
            ofertaText="¡¡OFERTA!!";
       }
        return getTipo()  +  adosadaText + " de " + getSuperficie()  + "m2 en " + getUbicacion() + " | Precio (" + ofertaText + "): " + getPrecio() + "€";
    }

   

}
