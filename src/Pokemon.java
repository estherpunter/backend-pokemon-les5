public abstract class Pokemon {

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    private String name;
    private int level;
    private int hp;
    private String food;
    private String type;
    private String sound;

    public String getAttacks() {
        return attacks;
    }

    public void setAttacks(String attacks) {
        this.attacks = attacks;
    }

    private String attacks;


    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

}
