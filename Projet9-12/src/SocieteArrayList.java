import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    List<Employe> employes;
    public SocieteArrayList(){
        employes = new ArrayList<>();

    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(int i=0;i<employes.size();i++){
            if(employes.get(i).getNom().equals(nom))
                return true;
        }
        //methodes 2
        //for (Employe employe)
            //if(employe.getNom().equals(nom))
                //return true;
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        System.out.println(employes);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> departementComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNomdep().compareTo(o2.getNomdep());
            }
        };
        Comparator<Employe> gradeComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade() - o2.getGrade();
            }
        };
        Collections.sort(employes,departementComparator.thenComparing(gradeComparator));

    }
}
