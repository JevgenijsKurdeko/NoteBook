package tsiproject;

public class Alarm extends Note implements Expirable{

    public String timeAlarm;

    public String getTimeAlarm() {
        return timeAlarm;
    }

    public void setTimeAlarm(String timeAlarm) {
        this.timeAlarm = timeAlarm;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                "text='" + getNote() + '\'' +
                "time='" + timeAlarm + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {
        if(super.contains(str)){
            return true;
        } else if(timeAlarm.contains(str)){
            return true;
        }
        return false;
    }

    @Override
    public boolean isExpirable() {
        return false;
    }
}
