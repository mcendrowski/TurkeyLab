/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortable.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author MCENDROWSKI
 */
public class TurkeySorting {
    public static void main(String[] args) {
        
        Turkey t1 = new Turkey(7.5,1);
        Turkey t2 = new Turkey(6.5,2);
        Turkey t3 = new Turkey(7.5,3);
        Turkey t4 = new Turkey(5.0,4);
        
        List<Turkey> turkeyList = new ArrayList<>();
        
        turkeyList.add(t1);
        turkeyList.add(t2);
        turkeyList.add(t3);
        turkeyList.add(t4);
        
      
        Set<Turkey> turkeySet = new TreeSet<>(turkeyList);
        
//          System.out.println("\n------------------ natural sorting in the set---------------------------\n");
//        for(Turkey turkey: turkeySet){
//            System.out.println(turkey.toString());
//        }
        
        System.out.println("\n-------------------- natural sorting in the list -------------------------\n");
        turkeyList = new ArrayList<>(turkeySet);
        for(Turkey turkey: turkeyList){
            System.out.println(turkey.toString());
        }
        
        System.out.println("\n------------------ alternative sorting ---------------------------\n");
        Collections.sort(turkeyList, new TurkeyByWeightThenId());
        for(Turkey turkey: turkeyList){
            System.out.println(turkey.toString());
        }
    } 
}
