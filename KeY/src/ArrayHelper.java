public class ArrayHelper {

    public static void replaceIfGreater(int newE, int at, int[] array) {
		if (newE > array[at]) {
			array[at] = newE;
		}
    }


}