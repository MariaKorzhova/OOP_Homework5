package Controller;

import java.util.List;
import java.util.HashMap;
import Model.Student;
// Создание интерфейса iGetView и методов для вывода списка, подсказки в терминал
public interface iGetView {
    void printAllStudent(HashMap<Long,Student> students);
    String prompt(String message);
}
