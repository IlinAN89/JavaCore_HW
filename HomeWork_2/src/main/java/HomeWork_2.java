public class HomeWork_2 {

    static String[][] arrayDataException = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "☻", "9", "8"}, {"7", "6", "5", "4"}};
    static String[][] arraySizeException = {{"1", "2"}, {"3", "4",}, {"5", "6"}, {"7", "8"}};
    static String[][] arrayWithNoError = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "8", "7", "6"}, {"5", "4", "3", "2"}};

    static int sizeA = 4;
    static int sizeB = 4;

    public static void main(String[] args) {

        try {
            System.out.println("Сумма массива: " + getSumm(arrayWithNoError));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма массива: " + getSumm(arraySizeException));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма массива: " + getSumm(arrayDataException));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkValue(String[][] array) throws MyArraySizeException {
        if (array.length != sizeA || array[0].length != sizeB) throw new MyArraySizeException();
    }

    static Integer getSumm(String[][] array) throws MyArrayDataException, MyArraySizeException {
        checkValue(array);
        Integer result = 0;
        int i = 0;
        int j = 0;
        try {
            for (; i < array.length; i++) {
                j = 0;
                for (; j < array.length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Ошибка массива в позиции: " + "[" + i + "]" + "[" + j + "]");
        }

        return result;
    }
}
