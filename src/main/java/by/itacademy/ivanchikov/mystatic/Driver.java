package by.itacademy.ivanchikov.mystatic;

import java.util.Objects;

public class Driver {
    private String name;
    private String driverLicence;
    private  static String car;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(name, driver.name) && Objects.equals(driverLicence, driver.driverLicence) && Objects.equals(car, driver.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicence, car);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverLicence='" + driverLicence + '\'' +
                '}';
    }

    public Driver(String name, String driverLicence) {
        this.name = name;
        this.driverLicence = driverLicence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    public static String getCar() {
        if (car==null)
            car="BMW";
        return car;
    }

    public void setCar(String car) {
        if (car==null) {
            System.out.println("Машину продовать нельзя");
        }else {
           if (car!=null){
               this.car=car;
           }
        }
        Driver.car = car;
    }

}
