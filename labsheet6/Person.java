package labsheet6;

import javax.swing.*;

public class Person {

    private String firstName;
    private String lastName;


    public Person(){

        firstName= "Not Supplied";
        lastName= "Not Supplied";
    }

    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String toString(){
        return ("First name: "+firstName+" Last name: "+lastName);

    }
}
