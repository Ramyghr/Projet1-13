import com.sun.source.tree.Tree;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe employe, Departement departement) {
        if (!affectations.containsKey(employe)) {
            affectations.put(employe, departement);
            System.out.println("Affectation réussie : " + employe.getNom() + " dans le département " + departement.getNomdep());

        } else {
            System.out.println("L'employé " + employe.getNom() + " est déjà affecté à un département.");
        }
    }
    public void afficherEmployesEtDepartements(){
        System.out.println("Liste des employe et departement :");
        for (Map.Entry<Employe , Departement> entry :affectations.entrySet()){
            Employe employe=entry.getKey();
            Departement departement =entry.getValue();
            System.out.println("Employe :"+employe.getNom()+",Departement ;"+departement.getNomdep());
        }
    }
    public void supprimerEmploye(Employe employe){
        if(affectations.containsKey(employe)){
            affectations.remove(employe);
            System.out.println("l'employe "+employe.getNom()+"est mfassekh");
        }else {
            System.out.println(employe.getNom()+"n'est pas affecte");
        }
    }
    public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
        if (affectations.containsKey(employe) && affectations.get(employe).equals(departement)) {
            affectations.remove(employe);
            System.out.println("Suppression réussie : " + employe.getNom() + " du département " + departement.getNomdep());
        } else {
            System.out.println("L'employé " + employe.getNom() + " n'est pas affecté à ce département.");
        }
    }
    public void afficherEmployes(){
        System.out.println("Liste des employe :");
        for (Map.Entry<Employe , Departement> entry :affectations.entrySet()){
            Employe employe=entry.getKey();

            System.out.println("Employe :"+employe.getNom());
        }
    }
    public void afficherDepartement(){
        System.out.println("Liste des departement :");
        for (Map.Entry<Employe , Departement> entry :affectations.entrySet()){
            Departement departement=entry.getValue();

            System.out.println("Depatement :"+departement.getNomdep());
        }
    }
    public boolean rechercherEmploye(Employe employe){
        return affectations.containsKey(employe);
    }
    public boolean rechercherDepartement(Departement departement){
        return affectations.containsKey(departement);
    }
    public TreeMap<Employe,Departement>trierMap(){
        TreeMap<Employe,Departement> sortedMap = new TreeMap<>(affectations);
        return sortedMap;
    }


}
