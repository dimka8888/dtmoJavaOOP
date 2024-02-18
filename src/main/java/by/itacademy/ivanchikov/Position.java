package by.itacademy.ivanchikov;

public class Position {
    private String name;

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", salory=" + salory +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalory() {
        return salory;
    }

    public void setSalory(int salory) {
        this.salory = salory;
    }

    private int salory;

}
