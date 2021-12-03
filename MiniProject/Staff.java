package MiniProject;
//Staff.java

import java.io.Serializable;

/**
 * An instantiable class which defines a Staff
 * @author Darragh Leahy
 */

public  class Staff implements Serializable {

    private int ID;
    private String forename;
    private String surname;
    private String gender;
    private String DOB;
    private String address;
    private long PhoneNo;


    /**
     * Staff no-argument constructor. Calls 7-argument Staff constructor to
     * initialise the attributes of a Staff object with some default initial
     * values, to leave the Staff object in a consistent initial state
     */
    public Staff() {
       this(0,"Undefined","Undefined","Undefined",null,0,"Undefined" );
    }
    /**
     * Staff 7-argument constructor. Calls 7 mutators  to
     * initialise the attributes of a Staff object with user-supplied values.
     * @param ID the staffs ID
     * @param forename the staffs forename
     * @param surname the staffs surname
     * @param gender the staffs gender
     * @param DOB the staffs DOB
     * @param address the staffs address
     * @param phoneNo the staffs PhoneNo.
     */
    public Staff(int ID,String forename, String surname,String gender, String address, long phoneNo, String DOB) {
        setID(ID);
        setForename(forename);
        setSurname(surname);
        setGender(gender);
        setDOB(DOB);
        setAddress(address);
        setPhoneNo(phoneNo);

    }
    /**
     * Method to get the ID of a Staff object
     * @return an integer value specifying the ID of a Staff object
     */


    public int getID() {
        return ID;
    }
    /**
     * Method to set the ID of a Staff object
     * @param  ID the Staffs ID
     */

    public void setID(int ID) {
        this.ID = ID;
    }
    /**
     * Method to get the forename of a Staff object
     * @return a String value specifying the forename of a Staff object
     */

    public String getForename(){

        return forename;
    }
    /**
     * Method to set the forename of a Staff object
     * @param forename the Staffs forename
     */

    public void setForename(String forename) {

        this.forename = forename;
    }
    /**
     * Method to get the surname of a Staff object
     * @return a String value specifying the surname of a Staff object
     */

    public String getSurname() {

        return surname;
    }
    /**
     * Method to set the surname of a Staff object
     * @param  surname the Staffs surname
     */

    public void setSurname(String surname) {

        this.surname = surname;
    }
    /**
     * Method to get the gender of a Staff object
     * @return a String value specifying the gender of a Staff object
     */

    public String getGender() {

        return gender;
    }
    /**
     * Method to set the gender of a Staff object
     * @param gender the Staffs gender
     */


    public void setGender(String gender) {

        this.gender = gender;
    }
    /**
     * Method to get the DOB of a Staff object
     * @return a String value specifying the DOB of a Staff object
     */

    public String getDOB() {

        return DOB;
    }
    /**
     * Method to set the DOB of a Staff object
     * @param  DOB the Staffs DOB
     */

    public void setDOB(String DOB) {

        this.DOB = DOB;
    }
    /**
     * Method to get the address of a Staff object
     * @return a String value specifying the address of a Staff object
     */

    public String getAddress() {

        return address;
    }
    /**
     * Method to set the address of a Staff object
     * @param  address the Staffs address
     */

    public void setAddress(String address) {

        this.address = address;
    }
    /**
     * Method to get the phone number of a Staff object
     * @return an integer value specifying the phone number of a Staff object
     */
    public long getPhoneNo() {

        return PhoneNo;
    }
    /**
     * Method to set the phone number of a Staff object
     * @param  phoneNo the Staffs phone number
     */

    public void setPhoneNo(long phoneNo) {

        PhoneNo = phoneNo;
    }

    /**
     * Method to get the state of a Staff object
     * @return a String value specifying the state of a Staff object
     */



    public  String toString(){

         return  "\n\nStaff Details. \n\nName: Forename: "+getForename()+ " \nSurname: "+getSurname()+ " \nGender: "+getGender()+" \nAddress: "+getAddress()+ " \nPhoneNumber: "+getPhoneNo()+ "" +
                 "\nDOB: "+getDOB();



    }


}
