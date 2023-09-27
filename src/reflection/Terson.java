package reflection;

public class Terson {
    private String name;

    public Terson() {
        this.name = "Shcrec";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Terson{" +
                "name='" + name + '\'' +
                '}';
    }
}
