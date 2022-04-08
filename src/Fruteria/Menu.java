package Fruteria;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        
        Scanner sc= new Scanner(System.in);
        
        int opcion;
        
        do{
            opcion=sc.nextInt();
            
            System.out.println("-----------------------------"
                             + "\n1.- Añadir cliente"
                             + "\n2.- Atender cliente"
                             + "\n3.- Adelantar puesto"
                             + "\n4.- Retrasar puesto"
                             + "\n5.- Dejar pasar"
                             + "\n6.- Mostrar no atendidos"
                             + "\n7.- Mostrar atendidos"
                             + "\n8.- Salir"
                             + "\n--------------------------");
            
            switch(opcion){
                case 1:
                    do{
                        System.out.println("1.-Es mayor"
                                         + "\n2.-Es menor");
                        switch(opcion){
                            case 1:
                                Cliente c=new Cliente(opcion, Edad.MAYOR);
                                break;
                        }
                        
                    }while(opcion!=1||opcion!=2);
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    break;
                    
                case 6:
                    break;
                    
                case 7:
                    break;
                    
            }
            
            
        }while(opcion!=8);
        
       

        /*Fruteria f1 = new Fruteria("Manu");
        f1.nuevoCliente(Edad.JOVEN);
        f1.nuevoCliente(Edad.JOVEN);
        f1.nuevoCliente(Edad.JOVEN);
        f1.nuevoCliente(Edad.JOVEN);
        f1.nuevoCliente(Edad.JOVEN);
        System.out.println(f1.getListaClientesNoAtendidos().toString());
>>>>>>> a6bfd624d9ce2b75181a913f16fe9c19df9ee15e*/
    }

}
