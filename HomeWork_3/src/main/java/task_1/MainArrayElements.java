package task_1;

import java.util.Arrays;

public class MainArrayElements {
    static Integer[]  arrayInteger = {7, 6, 5};

    public static void main(String[] args) {
        SwapArrayClass<Object> swapArrayClass = new SwapArrayClass<>();
        try {
            System.out.println(Arrays.toString(swapArrayClass.swapElements (arrayInteger, 0, 2)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}
