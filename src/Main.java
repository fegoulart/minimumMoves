import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY m
     */

    public static int minimumMoves(List<Integer> a, List<Integer> m) {
        // Write your code here
        int moves = 0;

        for (int i = 0; i < a.size(); i++) {

            String sA = a.get(i).toString();
            String sM = m.get(i).toString();

            for (int j = 0; j < sA.length(); j++) {

                int iA = Integer.parseInt(sA.substring(j, j + 1));
                int iM = Integer.parseInt(sM.substring(j, j + 1));

                moves += Math.abs(iA - iM);
            }

        }
        return moves;

    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < aCount; i++) {
            int aItem = Integer.parseInt(bufferedReader.readLine().trim());
            a.add(aItem);
        }

        int mCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> m = new ArrayList<>();

        for (int i = 0; i < mCount; i++) {
            int mItem = Integer.parseInt(bufferedReader.readLine().trim());
            m.add(mItem);
        }

        int result = Result.minimumMoves(a, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

