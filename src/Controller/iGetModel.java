package Controller;

import java.util.List;
import java.util.HashMap;
import Model.Student;
// Создание интерфейса iGetModel и методов для вызова всех элементов списка, для удаления элемнента списка
public interface iGetModel {
    public HashMap<Long,Student> getAllStudent();
    public HashMap<Long,Student> removeStudent(Long n);
}
