public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int honour;
    private int dedication;

    public Hufflepuff (String name, int distance, int magic, int hardworking, int honour, int dedication){
        super(name, distance, magic);
        this.hardworking = hardworking;
        this.honour =honour;
        this.dedication =dedication;

    }

    public int getDedication() {
        return dedication;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getHonour() {
        return honour;
    }
}
