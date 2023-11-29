package simple;

public class PlaneDemo1 {
    public static void main(String[] args) {
        Plane one = new Plane("Red", "Jet", 1989);
        Plane two = new Plane("White", "AN-140", 2001);

        System.out.println(one);
        System.out.println(two);

        int i = 1;

        while (i <= 10) {
            System.out.println("JAVA " + i);
            i++;
        }

    }
}


class Plane {
    private String color;

    private String brand;

    private int yearOfProduce;

    public Plane(String color, String brand, int yearOfProduce) {
        this.color = color;
        this.brand = brand;
        this.yearOfProduce = yearOfProduce;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", yearOfProduce=" + yearOfProduce +
                '}';
    }
}


class PlaneChildren extends Plane {

    public PlaneChildren(String color, String brand, int yearOfProduce) {
        super(color, brand, yearOfProduce);
    }
}