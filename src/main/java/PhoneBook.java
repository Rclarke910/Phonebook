import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneRecord;

    public PhoneBook(){
        this(new HashMap<>());
    }

    public PhoneBook(Map<String, List<String>> phoneRecord) {
        this.phoneRecord = phoneRecord;
    }


    public void add(String name, String phoneNumber){
        List<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        phoneRecord.put(name, numbers);
    }

    public void addAll(String name, String... phoneNumbers){


        List<String> numbers = phoneRecord.getOrDefault(name, new ArrayList<>());
        for (String phoneNumber : phoneNumbers) {
            numbers.add(phoneNumber);
        }
        phoneRecord.put(name, numbers);
    }


    public void remove(String name){
        //remove from the map
        phoneRecord.remove(name);
    }

    public Boolean hasEntry(String name){

        return phoneRecord.containsKey(name);
    }


    public List<String> lookup(String name){
        return phoneRecord.getOrDefault(name,new ArrayList<>());
    }

    public String reverseLookUp(String phoneNumber){

        for (Map.Entry<String, List<String>> entry : phoneRecord.entrySet()) {
            List<String> numbers = entry.getValue();
            if (numbers.contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }


    public List<String> getAllContactNames(){
        List<String> contacts = new ArrayList<>();

        contacts.addAll(phoneRecord.keySet());

        return contacts;
    }



    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneRecord=" + phoneRecord +
                '}';
    }


}
