package generics;

public class Cat extends Animal{
    private String litterPreference;

    public Cat() {
    }

    public Cat(String litterPreference) {
        this.litterPreference = litterPreference;
    }

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }
}
