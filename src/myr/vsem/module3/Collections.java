package myr.vsem.module3;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class Collections
 * @since 02.04.2021 - 06.37
 */
public class Collections {
    public static void main(String[] args) {

        //----------------------------------------------------------------------------------------------------
        System.out.println("----------ARRAY LIST----------");
        List<Integer> arrayList = new ArrayList<>();
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println("Create duration: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + arrayList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------LINKED LIST----------");
        List<Integer> linkedList = new LinkedList<>();
        start = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        finish = LocalDateTime.now();
        System.out.println("Create duration: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + linkedList.size());

        //--------------------------------------------INSERT--------------------------------------------------

        System.out.println("--------------------INSERT--------------------");
        System.out.println("----------ARRAY LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, 69);
        }
        finish = LocalDateTime.now();
        System.out.println("Insert on the beginning: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + arrayList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------LINKED LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, 69);
        }
        finish = LocalDateTime.now();
        System.out.println("Insert on the beginning: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + linkedList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------ARRAY LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(50000, 69);
        }
        finish = LocalDateTime.now();
        System.out.println("Insert on the middle: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + arrayList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------LINKED LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(50000, 69);
        }
        finish = LocalDateTime.now();
        System.out.println("Insert on the middle: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + linkedList.size());
        //--------------------------------------------------------------------------------------------------
        System.out.println("----------ARRAY LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(99999, 69);
        }
        finish = LocalDateTime.now();
        System.out.println("Insert on the end: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + arrayList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------LINKED LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(99999, 69);
        }
        finish = LocalDateTime.now();
        System.out.println("Insert on the end: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + linkedList.size());
        //----------------------------------------------------------------------------------------------------


        //-------------------------------------------------UPDATE---------------------------------------------

        System.out.println("--------------------UPDATE--------------------");
        System.out.println("----------ARRAY LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(0, 69);
        }
        finish = LocalDateTime.now();
        System.out.println("Update from the beginning: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + arrayList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------LINKED LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(0, 69);
        }
        finish = LocalDateTime.now();
        System.out.println("Update from the beginning: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + linkedList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------ARRAY LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 10000; i++) {
            arrayList.set(50000, 69);
        }
        finish = LocalDateTime.now();
        System.out.println("Update of the middle: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + arrayList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------LINKED LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 10000; i++) {
            linkedList.set(50000, 69);
        }
        finish = LocalDateTime.now();
        System.out.println("Update of the middle " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + linkedList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------ARRAY LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 10000; i++) {
            arrayList.set(99999, 69);
        }
        finish = LocalDateTime.now();
        System.out.println("Update on the end: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + arrayList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------LINKED LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 10000; i++) {
            linkedList.set(99999, 69);
        }
        finish = LocalDateTime.now();
        System.out.println("Update on the end " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + linkedList.size());


        //------------------------------------------------DELETE---------------------------------------------

        System.out.println("--------------------DELETE--------------------");
        System.out.println("----------ARRAY LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(0);
        }
        finish = LocalDateTime.now();
        System.out.println("Delete from the beginning: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + arrayList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------LINKED LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }
        finish = LocalDateTime.now();
        System.out.println("Delete from the beginning: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + linkedList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------ARRAY LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(50000);
        }
        finish = LocalDateTime.now();
        System.out.println("Delete of the middle: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + arrayList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------LINKED LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(50000);
        }
        finish = LocalDateTime.now();
        System.out.println("Delete of the middle " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + linkedList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------ARRAY LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(99999);
        }
        finish = LocalDateTime.now();
        System.out.println("Delete on the end: " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + arrayList.size());
        //----------------------------------------------------------------------------------------------------
        System.out.println("----------LINKED LIST----------");
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(99999);
        }
        finish = LocalDateTime.now();
        System.out.println("Delete on the end " + ChronoUnit.MILLIS.between(start, finish) + " m.sec");
        System.out.println("List size now " + linkedList.size());
    }
}

/*
----------ARRAY LIST----------
Create duration: 7 m.sec
List size now 100000
----------LINKED LIST----------
Create duration: 20 m.sec
List size now 100000
-------------------------------
When create duration:
array list is significantly
faster than a linked list
------------------------------
--------------------INSERT--------------------
----------ARRAY LIST----------
Insert on the beginning: 31 m.sec
List size now 101000
----------LINKED LIST----------
Insert on the beginning: 0 m.sec
List size now 101000
-------------------------------
When insert on the beginning:
linked list is significantly
faster than an array list
-------------------------------
----------ARRAY LIST----------
Insert on the middle: 9 m.sec
List size now 102000
----------LINKED LIST----------
Insert on the middle: 75 m.sec
List size now 102000
-------------------------------
When insert on the middle:
array list is significantly
faster than a linked list
-------------------------------
----------ARRAY LIST----------
Insert on the end: 0 m.sec
List size now 103000
----------LINKED LIST----------
Insert on the end: 12 m.sec
List size now 103000
-------------------------------
When insert on the end:
array list is significantly
faster than a linked list
-------------------------------
--------------------UPDATE--------------------
----------ARRAY LIST----------
Update from the beginning: 0 m.sec
List size now 103000
----------LINKED LIST----------
Update from the beginning: 1 m.sec
List size now 103000
------------------------------
When update from the beginning:
array list is 1 millisecond
faster than a linked list
------------------------------
----------ARRAY LIST----------
Update of the middle: 1 m.sec
List size now 103000
----------LINKED LIST----------
Update of the middle 646 m.sec
List size now 103000
-------------------------------
When update of the middle:
array list is significantly
faster than a linked list
-------------------------------
----------ARRAY LIST----------
Update on the end: 0 m.sec
List size now 103000
----------LINKED LIST----------
Update on the end 38 m.sec
List size now 103000
-------------------------------
When update on the end:
array list is significantly
faster than a linked list
-------------------------------
--------------------DELETE--------------------
----------ARRAY LIST----------
Delete from the beginning: 20 m.sec
List size now 102000
----------LINKED LIST----------
Delete from the beginning: 0 m.sec
List size now 102000
-------------------------------
When deleted from the beginning:
the linked list is 20 milliseconds
faster than the array list
-------------------------------
----------ARRAY LIST----------
Delete of the middle: 7 m.sec
List size now 101000
----------LINKED LIST----------
Delete of the middle 64 m.sec
List size now 101000
------------------------------
When deleted from the middle:
array list is significantly
faster than a linked list
------------------------------
----------ARRAY LIST----------
Delete on the end: 0 m.sec
List size now 100000
----------LINKED LIST----------
Delete on the end 1 m.sec
List size now 100000
------------------------------
When deleted on the end:
array list is 1 millisecond
faster than a linked list
------------------------------
 */


