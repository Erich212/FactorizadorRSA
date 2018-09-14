/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumerosPrimos;

import java.util.NoSuchElementException;

/**
 *
 * @author Erich
 */
public class Lista
{
    private Node frente;
    private int cantidad;
    private boolean d;

    
    public Lista()
    {
        frente = null;
        cantidad=0;
    }

    
   
     private boolean isHomogeneus (Comparable x)
    {
        if ( x == null ) return false;
        if ( frente != null && x.getClass() != frente.getInfo().getClass() ) return false;
        return true;
      }
     
     
     
      public void addInOrder(Comparable x)
      {
            if ( ! isHomogeneus( x ) ) return;
            
            Node nuevo = new Node( x, null );
            Node p = frente, q = null;
            while ( p != null && x.compareTo( p.getInfo() ) >= 0 )
            {
                q = p;
                p = p.getNext();
            }
            nuevo.setNext( p );
            if( q != null ) q.setNext( nuevo );
            else frente = nuevo;
            cantidad++;
      } 
      
    public Comparable getLast()
      {
         if (frente == null) throw new NoSuchElementException("Error: la lista esta vacia...");
         Node p = frente;
         while( p.getNext() != null ) { p = p.getNext(); }
         return p.getInfo();
      }

  
    
    public boolean isPrime(long n)
    {

        boolean a = false;

        if (n == 1)
        {
            a = true;
        }
        if (n == 2)
        {
            a = true;
        }
        if (n == 3)
        {
            a = true;
        }

        for (long i = 2; i <= Math.sqrt(n); i++)
        {

            if ((n % i) == 0)
            {
                a = false;
                break;
            } else 
            {
                a = true;
            }

        }

        return a;
    }
  
     
     public long nextPrime(boolean d, long n)
    {
        if(d == false)
        {
        while (d == false)
        {
            n++;
            d = isPrime(n);
        }
        }
        else
        {
            n++;
            d = isPrime(n);
            
            while(d == false)
            {
                n++;
                d = isPrime(n);
            }
        }
        return n;

    }
     
     
     
     
      public  Lista factorization(long n)
    {

        Lista l = new Lista();

        long i = 2;

       
        while (n > 1)
        {
             if(isPrime(n)== false)
           {
              
                if ((n % i) == 0)
                {
                    n = n / i;
                    if(isPrime(i)== true)
                    {
                        l.addInOrder(i);
                    }
                    else 
                    {
                        i=nextPrime(d,i);
                    }
                }
                
                else 
                {
                  i=nextPrime(d,i);
                 }
                
            }       
                
             else 
           {
        
                    if((n % i)==0) 
                    {
                       n=n/i;
                       if(isPrime(i)== true)
                       {
                          l.addInOrder(i);
                         
                       }
                    
                       else
                       {
                         i=nextPrime(d,i);
                         
                        }
                    }
                    
                    else
                    {
                        i=nextPrime(d,i);
                    }
       
           }
     
        }
       return l;
    }
      
      
    public String toString()
      {
             Node p = frente;
             String res = "[ ";
             while( p != null )
             {
                res = res + p.toString();
                if ( p.getNext() != null ) res = res + " - ";
                p = p.getNext();
             }
             res = res + " ]";
             return res;
      }
    

    
    
}
