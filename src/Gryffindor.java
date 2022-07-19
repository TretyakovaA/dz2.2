public class Gryffindor extends Hogwarts {
    private  int nobility;
    private  int honour;
    private  int bravery;

    public Gryffindor (String name, int magic, int distance, int nobility, int honour, int bravery){
        super(name, magic, distance);
        this.nobility= nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    public int getNobility() {
        return nobility;
    }
}
