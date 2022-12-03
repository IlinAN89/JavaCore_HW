public class Team {
    private String name;
    private Teammait[] teammaits;

    public Team(String name, Teammait[] teammaits) {
        this.name = name;
        this.teammaits = teammaits;
    }

    public String getName() {
        return name;
    }

    public Teammait[] getTeammaits() {
        return teammaits;
    }
}
