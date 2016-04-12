package io.github.bootstrappies.beans;

import java.util.Date;

/**
 * Created by Corinna on 12.04.2016.
 */
public class Customer {
    /*
    Forname, Last Name, Date of Birth, Email, Contact Adress (Street Name, Number, Postcode, Town, Country)
     */

    private String forname;
    private String lastname;
    private Date birthDate;
    private String email;
    private String street;
    private int number;
    private String postcode;
    private String town;
    private String country;

    public Customer() {
    }

    public String getForname() {
        return forname;
    }

    public void setForname(String forname) {
        this.forname = forname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (number != customer.number) return false;
        if (forname != null ? !forname.equals(customer.forname) : customer.forname != null) return false;
        if (lastname != null ? !lastname.equals(customer.lastname) : customer.lastname != null) return false;
        if (birthDate != null ? !birthDate.equals(customer.birthDate) : customer.birthDate != null) return false;
        if (email != null ? !email.equals(customer.email) : customer.email != null) return false;
        if (street != null ? !street.equals(customer.street) : customer.street != null) return false;
        if (postcode != null ? !postcode.equals(customer.postcode) : customer.postcode != null) return false;
        if (town != null ? !town.equals(customer.town) : customer.town != null) return false;
        return !(country != null ? !country.equals(customer.country) : customer.country != null);

    }

    @Override
    public int hashCode() {
        int result = forname != null ? forname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + number;
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (town != null ? town.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "forname='" + forname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", postcode='" + postcode + '\'' +
                ", town='" + town + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
