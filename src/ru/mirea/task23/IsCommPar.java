package ru.mirea.task23;

class DNA{
    String surname;
    int motherp_dna;
    int fatherp_dna;
    public DNA( String sn, int md, int fd) {
        this.surname =sn;
        this.motherp_dna = md;
        this.fatherp_dna = fd;
    }
    @Override
    public boolean equals(Object surname) {
        if (this == surname) return true;
        if (surname == null || getClass() != surname.getClass()) return false;

        DNA that = (DNA) surname;

        if (motherp_dna != that.motherp_dna) return false;
        return fatherp_dna == that.fatherp_dna;
    }
    @Override
    public int hashCode() {
        int result = surname == null ? 0 : surname.hashCode();
        result = 31 * result + motherp_dna;
        result = 31 * result + fatherp_dna;
        return result;
    }

}
public class IsCommPar {
    public static void main(String[] args) {

        DNA Person1 = new DNA("Smirnova", 196453573, 390390487);
        DNA Person2 = new DNA("Smirnov", 196473573, 390390487);

        System.out.println("Эти люди связаны родственной связью брат-сестра или наоборот?");
        System.out.println(Person1.equals(Person2));

        //System.out.println("Какие у них хэш-коды?");
        //System.out.println(Person1.hashCode());
        //System.out.println(Person2.hashCode());
    }

}
