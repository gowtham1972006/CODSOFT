import java.util.*;
class NumberGame{
    public static void main(String args[]){                     //Task-1 Number Game
        int N=(int)(Math.random()*(100))+1;
        Scanner A=new Scanner(System.in);
        int c=0,score=0;
        char r='Y';
        while(r=='Y'||r=='y'){
        System.out.println("Enter the number you Guessed: ");
        for(int i=0;i<10;i++){
        int n=A.nextInt();
        c=recur(n,N);
         if(c==1){
         score=score+9-i;
        break;}}
        if(c==0)
        System.out.println("Oops:( You Lost!");
        System.out.println("Do you want to play Again (Y/n): ");
        r=A.next().charAt(0);
    }      
        System.out.println("Your Score is: "+ score);
        System.out.println("Thanks for Playing :)");
    
}
        static int recur(int n,int N){
        if(n>N){
        System.out.println("The number is too high...!");
        return 0;}
        else if(n<N){
        System.out.println("The number is too low...!");
        return 0;}
        else {
            System.out.println("Wow! You Got the number...!");
            return 1;
            }
    }
}