package thinkingInJava.exercise.chapter2;

/**
 * @author jinhuan3
 * @date 1/29/2022 - 11:25 PM
 */
public class Exercise7 {

 static int increment(){
   return StaticTest.i++;
  }

  public static void main(String[] args) {
    System.out.println(Exercise7.increment());
  }
}
