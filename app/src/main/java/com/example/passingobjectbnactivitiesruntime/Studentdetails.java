package com.example.passingobjectbnactivitiesruntime;

import java.io.Serializable;

// Class Declaration
public class Studentdetails implements Serializable {

    // Instance Variables
    String Id,Name,Contact,Email;

    // Constructor Declaration of Class
    public Studentdetails(String Id, String Name, String Contact, String Email){
        this.Id = Id;
        this.Name = Name;
        this.Contact = Contact;
        this.Email = Email;
    }
}
