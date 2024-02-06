import java.util.Comparator;

import static java.lang.String.format;

public class Pet implements Comparable<Pet> {
    private String animalBreed;
    private String name;
    private double weight;

    public Pet(String animalBreed, String name, double weight) {
        this.animalBreed = animalBreed;
        this.name = name;
        this.weight = weight;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return format("Pet{animalBreed=%s,name=%s,weight=%.2f}",
                animalBreed, name, weight);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Pet o) {
        return Double.compare(this.weight, o.weight);
    }
}
