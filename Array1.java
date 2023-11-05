/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testarraylist1;

/**
 *
 * @author cui
 */
import java.util.ArrayList;
public class Array1 {
    ArrayList <Integer> Array=new ArrayList<Integer>();
    //Add
    public void add(){
        Array.add(1);
        Array.add(2);
        Array.add(3);
        System.out.println(Array);
    }
    //Delet a element in ArrayLit
    public void remove(){
        Array.remove(1);
    }
    //Get a Value from ArrayList
    public void get(){ 
        int g=Array.get(0);
        System.out.println(g);
    }
    //Set a value in ArrayList
    public void set(){
      Array.set(0,5);
      System.out.println(Array);
}
    //Modifying ArrayList
  public void modify(){  
      Array.add(0,7);
}
  //ArrayList Size
  public void size(){
      int size=Array.size();
      System.out.println(size);
  }
  //Using of loop in ArrayLit
 /* public void loop(){
     for(int i=0;i<Array.size();i++){
         System.out.println(Array.get(i)+"\t");
         //System.out.println();
     } 
     System.out.println();
}*/
  public void loop() {
    for (int i = 0; i < Array.size(); i++) {
        System.out.println(Array.get(i));
    }
    // Add an extra println outside the loop to print a newline after all elements.
    System.out.println();
}

}