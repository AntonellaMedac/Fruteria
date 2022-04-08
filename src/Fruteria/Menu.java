package Fruteria;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Indica el nombre de la fruteria: ");
        
        Fruteria f= new Fruteria(sc.next());
       
        
        int opcion;
        
        do{
            
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
            
            opcion=sc.nextInt();

            
            switch(opcion){
                case 1:
                    int opcion2;
                    do{
                        opcion2=sc.nextInt();
                        System.out.println("1.-Es mayor"
                                         + "\n2.-Es joven");
                        switch(opcion2){
                            case 1:
                               f.nuevoCliente(Edad.MAYOR);
                                break;
                            case 2: 
                                f.nuevoCliente(Edad.JOVEN);
                                break;
                        }
                        
                    }while(opcion2!=1||opcion2!=2);
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
                    System.out.println(f.getListaClientesNoAtendidos().toString());
                    System.out.println("");
                    break;
                    
                case 7:
                    System.out.println(f.getListaClientesAtendidos().toString());
                    System.out.println("");
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
