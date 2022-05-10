package t11ejercicio03;

//@author lasensios01
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test {
    //hashset es una coleccion(como arrayList) que no guarda de forma ordenada

    public static int opcion() {
        Scanner entradaI = new Scanner(System.in);
        System.out.println("(1. Playa - 2. Montaña - 3. Rural  - - 4. Salir) ");
        System.out.print("Introduce: ");
        return entradaI.nextInt();
    }

    public static String aleatorioZona() {
        String[] vZonas = {"Playa", "Montaña", "Rural"};
        int aleatorioZona;
        aleatorioZona = (int) (Math.random() * 3);
        return vZonas[aleatorioZona];

    }

    public static int aleatorioPrecio() {
        int aleatorioPrecio;
        aleatorioPrecio = (int) (Math.random() * 200 + 100);
        return aleatorioPrecio;

    }

    public static void mostrarHoteles(Set<Hotel> conjunto) {//los cojuntos se muestran con un iterador, ¿solo cuando son objetos?
        Iterator it = conjunto.iterator();
        Hotel aux;
        while (it.hasNext()) {
            aux = (Hotel) it.next();// hago el casting explicito(Hotel) lo requiere por que es su sintaxis
            System.out.println("- - - -");
            System.out.println("Id : " + aux.getIdHotel());
            System.out.println("Zona: " + aux.getZona());
            System.out.println("Precio: " + aux.getPrecio());
            System.out.println("- - - -\n");
        }
    }

    public static void mostrarHotelesPorZona(Set<Hotel> conjunto, String zona) {//los cojuntos se muestran con un iterador, ¿solo cuando son objetos?
        Iterator it = conjunto.iterator();
        Hotel aux;
        while (it.hasNext()) {
            aux = (Hotel) it.next();
            if (aux.getZona() == zona) {
                System.out.println("- - - -");
                System.out.println("Id : " + aux.getIdHotel());
                System.out.println("Zona: " + aux.getZona());
                System.out.println("Precio: " + aux.getPrecio());
                System.out.println("- - - -\n");
            }
        }
    }

    public static void main(String[] args) {
        Set<Hotel> conjunto = new HashSet<>();
        for (int i = 0; i < 12; i++) {//12 hoteles
            conjunto.add(new Hotel((i + 1), aleatorioZona(), aleatorioPrecio()));
        }
        mostrarHoteles(conjunto);
        int opc;
        String[] vZonas = {"Playa", "Montaña", "Rural"};
        String zona;
        do {
            opc = opcion();
            switch (opc) {
                case 1:
                    zona = vZonas[0];
                    mostrarHotelesPorZona(conjunto, zona);
                    break;
                case 2:
                    zona = vZonas[1];
                    mostrarHotelesPorZona(conjunto, zona);
                    break;
                case 3:
                    zona = vZonas[2];
                    mostrarHotelesPorZona(conjunto, zona);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("No es correcto lo que has introducido");
                //4 opcion y do while para repetir mientras no salga
            }
        } while (opc != 4);
    }

}
