package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> {
    List<T> obj = new ArrayList<>();


    public Shelter() {
        this.obj = obj;
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return obj.size();
    }

    public void add(Object object) {
        obj.add((T) object);
    }

    public Boolean contains(Object object) {
        return obj.contains(object);
    }

    public void remove(Object object) {
        obj.remove(object);
    }

    public Object get(Integer index) {
        return obj.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return obj.indexOf(ageable);
    }
}