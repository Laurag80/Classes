package HomeWork09;

public class Task6 {
    /*
    6)Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    score > 90 - A
    score >80 - B
    score >70 - C
    score > 50 - D
    anything else - F
     */
    public static class Student {
        public static char getGrade(int score) {
            if (score > 90) {
                return 'A';
            } else if (score > 80) {
                return 'B';
            } else if (score > 70) {
                return 'C';
            } else if (score > 50) {
                return 'D';
            } else {
                return 'F';
            }
        }
    }
    public static void main(String[] args) {
        Student obj= new Student();
        System.out.println(obj.getGrade(89)); // will print 'B'
    }
}
