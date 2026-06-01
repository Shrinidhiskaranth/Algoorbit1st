package  Java;
import java.util.Scanner;
public class example{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name");
String fname=sc.nextLine();
        System.out.println("Enter the last name");
        String lname=sc.nextLine();
        System.out.println("Enter the age");
        int age=sc.nextInt();
        System.out.println("Hello this is "+fname+" "+lname+" age is "+age);
System.out.println("Enter the number which u need the table to create");
int num=sc.nextInt();

for(int i=1;i<=10;i++){
    System.out.println(num+"*"+i+"="+num*i);
}

    }
}