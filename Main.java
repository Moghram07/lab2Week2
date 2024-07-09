import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        //Q1. write a program to find the longest words in a given dictionary
        String [] words = {"Cat", "dog", "red", "is", "am"};
        int shortNum = 10;
        for(String n : words){
            if(n.length()<shortNum){
                shortNum = n.length();
            }
        }
        for(String f : words){
            if(shortNum<f.length()){
                System.out.println("Q1. Answer: "+ f);
            }
        }
        //Q2. write a program that displays the number of
        // occurrences of an element in the array
        int []arr = {1,1,1,3,3,5};
        int times =0;
        System.out.println("Q2. Enter a number to count occurrences of that number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int n:arr){
            if (n == num){
                times++;
            }
        }
        System.out.println("Q2. Answer: "+num + " occurs "+ times + " times");

        //Q3. Write a program to find the k largest elements in a given
        // array. Elements in the array can be in any order
        int []arr1 ={1,4,17,7,25,3,100};
        ArrayList<Integer>allnums = new ArrayList<>();
        ArrayList<Integer>a3Large = new ArrayList<>();
        for(int s: arr1){
            allnums.add(s);
        }

        int x=0;
        while(x<3) {
            int large = 0;
            int temp=0;
            for (int i =0; i<allnums.size(); i++) {
                if (large < allnums.get(i)) {
                   large = allnums.get(i);
                   temp = i;
                }
            }
            a3Large.add(large);
            allnums.remove(temp);
            x++;
        }
        System.out.println("Q3. Answer: "+ a3Large);

        //Q4. Create a method to reverse an array of integers. Implement
        // the method without creating a new array.
        int[]arr2 = {5,4,3,2,1};
        for (int i =0; i<arr2.length/2;i++ ){
            int temp = arr2[i];
            arr2[i] = arr2[arr2.length-1-i];
            arr2[arr2.length-1-i] = temp;
        }
        System.out.println("Q4. Answer: " + Arrays.toString(arr2));

        //Q5. write a menu driven Java program with following option
        System.out.println("Q5. Enter the size of the array");
        int arrSize = scanner.nextInt();
        int[]menu = new int[arrSize];
        int choice=0;
        do{
            System.out.println("Enter one of the following numbers: \n 1.Add Elements:\n 2.Display Elements:\n 3.Search\n 4.Sort Array \n 5.Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for(int i=0; i<menu.length;i++){
                        System.out.println("Please enter the " + (i+1) + " element of the menu: ");
                        int element = scanner.nextInt();
                        menu[i] = element;
                    }
                    break;
                case 2:
                    System.out.println("Menu elements are: \n" + Arrays.toString(menu));
                    break;
                case 3:
                    System.out.println("Enter the number you are searching for: ");
                    int lookup = scanner.nextInt();
                    for(int n: menu){
                        if(n == lookup){

                            System.out.println((n==lookup)? lookup +" is an element of the array": lookup +" is not an element of the array");
                        }
                    }
                    break;
                case 4:
                    Arrays.sort(menu);
                    System.out.println("Sorted array : "+ Arrays.toString(menu));
                    break;
            }
        }while(choice != 5);

        //Q6. Create a method that generates a random number within a given range.
        // Allow the user to specify the range and call the method to display random numbers.
        System.out.println("Q6. Enter the min number: ");
        int min = scanner.nextInt();
        System.out.println("Q6. Enter the max number: ");
        int max = scanner.nextInt();
        System.out.println("Enter the number of random numbers you like to generate: ");
        int count = scanner.nextInt();
        for(int i=0; i<count; i++){

            Random random = new Random();
            int randomNum = random.nextInt( max - min + 1) + min;
            System.out.println(randomNum);
        }
        scanner.nextLine();
        //Q7. write a program that checks the strength of a password
        System.out.println("Q7. Enter your password: ");
        String passWord = scanner.nextLine();
        int points = 0;
            if(passWord.length()>5 && passWord.length()<8){
                points +=2;
            }else if(passWord.length()>=8){
                points +=3;
            }
            if(passWord.matches(".*[a-z].*") && passWord.matches(".*[A-Z].*")){
                points += 3;
            }
            if(!passWord.matches("[a-zA-Z0-9]+")){
                points +=2;

            }
            if(points >=8){
                System.out.println("Password is strong");
            }else if(points < 8 && points >=5){
                System.out.println("Password is moderately strong");
            }else if(points<5){
                System.out.println("Password is weak");
            }


        //Q8 Fibonacci sequence
        System.out.println("Please enter the number of Fibonacci terms to generate: ");
        int terms = scanner.nextInt();
        int []fib = new int [terms];
        fib[0] = 0;
        if (terms>1) {
            fib[1] = 1;
            for (int i = 2; i < terms; i++) {
                fib[i] = fib[i-1]+fib[i-2];
            }
        }
        System.out.println(Arrays.toString(fib));
    }

}