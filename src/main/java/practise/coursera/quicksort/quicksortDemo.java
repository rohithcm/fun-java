package practise.coursera.quicksort;

import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * Created by Rohith on 02-11-2015.
 */
public class quicksortDemo {
    static long comparison_count = 0;
    static int[] a = new int[10000];
    //static int[] a = new int[37];
    static int choosePivotFirst(final int left) {
        return a[left];
    }
    static int choosePivotLast(final int left, final int right){
        swap(left,right);
        return a[left];
    }
    static int choosePivotMedian(final int left, final int right){
        swap(left,left + (right-left)/2);
        return a[left];
    }
    static void quicksort(int left,int right) {
        if(left < right) {
            comparison_count += (right - left);
            //int pivot = choosePivotFirst(left);
            //int pivot = choosePivotLast(left, right);
            int pivot = choosePivotMedian(left,right);
            int i=left+1;
            for(int j=left+1; (j<=right); j++) {
                if(a[j] < pivot) {
                    swap(i++,j);
                }
            }
            swap(left,i-1);
            quicksort(left,i-2);
            quicksort(i,right);
        }
    }
    static void swap(int pos1, int pos2) {
        if(pos1!= pos2) {
            a[pos1] =a[pos1] +a[pos2];
            a[pos2] = a[pos1] - a[pos2];
            a[pos1] = a[pos1] - a[pos2];
        }
    }
    public static void main(String[] args) {

        BufferedReader io = null;
        try {
            io = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:\\Users\\Rohith\\IdeaProjects\\LearnJavaMaven\\src\\main\\java\\practise\\coursera\\quicksort\\input.txt")));
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
        quicksort(0,a.length-1);
        System.out.println("Comparison count : "+comparison_count);
        for(int num : a)
            System.out.print(num+" ");
    }
}
