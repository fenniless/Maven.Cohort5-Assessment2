package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    public Long id;
    public String name;
    public Address address = new Address("","","","","");
    public Person person;
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        person = new Person(id, name, address);
    }

    public Long getId() {
        return person.id;
    }

    public void setId(Long id) {
        person.id = id;
    }

    public String getName() {
        return person.name;
    }

    public void setName(String name) {
        person.name = name;
    }

    public Address getAddress() {
        return person.address;
    }

    public void setAddress(Address address) {
        person.address = address;
    }

    @Override
    public boolean equals(Object o) {
        return person.equals(o);
    }
}