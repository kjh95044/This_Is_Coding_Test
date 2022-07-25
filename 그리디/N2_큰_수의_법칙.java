import java.util.*;
import java.io.*;

class N2_큰_수의_법칙 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] array = new Integer[N];

        st= new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array,Collections.reverseOrder());
        int cnt = (M/(K+1))*K + M%(K+1); //가장 큰수의 갯수

        System.out.println(cnt*array[0] + (M-cnt)*array[1]);
    }
}