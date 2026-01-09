package model;

/**
 *
 * @author sebas
 */
public class Heroe {
    private String nombre;
    private int nivelDeEnergia;
    private MascotaMagica mascota;

    public Heroe() {
    }
//constructor
    public Heroe(String nombre, int nivelDeEnergia, MascotaMagica mascota) throws Exception{
        this.setNombre(nombre);
        this.setNivelDeEnergia(nivelDeEnergia);
        this.setMascota(mascota);
    }
//getter y setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception{
        if(!nombre.isBlank() && !nombre.isEmpty()){
            this.nombre = nombre;
        }else{
        throw new Exception ("Debe ingresar un nombre");
        }
    }

    public int getNivelDeEnergia() {
        return nivelDeEnergia;
    }

    public void setNivelDeEnergia(int nivelDeEnergia) {
        if(nivelDeEnergia>= 0 && nivelDeEnergia <= 120)
        this.nivelDeEnergia = nivelDeEnergia;
    }

    public MascotaMagica getMascota() {
        return mascota;
    }

    public void setMascota(MascotaMagica mascota) {
        this.mascota = mascota;
    }
    /**
*    metodo para calcular y retornar la cantidada de energia peridad al usar el poder de la mascota 
valor de la energia gastada
     * @return 
*/
    public int cantidadDeEnergiaPerdida(){
        return this.nivelDeEnergia * this.mascota.getPorcentajeDeEnergiaGastada()/100;
    }
/**retorna indicador para saber si se puede usar o no la mascota las veces indicadas 
 * 
     * @param veces
     * @return 
 */
    public boolean puedeUsarMascota(int veces){
         return this.nivelDeEnergia>= this.cantidadDeEnergiaPerdida()*veces;
    }
}
    

