package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<User>linkedList=new LinkedList<>();
        linkedList.add(new User(1,20,"Sara"));
        linkedList.add(new User(5,24,"John"));
        linkedList.add(new User(4,26,"Duck"));
        linkedList.add(new User(3,21,"Steffan"));
        linkedList.add(new User(7,19,"Hanry"));
        linkedList.add(new User(8,32,"Victor"));

        Collections.sort(linkedList);

        for (User user:linkedList) {

            System.out.println(user);
        }

    }
}
