public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[5] = 10; //This line causes ArrayIndexOutOfBoundsException
        System.out.println(array[5]);
    }
}