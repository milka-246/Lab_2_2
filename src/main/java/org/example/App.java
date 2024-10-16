package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* Command prog[] = {
                new Command("init 10 20"),
                new Command("init" ,"11", "25"),
                new Command("ld", "a" ,"10"),
                new Command("ld", "b" ,"11"),
                new Command("add"),
                new Command("print")}; //вывод 20 25 * 45 */
        Program prog = new Program();
        prog.add(new Command("init 10 20"));
        prog.add(new Command("init" ,"11", "25"));
        prog.add(new Command("ld", "a" ,"10"));
        prog.add(new Command("ld", "b" ,"11"));
        prog.add(new Command("ld", "c" ,"11"));
        prog.add(new Command("add"));
        prog.add(new Command("mv", "a" ,"d"));
        prog.add(new Command("add"));
        prog.add(new Command("print"));
        for(Command c: prog.prog) System.out.println(c);
        System.out.println(prog.mostPopularInstruction());  //выводит самую популярную инструкцию
        prog.printInstruction();    //выводит все инструкции в порядке убывания частоты использования
        prog.addreses();    //выводит диапазон адресов
        ICPU cpu = BCPU.build();
        Executer exec = new Executer(cpu);
        exec.run(prog);
    }
}
