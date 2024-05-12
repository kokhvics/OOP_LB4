package org.example.oop_lb4;
import org.json.simple.JSONObject;

public class Tutor {
    private String name;
    private String lastname;
    private String subject;
    private int age;
    private String contact;

    public Tutor(String name, String lastname, String subject, int age, String contact){
        this.name = name;
        this.lastname = lastname;
        this.subject = subject;
        this.age = age;
        this.contact = contact;
    }
    //getters
    public String getName(){
        return name;
    }
    public String getLastname(){
        return lastname;
    }
    public String getSubject(){
        return subject;
    }
    public int getAge(){
        return age;
    }
    public String getContact(){
        return contact;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setContact(String contact){
        this.contact = contact;
    }

    //form json
    public JSONObject toJSON() {
        JSONObject tutorJSON = new JSONObject();
        tutorJSON.put("name", name);
        tutorJSON.put("lastname", lastname);
        tutorJSON.put("subject", subject);
        tutorJSON.put("age", age);
        tutorJSON.put("contact", contact);
        return tutorJSON;
    }
    //form objTutor
    public static Tutor fromJSON(JSONObject tutorJSON) {
        try {
            String name = (String) tutorJSON.get("name");
            String lastname = (String) tutorJSON.get("lastname");
            String subject = (String) tutorJSON.get("subject");
            int age = ((Long) tutorJSON.get("age")).intValue();
            String contact = (String) tutorJSON.get("contact");
            return new Tutor(name, lastname, subject, age, contact);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
