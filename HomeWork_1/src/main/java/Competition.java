public class Competition {
    public static void main(String[] args) {
        Teammait[] teammaits = new Teammait[4];
        teammaits[0] = new Teammait("Иван", 900);
        teammaits[1] = new Teammait("Дмитрий", 800);
        teammaits[2] = new Teammait("Алексей", 600);
        teammaits[3] = new Teammait("Юрий", 500);

        Team team = new Team("Троеборцы", teammaits);

        Course course = new Course(100, 500, 200);

        String result = course.doIt(team);
        System.out.println(result);
    }
}
