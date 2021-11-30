package MiniProject;


import java.io.Serializable;
import java.util.Date;


public  class Staff implements Serializable {

    private String forename;
    private String surname;
    private String gender;
    private Date DOB;
    private String address;
    private int PhoneNo;
    private int staffID=0;
    private static int count;


    public Staff() {
       this("Undefined","Undefined",null,"Undefined", 0);
    }

    public Staff(String forename, String surname, Date birthDate, String address, int phoneNo) {
        setForename(forename);
        setSurname(surname);
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

    public Date getDOB() {

        return DOB;
    }

    public void setDOB(Date DOB) {

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

         return  "\n\nStaff Details. \n\nName: Forename: "+getForename()+ " \nSurname: "+getSurname()+ " \nGender: "+getGender()+" \nAddress: "+getAddress()+ " \nPhoneNumber: "+getPhoneNo()+ "" +
                "\nDOB: ";



    }


}
