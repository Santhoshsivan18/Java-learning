public class defineclass {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] nos = new int[5];

        // store 5 student names
        String[] names = new String[5];

        // store 5 student data like - {rollno, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // new - dynamically allocates memory & returns a reference to it
        Student[] student = new Student[5];

        // Student student1; - declaring the reference variable "student1" to an object of type Student (i.e) it's just prsent in stack memory now
        Student student1;

        // System.out.println(Arrays.toString(student));
        // o/p - [null, null, null, null, null]


    }
}

// datatype for every single student
class Student {
    int rno;
    String name;
    float marks;
}
