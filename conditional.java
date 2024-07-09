
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int y=sc.nextInt();
        String monthString="";
        switch(m){
            case 1:monthString="January 31";
            break;
            case 2:
                if(y%4==0&&y%100!=0)
                monthString="February 29";
                else
                monthString="February 28";
            break;
            case 3:monthString="March 31";
            break;
            case 4:monthString="April 30";
            break;
            case 5:monthString="May 31";
            break;
            case 6:monthString="June 30";
            break;
            case 7:monthString="July 31";
            break;
            case 8:monthString="Augest 31";
            break;
            case 9:monthString="September 30";
            break;
            case 10:monthString="October 31";
            break;
            case 11:monthString="November 30";
            break;
            case 12:monthString="December 31";
            break;
            default:System.out.println("Invalid month!");
        }
        System.out.println(monthString);
    }
}

WEIRD


import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.println("Weird");
        }
        else if(n%2==0){
            if(n>2 && n<=5){
                System.out.println("Not Weird");
            }
            else if(n>20){
                System.out.println("Not Weird");
            }
            else if(n>6&&n<=20){
                System.out.println("Weird");
            }
        }
        else if(n%2==0){
            if(n>20){
                System.out.println("Not Wired");
            }
        }
    }
}



VOWEL ARE CONSONANT


import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().trim();
        checkVowelOrConsonant(input);
    }
    public static void checkVowelOrConsonant(String input){
        if(input.length()!=1||! Character.isLetter(input.charAt(0))){
            System.out.println("-1");
        }else{
            char ch=Character.toLowerCase(input.charAt(0));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
    }
}
