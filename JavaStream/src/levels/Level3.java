package levels;

import models.Subject;
import models.Teacher;
import utils.Data;

import java.util.*;
import java.util.stream.Collectors;

public class Level3 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();


        /* TO DO 1: Retourner une chaine de caractère qui contient tous les noms des enseignants en majuscule separés par # */
        String names = teachers.stream().map(Teacher::getName).map(String::toUpperCase).reduce((name1,name2)-> name1+"#"+name2).orElse("");
        System.out.println("les noms des enseignant en majuscule "+names);

        /* TO DO 2: Retourner une set d'enseignants Java dont le salaire > 80000 */
        List<Teacher> teachers1 = teachers.stream().filter(teacher -> teacher.getSubject()== Subject.JAVA && teacher.getSalary()>80000).collect(Collectors.toList());

        /* TO DO 3: Retourner une TreeSet d'enseignants (tri par nom et en cas d'égalité tri par salaire) */
        TreeSet<Teacher> teachers2 = teachers.stream()
                .collect(Collectors.toCollection(() ->
                        new TreeSet<>(Comparator.comparing(Teacher::getName)
                                .thenComparingInt(Teacher::getSalary))));
        System.out.println("Treeset d'enseignants trier par nom et en cas d egalite trier par salaire " + teachers2);


        /* TO DO 4: Retourner une Map qui regroupe les enseignants par module */
        Map<Subject, List<Teacher>> map = teachers.stream()
                .collect(Collectors.groupingBy(Teacher::getSubject));
        System.out.println("Map grouping teachers by subject: " + map);

        /* TO DO 5: Retourner une Map qui regroupe les nom des enseignants par salaire */
        Map<Integer, String> map1 = teachers.stream()
                .collect(Collectors.groupingBy(Teacher::getSalary,
                        Collectors.mapping(Teacher::getName, Collectors.joining(", "))));
        System.out.println("Map grouping names by salary: " + map1);


    }
}
