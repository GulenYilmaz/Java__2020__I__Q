package Java_Certification__Questions;

public class QQQ103 {

}
class Stuudent {
    String name;
    public Stuudent(String name){
        this.name=name;
    }
}
class TTESTT{
    public static void main(String[] args){

        Stuudent [] students= new Stuudent[3];
        students[1]=new Stuudent("Richard");
        students[2]=new Stuudent("Donald");
        for( Stuudent s:students){
            System.out.println(" "+s.name);
        }
     }

//second way
//
//        Student [] students= new Student[3];
//        students[0]=new Student("Richard");
//        students[1]=new Student("Donald");
//        for( Student s:students){
//            System.out.println(" "+s.name);
//        }
//    }
}

// What is the result?
/*
*A. nullRichardDonald
B. RichardDonald
C. Compilation fails
D. An ArrayOutOfBoundException is thrown at runtime
E. A NullPointerException is thrown at runtime.
*/

