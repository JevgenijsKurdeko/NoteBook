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

    @Override
    public boolean contains(String str){
        String strLower = str.toLowerCase();
        String textLower = note.toLowerCase();
        return textLower.contains(strLower);
    }

}
