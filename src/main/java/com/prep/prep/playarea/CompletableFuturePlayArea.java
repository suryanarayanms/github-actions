package com.prep.prep.playarea;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFuturePlayArea {

    public static void main(String[] args) {
        List<CompletableFuture<Void>> futures = new ArrayList<>();
        List<CompletableFuture<String>> syncFutures = new ArrayList<>();

        List<Integer> waitTime = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(System.currentTimeMillis());
        waitTime.forEach(time -> {
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                try {
                    System.out.println("Sleeping for " + time + " seconds");
                    Thread.sleep(time*1000);
                    System.out.println("Woke up after " + time + " seconds");
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            });
            futures.add(future);
        });
        futures.forEach(future -> {
            future.join();
        });
        System.out.println(System.currentTimeMillis());
        System.out.println("All tasks completed successfully!");

        waitTime.forEach(time -> {
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                try {
                    System.out.println("Processing task for " + time + " seconds");
                    Thread.sleep(time * 1000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                return "Task completed after " + time + " seconds";
            });
            syncFutures.add(future);
        });
        List<String> results = syncFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        results.forEach(System.out::println);
        System.out.println("All tasks completed successfully!");
        Set<Integer> numbers = new HashSet<>();
        int[] nums = new int[]{1,2,2};
        Arrays.stream(nums).forEach(f->{numbers.add(f);});

        System.out.println(numbers.size());
    }
}
