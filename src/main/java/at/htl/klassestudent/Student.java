package at.htl.klassestudent;

public class Student implements Comparable<Student> {

    private int katNr;
    private String vorname;
    private String nachname;

    public Student() {
    }

    public Student(String vorname, String nachname) {
        this();
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getKatNr() {
        return katNr;
    }

    public void setKatNr(int katNr) {
        this.katNr = katNr;
    }


    @Override
    public int compareTo(Student o) {
        if (this.nachname.equals(o.getNachname())) {
            return this.vorname.compareTo(o.getVorname());
        }
        return this.nachname.compareTo(o.getNachname());
    }

    @Override
    public String toString() {
        return String.format("%s, %s", nachname, vorname);
    }



}
