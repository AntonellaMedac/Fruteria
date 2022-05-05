package Fruteria;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Indica el nombre de la fruteria: ");
        String nombre = sc.next();
        Fruteria f = new Fruteria(nombre);

        int opcion;

        do {

            System.out.println(nombre + "\n-----------------------------"
                    + "\n1.- Añadir cliente"
                    + "\n2.- Atender cliente"
                    + "\n3.- Adelantar puesto"
                    + "\n4.- Retrasar puesto"
                    + "\n5.- Dejar pasar"
                    + "\n6.- Mostrar no atendidos"
                    + "\n7.- Mostrar atendidos"
                    + "\n8.- Salir"
                    + "\n--------------------------");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int opcion2 = 0;
                    do {
                        System.out.println("1.-Es mayor"
                                + "\n2.-Es joven");
                        opcion2 = sc.nextInt();
                        if (opcion2 != 1 && opcion2 != 2) {
                            System.out.println("Se ha equivocado introduzca 1 o 2");
                        }
                        switch (opcion2) {
                            case 1:
                                f.nuevoCliente(Edad.MAYOR);
                                break;
                            case 2:
                                f.nuevoCliente(Edad.JOVEN);
                                break;
                        }

                    } while (opcion2 != 1 && opcion2 != 2);
                    break;

                case 2:
                    if (f.atenderCliente()) {
                        System.out.println("Cliente ha sido atendido");
                    } else {
                        System.out.println("No hay clientes para atender.");
                    }

                    break;

                case 3:
                    System.out.println("Introduca el ticket del cliente que va a adelantar");
                    int ticket = sc.nextInt();
                    if (f.adelantar(ticket) > 0) {
                        System.out.println("Ciente con ticket " + ticket + " ha adelantado un puesto");
                    } else {
                        System.out.println("No se ha podido adelantar al cliente");
                    }
                    break;

                case 4:
                    System.out.println("Introduca el ticket del cliente que va a retrasar");
                    int ticketAtrasar = sc.nextInt();
                    int posicionCliente=f.retrasar(ticketAtrasar);
                    if (posicionCliente == -1 || posicionCliente == f.getListaClientesNoAtendidos().size() - 1) {
                        System.out.println("No se ha podido retrasar al cliente");
                    } else {
                        System.out.println("Ciente con ticket " + ticketAtrasar + " ha retrasado un puesto");

                    }
                    break;

                case 5:
                    if (f.dejarPasar()) {
                        System.out.println("El primero ha dejado pasar a al segundo");
                    } else {
                        System.out.println("No hay nadie para dejar pasar");
                    }
                    break;

                case 6:
                    System.out.println(f.getListaClientesNoAtendidos().toString());
                    System.out.println("");
                    break;

                case 7:
                    System.out.println(f.getListaClientesAtendidos().toString());
                    System.out.println("");
                    break;

            }

        } while (opcion != 8);
    }

}
