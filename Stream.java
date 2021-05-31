package com.addressbook.stream;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class AddressBookUC7 {
	public static void main(String[] args)
    {
  
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Aryan", "Suresh",
                                          "Shalshi", "Ganesh","Ramesh");
  
        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the
        // elements ending with s
        stream.filter(str -> str.startsWith("S"))
            .forEach(System.out::println);
    
    }
}
