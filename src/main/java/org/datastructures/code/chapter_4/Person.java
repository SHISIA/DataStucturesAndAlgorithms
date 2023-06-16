package org.datastructures.code.chapter_4;

public class Person {
    private String name;
    private Address address;

    public Person(Address address,String name){
        this.address=address;
        this.name=name;
    }

    public Option<Address> getAddress(){
        return Option.optionOf(address);
    }

    public Option<String> getName(){
        return Option.optionOf(name);
    }

}
