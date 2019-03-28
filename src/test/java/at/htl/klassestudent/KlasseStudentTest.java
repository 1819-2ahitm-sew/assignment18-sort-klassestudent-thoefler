package at.htl.klassestudent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class KlasseStudentTest {

    @Test
    public void student_comp4areTwoStudents_success() {
        Student maxi = new Student("Maxi","Müller");
        Student susi = new Student("Susi","Scholz");
        int compare = maxi.compareTo(susi);
        assertThat(compare, lessThan(0));
    }

    @Test
    public void student_compareTwoStudentsViceVersa_success() {
        Student maxi = new Student("Maxi","Müller");
        Student susi = new Student("Susi","Scholz");
        assertThat(susi.compareTo(maxi), greaterThan(0));
    }

    @Test
    public void student_compareTwoEqualStudents_success() {
        Student maxi = new Student("Maxi","Müller");
        Student maxi2 = new Student("Maxi","Müller");
        assertThat(maxi.compareTo(maxi2), is(0));
    }

    @Test
    public void klasse_insertFirstStudent_success() {
        Student magda = new Student("Magdalena","Nonononodwa");
        Klasse klasse = new Klasse("2ahitm");
        klasse.add(magda);

        assertThat(klasse.getStudents(), hasItemInArray(magda));
        assertThat(klasse.getStudents(), arrayWithSize(1));
    }

    @Test
    public void klasse_addNewStudent(){
        Klasse klasse = new Klasse("2ahitm");
        Student magda = new Student("Magdalena", "Scholz");
        klasse.add(magda);
        assertThat(klasse.getStudents(),arrayWithSize(1));
        assertThat(klasse.getStudents(),hasItemInArray(magda));
    }

    @Test
    public void klasse_addSecondNewStudent(){
        Klasse klasse = new Klasse("2ahitm");
        Student magda = new Student("Magdalena", "Scholz");
        Student nina = new Student("Nina", "Bopolini");
        klasse.add(magda);
        klasse.add(nina);
        assertThat(klasse.getStudents(),arrayWithSize(2));
        assertThat(klasse.getStudents(),hasItemInArray(magda));
        assertThat(klasse.getStudents(),hasItemInArray(nina));
    }

    @Test
    public void klasse_addThirdNewStudent(){
        Klasse klasse = new Klasse("2ahitm");
        Student magda = new Student("Magdalena", "Scholz");
        Student nina = new Student("Nina", "Bopolini");
        Student meris = new Student("Meris", "Bepo");
        klasse.add(magda);
        klasse.add(nina);
        klasse.add(meris);
        assertThat(klasse.getStudents(),arrayWithSize(3));
        assertThat(klasse.getStudents(),hasItemInArray(magda));
        assertThat(klasse.getStudents(),hasItemInArray(nina));
        assertThat(klasse.getStudents(),hasItemInArray(meris));
    }

    @Test
    public void klasse_addFourthNewStudent(){
        Klasse klasse = new Klasse("2ahitm");
        Student magda = new Student("Magdalena", "Scholz");
        Student nina = new Student("Nina", "Bopolini");
        Student meris = new Student("Meris", "Bepo");
        Student adrian = new Student("Adrian", "Moser");
        klasse.add(magda);
        klasse.add(nina);
        klasse.add(meris);
        klasse.add(adrian);
        assertThat(klasse.getStudents(),arrayWithSize(4));
        assertThat(klasse.getStudents(),hasItemInArray(magda));
        assertThat(klasse.getStudents(),hasItemInArray(nina));
        assertThat(klasse.getStudents(),hasItemInArray(meris));
        assertThat(klasse.getStudents(),hasItemInArray(adrian));
    }

    @Test
    public void klasse_bubbleSort_success() {
        Klasse klasse = new Klasse("2ahitm");
        Student magda = new Student("Magdalena", "Scholz");
        Student nina = new Student("Nina", "Bopolini");
        Student meris = new Student("Meris", "Bepo");
        Student adrian = new Student("Adrian", "Moser");
        klasse.add(magda);
        klasse.add(nina);
        klasse.add(meris);
        klasse.add(adrian);

        klasse.grundSort();

        assertThat(klasse.getStudents(), arrayContaining(meris,adrian,magda,nina));
    }


}