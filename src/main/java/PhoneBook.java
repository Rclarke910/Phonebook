import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//name : phoneNumber1, phoneNumber1
//name: phoneNumber

// String , ArrayList of Strings, Map of some king
//Map to hold name and phoneNumbers
//Key is String and values is arrayList of String

public class PhoneBook {
    private Map<String, List<String>> phoneRecord;

    public PhoneBook(){
        this(new HashMap<>());
    }

    public PhoneBook(Map<String, List<String>> phoneRecord) {
        this.phoneRecord = phoneRecord;
    }

    //Create a method to add a number to the phonebook

    public void add(String name, String phoneNumber){
        List<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        phoneRecord.put(name, numbers);  //put the record in the map
    }

    //Create a method to addAll Numbers to a phoneRecord
    public void addAll(String name, String... phoneNumbers){
        //put the record in the map by key and values

    }

    //Method to remove a person
    public void remove(String name){
        //remove from the map
        phoneRecord.remove(name);
    }

    //HasEntry - to check if entry exist
    public Boolean hasEntry(String name){
        //check if name exist in record and return true
        return phoneRecord.containsKey(name);
    }

    //lookUp (name) - return phone number(s)
    public List<String> lookup(String name){
        //return a list of phone numbers that belong to the name
        return phoneRecord.getOrDefault(name,new ArrayList<>());
    }

    //reverse lookUp (phoneNumber) - return phone name
    public String reverseLookUp(String phoneNumber){

        //Takes a phone number and returns the name attached to the number

        return null;
    }

    //Get allContactNames in the phoneBook

    public List<String> getAllContactNames(){
        List<String> contacts = new ArrayList<>();

        contacts.addAll(phoneRecord.keySet());

        return contacts;
    }


    //A way to represent the String Object


    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneRecord=" + phoneRecord +
                '}';
    }


}
