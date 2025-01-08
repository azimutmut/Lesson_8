package lesson_8;

class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    // Конструктор
    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации об объекте
    public void printInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println();
    }

    // Геттер для возраста
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Создаем массив сотрудников
        Employee[] employees = new Employee[5];

        // Инициализируем массив объектами
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 40000, 45);
        employees[2] = new Employee("Sidorov Sid", "Analyst", "sidorov@mailbox.com", "892312314", 50000, 41);
        employees[3] = new Employee("Kuznetsov Kuz", "Developer", "kuznetsov@mailbox.com", "892312315", 60000, 28);
        employees[4] = new Employee("Smirnov Smir", "Designer", "smirnov@mailbox.com", "892312316", 35000, 50);

        // Вывод информации о сотрудниках старше 40 лет
        System.out.println("Employees older than 40:");
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}

//
//public class MainAppConstructor {
//    public static void main(String[] args) {
//        CatConstructor[] persArray = new CatConstructor[5];
//        persArray[0] = new CatConstructor("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        persArray[1] = new CatConstructor("Ivanov Ivang", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        persArray[2] = new CatConstructor("Ivanov Ivafn", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        persArray[3] = new CatConstructor("Ivanov Ivaan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        persArray[4] = new CatConstructor("Ivanov Idvan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
////        CatConstructor barsik = new CatConstructor("Барсик", "Белый", 4);
////        CatConstructor simba = new CatConstructor("Simba", "Yellow", 4);
//        CatConstructor.myMethod();
//    }
//
//}