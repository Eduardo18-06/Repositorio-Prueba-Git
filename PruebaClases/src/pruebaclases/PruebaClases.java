
package pruebaclases;

public class PruebaClases {
    private String nombre;
    private String apellido;
    private String celular;
    private String direccion;
    private String IDEspe;
    private String carrera;
    
    public PruebaClases(String nombre, String apellido, String celular, String direccion, String IDEspe, String carrera){
        this.nombre=nombre;
        this.apellido=apellido;
        this.celular=celular;
        this.direccion=direccion;
        this.IDEspe=IDEspe;
        this.carrera=carrera;
    }
   public void imprimir(){
    System.out.println("Nombre y apellido: "+nombre+" "+apellido+".");
    System.out.println("Numero de telefono: "+celular);
    System.out.println("Direccion: "+direccion);
    System.out.println("Id universitario: "+IDEspe);
    System.out.println("Carrera en curso: "+carrera);
}

    public static void main(String[] args) {
        // TODO code application logic here
        PruebaClases estudiante = new PruebaClases("Eduardo","Tasiguano","0939419340","Sur de Quito","L004545","TICS");
        estudiante.imprimir();
    }
    
}
