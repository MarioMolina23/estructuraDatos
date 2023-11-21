public class Atributos {
    private String nombre;
    private String cedula;
    private String sintomas;
    private String diagnostico;
    private String tratamiento;
    private String nombreDato;
    private String sintomaDato;
    
    public Atributos (){
        this.nombre = "";
        this.cedula = "";
        this.sintomas = "";
        this.diagnostico = "";
        this.tratamiento = "";
        this.nombreDato = "";
        this.sintomaDato = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getNombreDato() {
        return nombreDato;
    }

    public void setNombreDato(String nombreDato) {
        this.nombreDato = nombreDato;
    }

    public String getSintomaDato() {
        return sintomaDato;
    }

    public void setSintomaDato(String sintomaDato) {
        this.sintomaDato = sintomaDato;
    }
}
