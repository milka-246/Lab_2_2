package org.example;

import java.util.*;

public class Program {
    ArrayList<Command> prog;
    Program(Command [] prog_)
    {
        prog = new ArrayList<>();
        for(int i = 0; i < prog_.length; i++)
        {
            prog.add(prog_[i]);
        }
    }

    Program() {
        prog = new ArrayList<>();
    }

    public void add(Command com)
    {
        prog.add(com);
    }

    private Map<Commands,Integer> get_Map()
    {
        Iterator<Command> it1 = prog.iterator();
        Map<Commands, Integer> statistic = new HashMap<>();
        statistic.put(Commands.ld, 0);
        statistic.put(Commands.print, 0);
        statistic.put(Commands.st, 0);
        statistic.put(Commands.mv, 0);
        statistic.put(Commands.init, 0);
        statistic.put(Commands.add, 0);
        statistic.put(Commands.sub, 0);
        statistic.put(Commands.mult, 0);
        statistic.put(Commands.div, 0);
        while (it1.hasNext())
        {
            int i = 0;
            Commands T = Commands.valueOf(it1.next().info[0]);
            i = statistic.get(T) + 1;
            statistic.put(T, i);
        }
        return statistic;
    }

    public void printInstruction()
    {
        Map<Commands, Integer> statistic = get_Map();
        Integer max = 0;
        for (Map.Entry<Commands,Integer> entry: statistic.entrySet())
        {
            if(max < entry.getValue())
                max = entry.getValue();
        }
        System.out.println("Instruction:");
        for(int i = 0; i < max; i++)
            for (Map.Entry<Commands,Integer> entry: statistic.entrySet())
            {
                if((max-i) == entry.getValue())
                    System.out.println(entry.getKey());
            }
    }

    public Commands mostPopularInstruction()
    {
        Map<Commands, Integer> statistic = get_Map();
        Integer max = 0;
        for (Map.Entry<Commands, Integer> entry : statistic.entrySet()) {
            if (max < entry.getValue())
                max = entry.getValue();
        }

        for (Map.Entry<Commands, Integer> entry : statistic.entrySet()) {
            if (max.equals(entry.getValue()))
                return entry.getKey();

        }
        System.out.println("Error!!!!!");
        return Commands.ld;
    }

    public void addreses ()
    {
        Set<Integer> ad = new HashSet<>();
        Iterator<Command> it = prog.iterator();
        for(Command tyt: prog)
        {
            Commands T = Commands.valueOf(tyt.info[0]);
            switch (T)
            {
                case ld:
                        ad.add(Integer.valueOf(tyt.info[2]));
                    break;
                case st:
                        ad.add(Integer.valueOf(tyt.info[2]));
                    break;
                case init:
                        ad.add(Integer.valueOf(tyt.info[1]));
                    break;
            }
        }
        System.out.println("Addresses:");
        for(Integer id: ad)
            System.out.println(id);

    }
}
