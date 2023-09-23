package guru.qa;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Human dima = new Human(
                "Dima",
                34,
                true
        );

        List<String> lectures = new ArrayList<>();
        lectures.add("git");
        lectures.add("java");
        lectures.add("files");
        lectures.add("junit");
        lectures.add("junit");
        lectures.add("junit");
        lectures.add("junit");
        lectures.add("junit");
        lectures.add("junit");

        Set<String> lecturesSet = Set.of( // new HashSet<>();
                "git", "java", "files", "junit"
        );

        Map<String, Human> humans = new HashMap<>();
        humans.put("673427234", dima);
        humans.put("354543534", dima);
        humans.put("675676565", dima);
        humans.put("877687686", dima);
        humans.put("234764777", dima);
        humans.put("984564566", dima);


        for (Map.Entry<String, Human> entry : humans.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        for (String key : humans.keySet()) {

        }

        for (Human value : humans.values()) {

        }


        int hours = 12;
        String hello = "Hello";

        dima.printSomeValues(
                hours,
                hello,
                lectures
        );

        System.out.println("After method, int: " + hours);
        System.out.println("After method, String: " + hello);
        System.out.println("After method, List: " + lectures);

        String[] lecturesArray = new String[] {"git", "java", "files", "junit"};
        lecturesArray[0] = "git";
        lecturesArray[1] = "java";
        lecturesArray[2] = "files";
        lecturesArray[3] = "junit";

        int[] intArray0 = new int[] {1,2,3};
        int[] intArray1 = new int[] {1,2,3};

        int[][] biArray0 = new int[][] {
                intArray0,
                intArray1
        };
        int[][] biArray1 = new int[][] {
                intArray0,
                intArray1
        };

        int[][][] threeArray = new int[][][] {
                biArray0,
                biArray1
        };


//        for (int i = 0; i < lecturesArray.length ; i++) {
//            System.out.println(lecturesArray[i]);
//        }
//
//        for (int i = lecturesArray.length - 1; i >= 0; i--) {
//            System.out.println(lecturesArray[i]);
//        }

        for (String lectureName : lecturesSet) {
            if (!lectureName.startsWith("j")) {
               continue;
            }
            System.out.println(lectureName);
            return;
        }

//        int i = 0;
//        while (i < lecturesArray.length) {
//            System.out.println(lecturesArray[i]);
//            i++;
//        }
//

    }
}
