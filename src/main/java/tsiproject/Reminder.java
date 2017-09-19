package tsiproject;

public class Reminder extends Note {

    public String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                "text='" + getNote() + '\'' +
                "time='" + time + '\'' +
                '}';
    }
}
