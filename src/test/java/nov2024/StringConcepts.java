package nov2024;

import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Locale;

public class StringConcepts {

    public static void main(String[] args) {
        String s3 = "This is my first string";
        System.out.println(s3);
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());
        s3 = "THis is my first string sample";
        System.out.println(s3.isBlank());
        System.out.println(s3.isEmpty());

        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());

        System.out.println(s3.startsWith("This"));//false
        System.out.println(s3.startsWith(s3));//true
        System.out.println(s3.toLowerCase().startsWith("this"));
        System.out.println(s3.replace("my", "for"));
        System.out.println(s3.charAt(25));
        System.out.println(s3.substring(20));

        s3 = "THis is my first string sample \n";
        System.out.println(s3);
        System.out.println(s3.repeat(3));
        System.out.println(s3.indexOf('m'));
        System.out.println(s3.indexOf("string"));
        System.out.println(s3.lastIndexOf('m'));
        System.out.println(s3.lastIndexOf("sample"));

        String s5  = "NEW DATA";
        String s6 = "new date";

        System.out.println(s5.equals(s6));
        System.out.println(s6.compareToIgnoreCase(s5));

        String s8 = "   New project of coading     ";

        System.out.println(s8.trim()); //ignoce all before and after space
        System.out.println(s8.strip());// jdk 11 function(trim)
        System.out.println(s8.stripLeading());//ignoce front space
        System.out.println(s8.stripTrailing());//ignoce back space
        System.out.println(s8.trim().replace(" ",""));

        s8="Coding progress";

        System.out.println(s8.codePointAt(6));
        System.out.println(s8.concat(" yes it's good"));

        s8 = "This is progress for the first progress";
        System.out.println(s8.replaceFirst("progress", "progressed"));
        System.out.println(s8.replace("s", "q"));
        System.out.println(s8.repeat('5'));
        System.out.println(s8.replaceFirst("This","So"));

        String R20= """
                There is the
                person was teaching automation
                for the peoples""";


        System.out.println(R20.regionMatches(0, "There", 0, 5));







    }
}

