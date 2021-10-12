package Classes;
import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter; 

public class Main {
    //CLASSES --templates for creating Java objects ^^
    public static void main(String[] args){
        //creating local variable, calling on object by initializing it
        Car nissan = new Car();

        System.out.println(nissan.getModel());
        nissan.setModel("Toyota");
        System.out.println(nissan.getModel()); 
        nissan.setModel("Altima");
        System.out.println(nissan.getModel());
    }
}
