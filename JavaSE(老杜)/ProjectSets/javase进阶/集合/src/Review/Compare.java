package Review;

import java.time.temporal.Temporal;
import java.util.*;

public class Compare {
    public static void main(String[] args) {
        Set<Team> se = new TreeSet<>(new BiJiaoQi());
        se.add(new Team(140));
        se.add(new Team(130));
        se.add(new Team(110));
        se.add(new Team(150));
        for (Team t : se)
        {
            System.out.println(t);
        }
    }
}

class Team{
    private int no;
    public Team(int no){
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Team{" +
                "no=" + no +
                '}';
    }
}

class BiJiaoQi implements Comparator<Team>{

    @Override
    public int compare(Team t1, Team t2) {
        return t2.getNo() - t1.getNo();
    }
}

