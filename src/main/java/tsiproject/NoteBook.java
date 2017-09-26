package tsiproject;

import asg.cliche.Command;
import asg.cliche.Shell;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private final List<Record> records = new ArrayList<>();
    private Shell parentShell; // need for cliche to allow subshells


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
    public void createReminder(String text, String time){
        Reminder t = new Reminder();
        t.setTime(time);
        t.setNote(text);
        records.add(t);
    }
    @Command
    public void createAlarm(String alarmTime, String note){
        Alarm a= new Alarm();
        a.setNote(note);
        a.setTimeAlarm(alarmTime);
        records.add(a);
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
    public List<Record> find(String str){
        List<Record> result = new ArrayList<>();
        for (Record r: records){
            if (r.contains(str)){
                result.add(r);
            }
        }
        return result;
    }

    @Command
    public List<Record> List(){
        return records;
    }
}

