import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Utakmica {

    private static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.err.println("Vrijeme utakmice: " + dtf.format(now));

        Thread.sleep(2000);

        List<String> esp = new ArrayList<>();
        esp.add("Barcelona");
        esp.add("Real Madrid");
        esp.add("Villarreal");
        esp.add("Atletico Madrid");
        esp.add("Sevilla");
        esp.add("Getafe");
        esp.add("Real Sociedad");

        List<String> eng = new ArrayList<>();
        eng.add("Manchester City");
        eng.add("Arsenal");
        eng.add("Liverpool");
        eng.add("Chelsea");
        eng.add("Manchester United");
        eng.add("Newcastle");
        eng.add("Tottenham");

        for(int i = 0; i<1; i++){

        int index = random.nextInt(esp.size());
        int index2 = random.nextInt(eng.size());

        System.err.println("PRVA UTAKMICA:");
        Thread.sleep(1000);
        System.out.println(esp.get(index) + " : " + eng.get(index2));

        Thread.sleep(2000);

        Random rn = new Random();

        int x1 = rn.nextInt(6);
        int y1 = rn.nextInt(6);
        System.out.println(x1 + " : " + y1);
        Thread.sleep(2000);

          if(x1>y1){
              System.out.println("POBJEDNIK: " + esp.get(index));
          }else if(x1<y1){
              System.out.println("POBJEDNIK: " + eng.get(index2));
          }else if(x1==y1){
              System.out.println("IZJEDNAČENO");
          }

          Thread.sleep(1000);
          System.out.println(" ");
          System.err.println("Vrijeme utakmice: " + dtf.format(now));
          Thread.sleep(1000);
          System.err.println("UZVRATNA UTAKMICA:");
          Thread.sleep(1000);
          System.out.println(eng.get(index2) + " : " + esp.get(index));
          Thread.sleep(1000);
          int x2 = rn.nextInt(6);
          int y2 = rn.nextInt(6);
          System.out.println(y2 + " : " + x2);
          Thread.sleep(1000);

            if(y2>x2){
                System.out.println("POBJEDNIK: " + eng.get(index2));
            }else if(y2<x2){
                System.out.println("POBJEDNIK: " + esp.get(index));
            }else if(x2==y2){
                System.out.println("IZJEDNAČENO");
            }

            Thread.sleep(1000);
            System.out.println(" ");
            System.err.println("UKUPAN REZULTAT:");
            Thread.sleep(1000);
            System.out.println(esp.get(index) + " : " + eng.get(index2));
            Thread.sleep(1000);
            int x = x1 + x2;
            int y = y1 + y2;
            System.out.println(x + " : " + y);

            if(x>y){
                System.out.println("POBJEDNIK: " + esp.get(index));
            }else if(x<y){
                System.out.println("POBJEDNIK: " + eng.get(index2));
            }else if(x==y){
                System.out.println("IZJEDNAČENO");
            }
    }
}
}

