package co.edu.uniquindio.GestionEmpleados.model;

public class Empleado {
    private String nombreEmpleado;
    private String idempleado;
    private String rolEspecifico;
  

    public Empleado (String nombreEmpleado, String idempleado, String rolEspecifico) {
        this.nombreEmpleado = nombreEmpleado;
        this.idempleado = idempleado;
        this.rolEspecifico = rolEspecifico;
    }
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getIdempleado() {
        return idempleado;
    }
    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }
    public String getRolEspecifico() {
        return rolEspecifico;
    }
    public void setRolEspecifico(String rolEspecifico) {
        this.rolEspecifico = rolEspecifico;
    }
}
