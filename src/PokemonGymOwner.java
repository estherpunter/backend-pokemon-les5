public class PokemonGymOwner {

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    private String name;
    private String town;

    public PokemonGymOwner(String name, String town) {
        this.name = name;
        this.town = town;
    }

}
