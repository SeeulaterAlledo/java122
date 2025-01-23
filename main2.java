import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. Класс "Человек"
class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }

    public void incrementAge() {
        age++;
    }

    public void changeName(String newName) {
        name = newName;
    }
}

// 2. Наследование: Класс "Работник" и "Менеджер"
class Worker extends Person {
    private double salary;

    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Worker {
    private Worker[] subordinates;

    public Manager(String name, int age, String gender, double salary, Worker[] subordinates) {
        super(name, age, gender, salary);
        this.subordinates = subordinates;
    }

    public Worker[] getSubordinates() {
        return subordinates;
    }
}

// 3. Полиморфизм: Животные
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Cow implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}

// 4. Абстрактный класс "Транспорт"
abstract class Transport {
    abstract void move();
}

class Car extends Transport {
    @Override
    void move() {
        System.out.println("The car is driving");
    }
}

class Bike extends Transport {
    @Override
    void move() {
        System.out.println("The bike is cycling");
    }
}

// 5. Класс "Книга" и "Библиотека"
class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }
}

// 6. Инкапсуляция: Банк
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

// 7. Счетчик объектов
class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

// 8. Площадь фигур
abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

// 9. Наследование: Животные и их движения
class AnimalMovement {
    public void move() {
        System.out.println("Animal is moving");
    }
}

class Fish extends AnimalMovement {
    @Override
    public void move() {
        System.out.println("Fish is swimming");
    }
}

class Bird extends AnimalMovement {
    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}

class DogMovement extends AnimalMovement {
    @Override
    public void move() {
        System.out.println("Dog is running");
    }
}

// 10. Работа с коллекциями: Университет
class Student {
    private String name;
    private String group;
    private double grade;

    public Student(String name, String group, double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}

class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> sortByName() {
        students.sort((a, b) -> a.getName().compareTo(b.getName()));
        return students;
    }

    public List<Student> filterByGrade(double minGrade) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() >= minGrade) {
                result.add(student);
            }
        }
        return result;
    }
}

// Главный класс для проверки
public class Main {
    public static void main(String[] args) {
        // Пример работы с классами

        // Полиморфизм с животными
        Animal[] animals = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animals) {
            animal.makeSound();
        }

        // Работа с библиотекой
        Library library = new Library();
        library.addBook(new Book("Book1", "Author1", 2000));
        library.addBook(new Book("Book2", "Author2", 2005));
        System.out.println("Books by Author1: " + library.searchByAuthor("Author1").size());

        // Проверка счетчика объектов
        new Counter();
        new Counter();
        System.out.println("Objects created: " + Counter.getCount());
    }
}
