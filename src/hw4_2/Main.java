package hw4_2;

import java.util.List;

class Main {
    public static void main(String[] args) {
        AnimalHelper animalHelper = new AnimalHelper();
        Animal animal1 = new Animal();
        animal1.setName("Owl");
        animal1.setAge(10);
        animal1.setTale(false);

        Animal animal2 = new Animal();
        animal2.setName("Wolf");
        animal2.setAge(2);
        animal2.setTale(true);

        Animal animal3 = new Animal();
        animal3.setName("Bear");
        animal3.setAge(1);
        animal3.setTale(false);

        animalHelper.add(animal1);
        animalHelper.add(animal2);
        animalHelper.add(animal3);

        System.out.println("-----------------------------------------");
        System.out.println("GET ALL");
        System.out.println("-----------------------------------------");
        List<Animal> animals = animalHelper.getAll();
        for (Animal an : animals) {
            System.out.println("ID: " + an.getId() + ", name: " + an.getName()
                    + ", age: " + an.getAge() + ", tale: " + an.isTale() + ".");

        }

        System.out.println("-----------------------------------------");
        System.out.println("GET BY ID (1)");
        System.out.println("-----------------------------------------");
        Animal animal = animalHelper.getById(1);
        System.out.println("ID: " + animal.getId() + ", name: " + animal.getName()
                + ", age: " + animal.getAge() + ", tale: " + animal.isTale() + ".");

        System.out.println("-----------------------------------------");
        System.out.println("REMOVE BY ID (1)");
        System.out.println("-----------------------------------------");
        animalHelper.remove(1);
        System.out.println("-----------------------------------------");
        List<Animal> anim = animalHelper.getAll();
        for (Animal an : anim) {
            System.out.println("ID: " + an.getId() + ", name: " + an.getName()
                    + ", age: " + an.getAge() + ", tale: " + an.isTale() + ".");

        }
        System.out.println("-----------------------------------------");
        animalHelper.entityManagerFactory.close();
    }
}