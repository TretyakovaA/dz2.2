public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int resourcefulness;
    private  int lustForPower;

    public Slytherin (String name, int distance, int magic, int cunning, int determination, int resourcefulness, int lustForPower){
        super(name, distance, magic);
        this.cunning = cunning;
        this.determination = determination;
        this.resourcefulness =resourcefulness;
        this.lustForPower =lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }
}
