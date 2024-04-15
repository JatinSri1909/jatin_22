public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bunny", "Golden Retriever");
        Dog dog2 = new Dog("Sunny", "Poodle");

        System.out.println("Dog 1: Name = " + dog1.getName() + ", Breed = " + dog1.getBreed());
        System.out.println("Dog 2: Name = " + dog2.getName() + ", Breed = " + dog2.getBreed());

        dog1.setName("Max");
        dog1.setBreed("Labrador");
        dog2.setName("Bella");
        dog2.setBreed("Cocker Spaniel");

        System.out.println("\nUpdated Dog 1: Name = " + dog1.getName() + ", Breed = " + dog1.getBreed());
        System.out.println("Updated Dog 2: Name = " + dog2.getName() + ", Breed = " + dog2.getBreed());
    }
}