import java.util.ArrayList;
import java.util.Scanner;

public class App {

/*
Tienes un programa principal de gestión inmobiliaria, que gestiona tres tipos de
inmuebles:
Características en común: superficie, precio, ubicación. Opcional: se puede añadir
tipo: casa, piso, trastero
como un campo más en vez de buscar la clase.
Características personalizadas:

- Casa => es adosada?
- Piso => en que planta está? Tiene ascensor?
- Trastero => tiene seguridad?

Crear una clase abstracta Edificio, o Inmueble, u otro nombre, de la cual hereden el
resto.
- Instanciar al menos dos de cada tipo (casa, piso , trastero)
- Dos tipos de consulta: una que muestre solo tipo y ubicación: ‘casa en Santa Coloma’
- Y otra que muestre todas las características. Mostrar casas

• Probar constructor vacío y luego llenarlo en el main

• Probar sobrecarga de métodos (método solo con tipo y ubicación)

• Verificar qué ocurre con los toString() en cada caso. No vale decir: ascensor=true. Tiene que ser
frase completa: ‘Es una casa de 100m2 en Sta. Coloma que vale 400.000E y está adosada’

• Probar a crear un atributo final en una de las clases hijas.

+extra: añadir datos por entrada de teclado


 */
    public static void main(String[] args) throws Exception {
        
        ArrayList <Edificio> edificiosAll = new ArrayList<>();

        //edificiosAll.add(new Casa(150,350000,"Cardedeu","casa",true,false));
        //edificiosAll.add(new Casa(450,1200000,"Figueres","casa",true,true));
        //edificiosAll.add(new Piso(60,2800000,"Barcelona","piso",false,1));
        //edificiosAll.add(new Piso(92,3800000,"Hospitalet","piso",true,3));
        //edificiosAll.add(new Trastero(7,5000,"Tarragona","trastero",false));
        //edificiosAll.add(new Trastero(10,10000,"Girona","trastero",true));
        Scanner teclado = new Scanner(System.in);
        boolean activo=true;
        while (activo) {
            Edificio.menu();
            int menuOption = teclado.nextInt();
            teclado.nextLine();
            switch (menuOption) {
                case 0:
                int superficieInmueble;
                int precioInmueble;
                String ubicacionInmueble="";
                    System.out.println("Cuántos inmuebles quieres añadir?");
                    int numInmuebles = teclado.nextInt();
                    teclado.nextLine();
                    for(int i=0; i<numInmuebles;i++){
                    System.out.println("Qué tipo de inmueble quieres añadir?");
                    System.out.println("1. Casa\n2. Piso\n 3. Trastero\n0. Cancelar");
                    int tipoInmueble = teclado.nextInt();
                    teclado.nextLine();
                    String tipoInmuebleText="";
                    switch (tipoInmueble) {
                        case 1:
                        tipoInmuebleText="casa";
                        System.out.println("Indica su ubicación");
                        ubicacionInmueble=teclado.nextLine();
                        System.out.println("¿Cúantos metros tiene?");
                        superficieInmueble=teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Indica su precio");
                        precioInmueble=teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("es adosada?(S/N)");
                        boolean adosada;
                        if(teclado.next().charAt(0)=='S'){adosada=true;}else{adosada=false;}
                        System.out.println("está en oferta?(S/N)");
                        boolean oferta;
                        if(teclado.next().charAt(0)=='S'){oferta=true;}else{oferta=false;}
                        edificiosAll.add(new Casa(superficieInmueble,precioInmueble,ubicacionInmueble,tipoInmuebleText,adosada,oferta));                        
                            break;
                        case 2:
                        tipoInmuebleText="piso";
                        System.out.println("Indica su ubicación");
                        ubicacionInmueble=teclado.nextLine();
                        System.out.println("¿Cúantos metros tiene?");
                        superficieInmueble=teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Indica su precio");
                        precioInmueble=teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("que piso es?");
                        int pisoInmueble=teclado.nextInt();
                        teclado.nextLine();
                        boolean ascensor;
                        System.out.println("tiene ascensor?(S/N)");
                        if(teclado.next().charAt(0)=='S'){ascensor=true;}else{ascensor=false;}
                        edificiosAll.add(new Piso(superficieInmueble,precioInmueble,ubicacionInmueble,tipoInmuebleText,ascensor,pisoInmueble)); 
                            break;
                        case 3:
                        tipoInmuebleText="trastero";
                        System.out.println("Indica su ubicación");
                        ubicacionInmueble=teclado.nextLine();
                        System.out.println("¿Cúantos metros tiene?");
                        superficieInmueble=teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Indica su precio");
                        precioInmueble=teclado.nextInt();
                        teclado.nextLine();
                        boolean seguridadInmueble;
                        System.out.println("tiene seguridad?(S/N)");
                        if(teclado.next().charAt(0)=='S'){seguridadInmueble=true;}else{seguridadInmueble=false;}
                        edificiosAll.add(new Trastero(superficieInmueble,precioInmueble,ubicacionInmueble,tipoInmuebleText,seguridadInmueble)); 
                            break;

                        default:
                            break;
                    }
                }

                    break;
                case 1:
                    Edificio.separador();
                    System.out.println("Tipo y ubicación");
                    for(Edificio x: edificiosAll)
                    {
                        System.out.println(x.tipoYubicacion());
                    }
                    Edificio.separador();
                    break;
                case 2:
                    Edificio.separador();
                    System.out.println("Todas las características");
                    
                    for(Edificio x: edificiosAll){
                        System.out.println(x.toString());
                    }
                    Edificio.separador();
                    break;
                case 3:
                    edificiosAll.add(new Casa());
                    for(Edificio x: edificiosAll){
                        if(x instanceof Casa){
                            System.out.println(x.toString());
                        }
                    }
                    System.out.println("-------");
                    System.out.println("Vamos a añadirle atributos");
                    int indexItems=(edificiosAll.size()-1);
                    System.out.println("Indica el tipo de vivienda");
                    edificiosAll.get(indexItems).setTipo(teclado.nextLine());
                    System.out.println("Indica la ubicación");
                    edificiosAll.get(indexItems).setUbicacion(teclado.nextLine());
                    for(Edificio x: edificiosAll){
                        if(x instanceof Casa){
                            System.out.println(x.tipoYubicacion());
                        }
                    }
                    Edificio.separador();
                    break;
                case 4:
                    System.out.println("Vamos a ñadir un casa indicando el tipo y la ubicación");
                    System.out.println("Indica que tipo es(casa,trastero,piso)");
                    String tipoVivienda=teclado.nextLine();
                    System.out.println("Ahora indica su ubicación");
                    String ubicacionVicienda=teclado.nextLine();
                    edificiosAll.add(new Casa(ubicacionVicienda, tipoVivienda));
                    for(Edificio x: edificiosAll){
                        if(x instanceof Casa){
                            System.out.println(x.tipoYubicacion());
                            Edificio.separador();
                        }
                    }

                    break;
                case 5:
                    activo=false;
                    Edificio.separador();
                    System.out.println("FINALIZADO");
                    Edificio.separador();
                    break;
                default:
                    break;
            }

        }
        
        
        
        
    }

}