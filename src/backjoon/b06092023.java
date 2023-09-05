package backjoon;

// import java.io.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
// import java.util.*;

//오늘의 날짜는?
//06092023

public class b06092023 {

    public static void main(String args[]) throws Exception {

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        // int n = Integer.parseInt(st.nextToken());

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(zonedDateTime.getYear());
        System.out.println(zonedDateTime.getMonthValue());
        System.out.println(zonedDateTime.getDayOfMonth());

    }
}
