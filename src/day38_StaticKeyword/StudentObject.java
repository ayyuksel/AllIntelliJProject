package day38_StaticKeyword;

public class StudentObject {
    public static void main(String[] args) {
        CybertekStudent student1 = new CybertekStudent();
        student1.setInfo("Ayse",21,5,'F');

        CybertekStudent student2 = new CybertekStudent();
        student2.setInfo("Erjon",22,6,'M');

        CybertekStudent student3 = new CybertekStudent();
        student3.setInfo("Afrooz",23,7,'F');
        //System.out.println(student1.schoolName)
        //System.out.println(student2.schoolName);
        System.out.println(CybertekStudent.schoolName);//prefer
        System.out.println(CybertekStudent.schoolName);
        //student1.getSchoolInfo();
        //student2.getSchoolInfo();
        //student3.getSchoolInfo();

        CybertekStudent.getSchoolInfo();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }
}
