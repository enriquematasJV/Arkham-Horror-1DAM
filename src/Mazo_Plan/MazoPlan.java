/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo_Plan;
import java.util.ArrayList;


/**
 *
 * @author Imanol G
 */
public class MazoPlan {
    
    ArrayList<MazoPlan> mazoPlan = new ArrayList<>();
    
    
    public MazoPlan(String nombre){
        
    }
    
    
    public void CartasPlan(){
       
       mazoPlan.add(new MazoPlan("QueEstaPasando"));
       mazoPlan.add(new MazoPlan("El asceso de los gules"));
       mazoPlan.add(new MazoPlan("¡Están saliendo!")); 
       
   }
    
    
}
