package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Hashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Logger l = Logger.getLogger("welcome");
        HashSet<String> set = new HashSet<>();
        int i=0;
        l.info("Enter size of the set:");
        int size=s1.nextInt();
        l.info("Enter Employees name to Add:");
        while (i < size) {
            set.add(s.nextLine());
            i++;
        }
        l.log(Level.INFO, "The Employees name are:"+set);
        l.info("Enter Employees name to remove:");
        set.remove(s.nextLine());
        l.log(Level.INFO, "After remove the employee name:"+set);
        l.info("Enter Employees name to check:");
        if(set.contains(s.nextLine()))
            l.info("The name is present in the set");
        else
            l.info("The name is not present in the set");
        HashSet<String> set1 = new HashSet<>(set);
        set1.addAll(set);
        set1.add("sri");
        l.log(Level.INFO,"The new Employee set is: "+set1);
        set1.removeAll(set);
        l.log(Level.INFO,"After remove all in set1: "+set1);
        set.clear();
        l.log(Level.INFO,"After clearing Employee set: "+set);
        if(set.isEmpty())
            l.info("The Employee set is empty");
        else
            l.info("The Employee set is not empty" );

    }
}
