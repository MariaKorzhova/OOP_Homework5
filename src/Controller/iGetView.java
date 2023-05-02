package Controller;

import java.util.List;
import java.util.HashMap;
import Model.Student;

public interface iGetView {
    void printAllStudent(HashMap<Long,Student> students);
    String prompt(String message);
}
