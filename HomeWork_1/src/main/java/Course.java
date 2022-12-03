public class Course {
    String result;
    private int swim;
    private int run;
    private int crawl;

    public Course(int swim, int run, int crawl) {
        this.swim = swim;
        this.run = run;
        this.crawl = crawl;
    }

    public String doIt(Team team) {
        result = "Команда: " + team.getName() + "." + '\n';
        for (Teammait teammait: team.getTeammaits()) {
            result += "Участник команды: " + teammait.getName() + "." + '\n';
            int value = teammait.getDistance();
            actionSwim(value);
            actionRun(value);
            actionCrawl(value);
        }
        return result;
    }

    private void actionCrawl(int value) {
        if (value>=(swim + run + crawl)) result += "Препятствие 'Проползти' - участник перодолел." + '\n';
        else result += "Препятствие 'Проползти' - участник устал после плавания и бега, и не смог преодолеть." + '\n';
    }

    private void actionRun(int value) {
        if (value>=(swim + run)) result += "Препятствие 'Пробежать' - участник перодолел." + '\n';
        else result += "Препятствие 'Пробежать' - участник устал после плавания и не смог преодолеть." + '\n';
        
    }

    private void actionSwim(int value) {
        if (value>=swim) result += "Препятствие 'Проплыть' - участник перодолел." + '\n';
        else result += "Препятствие 'Проплыть' - участник не смог преодолеть." + '\n';
        
    }
}
