package kr.hs.dgsw.java.K0504;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListStudy {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();
        List<String> stack = new Stack<String>();

        list1.add("Korea");
        list2.add("Korea");
        stack.add("Korea");

        list1.add("Gana");
        list2.add("Gana");
        stack.add("Gana");

        System.out.println(list1.get(0));
        System.out.println(list2.get(0));
        System.out.println(stack.get(0));
    }

}
