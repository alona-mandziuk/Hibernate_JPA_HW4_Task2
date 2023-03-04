package hw4_2;

import javax.persistence.*;

@Entity
@Table(name = "Animals")
class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private boolean tale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTale() {
        return tale;
    }

    public void setTale(boolean tale) {
        this.tale = tale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
