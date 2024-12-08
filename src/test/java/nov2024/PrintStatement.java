package nov2024;

public class PrintStatement {

    public static void main(String[] args) {

        //Prints the data onto the console and moves the cursor to the next line
        //Hello World

        System.out.println("Hello World");

        System.out.println("This is my second programming class");

        //BODMAS Rule --> Bracket of Division Multiplication Addition Subraction
        //50-400-20*30
        //50-400-600
        //-350-600
        //-950
        System.out.println(50-400-20*30);

        //(50-30)*20 -400 - (37-40 - (500-30/10))
        //(50-30)*20 -400 - (37-40 - (500-3))
        //(50-30)*20 -400 - (37-40 - 497)
        //20*20-400 - (-3 - 497)
        //20*20-400 -(-500)
        //20*20-400+500
        //400-400+500
        //900-400
        //500
        System.out.println((50-30)*20 -400 - (37-40 - (500-30/10)));

        //Prints the data onto the console
        //The Above is a Integer
        System.out.print("The Above is a Integer");

        System.out.println("This is my third line of data");

        System.out.println("*********************************************************************************");

        //When we divide a Number by Number without any decimal values
        //The quotient should not have any decimal values

        //40-50*60-70/60
        //40-50*60-1
        //40-3000-1
        //-2960-1
        //-2961

        //+ symbol is used to join the sentence with the number
        System.out.println("Number generated to be is: "+(40-50*60-70/60));

        //STR --> String Templates
        // \{} ---> Add the value within the curly braces
        // System.out.println(STR."Number generated to be is: \{40-50*60-70/60}");

        //To Print any sort of Error Messages --> Output will be displayed in the red colour
        //serr is shortcut to generate System.err.println()
        //Type serr followed by enter key
        // System.err.println("Error Message Occured");
    }
}
