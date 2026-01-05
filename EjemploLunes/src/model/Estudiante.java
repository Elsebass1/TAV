package model;

/**
 *
 * @author CETECOM
 */
public class Estudiante {
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double estatura;

    public Estudiante(String rut, String nombre, String apellido, int edad, double peso, double estatura) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    public Estudiante(){
        
    }
    
    public void setRut (String rut)throws Exception{
        if (!rut.isBlank() && !rut.isEmpty())
        {
            this.rut =rut;
        }
        else
        {
            throw new Exception("No agrego rut");
        }
    }
    public String getRut(){
        return this.rut;
    }
    public void setNombre (String nombre)throws Exception{
        if (!nombre.isBlank() && !nombre.isEmpty())
        {
            this.nombre = nombre;
        }
        else
        {
            throw new Exception("Nombre no puede estar vacio");
        }
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String apellido) throws Exception{
        if (!apellido.isBlank() && !apellido.isEmpty())
        {
            this.apellido = apellido;
        }
        else
        {
            throw new Exception("El apellido no puede estar vacio");
        }
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setEdad (int edad){
        
    }
}
/**      *
 *      ***
 *    *******
 *  ***********
 *    *******
 *      ***
 *       *
 **/