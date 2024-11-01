package hometasks.hometask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Pet pet;

    static {
        System.out.println("Family class loaded.");
    }

    {
        System.out.println("New Family object created.");
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
    }

    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);
    }

    public boolean deleteChild(Human child) {
        if (children.remove(child)) {
            child.setFamily(null);
            return true;
        }
        return false;
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < children.size()) {
            children.get(index).setFamily(null);
            children.remove(index);
            return true;
        }
        return false;
    }

    public int countFamily() {
        return 2 + children.size();
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children);
    }

    @Override
    public String toString() {
        return "Family{" + "mother=" + mother + ", father=" + father + ", children=" + children + ", pet=" + pet + '}';
    }
}

