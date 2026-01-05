package ejemplolunes;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Estudiante;

/**
 *
 * @author CETECOM
 */
public class Inicio {

    public static void main(String[] args) {
        try {
        Estudiante es = new Estudiante();
            es.setRut("");
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(es.get); 
    }
    
}