import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> departementsHashSet = new HashSet<Departement>();
    @Override
    public void ajouterDepartement(Departement departement) {
        departementsHashSet.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement d: departementsHashSet){
            if(d.getNomdep().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departementsHashSet.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departementsHashSet.remove(departement);
    }

    @Override
    public void displayDepartement() {
        Iterator<Departement> it=departementsHashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }



    @Override
    public TreeSet trierDepartementById() {
        return new TreeSet<>(departementsHashSet);
    }
}
