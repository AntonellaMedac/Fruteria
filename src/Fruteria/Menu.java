package Fruteria;

public class Menu {

    public static void main(String[] args) {
        Fruteria f1 = new Fruteria("Manu");
        f1.nuevoCliente(Edad.JOVEN);
        f1.nuevoCliente(Edad.JOVEN);
        f1.nuevoCliente(Edad.JOVEN);
        f1.nuevoCliente(Edad.JOVEN);
        f1.nuevoCliente(Edad.JOVEN);
        System.out.println(f1.getListaClientesNoAtendidos().toString());
    }

}
