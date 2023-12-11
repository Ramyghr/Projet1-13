import com.sun.source.tree.Tree;

import java.util.TreeSet;

public interface IDepartement<T> {
    public void ajouterDepartement(T t);
    public boolean rechercherDepartement(String nomdep);
    public boolean rechercherDepartement(T t);
    public void supprimerDepartement(T t);
    public void displayDepartement();
    public TreeSet<T> trierDepartementById();


}
