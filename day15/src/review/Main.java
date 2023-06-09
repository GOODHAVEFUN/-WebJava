package review;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("이우진", 20, 12345);
        Student student2 = new Student("", 22, 54321);
        Student student3 = new Student("John", 20, 12345);
        Student student4 = new Student("Jack", 19, 98765);


        System.out.println("student1.equals(student2): " + student1.equals(student2));
        System.out.println("student1.equals(student3): " + student1.equals(student3));


        System.out.println("student1.hashCode(st): " + student1.hashCode());
        System.out.println("student2.hashCode(): " + student2.hashCode());
        System.out.println("student3.hashCode(): " + student3.hashCode());


        System.out.println("student1.toString(): " + student1.toString());
        System.out.println("student2.toString(): " + student2.toString());
        System.out.println("student3.toString(): " + student3.toString());
        System.out.println("student4.toString(): " + student4.toString());
    }
}
