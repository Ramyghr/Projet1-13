import java.util.Objects;

public class Departement implements Comparable<Departement>{
    private int id,nbremp;
    private String nomdep;

    public Departement(int id, int nbremp, String nomdep) {
        this.id = id;
        this.nbremp = nbremp;
        this.nomdep = nomdep;
    }

    public Departement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbremp() {
        return nbremp;
    }

    public void setNbremp(int nbremp) {
        this.nbremp = nbremp;
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
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nomdep, that.nomdep);
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(id, nomdep);
    }*/

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nbremp=" + nbremp +
                ", nomdep='" + nomdep + '\'' +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return this.id - o.id;
    }
}
