package levels;

import models.Subject;
import models.Teacher;
import utils.Data;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Level2 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();

        /* TO DO 1: Retourner le nombre des enseignants dont le nom commence avec s */
        long nbr = teachers.stream().filter(teacher -> teacher.getName().startsWith("s")).count();
        System.out.println("Le nombre des enseignaints dont le nom commence avec s"+nbr);

        /* TO DO 2: Retourner la somme des salaires de tous les enseignants Flutter (hint: mapToInt) */
        long sum = teachers.stream().filter(teacher -> teacher.getSubject()== Subject.FLUTTER).mapToLong(Teacher::getSalary).sum();
        System.out.println("la somme des salaires de tous les enseignants "+sum);
        /* TO DO 3: Retourner la moyenne des salaires des enseignants dont le nom commence avec a */

        OptionalDouble average = teachers.stream().filter(teacher -> teacher.getName().startsWith("a")).mapToDouble(Teacher::getSalary).average();
        System.out.println("aLa moyenne des salaires des enseignants dont le nom commence avec a :"+(average.isPresent()? average.getAsDouble() : "N/A"));


        /* TO DO 4: Retourner la liste des enseignants dont le nom commence par f */
        List<Teacher> teachers1 = teachers.stream().filter(teacher -> teacher.getName().startsWith("f")).collect(Collectors.toList());
        System.out.println("La liste des enseingants dont le nom commence par f :"+teachers1);


        /* TO DO 5: Retourner la liste des enseignants dont le nom commence par s */
        List<Teacher> teachers2 = teachers.stream().filter(teacher -> teacher.getName().startsWith("s")).collect(Collectors.toList());
        System.out.println("La liste des enseignants dont le nom commence par s :"+teachers2);


        /* TO DO 5: Retourner true si il y a au min un enseignants dont le salaire > 100000, false si non */
        boolean test = teachers.stream().anyMatch(teacher -> teacher.getSalary()>100000);
        System.out.println("la list des enseignants ayant une salaire supperieure a 100000 ;"+test);

        /* TO DO 6: Afficher le premier enseignant Unity le nom commence avec g avec 2 manières différentes */
        /*First way*/
        teachers.stream().filter(teacher -> teacher.getSubject()==Subject.UNITY && teacher.getName().startsWith("g")).findFirst().ifPresent(System.out::println);
        ;
        /*Second way*/
        teachers.stream().filter(teacher -> teacher.getSubject()==Subject.UNITY && teacher.getName().startsWith("g")).limit(1).forEach(System.out::println);

        /* TO DO 7: Afficher le deuxième enseignant dont le nom commence avec s */
        teachers.stream().filter(teacher -> teacher.getName().startsWith("s")).skip(1).findFirst().ifPresent(System.out::println);

    }
}
