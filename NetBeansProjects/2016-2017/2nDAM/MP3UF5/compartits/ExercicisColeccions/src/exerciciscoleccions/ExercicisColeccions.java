/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciscoleccions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author profe
 */
public class ExercicisColeccions {

    public String bonDia(){
        return "Bon dia!!";
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Set col=new HashSet();
        
        col.add(new Object());
        col.add(new ExercicisColeccions());
        
        Iterator it=col.iterator();
        
        while(it.hasNext()){
            Object o=it.next();
            if(o instanceof ExercicisColeccions)
                System.out.println(((ExercicisColeccions)o).bonDia());
            
        }
        
        for(Object o:col)
            if(o instanceof ExercicisColeccions)
                System.out.println(((ExercicisColeccions)o).bonDia());
    }
    
}
