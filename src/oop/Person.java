package oop;

public class Person {

    // Class Members

    // Field
    // private means only members of this class can access these below
    private String fullName = "N/A";
    private String firstName = "";
    private String lastName = "";
    private int age;
    private String height;
    private String nationality;
    private String purpose;
    private static final boolean hasSkin = true;

    // Constructor
    public Person(String fullName, int age,
                  String height, String nationality){
        this.fullName = fullName;
        this.age = age;
        this.height = height;
        this.nationality = nationality;
    }

    public Person(){
    }



    // Properties


    public String getFullName() {
        return fullName;
    }

    private void setFullName() {
        if (!this.firstName.equals("") && !this.lastName.equals(""))
            this.fullName = this.firstName.toUpperCase() + " " + this.lastName.toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        setFullName();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        setFullName();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public static boolean isHasSkin() {
        return hasSkin;
    }

    public String getEntertainment(String entertainment){
        return this.fullName + " is going to go " + entertainment;
        // Casey is going to go ride a rollercoaster
    }

    public String getPurpose(){
        return purpose;
    }

    public void setPurpose(String purpose){
        this.purpose = purpose;
    }
}
