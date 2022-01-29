package thinkingInJava.exercise.chapter2;

/**
 * @author jinhuan3
 * @date 1/29/2022 - 11:22 PM
 */
public class Exercise6 {

  int storage(String s){
    return s.length() * 2;
  }

  public static void main(String[] args) {
    Exercise6 exercise6 = new Exercise6();
    System.out.println(exercise6.storage("ssp"));
  }
}
