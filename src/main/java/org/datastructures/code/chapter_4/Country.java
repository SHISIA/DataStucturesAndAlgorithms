package org.datastructures.code.chapter_4;

public class Country {
    private String countryName;
    private String countryCode;

    public Country(String countryName,String countryCode){
        this.countryCode=countryCode;
        this.countryName=countryName;
    }

    public Option<String> getName(){
        return Option.optionOf(countryName);
    }

     public Option<String> getCode(){
        return Option.optionOf(countryCode);
    }
 
}
