package nov2024;

public class VariableConcepts {

    public static void main(String[] args) {

        //Variable : Temporary storage of data/values

        //Why Variables are having temporary storage, because it's scope of execution
        //is during the execution time of the program

        //Once the execution is completed then all the variables will be vanished or erased off in JVM

        //Rules to followed for declaring a variable name:
        //1. It should always start with a small letter
        //2. It should not start with numbers or any special characters
        //3. Variable names should not have any white spaces between them, (we can underscore(_) symbol instead of a whitespace.
        //4. Variable Names should not have any JAVA Keywords

        //JAVA is a statically typed language --> We need to mention the data type explicitly
        //Along with JAVA, C#, TypeScript

        //Python, JS are dynamically typed language --> We need not mention any data type to store the values

        //Different Types of data types:
        //1. Primitive Data Type: int, char, boolean, byte, short, long, float, double
        //2. Non Primitive Data Type: String, Arrays, List, etc...............................................

        //Syntax of declaring a variable
        //datatype variableName;

        int a1; //Accepts a range of values from -2^31 to 2^31-1 (Occupies 4 bytes of Memory)
        char b2; //Accepts a single value like 'A', 'k', '4', '^', ' ' (Occupies 2 Bytes of Memory)
        long c3; //Accepts a range of values from -2^63 to 2^63-1 (Occupies 8 bytes of Memory)
        double d4; //Accepts upto 16 significant digits( Upto 16 decimal points) (Occupies 8 Bytes of Memory)
        byte e5; //Accepts a range of values from -128 to 127 (Occupies 1 Byte of Memory)
        float f6; //Accepts upto 5 significant digits( Upto 5 decimal points) (Occupies 4 bytes of Memory)
        boolean g7; //Accepts true or false (Occupies only 1 bit of Memory)
        short h8; //Accepts a range of values from -32768 to 32767 (Occupies 2 Bytes of Memory)

        //Syntax of initializing a variable:
        a1=-4925;
        b2='^'; //Always We need to write it within ' ' quotes
        c3=98235892L; //L is written at the end to indicate it is a long value
        d4=8.21125562;
        e5=-28;
        f6=9421.214f; //f is written at the end to indicate it is a float value
        g7=false;
        h8=5923;

        //Whenever we are using any character in arithmetic operations, it will take the ASCII Value of the character
        //-4925-94*5923-8.21125562

        System.out.println(a1-b2*h8-d4);

        System.out.println(a1);
        System.out.println(b2);
        System.out.println(c3);
        System.out.println(d4);
        System.out.println(e5);
        System.out.println(f6);
        System.out.println(g7);
        System.out.println(h8);

    }
}