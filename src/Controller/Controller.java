package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import Model.Student;
import Model.Model;
import View.ViewEng;
import java.util.HashMap;
// Создание класса Controller
public class Controller {

    private HashMap<Long,Student> students; 
    private iGetView view;
    private iGetModel model;
// Конструктор класса Controller
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new HashMap<Long,Student>();
    } 
// Метод для вызова всех элементов списка
    public void getAllStudent()
    {
        students = model.getAllStudent();
    }
// Метод для определения размера списка, больше 0 или нет
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
// Метод для выведения списка в терминал, если список не пустой
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
// Метод для вызова комманд, которые управляют списком (выход, вывод, удаление)
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
                    model.removeStudent(a);
                    updateView();
                    break;
            }

        }
    }

}