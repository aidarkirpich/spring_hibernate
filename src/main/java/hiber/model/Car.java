package hiber.model;

import javax.persistence.*;

@Entity
public class Car {
    private String model;
    @Id
    @GeneratedValue
    private int series;
    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private User user;

    public Car () {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {this.model = model;}

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public Car(String model) {
        this.model = model;
    }
}
