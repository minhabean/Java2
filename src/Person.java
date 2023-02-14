public class Person {
    String name;
    Object age;
    boolean student;
    Object weight;

    Person(String name, int age, boolean student, double weight) {
        this.name = name;
        this.age = age;
        this.student = student;
        this.weight = weight;
    }
    Person(String name, String age, boolean student, String weight){
        this.name = name;
        this.age = age;
        this.student = student;
        this.weight = weight;
    }
    Person(String name, int age, boolean student, String weight){
        this.name = name;
        this.age = age;
        this.student = student;
        this.weight = weight;
    }

    Person(String name, String age, boolean student, double weight){
        this.name = name;
        this.age = age;
        this.student = student;
        this.weight = weight;
    }
    void printProfile(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("대학생인가요? : " + student);
        System.out.println("몸무게 : " + weight);
        System.out.println();
    }
}
