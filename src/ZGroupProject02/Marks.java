package ZGroupProject02;

public abstract class Marks {
    /*
    2. We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by student B.
    Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
     Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes
     the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
     Test your code
     */
    public abstract double getAverage();
}

class A extends Marks {
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;

    public A(double subject1Marks, double subject2Marks, double subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    @Override
    public double getAverage() {
        return (subject1Marks + subject2Marks + subject3Marks) / 3;
    }
}

class B extends Marks {
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;
    private double subject4Marks;

    public B(double subject1Marks, double subject2Marks, double subject3Marks, double subject4Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
    }

    @Override
    public double getAverage() {
        return (subject1Marks + subject2Marks + subject3Marks + subject4Marks) / 4;
    }
}