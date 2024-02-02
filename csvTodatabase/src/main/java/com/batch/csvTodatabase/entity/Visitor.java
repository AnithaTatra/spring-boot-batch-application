package com.batch.csvTodatabase.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "visitors")
public class Visitor {
    @Id
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String emailAddress;

    @Column(name = "mobile")
    private String phoneNumber;
    @Column(name = "address")
    private String address;

    @Temporal(TemporalType.TIMESTAMP)
    private Date visitDate;

    @Transient
    private String strVisitDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public String getStrVisitDate() {
        return strVisitDate;
    }

    public void setStrVisitDate(String strVisitDate) {
        this.strVisitDate = strVisitDate;
    }
}
