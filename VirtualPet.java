public class VirtualPet extends VirtualPetApp {
    private String name;
    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 50;
        this.thirst = 50;
        this.waste = 0;
        this.boredom = 50;
        this.sickness = 0;
    }

    public void tick() {
        hunger += 10;
        thirst += 10;
        waste += 10;
        boredom += 10;
        sickness += 10;
    }

    public void feed() {
        hunger -= 50;
        thirst += 50;
    }

    public void water() {
        thirst -= 75;
    }

    public void waste() {
        waste -= 20;
    }

    public void play() {
        boredom -= 50;
        
    }

    public void takeToDoctor() {
        sickness += 50;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getWaste() {
        return this.waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getBoredom() {
        return this.boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getSickness() {
        return this.sickness;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }

}