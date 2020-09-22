package PackageDjurdjevic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Utakmica {

    private static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Utakmica na dan: " + dtf.format(now));

        Thread.sleep(1500);

        List<String> esp = new ArrayList<>();
        esp.add("Barcelona");
        esp.add("Real Madrid");
        esp.add("Villarreal");
        esp.add("Atletico Madrid");
        esp.add("Sevilla");

        List<String> eng = new ArrayList<>();
        eng.add("Manchester City");
        eng.add("Arsenal");
        eng.add("Liverpool");
        eng.add("Chelsea");
        eng.add("Manchester United");

        for(int i = 0; i<1; i++){


        int index = random.nextInt(esp.size());
        int index2 = random.nextInt(eng.size());
        System.out.println(esp.get(index) + " : " + eng.get(index2));

        Thread.sleep(3000);

        Random rn = new Random();
        int x = rn.nextInt(6);
        int y = rn.nextInt(6);
        System.out.println(x + " : " + y);
        Thread.sleep(3000);

        if(x>y){
            System.out.println("POBJEDNIK: " + esp.get(index));
        }if(x<y){
            System.out.println("POBJEDNIK: " + eng.get(index2));
        }if(x==y){
            System.out.println("IZJEDNAČENO");
        }
            System.out.println("***********************");
        }



    }







}

