package com.nextly;

import java.util.Scanner;

public class PhoneBookSearch {


    public static void main(String[] args) {
        // Sample phone book data (sorted by name)
        String[][] phoneBook = {
                {"Ana", "(83)999556688"},
                {"Bruce", "(83)999556689"},
                {"Charles", "(83)999556690"},
                {"Davide", "(83)999556691"},
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the person's name: ");
        String personName = scanner.nextLine();

        int index = searchByName(phoneBook, personName);

        if (index != -1) {
            System.out.println("Phone number of " + personName + ": " + phoneBook[index][1]);
        } else {
            System.out.println(personName + " not found in the phone book.");
        }
    }

    public static int searchByName(String[][] phoneBook, String targetName) {
        int low = 0;
        int high = phoneBook.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = targetName.compareTo(phoneBook[mid][0]);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
