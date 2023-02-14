public class Student {
    String name;
    int kor;
    int eng;

    Student(String name, int kor, int eng){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }
    void print() {
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println();
    }
}
