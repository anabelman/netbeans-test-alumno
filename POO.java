package logica;

public class POO {

 
    public static void main(String[] args) {
 
        
        Alumno alu1 = new Alumno ();
        Alumno alu2 = new Alumno (5, "Ana", "Belman");
        
       
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("el apellido es: " + alu2.getApellido());
        
        alu1.setId(8);
        alu1.setNombre("Rodrigo");
        alu1.setApellido("Perez");
        
        System.out.println("-----------");
        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("el apellido es: " + alu1.getApellido());
        
        // aca esta el cambio de valor
        alu2.setId(35);
        
        System.out.println("-----------");
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("el apellido es: " + alu2.getApellido());               
    }
    
}
