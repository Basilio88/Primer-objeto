
package firstobjet;

public class FirstObjet {

    public static void main(String[] args) {
        Auto miCarro = new Auto("Porsche", "Gris", "992", "GT3", 4);
        miCarro.mostrarInformacion();
        
        miCarro.setColor("Negro");
        miCarro.setTipo("911");
        miCarro.setModelo("GT3 RS");
        
        System.out.println("Se han actualizado los datos del auto");
        System.out.println("Marca: "+miCarro.getMarca());
        System.out.println("Color: "+miCarro.getColor());
        System.out.println("Tipo: "+miCarro.getTipo());
        System.out.println("Modelo: "+miCarro.getModelo());
        System.out.println("Cantidad de pasajeros: "+miCarro.getCantidadPasajeros());
        
        System.out.println("Hola a todos");
    }
    
}
