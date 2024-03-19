package problem_set_2;

import java.util.Arrays;

public class FootballTeam {
    private String team_name;
    private Player[] team_players = new Player[5];
    
    public FootballTeam(String team_name, Player[] team_players) {
        this.team_name = team_name;
        this.team_players = team_players;
    }

    @Override
    public String toString() {
        return "FootballTeam [team_name=" + team_name + ", team_players=" + Arrays.toString(team_players) + "]";
    }
}
