package by.itacademy.ivanchikov;

public class Worker {
    private User user;
    private Position position;

    @Override
    public String toString() {
        return "Worker{" +
                "user=" + user +
                ", position=" + position +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


}
