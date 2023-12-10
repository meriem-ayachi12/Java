import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Etudiant> students = new ArrayList<>();
        students.add(new Etudiant(1, 20, "Alice"));
        students.add(new Etudiant(2, 22, "Bob"));
        students.add(new Etudiant(3, 21, "Charlie"));
        students.add(new Etudiant(4, 23, "David"));
        students.add(new Etudiant(5, 20, "Eva"));
        students.add(new Etudiant(6, 22, "Frank"));
        students.add(new Etudiant(7, 21, "Grace"));
        students.add(new Etudiant(8, 23, "Hank"));
        students.add(new Etudiant(9, 19, "Ivy"));
        students.add(new Etudiant(10, 24, "Jack"));


        StudentManagement st = new StudentManagement();

        //lambda
        Consumer<Etudiant> con = s -> System.out.println(s);
        st.displayStudents(students, con);
        //reference method
        st.displayStudents(students, System.out::println);

        //lambda
        Predicate<Etudiant> pre = t -> t.getAge() > 22;
        st.displayStudentsByFilter(students, pre, con);

        //lambda
        Function<Etudiant, String> fun = e -> e.getName();
        String names = st.returnStudentsNames(students, fun);
        System.out.println(names);
        //reference method
        String names1 = st.returnStudentsNames(students, Etudiant::getName);
        System.out.println(names1);

        //lambda (create empty student object)
        Supplier<Etudiant> sup = () -> new Etudiant();
        Etudiant student = st.createStudent(sup);
        System.out.println(student);
        //lambda (create parametrized student object)
        Supplier<Etudiant> sup1 = () -> new Etudiant(11, 23, "Amy");
        Etudiant student1 = st.createStudent(sup);
        System.out.println(student1);

        //reference method (create empty student object)
        Supplier<Etudiant> sup2 = Etudiant::new;
        Etudiant student2 = sup2.get();
        System.out.println(student2);

        //lambda
        Comparator<Etudiant> com = (a, b) -> a.getId() - b.getId();
        List<Etudiant> students1 = st.sortStudentsById(students, com);
        System.out.println(students1);
        //reference method
        List<Etudiant> students2 = st.sortStudentsById(students, Comparator.comparing(Etudiant::getId));
        System.out.println(students2);

        Stream<Etudiant> stream = st.convertToStream(students);

    }
}