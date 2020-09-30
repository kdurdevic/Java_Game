import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Utakmica {

    private static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
        LocalDateTime now = LocalDateTime.now();
        System.err.println("Vrijeme utakmice: " + dtf.format(now));

        Thread.sleep(2000);

        List<String> esp = new ArrayList<>();
        esp.add("Athletic Bilbao");
        esp.add("Atletico Madrid");
        esp.add("Barcelona");
        esp.add("Granada");
        esp.add("Getafe");
        esp.add("Real Madrid");
        esp.add("Real Sociedad");
        esp.add("Sevilla");
        esp.add("Valencia");
        esp.add("Villarreal");

            List<String> espPlayers = new ArrayList<>();
            espPlayers.add("Esp_1");
            espPlayers.add("Esp_2");
            espPlayers.add("Esp_3");
            espPlayers.add("Esp_4");
            espPlayers.add("Esp_5");
            espPlayers.add("Esp_6");
            espPlayers.add("Esp_7");
            espPlayers.add("Esp_8");
            espPlayers.add("Esp_9");
            espPlayers.add("Esp_10");
            espPlayers.add("Esp_11");
            espPlayers.add("Esp_12");
            espPlayers.add("Esp_13");
            espPlayers.add("Esp_14");
            espPlayers.add("Esp_15");

        List<String> eng = new ArrayList<>();
        eng.add("Aston Villa");
        eng.add("Arsenal");
        eng.add("Chelsea");
        eng.add("Everton");
        eng.add("Liverpool");
        eng.add("Manchester City");
        eng.add("Manchester United");
        eng.add("Southampton");
        eng.add("Tottenham");
        eng.add("West Ham");
            List<String> engPlayers = new ArrayList<>();
                engPlayers.add("Eng_1");
                engPlayers.add("Eng_2");
                engPlayers.add("Eng_3");
                engPlayers.add("Eng_4");
                engPlayers.add("Eng_5");
                engPlayers.add("Eng_6");
                engPlayers.add("Eng_7");
                engPlayers.add("Eng_8");
                engPlayers.add("Eng_9");
                engPlayers.add("Eng_10");
                engPlayers.add("Eng_11");
                engPlayers.add("Eng_12");
                engPlayers.add("Eng_13");
                engPlayers.add("Eng_14");
                engPlayers.add("Eng_15");


        for(int i = 0; i<1; i++){

        int indexEsp = random.nextInt(esp.size());
        int indexEng = random.nextInt(eng.size());

        System.err.println("PRVA UTAKMICA:");
        Thread.sleep(1000);
        System.out.println(esp.get(indexEsp) + " : " + eng.get(indexEng));
        Thread.sleep(2000);

        Collections.shuffle(espPlayers);
            for (int p = 0; p < 11; p++) {
                System.out.print(espPlayers.get(p) + " ");
            }

        Collections.shuffle(engPlayers);
            System.out.println(" ");
                for (int s = 0; s < 11; s++) {
                    System.out.print(engPlayers.get(s) + " ");
                }

        Random rn = new Random();
        int x1 = rn.nextInt(6);
        int y1 = rn.nextInt(6);
            System.out.println("");
        System.out.println(x1 + " : " + y1);
        Thread.sleep(2000);

          if(x1>y1){
              System.out.println("POBJEDNIK: " + esp.get(indexEsp));
          }else if(x1<y1){
              System.out.println("POBJEDNIK: " + eng.get(indexEng));
          }else if(x1==y1){
              System.out.println("IZJEDNAČENO");
          }

          Thread.sleep(1000);
          System.out.println(" ");
          System.err.println("Vrijeme utakmice: " + dtf.format(now));
          Thread.sleep(1000);
          System.err.println("UZVRATNA UTAKMICA:");
          Thread.sleep(1000);
          System.out.println(eng.get(indexEng) + " : " + esp.get(indexEsp));
          Thread.sleep(1000);

            Collections.shuffle(espPlayers);
            for (int p = 0; p < 11; p++) {
                System.out.print(espPlayers.get(p) + " ");
            }

            Collections.shuffle(engPlayers);
            System.out.println(" ");
            for (int s = 0; s < 11; s++) {
                System.out.print(engPlayers.get(s) + " ");
            }

          int x2 = rn.nextInt(6);
          int y2 = rn.nextInt(6);
            System.out.println("");
          System.out.println(y2 + " : " + x2);
          Thread.sleep(1000);

            if(y2>x2){
                System.out.println("POBJEDNIK: " + eng.get(indexEng));
            }else if(y2<x2){
                System.out.println("POBJEDNIK: " + esp.get(indexEsp));
            }else if(x2==y2){
                System.out.println("IZJEDNAČENO");
            }

            Thread.sleep(1000);
            System.out.println(" ");
            System.err.println("KONAČAN REZULTAT:");
            Thread.sleep(1000);
            System.out.println(esp.get(indexEsp) + " : " + eng.get(indexEng));
            Thread.sleep(1000);
            int x = x1 + x2;
            int y = y1 + y2;
            System.out.println(x + " : " + y);

            if(x>y){
                System.out.println("POBJEDNIK: " + esp.get(indexEsp));
            }else if(x<y){
                System.out.println("POBJEDNIK: " + eng.get(indexEng));
            }else if(x==y){
                System.out.println("IZJEDNAČENO");
            }

        }
    }
}

