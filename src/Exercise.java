import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("제이슨", 87, 92));
        students.add(new Student("레이첼", 82, 92));
        students.add(new Student("리사", 92, 88));

        for(int i=0; i<students.size(); i++){
            Student student = students.get(i);
            student.print();
        }
    }
}