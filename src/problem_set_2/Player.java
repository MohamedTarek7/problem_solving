package problem_set_2;

public class Player {
    private String name;
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Player [name: " + name + "]";
    }
}
