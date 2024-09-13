import java.util.Scanner;

public class GradeCalculate {
    public static void main(String args[]){
    int total=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your marks for all subject out of 100");

    for (int i=1; i<=6; i++){
    
    int marks = sc.nextInt();
    
    total=total+marks;
    // System.out.println("Your total marks are:"+total);
    }
    System.out.println("Your total marks are:"+total);
    double percentage= (total*100)/600;
    System.out.println("Your Total Percentage is :"+percentage);
    if(percentage>=80){
        System.out.println("excelllent! you got A grade");
    }
    
        else if( percentage<80 && percentage>= 70){
            System.out.println("excelllent! you got B grade");
        }
        else if( percentage<70 && percentage>=50){
            System.out.println("Very Good! you got c grade");
        }
        else if( percentage<60 && percentage>= 50){
            System.out.println("Good! you got D grade");
        }
        else if( percentage<50 && percentage>= 40){
            System.out.println("Nice try! you got E grade");
        }
        else{
            System.out.println("Sorry!! You are Fail");
        }
    

    

}
}
