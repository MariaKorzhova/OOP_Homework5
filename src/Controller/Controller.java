package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import Model.Student;
import Model.Model;
import View.ViewEng;
import java.util.HashMap;

public class Controller {

    private HashMap<Long,Student> students; 
    private iGetView view;
    private iGetModel model;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new HashMap<Long,Student>();
    } 

    public void getAllStudent()
    {
        students = model.getAllStudent();
    }

    public boolean testData()
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void updateView()
    {
        //MVP
        getAllStudent();
        if(testData())
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }
        
        //MVC
        //view.printAllStudent(model.getAllStudent());
    }

    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudent();
                    updateView();
                    break;
                case DELETE:
                    Scanner iScanner = new Scanner(System.in);
                    System.out.printf("Введите номер строки, которую нужно удалить: ");
                    Long a = iScanner.nextLong();
                    // for (HashMap.Entry<Long, Student> set : students.entrySet()) {
                    students.removeStudent(a);
                    updateView();
                    break;
            }

        }
    }

}