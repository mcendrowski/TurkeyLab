package sortable.sets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MCENDROWSKI
 */
public class Turkey implements Comparable {
   private double weight;
   private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Turkey(double weight, int id) {
        this.weight = weight;
        this.id = id;
    }
   

   

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Turkey{" + "weight=" + weight + ", id=" + id + '}';
    }

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turkey other = (Turkey) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    

     @Override
    public int compareTo(Object o) {
       Turkey turkey = (Turkey)o;
       
       final int EQUAL = 0;
       final int BEFORE = -1;
       final int AFTER = 1;
       
       if(this.equals(turkey)){
           return EQUAL;
       }
       if(turkey.getId()>this.getId()){
           return BEFORE;
       } else {
           return AFTER;
       }
       
    }
   
}

