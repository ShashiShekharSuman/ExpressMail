/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expmail;

/**
 *
 * @author shash
 */
public class User {

    private final int id;
    private String firstName;
    private String lastName;
    private final String email;
    private String mobileNumber;
    private String recoveryEmail;

    public User(int id, String firstName, String SecondName, String email, String mobileNumber, String recEmail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = SecondName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.recoveryEmail = recEmail;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setRecoveryEmail(String recoveryEmail) {
        this.recoveryEmail = recoveryEmail;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getRecoveryEmail() {
        return recoveryEmail;
    }

    @Override
    public String toString() {
        return "User {" + "\nid=" + id + ",\nfirstName=" + firstName + ",\nlastName=" + lastName + ",\nemail=" + email + ",\nmobileNumber=" + mobileNumber + ",\nrecoveryEmail=" + recoveryEmail + "\n}";
    }

}
