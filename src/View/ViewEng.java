package View;

import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.lang.Iterable;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView {
    public void printAllStudent(HashMap<Long,Student> students)
    {
        System.out.println("-----Displaying a list of students-----");
        for (HashMap.Entry<Long, Student> set :
        students.entrySet()) {
 
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = "
                               + set.getValue());
        }
        // for(Long person : students.get(person))
        // {
        //     System.out.println(person);
        // }
        System.out.println("-----End of list-----");
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
