public abstract class Edificio {
       protected int superficie;
       protected int precio;
       protected String ubicacion;
       protected String tipo;
       

       public Edificio(){

       }
       public Edificio(String ubicacion, String tipo){
        this.ubicacion = ubicacion;
        this.tipo = tipo;
       }
        

    public Edificio(int superficie, int precio, String ubicacion, String tipo) {
        this.superficie = superficie;
        this.precio = precio;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
    }

    public int getSuperficie() {
        return this.superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "{" +
            " superficie='" + getSuperficie() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", ubicación='" + getUbicacion() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }
    public String tipoYubicacion() {
        return getTipo() + " " + getUbicacion();
    }
    public static void separador(){
        System.out.println("\n---------------\n");
    }

    public static void menu(){
        System.out.println("\n----MENU----\n");
        System.out.println("Elige una opción:");
        System.out.println("0. Añadir Inmuebles");
        System.out.println("1. Ver inmuebles por tipo y ubicación");
        System.out.println("2. Ver todos y sus características");
        System.out.println("3. Añadir casa constructor vacío y modificarla");
        System.out.println("4. Añadir casa con tipo y ubicación");
        System.out.println("5. SALIR");
    }

}


