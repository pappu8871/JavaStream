package com.addressbook.stream;

import java.util.stream.Stream;

public class AddressBookUC8 {
	 // Driver code
    public static void main(String[] args)
    {
  
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Aryan", "Aahan",
                                          "Shalshi", "Ganesh","Ramesh");
  
        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the
        // elements ending with s
        stream.filter(str -> str.endsWith("n"))
            .forEach(System.out::println);
    
    }
}

