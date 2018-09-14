/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumerosPrimos;

/**
 *
 * @author Erich
 */
public class Numero implements Comparable
{
    private int num;
    private boolean bool;
   
    
    public Numero()
    {
        
    }

    public Numero(int nu) 
    {
       num=nu;
       
    }
  public Numero(boolean b, int nu) 
    {
       bool=b;
       num=nu;
       
    }

      public void setNum(int nu)
    {
        num=nu;
    }

    public int getNum() 
    {
        return num;
    }

    
    public int compareTo( Object x )
    {
     Numero p = ( Numero ) x;
     return this.getNum()- p.getNum();
    }
    
     @Override
    public String toString() 
    {
        return "Numero{"+"El número es = "+ num +  '}';
    }
    
}
