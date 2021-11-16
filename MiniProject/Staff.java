package MiniProject;

import javax.swing.*;
import java.io.Serializable;

public class Staff implements Serializable {

    private String forename;
    private String surname;
    private String gender;
    private int DOB;
    private String address;
    private int PhoneNo;
    private int staffId = 0;


    public Staff() {
        this.forename = "Undefined";
        this.surname = "Undefined";
        this.gender = "Undefined";
        this.DOB = 0;
        this.address = "Undefined";
        PhoneNo = 0;
    }

    public Staff(String forename, String surname, String gender, int DOB, String address, int phoneNo) {
        setForename(forename);
        setSurname(surname);
        setGender(gender);
        setDOB(DOB);
        setAddress(address);
        setPhoneNo(phoneNo);
    }

    public String getForename() {
        forename= JOptionPane.showInputDialog("Please enter your forename");
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    public String toString(){

        return "Staff Details. Name: Forename: "+getForename();

    }


}
