package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {
    public Long id;
    public Person owner;
    public Animal animal;

    public Animal() {
        animal = new Animal(id, owner);
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        this.id = id;
        this.owner = owner;
    }

    public Long getId() {
        return animal.id;
    }

    public void setId(Long id) {
        animal.id = id;
    }

    public Person getOwner() {
        return animal.owner;
    }

    public void setOwner(Person owner) {
        animal.owner = owner;
    }

    public Address getAddress() {
        return animal.getAddress();
    }
}
