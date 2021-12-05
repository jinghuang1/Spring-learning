package thinkingInJava.array.arrayAndGeneric;

import java.util.ArrayList;
import java.util.List;

class BerylliumSphere{
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Sphere " + id ;
    }
}
/*
It is possible to create arrays of generics
 */
public class ArraysOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[]) la;   //"Unchecked" warning
        ls[0] = new ArrayList<String>();
        //Compiles-time checking produces an error
        //! ls[1] = new ArrayList<Integer>();

        //However,if your needs are straightforward it is
        //possible to create an array of generics,albeit
        //with an "unchecked" warning:
        List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[]) new List[10];
        for (int i =0; i < spheres.length; i++){
            spheres[i] = new ArrayList<BerylliumSphere>();
        }
     }
}
