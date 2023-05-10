package Model;
// Создание базового класса User
public class User {
    private String firstName;
    private String secondName;
    private int age;
// Конструктор базового класса User
    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
// Метод для вызова имени экземпляра
    public String getFirstName() {
        return firstName;
    }
// Метод, который устанавливает имя экземпляра
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
// Метод для вызова фамилии экземпляра
    public String getSecondName() {
        return secondName;
    }
// Метод, который устанавливает фамилию экземпляра
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
// Метод для вызова возраста экземпляра
    public int getAge() {
        return age;
    }
// Метод, который устанавливает возраст экземпляра
    public void setAge(int age) {
        this.age = age;
    }
// Метод, который переопределяет метод вывода в консоль toString()
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
