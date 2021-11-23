package MiniProject;

import javax.swing.*;
import java.io.Serializable;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public  class Staff implements Serializable {

    private String forename;
    private String surname;
    private String gender;
    private GregorianCalendar DOB;
    private String address;
    private int PhoneNo;
    private int staffID=0;
    private static int count;


    public Staff() {
       this("Undefined","Undefined","Undefined",null,"Undefined", 0);
    }

    public Staff(String forename, String surname, String gender, GregorianCalendar DOB, String address, int phoneNo) {
        setForename(forename);
        setSurname(surname);
        setGender(gender);
        setDOB(DOB);
        setAddress(address);
        setPhoneNo(phoneNo);
        incrementCount();
        setStaffID(count);
    }

    public String getForename(){
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

    public GregorianCalendar getDOB() {

        return DOB;
    }

    public void setDOB(GregorianCalendar DOB) {

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

    public int getStaffID() {

        return staffID;
    }

    public void setStaffID(int staffID) {

        this.staffID = staffID;
    }

    private static void incrementCount(){

        count++;
    }

    public  String toString(){

        String str= "\n\nStaff Details. \n\nName: Forename: "+getForename()+ " \nSurname: "+getSurname()+ " \nGender: "+getGender()+" \nAddress: "+getAddress()+ " \nPhoneNumber: "+getPhoneNo()+ "" +
                "\nDOB: ";

                if(DOB==null)
                    str+=JOptionPane.showInputDialog("Can't have a null DOB!! Please enter your DOB");
                else
                    str+= getDOB().get(Calendar.DATE) + "-"+ getDOB().get(Calendar.MONTH) + "-"+ getDOB().get(Calendar.YEAR);



               return str;

    }


}
