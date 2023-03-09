package org.PatekOnlyPrograms;

public class Users {
    private String FirstName;
    private String SecondName;
    private Boolean AdminAccount;

    private String Password;

    public Users(String firstName, String secondName, Boolean adminAccount, String password) {
        FirstName = firstName;
        SecondName = secondName;
        AdminAccount = adminAccount;
        Password = password;
    }
    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public Boolean getAdminAccount() {
        return AdminAccount;
    }

    public void setAdminAccount(Boolean adminAccount) {
        AdminAccount = adminAccount;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
