package backjoon;

import java.io.*;
import java.util.*;

//생일
//10052023

public class b10052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            people[i] = new Person(name, day, month, year);
        }

        Arrays.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {

                if (p1.getYear() == p2.getYear()) {

                    if (p1.getMonth() == p2.getMonth()) {

                        return p1.getDay() - p2.getDay();
                    }

                    return p1.getMonth() - p2.getMonth();
                }

                return p1.getYear() - p2.getYear();
            }

        });

        System.out.println(people[n - 1].getName());
        System.out.println(people[0].getName());

    }
}

class Person {

    private final String name;
    private final int day;
    private final int month;
    private final int year;

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
