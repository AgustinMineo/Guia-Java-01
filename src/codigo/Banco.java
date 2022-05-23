package codigo;

public class Banco {
    private int id;
    private String nombre;
    private double balance;

    public Banco(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public double getBalance() {return balance;}
    public void setBalance(double balance) {this.balance = balance;}

    public double credito(double creditoAumento){return this.balance + creditoAumento;}
    public double debito(double debitoDescargo){
        if(this.balance<debitoDescargo){
            System.out.println("Saldo insuficiente");
        }else{
            this.balance-=debitoDescargo;
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return
                "id : " + id +
                " nombre : " + nombre + '\'' +
                " balance : " + balance ;
    }
}
