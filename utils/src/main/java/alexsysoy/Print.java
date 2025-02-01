package alexsysoy;

/**
 * Pretty view on console
 */
public class Print {
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
