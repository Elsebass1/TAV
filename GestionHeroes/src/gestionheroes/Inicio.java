package gestionheroes;

import model.Heroe;
import model.MascotaMagica;

/**
 *
 * @author sebas
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            MascotaMagica masc = new MascotaMagica("Kripto","volar",29);
            Heroe Her = new Heroe("Superman",80,masc);
            System.out.println("Heroe: "+Her.getNombre());
            System.out.println("Nombre mascota: "+ masc.getNombre());
            System.out.println("Poder de la mascota: "+ masc.getTipoDePoder());
            System.out.println("Porcentaje de Energia consumida: "+ masc.getPorcentajeDeEnergiaGastada());
            System.out.println("Energia consumida: "+Her.cantidadDeEnergiaPerdida());
            if(Her.puedeUsarMascota(10)){
                System.out.println("Si puede usar la mascota 10 veces");
            }else{
                System.out.println("NO puede usar la mascota 10 veces");
            }
            
        } catch (Exception ex) {
            System.getLogger(Inicio.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
}
