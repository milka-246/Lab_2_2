package org.example;
public class Command {
   public String [] info;

    Command(String in)
    {
        info = in.split(" ");
    }
    Command(String in1, String in2)
    {
        // System.out.println("2");
        String a = in1+" "+in2;
        info = a.split(" ");
    }
    Command(String in1, String in2, String in3)
    {
       // System.out.println("3");
        String a = in1+" "+in2+" "+in3;
        info = a.split(" ");
    }

}
