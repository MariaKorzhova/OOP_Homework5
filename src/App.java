import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.Model;

import Model.Student;
import View.ViewEng;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {

    HashMap<Long,Student> students = new HashMap<Long,Student>();
       Student s1 = new Student("Сергей", "Иванов", 21, (long)101);
       Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
       Student s3 = new Student("Иван", "Петров", 22, (long)121);
       Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
       Student s5 = new Student("Даша", "Цветкова", 25, (long)171);
       Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
       students.put((long) 1, s1);
       students.put((long) 2, s2);
       students.put((long) 3, s3);
       students.put((long) 4, s4);
       students.put((long) 5, s5);
       students.put((long) 6, s6);

       
    //    FileRepo fileRepo = new FileRepo("StudentDb.txt");
    //    for(Student pers :students)
    //    {
    //     fileRepo.addStudent(pers);
    //    }
    //    fileRepo.saveAllStudentToFile();


       iGetModel model = new Model(students);
    //    iGetModel modelFileRepo = fileRepo;

       




       iGetView view = new ViewEng();
       Controller control = new Controller(view, model);
       control.run();
    //    control.updateView();
       
    }
}
