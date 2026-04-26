
public class CreateArray {

    public static int[] create10() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr1 = create10();
        java.util.Arrays.sort(arr1);
        System.out.println(java.util.Arrays.toString(arr1));

    }

}
