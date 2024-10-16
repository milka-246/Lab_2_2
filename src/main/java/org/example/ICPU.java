package org.example;

public interface ICPU  {
     void work (Command com) throws Exception_div_zero, Exception_exceeded_index, Exception_missing_register, Exception_unidentified_command;
     /*void ld  (String in, int index);
     void print();
     void st (String in, int index);
     void mv (String in1, String in2);
     void init (int index, int value);
     void add();
     void sub();
     void mult();
     void div(); //небезопасный код
     */
}
