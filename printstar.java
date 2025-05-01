import  java.util.Scanner;
public class printstar{
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // for( int i = n ; i >= 1; i--){
        //     for( int j = 1 ; j <= i ; j++)
        //         System.out.print("* ");
        //     System.out.println( );
        // }

        //OUtput : 
        //* * * * * * 
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*

        for( int i = 1 ; i <= n; i++){
            for( int j = 1 ; j <= i ; j++)
                System.out.print("* ");
            System.out.println( );
        }

        //output 
        //* 
        //* * 
        //* * * 
        //* * * * 
        //* * * * *         
    
    }
}