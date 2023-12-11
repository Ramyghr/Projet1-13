import java.util.Comparator;
import java.util.Objects;

public class Employe implements Comparable<Employe> {
    private int id,grade;
    private String nom,prenom,nomdep;

    public Employe() {
    }

    public Employe(int id, int grade, String nom, String prenom, String nomdep) {
        this.id = id;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.nomdep = nomdep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomdep() {
        return nomdep;
    }

    public void setNomdep(String nomdep) {
        this.nomdep = nomdep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && Objects.equals(nom, employe.nom);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomdep='" + nomdep + '\'' +
                '}';
    }
    @Override
    public int compareTo(Employe o) {
        return this.id - o.id;
    }
}
