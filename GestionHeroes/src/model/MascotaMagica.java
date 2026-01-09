package model;

/**
 *
 * @author sebas
 */
public class MascotaMagica {
    private String nombre;
    private String tipoDePoder;
    private int porcentajeDeEnergiaGastada;

    public MascotaMagica(String nombre, String tipoDePoder, int porcentajeDeEnergiaGastada) throws Exception {
        this.setNombre(nombre);
        this.setTipoDePoder(tipoDePoder);
        this.setPorcentajeDeEnergiaGastada(porcentajeDeEnergiaGastada);
    }
    
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
    
    public String getTipoDePoder() {
        return tipoDePoder;
    }
    public void setTipoDePoder(String tipoDePoder) {
        this.tipoDePoder = tipoDePoder;
    }

    public int getPorcentajeDeEnergiaGastada() {
        return porcentajeDeEnergiaGastada;
    }
    public void setPorcentajeDeEnergiaGastada(int porcentajeDeEnergiaGastada) {
        if(porcentajeDeEnergiaGastada >= 5 && porcentajeDeEnergiaGastada <=30)
            this.porcentajeDeEnergiaGastada = porcentajeDeEnergiaGastada;
    }
}
