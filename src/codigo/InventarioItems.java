package codigo;

public class InventarioItems {
    private int id;
    private String descripcion;
    private int cantidad;
    private double pUnitario;
    private double pTotal;

    public InventarioItems(int id, String descripcion, int cantidad, double pUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
        this.pTotal = pUnitario * cantidad ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getpUnitario() {
        return pUnitario;
    }

    public void setpUnitario(double pUnitario) {
        this.pUnitario = pUnitario;
    }

    public double getpTotal() {
        return pTotal;
    }

    public void setpTotal(double pTotal) {
        this.pTotal = pTotal;
    }


    @Override
    public String toString() {
        return
                "id=" + id +
                " descripcion : '" + descripcion + '\'' +
                " cantidad : " + cantidad +
                " pUnitario : " + pUnitario +
                " pTotal : " + pTotal ;
    }
}
