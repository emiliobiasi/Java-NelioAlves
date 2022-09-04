package application;

import entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] rooms = new Student[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();

            rooms[room] = new Student(name, email);
            System.out.println();
        }


        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null) {
                System.out.println( i + ": " + rooms[i]);
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(rooms[i]);
        }

        sc.close();
    }
}