package thinkingInJava.array.arrayAndGeneric;

public class ArrayOfGenericType<T>{
    T[] array;      //OK
    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size){
        //! array = new T[size];    //Illegal
        // 向上转型 Object -> T
        array = (T[])new Object[size];      //"unchecked" warning
    }
    //Illegal:
    //!public <U> U[] makeArray(){
    //      return new U[10];
    // }
}
