package problem_set_2;

public class Solution1 {
    public static void main(String[] args) {
        char[] team_scored = { 'a', 'a', 'a', 'b', 'a', 'b', 'a' };

        System.out.println("Winner: Team " + winner(team_scored));
    }

    public static char winner(char[] team_scored) {
        // byte team_a_counter = 0;
        // byte team_b_counter = 0;

        // for (int i = 0; i < team_scored.length; i++) {
        //     if (team_scored[i] == 'a') {
        //         team_a_counter++;
        //     } else {
        //         team_a_counter++;
        //     }

        // }

        return team_scored[team_scored.length-1] == 'a' ? 'A' : 'B';
    }
}
