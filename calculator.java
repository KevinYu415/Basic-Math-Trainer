import java.util.Scanner;

class calculator{
    public static void main(String[] args){

        

        while(true){
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Please enter numbers of exercise and math symbol, or quit");
            System.out.println("format example: 33 * ");
            System.out.print("input: ");

            String inputs = myObj.nextLine();  // Read user input
            // System.out.println("Username is: " + inputs);  // Output user inputhi

            if(inputs.equals("quit")){
                break;
            }

            String[] arr = inputs.split("\s+");


            // for(String i: arr){
            //     System.out.println(i);
            // }
            
            // max and min range
            int max = 9;
            int min = 2;
            int correct = 0;
            int incorrect = 0;
            int one;
            int two;
            long startTime;
            long elapsedTime;
            for(int i = 0; i<Integer.valueOf(arr[0]); i++){
                // System.out.println(i + "yes");
                one = (int)(Math.random()*max)+min;
                two = (int)(Math.random()*max)+min;

                if(arr[1].equals("*")){
                    Scanner ans = new Scanner(System.in);
                    System.out.print("What is " + one + " * " + two + " = ");
                    startTime = System.currentTimeMillis();
                    String answer = ans.nextLine();
                    elapsedTime = ((System.currentTimeMillis() - startTime)/ 1000);    //timer
                    // System.out.println("You took "+elapsedTime+" seconds");
                    if((one * two) == Integer.valueOf(answer)){
                        System.out.println("Correct, You took "+elapsedTime+" seconds \n");
                        correct++;
                    }else{
                        System.out.println("Incorrect, should be " + one * two + "\n");
                        incorrect++;
                    }
                }else if(arr[1].equals("+")){
                    Scanner ans = new Scanner(System.in);
                    System.out.print("What is " + one + " + " + two + " = ");
                    startTime = System.currentTimeMillis();
                    String answer = ans.nextLine();
                    elapsedTime = ((System.currentTimeMillis() - startTime)/ 1000);    //timer
                    if((one + two) == Integer.valueOf(answer)){
                        System.out.println("Correct, You took "+elapsedTime+" seconds \n");
                        correct++;
                    }else{
                        System.out.println("Incorrect, should be " + (one + two) + "\n");
                        incorrect++;
                    }
                }else if(arr[1].equals("-")){
                    Scanner ans = new Scanner(System.in);
                    System.out.print("What is " + one + " - " + two + " = ");
                    startTime = System.currentTimeMillis();
                    String answer = ans.nextLine();
                    elapsedTime = ((System.currentTimeMillis() - startTime)/ 1000);    //timer
                    int sub = one - two;
                    if((sub) == Integer.valueOf(answer)){
                        System.out.println("Correct, You took "+elapsedTime+" seconds \n");
                        correct++;
                    }else{
                        System.out.println("Incorrect, should be " + sub + "\n");
                        incorrect++;
                    }

                    // division need to be fixed. currently converting double to int. losing data
                }else if(arr[1].equals("/")){
                    Scanner ans = new Scanner(System.in);
                    System.out.print("What is " + one + " / " + two + " = ");
                    startTime = System.currentTimeMillis();
                    String answer = ans.nextLine();
                    elapsedTime = ((System.currentTimeMillis() - startTime)/ 1000);    //timer
                    if((one / two) == Integer.valueOf(answer)){
                        System.out.println("Correct, You took "+elapsedTime+" seconds \n");
                        correct++;
                    }else{
                        System.out.println("Incorrect, should be " + one / two + "\n");
                        incorrect++;
                    }
                }
            }
            System.out.println("You got " + correct +" correct , " + incorrect + " incorrect \n");
        }
        System.out.println("Finished");
    }
}