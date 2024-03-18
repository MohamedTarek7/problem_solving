package problem_set_2;

public class Player {
    private String name;
    private String position;
    private String current_team;
    private byte age;
    private String nationality;
    private double height;
    private double weight;
    private double speed;
    private double salary;
    
    Player(String name, String position, String current_team, byte age, String nationality, double height,
            double weight, double speed, double salary) {
        this.name = name;
        this.position = position;
        this.current_team = current_team;
        this.age = age;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCurrent_team() {
        return current_team;
    }

    public void setCurrent_team(String current_team) {
        this.current_team = current_team;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", position=" + position + ", current_team=" + current_team + ", age=" + age
                + ", nationality=" + nationality + ", height=" + height + ", weight=" + weight + ", speed=" + speed
                + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        Player p = new Player("mohamed", "rb", "madrid", (byte)26, "egyptian", 181.0, 72.0, 60.0, 100000.500);
    }
}
