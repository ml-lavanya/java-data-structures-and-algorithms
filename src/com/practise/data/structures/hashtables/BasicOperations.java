package com.practise.data.structures.hashtables;

import java.util.HashMap;
import java.util.Map;

public class BasicOperations {
    public static void main(String[] args) {
        Map<String, String> presidentialCandidates = new HashMap<String, String>();

        // add
        presidentialCandidates.put("democrats", "joe bidedn");
        presidentialCandidates.put("republicans", "donald trump");
        presidentialCandidates.put("green party", "jill stein");
        presidentialCandidates.put("Libertarian party", "Chase Oliver");

        // remove
        presidentialCandidates.remove("Democrats");

        // get
        System.out.println(presidentialCandidates.get("Democrats"));

        presidentialCandidates.putIfAbsent("democrats", "kamala harris");

        System.out.println("********* list of parties *********");
        presidentialCandidates.keySet().forEach(System.out::println);

        System.out.println("********* final list of presidential candidates 2024 *********");
        System.out.println("------------------------------------------");
        System.out.printf("| %1$-20S | %2$-15S | %n", "party", "candidate");
        System.out.println("------------------------------------------");
        // print
        presidentialCandidates.forEach((key, value) -> System.out.printf("| %1$-20S | %2$-15S | %n", key, value));
        System.out.println("------------------------------------------");
        System.out.println("\n ********** print only values ***********");
        presidentialCandidates.values().forEach(System.out::println);
    }
}
