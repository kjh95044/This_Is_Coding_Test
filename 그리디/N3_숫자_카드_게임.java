import java.io.*;
import java.util.*;

public class N3_숫자_카드_게임 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<Integer> rows = new ArrayList<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            for(int j=0; j<M; j++){
                int val = Integer.parseInt(st.nextToken());
                min = Math.min(val,min);
            }
            rows.add(min);
        }
        System.out.println(Collections.max(rows));
    }
}
