package JavaQuiz5;

public class Q1 {
    public static void main(String[] args) {


        class A{

            public int i;

            private int j;

        }

        class B extends A{

            void display(){

                super.j = super.i + 1;

                System.out.println(super.i + " " + super.j);

            }

        }

        class Inheritance {

            public static void main(String args[]){

                B obj = new B();

                obj.i=1;

               // obj.j=2;

                obj.display();

            }

        }
    }
}
/*
    This program will result in a compilation error because the subclass
    B is attempting to access a private field j of its superclass A using the super keyword.
 */