package codigo;

public class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private double salario;

    public Empleado(String nombre, String apellido, String dni, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {return dni;}

    public void setDni(String dni) {this.dni = dni;}

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioAnual(){
        return this.getSalario()*12;
    }

    public void aumentoSalarial(double aumento){ this.salario += this.salario * (aumento / 100.0D); }


    public String toString() {
        return
                " Nombre : '" + nombre + '\'' +
                " Apellido : '" + apellido + '\'' +
                " Dni :" + dni + '\'' +
                " Salario :" + salario ;
    }
    
}
