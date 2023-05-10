package Model;
// Создание класса Student, наследника User и подключение к интерфейсу Comparable<Student>
public class Student extends User implements Comparable<Student>{
    private long studentID;
// Конструктор класса Student
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }

// Метод для вызова ID экземпляра
    public long getStudentID() {
        return studentID;
    }
// Метод, который устанавливает ID экземпляра
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }
// Метод, который переопределяет метод вывода в консоль toString()
    @Override
    public String toString() {
        return "Student{" 
                
                +"firstName=" +super.getFirstName()
                +", secondName=" +super.getSecondName()
                +", age=" +super.getAge()+
                ", studentID=" + studentID +
                '}';
    }

// Метод, который переопределяет метод сортировки compareTo(Student o) 
    @Override
    public int compareTo(Student o) {
        
        System.out.println(super.getFirstName()+" - "+o.getFirstName());
         if(super.getAge()==o.getAge())
         {
            if(this.studentID==o.studentID)
            {
                return 0;
            }
            if(this.studentID<o.studentID)
            {
                return -1;
            }
            return 1;
         } 
         if(super.getAge()<o.getAge())
         {
            return -1;
         }   
         return 1;
    }
}
