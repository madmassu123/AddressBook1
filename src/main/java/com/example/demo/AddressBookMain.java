package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean condition = false;
        Person newPerson;//created an object called newAddress of type Person


        ArrayList<Person> persons = new ArrayList<>();


        do {
            //instantiated an object

            newPerson = new Person();
            System.out.println("Enter FirstName");
            newPerson.setFirstName(scan.nextLine());
            System.out.println("Enter LastName");
            newPerson.setLastName(scan.nextLine());
            System.out.println("Enter PhoneNumber");
            newPerson.setPhoneNumber(scan.nextLine());
            System.out.println("Enter Address");
            newPerson.setAddress(scan.nextLine());
            System.out.println("Enter email");
            newPerson.setEmail(scan.nextLine());

            persons.add(newPerson);

            System.out.println("Do you want to add another person: ");
            String option = scan.nextLine();

            if(option.equalsIgnoreCase("n") || option.equalsIgnoreCase("no")){
                condition = true;
            }


        } while (!condition);

        System.out.println("My Address Book is:");
        for (Person eachPerson : persons) {
            System.out.println(eachPerson.getfirstName());
            System.out.println(eachPerson.getLastName());
            System.out.println(eachPerson.getAddress());
            System.out.println(eachPerson.getPhoneNumber());
            System.out.println(eachPerson.getEmail());
            System.out.println("++++++++++++++++++++");

        }
    }
}