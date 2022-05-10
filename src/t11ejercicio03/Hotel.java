package t11ejercicio03;

// @author lasensios01
public class Hotel {
    private int idHotel;
    private String zona;
    private int precio;

    public Hotel() {//constructor por defecto
        
    }

    public Hotel(int idHotel, String zona, int precio) {//constructor parametrizado
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = precio;
    }

    public void setIdHotel(int idHotel) {//Setters
        this.idHotel = idHotel;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdHotel() {//Setters
        return idHotel;
    }

    public String getZona() {
        return zona;
    }

    public int getPrecio() {
        return precio;
    }
    
    public void mostrarDatos(){
        System.out.println("- - - -");
        System.out.println("Id : " +idHotel);
        System.out.println("Zona: " +zona);
        System.out.println("Precio: " +precio);
        System.out.println("- - - -\n");
    }
}
