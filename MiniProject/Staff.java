package MiniProject;


import java.io.Serializable;
import java.util.Date;


public  class Staff implements Serializable {

    private int ID;
    private String forename;
    private String surname;
    private String gender;
    private String DOB;
    private String address;
    private int PhoneNo;



    public Staff() {
       this(0,"Undefined","Undefined","Undefined",null,"Undefined", 0);
    }

    public Staff(int ID,String forename, String surname,String gender, String DOB, String address, int phoneNo) {
        setID(ID);
        setForename(forename);
        setSurname(surname);
        setGender(gender);
        setDOB(DOB);
        setAddress(address);
        setPhoneNo(phoneNo);

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getDOB() {

        return DOB;
    }

    public void setDOB(String DOB) {

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



    public  String toString(){

         return  "\n\nStaff Details. \n\nName: Forename: "+getForename()+ " \nSurname: "+getSurname()+ " \nGender: "+getGender()+" \nAddress: "+getAddress()+ " \nPhoneNumber: "+getPhoneNo()+ "" +
                "\nDOB: ";



    }


}
