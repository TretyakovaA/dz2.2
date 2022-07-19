public class Ravenclaw extends Hogwarts {
    private int creative;
    private int witty;
    private int wise;

    public Ravenclaw (String name, int magic, int distance, int creative, int witty, int wise) {
        super(name, magic, distance);
        this.creative = creative;
        this.witty = witty;
        this.wise = wise;
    }

    public int getCreative() {
        return creative;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }
}
/////наследуемся от хогвардса