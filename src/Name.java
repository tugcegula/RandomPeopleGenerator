
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Name {

    // read names and count
    // generate random number from that count
    //pick the name from txt with random number

    public static String name() throws IOException {

        Random rand = new Random();
        List<String>  listOfPeople = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new FileReader("random_isimler.txt"));
        String line = bf.readLine();//exeptions kullanımı neden mecvuri

        while (line!=null){
            listOfPeople.add(line);
            line = bf.readLine();
        }

        bf.close();

        int allList =0;
        //String[] array = listOfPeople.toArray(new String[0]);
        for (String all:listOfPeople) {
            allList++;
        }

        int randS = rand.nextInt(allList);
        //System.out.println(listOfPeople);
        return listOfPeople.get(randS);

    }


}

