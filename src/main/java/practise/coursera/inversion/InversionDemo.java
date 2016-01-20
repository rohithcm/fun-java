package practise.coursera.inversion;

import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * Created by Rohith on 02-11-2015.
 */

public class InversionDemo {
    static long count = 0;

    static void getInversion(int[] a, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;

            getInversion(a, left, mid);
            getInversion(a, mid + 1, right);
            int i = left, j = mid + 1;
            int[] b = a.clone();
            for (int k = left; k <= right; k++) {
                if ((j <= right) && (i <= mid)) {
                    if (b[i] < b[j]) {
                        a[k] = b[i];
                        i++;
                    } else {
                        a[k] = b[j];
                        j++;
                        count += (mid + 1 - i);   // count will be incremented by number of items left in left array..
                    }
                } else if (j > right) {
                    a[k] = b[i];
                    i++;
                } else if (i > mid) {
                    a[k] = b[j];
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[100000];
        BufferedReader io = null;
        try {
            io = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:\\Users\\Rohith\\IdeaProjects\\LearnJavaMaven\\src\\main\\java\\practise\\coursera\\inversion\\testdata.txt")));
            String line = null;
            int count = 0;
            while ((line = io.readLine()) != null)
                a[count++] = new Integer(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(io);
        }
        getInversion(a, 0, a.length - 1);
        System.out.println("Inversion count : " + count);
    }
}
