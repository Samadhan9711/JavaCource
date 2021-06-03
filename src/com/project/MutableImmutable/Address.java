package com.project.MutableImmutable;

public class Address {
    String Country;
    String City;
    int Pin;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int pin) {
        this.Pin = pin;
    }

    public Address()
    {
    }

    public Address(String Country,String City,int Pin)
    {
        this.Country = Country;
        this.City = City;
        this.Pin = Pin;
    }

    @Override
    public String toString()
    {
        return "Address{"+"City : "+City+", Country : "+Country+", Pin : "+Pin+"}";
    }
}
