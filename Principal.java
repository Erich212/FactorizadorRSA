package NumerosPrimos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Erich
 */
public class Principal 
{
    private static boolean d;
    private static Lista l=new Lista();
    
    
    public static void main(String[] args)
    {
        // TODO code application logic here
       
        int op;
      
        System.out.print("Ingrese un número:");
                        long n = In.readLong();
      
        do
        {
            
            System.out.println("Opciones");
            System.out.println("1)Verificar si el número es primo");
            System.out.println("2)El valor del siguiente primo");
            System.out.println("3)La lista de números factores primos");
            System.out.println("4)Salir");
            System.out.print("Ingrese una opción:");
            op=In.readInt();
            
           
        
                switch(op)
                
               {
                  
                    case 1:
                            if (l.isPrime(n) == false)
                            {
                             System.out.println("El resultado es:" + 0 + "(No es un número primo)");
                            }else 
                            {
                             System.out.println("El resultado es:" + 1 + "(Es un número primo)");
                             }
                                                                                           break;
                    case 2:long f = l.nextPrime(d, n);
                           System.out.println("El valor del siguiente número primo es:" + f);
                                                                                       break;
                    case 3:Lista y = l.factorization(n);
                           System.out.println("La lista generada es:"+y);
                                                                    break;
                    case 4:;
                      break;
                    
               }
        }while(op!=4);
                
    }
        
}
