package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1_상하좌우 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 1;
        int [] dx = {0,0,-1,1};
        int [] dy = {-1,1,0,0};
        char [] move_types = {'L', 'R', 'U', 'D'};

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = st.countTokens();
        for(int i=0; i<count; i++){
            int temp_x = x;
            int temp_y = y;
            char move = st.nextToken().charAt(0);
            for(int j=0; j<4; j++){
                if(move==move_types[j]){
                    temp_x += dx[j];
                    temp_y += dy[j];
                }
            }

            if(temp_x >=1 && temp_x<=n)
                x = temp_x;
            if(temp_y >=1 && temp_y<=n)
                y = temp_y;
        }
        System.out.println(x + " " + y);
    }
}
