package emaillapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String email;
    private String companySuffix = "impact.com";
    // Constructor to receive the first and last name

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department - return the department
        this.department = setDepartment();

        // Call a method that returns a random password

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + '@' + department.toLowerCase() + "." + companySuffix;
    }

    // Ask for the department

    private String setDepartment(){
        System.out.println("New employee: " + firstName + ".\nDepartment Codes:\n1 for Sales\n2 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if(deptChoice == 1){
            return "Sales";
        }
        else if(deptChoice == 2){
            return "Dev";
        }
        else if(deptChoice == 3){
            return "acct";
        }
        else{
            return "";
        }

    }

    // Generate a random password

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+";
        char[] password = new char[length];
        for(int x = 0; x < length; x++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[x] = passwordSet.charAt(rand); // passes in letter/number from that character at random number
        }
        return new String(password);
    }

    // Set the mailbox capacity

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email.

    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password

    public void changePassword(String password){
        this.password = password;
    }


    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "Display Name: " + firstName + " " + lastName + "\nCompany Email: " + email +
                "\nMailbox Capacity: " + mailboxCapacity + "mb";
    }

}
