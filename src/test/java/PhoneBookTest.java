import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class PhoneBookTest {

    private PhoneBook phoneBook;

    @Before
    public void createMap() {
        phoneBook = new PhoneBook();
        phoneBook.add("Rashawn", "123");
        phoneBook.add("Mikaila", "456");
    }

    @Test
    public void testRemove(){

       phoneBook.remove("Rashawn");
      assertFalse(phoneBook.hasEntry("Rashawn"));
    }

    @Test

    public void testReverseLookUp(){

        String result = phoneBook.reverseLookUp("456");
        assertEquals("Mikaila", result);
    }






}