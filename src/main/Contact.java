package main;

import java.io.Serializable;
import java.time.LocalDate;

public class Contact implements Serializable, Comparable<Contact> {
    private String phoneNumber;
    private String group;
    private String name;
    private boolean gender;
    private String address;
    private LocalDate birthday;
    private String email;

    public Contact() {
    }

    public Contact(String phoneNumber, String group, String name, boolean gender, String address, LocalDate birthday, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contact o) {
        return name.compareTo(o.name);
    }
}
