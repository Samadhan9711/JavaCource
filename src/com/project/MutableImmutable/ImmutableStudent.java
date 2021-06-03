package com.project.MutableImmutable;

public class ImmutableStudent {
    private final String name; // blank final variable
    private final int roll_no;
    private final Address address; // mutable field

    public ImmutableStudent(String name, int roll_no, Address address)
    {
        this.name = name;
        this.roll_no = roll_no;

        Address clone_ad = new Address();
        clone_ad.setCity(address.getCity());
        clone_ad.setCountry(address.getCountry());
        clone_ad.setPin(address.getPin());

        this.address = clone_ad;

    }

    public String getName()
    {
        return name;
    }

    public int getRoll_no()
    {
        return roll_no;
    }

    public Address getAddress() {
        Address clone_ad = new Address();
        clone_ad.setCountry(this.address.getCountry());
        clone_ad.setCity(this.address.getCity());
        clone_ad.setPin(this.address.getPin());
        return clone_ad;
    }

    public String toString()
    {
        return "Name of student is: "+name+", Roll number is: "+roll_no+", Address is: "+address;
    }
}
