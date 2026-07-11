package I.O_Stream;

import java.io.File;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWordCount {

    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
            return;
        }

        File inputFile = new File(args[0]);

        Scanner sc = new Scanner(inputFile);

        TreeMap<String, Integer> map = new TreeMap<>();

        while (sc.hasNext()) {

            String word = sc.next();

            word = word.replaceAll("[^a-zA-Z]", "");

            if (!word.isEmpty()) {

                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }

        sc.close();

        PrintWriter pw = new PrintWriter(args[1]);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pw.println(entry.getKey() + " : " + entry.getValue());
        }

        pw.close();

        System.out.println("Word count written to " + args[1]);
    }
}
