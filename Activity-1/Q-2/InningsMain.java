import java.util.*;
public class InningsMain {
    public static void main(String[] args) {
        Innings i1 = new Innings();
        Innings i2 = new Innings();
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the team name: ");
        i1.setTeamName(sc.nextLine());
        System.out.println("Enter Session: ");
        i1.setInningsName(sc.nextLine());
        System.out.println("Enter Runs: ");
        i1.setRuns(sc.nextInt());
        System.out.println("Name: "+i1.getTeamName());
        System.out.println("Scored: "+i1.getRuns());
        System.out.println("Need "+i1.getRuns()+" to win");
        System.out.println("Enter the team name: ");
        i2.setTeamName(sca.nextLine());
        System.out.println("Enter Session: ");
        i2.setInningsName(sca.nextLine());
        System.out.println("Enter Runs: ");
        i2.setRuns(sca.nextInt());
        System.out.println("Name: "+i2.getTeamName());
        System.out.println("Scored: "+i2.getRuns());
        System.out.println("Match Ended");
    }
}
