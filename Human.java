package midassessment;
import java.util.Scanner;

public class Human {
    String name;
    int age;  
    String nationality;
    void humanInfo(){
        System.out.println("Name : "+name);
        System.out.println("Age: "+age);
        System.out.println("Nationality: "+nationality);
        }
}
class Male extends Human{
    String gender;

    void humanInfo2(){
        humanInfo();
    //Scanner input = new Scanner(System.in);
    //String gender = input.nextString();
        System.out.println("Gender: " +gender);
    } 
}
class Female extends Human{
    String gender;

    void humanInfo3(){
        humanInfo();
    
        System.out.println("Gender: " +gender);
    } 
}
class Inherit{
    public static void main(String[] args) {
        Male m = new Male();
        Female f = new Female();
        m.name= "Sukumar Chowdhury";
        m.age = 64;
        m.gender="Male";
        m.nationality = "Bangladeshi";
        m.humanInfo2();
        
        f.name= "Tripty Chowdhury";
        f.age = 54;
        f.gender="Female";
        f.nationality = "Bangladeshi";
        f.humanInfo3();
       
    }
}

