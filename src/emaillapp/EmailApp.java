package emaillapp;

import emaillapp.Email;

public class EmailApp {

    public static void main(String[] args) {
        Email em1 = new Email("Sean", "Kishan");
        em1.setAlternateEmail("SeansPrivateEmail@gmail.com");
        System.out.println(em1.showInfo());

    }
}
