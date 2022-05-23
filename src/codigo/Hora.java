package codigo;

/*
    Se necesitan 3 de sumar y 3 de restar
    Evaluar si resta hora, restar min y si resta min, restar seg
    Concatenar las funciones


*/


public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = (hora >= 0 && hora < 24) ? hora : 0;  /// Si la hora es >=0 y hora <24, sino hora es 0;
        this.minuto = (minuto >= 0 && minuto < 60) ? minuto : 0;
        this.segundo = (segundo >= 0 && segundo < 60) ? segundo : 0;
    }

    public int getHora() {return hora;}

    public void setHora(int hora) {this.hora = hora;}

    public int getMinuto() {return minuto;}

    public void setMinuto(int minuto) {this.minuto = minuto;}

    public int getSegundo() {return segundo;}

    public void setSegundo(int segundo) {this.segundo = segundo;}

    public Hora sumarSeg(){
        if(this.segundo==59){
            this.segundo=0;
            sumarMin();
        }else{
            this.segundo++;
        }
        return this;
    }
    public void sumarMin(){
        if(this.minuto==59){
            this.minuto=0;
            sumarHora();
        }else{
            this.minuto++;
        }
    }

    public void sumarHora(){
        if(this.hora==23){
            this.hora=0;
        }else{
            this.hora++;
        }
    }
    public void restarMin(){
        if(this.minuto==0){
            this.minuto=59;
            retroHora();
        }else{
            this.minuto--;
        }
    }
    public Hora restarSeg(){
        if(this.segundo==0){
            this.segundo=59;
            restarMin();
        }else{
            this.segundo--;
        }
        return this;
    }

    public void retroHora(){
        if(this.hora==0){
            this.hora=23;
        }else{
            this.hora--;
        }
    }

    public Hora sumSeg(){
        if(this.segundo==59){
            this.segundo=0;
        }else{
            this.segundo++;
        }
        return this; /// Retorna la instancia del objeto
    }

    @Override
    public String toString() {
        String horaS= String.format("%02d",this.hora);
        String minS= String.format("%02d",this.minuto);
        String segS= String.format("%02d",this.segundo);
        return   horaS + " : " + minS + " :" + segS;
    }
}
