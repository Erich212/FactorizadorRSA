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
public class Node 
{
    private Comparable info;
    private Node next;
    
    public Node() 
    {
    }
 
    
      public Node(Comparable x,Node p) 
    {
        info=x;
        next=p;
    }

  
    /**
     * @return the info
     */
      
    public Comparable getInfo()
    {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(Comparable p)
    {
       info = p;
    }

    /**
     * @return the next
     */
    public Node getNext() 
    {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node p)
    {
        next = p;
    }
    
    
    
     public String toString() 
    {
        return info.toString();
    }
}
