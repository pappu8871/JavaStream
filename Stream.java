package com.addressbook.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBookUC9 {

	public static void main(String[] args) {  
	//returns a list view   
	List<String> stringlist = Arrays.asList("Aahan", "Shakshi", "Pappu", "Ganesh", "Kundan", "Suresh");  
    //stringlist.stream().sorted().forEach(System.out::println);     
	List<String> sortedList = stringlist.stream().sorted().collect(Collectors.toList());  
    sortedList.forEach(System.out::println);  
	}  
    }
