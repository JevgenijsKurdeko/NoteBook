package tsiproject;

public class Reminder extends Note {

    public String time;
    public String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

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
                "text='" + text + '\'' +
                "time='" + time + '\'' +
                '}';
    }
}
