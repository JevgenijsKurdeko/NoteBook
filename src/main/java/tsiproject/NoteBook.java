package tsiproject;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private List<Record> records = new ArrayList<>();

    @Command
    public void createPerson(String firstName, String lastName, String email, String... phones){
        Person r = new Person();
        r.setFirstName(firstName);
        r.setLastName(lastName);
        r.addPhones(phones);//телефонов может быть много у контакта, по-этому мы сделали список телефонов
        r.setEmail(email);

        records.add(r);
    }
    @Command
    public void createNote(String note){
        Note n = new Note();
        n.setNote(note);
        records.add(n);

    }

    @Command
    public void createText(String text, String time){
        Reminder t = new Reminder();
        t.setTime(time);
        t.setNote(text);
        records.add(t);

    }

    @Command
    public void remove(int id){ //Удаляет запись по ID
        for (int i=0; i<records.size(); i++){
            Record r = records.get(i);
            if(r.getId() == id){
                records.remove(i);
                break;
            }
        }
    }

    @Command
    public List<Record> List(){
        return records;
    }
}
