//package javaCollection;

import java.util.*;
public class IterEnum 
{

public static void main(String[] args)
{
    String[] wordArr = {"Book", "Number", "Place", "Lemon", "Apple", "Tree"};
    Vector<String> wordList = new Vector<>(Arrays.asList (wordArr)); //directly convert array to vector
    System.out.println("\nThe word list: \n"+wordList + "\n");
    
    Enumeration<String> vectorEnum = wordList.elements(); 
    //Enumeration iterates through vector show elements one by one
    while(vectorEnum.hasMoreElements()) 
    { //when vector Enum has more element to get System.out.println(vectorEnum.nextElement());
        System.out.println(vectorEnum.nextElement());
    }

    LinkedList<String> wordLinkedList = new LinkedList<>();
    wordLinkedList.addAll(wordList); //add elements from vector to linked list add some additional items
    wordLinkedList.add("Ball");
    wordLinkedList.add("Mango");
    System.out.println("\nThe word list (LinkedList): \n" + wordLinkedList + "\n");

    Iterator<String> it =wordLinkedList.iterator(); //the iterator it will point elements of the linked list
    while(it.hasNext()) 
    { //when vector Enum has more element to get    
        System.out.println(it.next()); 
    }
}
}