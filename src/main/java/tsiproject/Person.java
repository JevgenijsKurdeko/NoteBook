package tsiproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person extends Record {

    private String firstName;
    private String lastName;
    private String email;
    private List<String> phones = new ArrayList<>();


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String lastName) {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getPhones() { return phones; }

    public void addPhones (String... phones) { Collections.addAll(this.phones, phones);}

    public String getEmail(){return email;}

    public void setEmail(String email) {this.email = email;}

    @Override
    public String toString() {
        return "Person " +
                "id=" + getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phones + '\'' +
                ", email='" + email + '\'' +
                ' ';
    }

    @Override
    public boolean contains(String str) {
        String lowerCase = str.toLowerCase();
        if (firstName.toLowerCase().contains(lowerCase)){
            return true;
        } else if (lastName.toLowerCase().contains(lowerCase)){
            return  true;
        } else if (email.toLowerCase().contains(lowerCase)){
            return true;
        } else {
            for (String p: phones){
                if (p.contains(lowerCase)){
                    return true;
                }
            }
        }
        return false;
    }
}

