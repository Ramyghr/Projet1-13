import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creation
        DepartementHashSet departementHashSet = new DepartementHashSet();
        AffectationHashMap affectationHashMap = new AffectationHashMap();
        StudentManager studentManager = new StudentManager();
        List<Etudiant> etudiants=new ArrayList<>();

        Departement d1 = new Departement(1,50,"informatique");
        Departement d2 = new Departement(1,50,"informatique");
        Departement d3 = new Departement(3,10,"finance");
        Departement d4 = new Departement(6,20,"marketing");

        Employe e1 = new Employe(1,15,"7assen","7osni","informatique");
        Employe e2 = new Employe(2,20,"nassir","abdelaati","finance");
        Employe e3 = new Employe(3,20,"ramy","ramy","informatique");
        Employe e4 = new Employe(4,15,"don","don","marketing");


        //Ajour
        departementHashSet.ajouterDepartement(d1);
        departementHashSet.ajouterDepartement(d2);
        departementHashSet.ajouterDepartement(d3);
        departementHashSet.ajouterDepartement(d4);
        System.out.println("-----------------------------------------");
        affectationHashMap.ajouterEmployeDepartement(e1,d1);
        affectationHashMap.ajouterEmployeDepartement(e2,d3);
        affectationHashMap.ajouterEmployeDepartement(e3,d1);
        affectationHashMap.ajouterEmployeDepartement(e4,d4);
        System.out.println("-----------------------------------------");



        Etudiant etudiant1 = studentManager.createStudent(() -> new Etudiant(1,21,"ramy"));
        Etudiant etudiant2 = studentManager.createStudent(() -> new Etudiant(2,15,"nassir"));
        Etudiant etudiant3 = studentManager.createStudent(() -> new Etudiant(3,23,"don"));
        Etudiant etudiant4 = studentManager.createStudent(() -> new Etudiant(4, 16, "3ezdin"));
        etudiants.add(etudiant1);
        etudiants.add(etudiant2);
        etudiants.add(etudiant3);
        etudiants.add(etudiant4);

        //Affichage

        departementHashSet.displayDepartement();
        System.out.println("-----------------------------------------");
        affectationHashMap.afficherEmployesEtDepartements();
        System.out.println("-----------------------------------------");
        affectationHashMap.afficherEmployes();
        System.out.println("-----------------------------------------");
        affectationHashMap.afficherDepartement();
        System.out.println("-----------------------------------------");


        System.out.println("All Students");
        studentManager.displayStudents(etudiants,System.out::println);
        System.out.println("-----------------------------------------");
        System.out.println("Student older than 18");
        studentManager.displayStudentsByFilter(etudiants,etudiant -> etudiant.getAge()>18,System.out::println);
        System.out.println("-----------------------------------------");
        String studentnames = studentManager.returnStudentsNames(etudiants ,Etudiant::getNom);
        System.out.println("Student names :"+studentnames);
        //suprimmer
        departementHashSet.supprimerDepartement(d3);
        departementHashSet.displayDepartement();
        System.out.println("-----------------------------------------");
        affectationHashMap.supprimerEmploye(e1);
        affectationHashMap.supprimerEmployeEtDepartement(e2,d3);
        System.out.println("-----------------------------------------");
        affectationHashMap.afficherEmployesEtDepartements();
        System.out.println("-----------------------------------------");



        //rechercher
        System.out.println(departementHashSet.rechercherDepartement(d1));
        System.out.println(departementHashSet.rechercherDepartement("finance"));
        System.out.println(affectationHashMap.rechercherEmploye(e1));
        System.out.println("-----------------------------------------");
        System.out.println(affectationHashMap.rechercherDepartement(d1));
        affectationHashMap.afficherEmployesEtDepartements();
        System.out.println("-----------------------------------------");




        //trier
        System.out.println(departementHashSet.trierDepartementById());
        System.out.println("-----------------------------------------");
        System.out.println(affectationHashMap.trierMap());
        System.out.println("-----------------------------------------");


        List<Etudiant> sortedEtudtion = studentManager.sortStudentsById(etudiants, Comparator.comparingInt(Etudiant::getId));
        studentManager.sortStudentsById(etudiants,Comparator.comparingInt(Etudiant::getId));
        System.out.println("-----------------------------------------");
        System.out.println("Students as stream");
        studentManager.convertToStream(etudiants).forEach(System.out::println);
        studentManager.displayStudents(etudiants,System.out::println);


    }
}