package tsiproject;

public class Note extends Record {
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String text) {
        this.note = text;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + getId() +
                "text='" + note + '\'' +
                '}';
    }
}
