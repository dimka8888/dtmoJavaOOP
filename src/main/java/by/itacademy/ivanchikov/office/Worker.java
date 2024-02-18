package by.itacademy.ivanchikov.office;

import java.util.Objects;

public class Worker {
    private String name;
    private String position;
    private int age;

    public Worker(String name, String age, int i) {
    }

    public Worker(String name, String posichion) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age && Objects.equals(name, worker.name) && Objects.equals(position, worker.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, age);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                '}';
    }
}
