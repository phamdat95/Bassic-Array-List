import java.util.Arrays;

class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[] = new Object[DEFAULT_CAPACITY];

    MyList(){
    }
    private void ensureCapa(){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element,newSize);
    }
    void add(E e){
        if (size == element.length){
           ensureCapa();
        }
        element[size++]=e;
    }
    E get(int index){
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (E) element[index];
    }
}
