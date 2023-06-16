package org.datastructures.code.chapter_4;

public class Address {
    private String street;
    private City city;

    public Address(String street,City city){
        this.street=street;
        this.city = city;
    }

    public Option<City> getCity(){
        return Option.optionOf(city);
    }

    public Option<String> getStreet(){
        return Option.optionOf(street);
    }
}
