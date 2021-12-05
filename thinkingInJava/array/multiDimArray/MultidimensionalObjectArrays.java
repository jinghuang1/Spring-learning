package thinkingInJava.array.multiDimArray;

import java.util.Arrays;
class BerylliumSphere{
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Sphere " + id ;
    }
}
public class MultidimensionalObjectArrays {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres = {
                {new BerylliumSphere(), new BerylliumSphere()},
                {new BerylliumSphere(), new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere()},
                {new BerylliumSphere(),new BerylliumSphere(),
                new BerylliumSphere(),new BerylliumSphere(),
                new BerylliumSphere(),new BerylliumSphere(),
                new BerylliumSphere(),new BerylliumSphere()}
        };
        System.out.println(Arrays.deepToString(spheres));
    }
}
