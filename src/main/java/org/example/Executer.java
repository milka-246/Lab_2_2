package org.example;

import java.util.Iterator;

public class Executer {
    ICPU cpu;
    Executer(ICPU cpu) {this.cpu = cpu;}

    public void run(Program prog)
    {
        Iterator <Command> it = prog.prog.iterator();
        while (it.hasNext())
        {
            try
            {
                cpu.work(it.next());
            }
            catch (Exception_div_zero|Exception_exceeded_index|Exception_missing_register|Exception_unidentified_command e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    /*public void run(Command[] prog)
    {
        while(i<prog.length)
        {
            if (prog[i].info[0].equals("ld")) cpu.ld(prog[i].info[1], Integer.parseInt(prog[i].info[2]));
            if (prog[i].info[0].equals("print")) cpu.print();
            if (prog[i].info[0].equals("st")) cpu.st(prog[i].info[1], Integer.parseInt(prog[i].info[2]));
            if (prog[i].info[0].equals(("mv"))) cpu.mv(prog[i].info[1], prog[i].info[2]);
            if (prog[i].info[0].equals("init")) cpu.init(Integer.parseInt(prog[i].info[1]), Integer.parseInt(prog[i].info[2]));
            if(prog[i].info[0].equals("add")) cpu.add();
            if(prog[i].info[0].equals("sub")) cpu.sub();
            if(prog[i].info[0].equals("mult")) cpu.mult();
            if(prog[i].info[0].equals("div")) cpu.div();
            i++;
        }
    }
    */
}
