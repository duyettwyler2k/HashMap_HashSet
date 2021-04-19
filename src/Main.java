import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("duyet",21,"ase12");
        Student student1=new Student("duyet1",21,"ase12");
        Student student2=new Student("duyet2",21,"ase12");
        Map<Integer,Student> studentMap=new HashMap<Integer,Student>();
        studentMap.put(1,student);
        studentMap.put(2,student1);
        studentMap.put(3,student2);
        for (Map.Entry<Integer,Student>studentEntry:studentMap.entrySet()){
            System.out.println(studentEntry.toString());
        }
        Set<Student> students=new HashSet<Student>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        for (Student student3:students){
            System.out.println(student3.toString());
        }
    }
}
