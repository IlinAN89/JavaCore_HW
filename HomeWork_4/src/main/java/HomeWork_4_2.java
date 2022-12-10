public class HomeWork_4_2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "8999111111");
        phoneBook.add("Смирнов", "8999222222");
        phoneBook.add("Сидоров", "8999333333");
        phoneBook.add("Захаров", "8999444444");
        phoneBook.add("Иванова", "8999555555");
        phoneBook.add("Иванов", "8999666666");
        phoneBook.add("Соболев", "8999777777");
        phoneBook.add("Воронов", "8999888888");
        phoneBook.add("Орлов", "8999999999");
        phoneBook.add("Орлова", "8999123123");
        phoneBook.add("Сидоров", "8999456456");
        phoneBook.add("Сидоров", "8999789789");

        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Сидоров"));
        System.out.println(phoneBook.get("Орлов"));
        System.out.println(phoneBook.get("Иванова"));
    }
}
