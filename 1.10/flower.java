public class flower {
    // TODO: Create variables for name, petals and price
    String name;
    int petals;
    float price;

    // TODO: Create a constructor for a flower using name, petals and price
    public flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    // TODO: Create methods to update the values for name, petals and price. 
    // Use setName, setPetals and setPrice as your method names.
    public void setName(String name) {
        this.name = name;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // TODO: Create accessor methods to get the values for name, petals and price.
    // Use getName, getPetals and getPrice as your method names.
    public String getName() {
        return name;
    }

    public int getPetals() {
        return petals;
    }

    public float getPrice() {
        return price;
    }

    // The toString method below has been provided for you. Do not modify
    public String toString() {
        return "Flower name: " + name + " | Number of petals: " + petals + " | Price: $" + price;
    }
}
