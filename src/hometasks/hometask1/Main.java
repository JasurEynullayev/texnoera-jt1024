package hometasks.hometask1;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Jack", "Martin", 1987, 120, new String[][]{{"Monday", "Work"}});
        Human father = new Human("Lucy", "Martin", 1985, 110, new String[][]{{"Tuesday", "Shopping"}});

        Family family = new Family(mother, father);

        mother.setFamily(family);
        father.setFamily(family);

        Human child1 = new Human("Hannah", "Martin", 2004, 101, new String[][]{{"Wednesday", "Dance"}});
        family.addChild(child1);

        Human child2 = new Human("Murphy", "Martin", 2007, 99, new String[][]{{"Sunday", "Theatre"}});
        family.addChild(child2);

        Pet pet = new Pet("Cat", "Tomas", 5);
        family.setPet(pet);

        System.out.println(family);
    }
}

