package basepatterns.creational.builder;

import java.util.Set;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person> parents;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", parents=" + parents +
                '}';
    }

    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name) {
            newPerson.name = name;
            return this;
        }

        public Builder withSurname (String surname) {
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge (int age) {
            newPerson.age = age;
            return this;
        }

        public Builder withHeight (int height) {
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight) {
            newPerson.weight = weight;
            return this;
        }

        public Builder withParrents(Set<Person> parrents) {
            newPerson.parents = parrents;
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }

    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .withName("Максим")
                .withAge(35)
                .withSurname("Якушев")
                .build();

        System.out.println(myPerson);

    }


}
