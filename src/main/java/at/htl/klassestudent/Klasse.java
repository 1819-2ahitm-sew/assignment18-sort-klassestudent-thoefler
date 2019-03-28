package at.htl.klassestudent;

public class Klasse {

    private String klassenbezeichnung;
    private Student[] students;

    public Klasse(String klassenbezeichnung) {
    }

    public Klasse(String klassenbezeichnung, Student[] students) {

        this.klassenbezeichnung = klassenbezeichnung;
        this.students = students;
    }

    public void add(Student student) {
        if (students == null) {
            students = new Student[1];
        } else {
            Student[] help = new Student[students.length + 1];
            for (int i = 0; i < help.length - 1; i++) {
                help[i] = students[i];
            }
            students = help;
        }
        students[students.length - 1] = student;
    }

    public String getKlassenbezeichnung() {
        return klassenbezeichnung;
    }

    public void setKlassenbezeichnung(String klassenbezeichnung) {
        this.klassenbezeichnung = klassenbezeichnung;
    }

    public Student[] students() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }



    @Override
    public String toString() {
        return String.valueOf(klassenbezeichnung);
    }

    public void grundSort() {
        showArray();
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[i].compareTo(students[j]) < 0) {
                    Student help = students[j];
                    students[i] = students[j];
                    students[j] = help;
                }
            }
        }
    }

    public void showArray() {
        for (Student student : students) {
            System.out.println(student + " - ");

        }
    }

    public void sortBubble() {



    }

    public void sortInsertion() {

    }


}
