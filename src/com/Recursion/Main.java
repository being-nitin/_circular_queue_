package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
	/*
     Why circular queue is needed?

     If the rear reaches to the end position of the Queue then there might be possibility that
     some vacant spaces are left in the beginning which cannot be utilized. So, to
     overcome such limitations, the concept of the circular queue was introduced.
	 */
        circularQueue cr = new circularQueue();
        cr.insert(90);
        cr.insert(91);
        cr.insert(92);
        cr.insert(93);
        cr.insert(94);
        cr.display();
        System.out.println(cr.remove());
        cr.insert(98);
        cr.display();
        System.out.println(4%5);
    }
}
