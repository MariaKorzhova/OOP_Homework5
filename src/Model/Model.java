package Model;

import java.util.List;
import java.util.HashMap;

import Controller.iGetModel;

public class Model implements iGetModel {

    private HashMap<Long,Student> students;

    public Model(HashMap<Long,Student> students) {
        this.students = students;
    }

    public HashMap<Long,Student> getAllStudent()
    {
        return students;
    }
    // private List<Student> students;

    // public Model(List<Student> students) {
    //     this.students = students;
    // }

    // public List<Student> getAllStudent()
    // {
    //     return students;
    // }
}
