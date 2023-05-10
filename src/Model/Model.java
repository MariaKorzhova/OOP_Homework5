package Model;

import java.util.List;
import java.util.HashMap;

import Controller.iGetModel;
// Создание класса Model и подключение к интерфейсу iGetModel
public class Model implements iGetModel {

    private HashMap<Long,Student> students;
// Конструктор класса Model
    public Model(HashMap<Long,Student> students) {
        this.students = students;
    }
// Метод для вызова всех элементов списка
    public HashMap<Long,Student> getAllStudent()
    {
        return students;
    }
    // private List<Student> students;

// Метод для удаления элемента списка по ключу
    @Override
    public HashMap<Long, Student> removeStudent(Long n) {
        if (students.containsKey(n)){
            students.remove(n);}
        else {
            System.out.println("Такой строки нет");
        }
        return students;
        
    }

    // public Model(List<Student> students) {
    //     this.students = students;
    // }

    // public List<Student> getAllStudent()
    // {
    //     return students;
    // }
}
