package Fruteria;

public class Cliente {
    private int nTicket;
    private Edad edad;
    
    public Cliente(int nTicket, Edad edad){
        this.nTicket = nTicket;
        this.edad = edad;
    }

    public int getnTicket() {
        return nTicket;
    }
    public void setnTicket(int nTicket) {
        this.nTicket = nTicket;
    }
    public Edad getEdad() {
        return edad;
    }
    public void setEdad(Edad edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Numero de ticket " + nTicket + " del cliente " + edad;
    }
}
