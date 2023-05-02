package Controller;

import java.util.List;
import java.util.HashMap;
import Model.Student;

public interface iGetModel {
    public HashMap<Long,Student> getAllStudent();
    public HashMap<Long,Student> removeStudent(Long n);
}
