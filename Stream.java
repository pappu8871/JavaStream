package com.addressbook.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBookUC10 {

	  public static void main(String[] args)
	    {
	        // creating stream of strings
	        Stream<String> s = Stream.of("Ramesh","Suresh",
	                        "Ganesh","Dinesh","Gopal","Aahan");
	  
	        // counting number of strings in stream
	        long count_string =  s.collect(Collectors.counting());
	  
	        System.out.println(count_string);
	    }
	}
