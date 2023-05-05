package mundo;

public class Alcancia {
    //Atributos de la clase alcancia
    private int numeroMonedas50;
    private int numeroMonedas100;
    private int numeroMonedas200;
    private int numeroMonedas500;
    private int numeroMonedas1000;
    private int estado;

    //Constructor de la clase
    public Alcancia() {
        this.numeroMonedas50 = 0;
        this.numeroMonedas100 = 0;
        this.numeroMonedas200 = 0;
        this.numeroMonedas500 = 0;
        this.numeroMonedas1000 = 0;
        this.estado = 1;
    }

    //Metodos de la clase
    public int getNumeroMonedas50() {
        return numeroMonedas50;
    }

    public void setNumeroMonedas50(int numeroMonedas50) {
        this.numeroMonedas50 = numeroMonedas50;
    }

    public int getNumeroMonedas100() {
        return numeroMonedas100;
    }

    public void setNumeroMonedas100(int numeroMonedas100) {
        this.numeroMonedas100 = numeroMonedas100;
    }

    public int getNumeroMonedas200() {
        return numeroMonedas200;
    }

    public void setNumeroMonedas200(int numeroMonedas200) {
        this.numeroMonedas200 = numeroMonedas200;
    }

    public int getNumeroMonedas500() {
        return numeroMonedas500;
    }

    public void setNumeroMonedas500(int numeroMonedas500) {
        this.numeroMonedas500 = numeroMonedas500;
    }

    public int getNumeroMonedas1000() {
        return numeroMonedas1000;
    }

    public void setNumeroMonedas1000(int numeroMonedas1000) {
        this.numeroMonedas1000 = numeroMonedas1000;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int calcularTotalDinero(){
        int total = 0;
        return total = (getNumeroMonedas50() * 50) + (getNumeroMonedas100() * 100) + (getNumeroMonedas200() * 200) + (getNumeroMonedas500() * 500) + (getNumeroMonedas1000() * 1000);
    }

    public String darEstadoAlcancia(){
        return "";
    }

    public void romperAlcancia(){}
}
