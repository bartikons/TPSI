/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.labs.lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author naeri
 */
public class TpsiLabsLab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> nazwiska = new ArrayList<>();
        nazwiska.add("Kowalski");
        nazwiska.add("Nowak");
        nazwiska.forEach((nazwisko) -> {
            System.out.println(nazwisko);
        });

        for (int i = 0; i < nazwiska.size(); i++) {
            String nazwisko = nazwiska.get(i);
            System.out.println(nazwisko);
        }
        Map<String, String> dniTygodnia = new HashMap<>();
        dniTygodnia.put("pn", "poniedziałek");
        dniTygodnia.put("wt", "wtorek");
        dniTygodnia.put("śr", "środa");
        dniTygodnia.put("czw", "czwartek");
        String dzien = dniTygodnia.get("pn");
        System.out.println("Skrót 'pn' oznacza: " + dzien);

        for (String skrot : dniTygodnia.keySet()) {
            dzien = dniTygodnia.get(skrot);
            System.out.println(skrot + " - " + dzien);
        }
        Set<String> zbiorDni = new HashSet<>();
        zbiorDni.add("wtorek");
        zbiorDni.add("poniedziałek");
//zad1
        System.out.println(zbiorDni);

        zbiorDni.add("wtorek");
        zbiorDni.add("wtorek");
        zbiorDni.add("wtorek");
        System.out.println(zbiorDni);

        zbiorDni.forEach((dzien2) -> {
            System.out.println(dzien2);
        });

        Set<String> zbiorDni2 = new TreeSet<>();
        zbiorDni2.add("wtorek");
        zbiorDni2.add("poniedziałek");

        System.out.println(zbiorDni2);

        zbiorDni2.add("wtorek");
        zbiorDni2.add("wtorek");
        zbiorDni2.add("wtorek");
        System.out.println(zbiorDni2);

        zbiorDni2.forEach((dzien2) -> {
            System.out.println(dzien2);
        }); //zad2

        Teacher t1 = new Teacher("4", "1", "bjarne@fake.org", "Introduction to fishing");
        Teacher t2 = new Teacher("3", "2", "bjarne@fake.org", "Introduction to C++");
        Teacher t3 = new Teacher("2", "3", "bjarne@fake.org", "Introduction to MACHINE");
        Teacher t4 = new Teacher("1", "4", "bjarne@fake.org", "Introduction to WEB");

        Student S1 = new Student("1", "11", "jkowalski@wi.zut.edu.pl", "32C");
        Student S2 = new Student("2", "10", "jkowalski@wi.zut.edu.pl", "31C");
        Student S3 = new Student("3", "9", "jkowalski@wi.zut.edu.pl", "33C");
        Student S4 = new Student("4", "8", "jkowalski@wi.zut.edu.pl", "32A");
        Student S5 = new Student("5", "7", "jkowalski@wi.zut.edu.pl", "31A");
        Student S6 = new Student("6", "6", "jkowalski@wi.zut.edu.pl", "33A");
        Student S7 = new Student("7", "5", "jkowalski@wi.zut.edu.pl", "32B");
        Student S8 = new Student("8", "4", "jkowalski@wi.zut.edu.pl", "31B");
        Student S9 = new Student("9", "3", "jkowalski@wi.zut.edu.pl", "33B");
        Student S10 = new Student("0", "2", "jkowalski@wi.zut.edu.pl", "32D");
        Student S11 = new Student("10", "1", "jkowalski@wi.zut.edu.pl", "31D");
        Student S12 = new Student("11", "0", "jkowalski@wi.zut.edu.pl", "33D");

        Map<String, Teacher> przedmioty = new HashMap<>();
        przedmioty.put("Wędkarstwo", t1);
        przedmioty.put("Programowanie obiektowe", t2);
        przedmioty.put("Systemy wbudowane", t3);
        przedmioty.put("Sieci", t4);

        List<Student> Grupa31 = new ArrayList<>();
        Grupa31.add(S1);
        Grupa31.add(S2);
        Grupa31.add(S3);
        Grupa31.add(S4);
        List<Student> Grupa32 = new ArrayList<>();
        Grupa32.add(S5);
        Grupa32.add(S6);
        Grupa32.add(S7);
        Grupa32.add(S8);
        List<Student> Grupa33 = new ArrayList<>();
        Grupa33.add(S9);
        Grupa33.add(S10);
        Grupa33.add(S11);
        Grupa33.add(S12);

        Map<String, List> listy_studentow = new HashMap<>();
        listy_studentow.put("31", Grupa31);
        listy_studentow.put("32", Grupa32);
        listy_studentow.put("33", Grupa33);

        Teacher zajecia = przedmioty.get("Programowanie obiektowe");
        System.out.println("Nauczyciel: " + zajecia);

        List student = listy_studentow.get("32");
        System.out.println("Nauczyciel: " + student);
        List <Product> ListOfProduct=new ArrayList<>();
        Map<Integer,Product> IdOfProduct = new HashMap<>();
        Map<String, List<Product>> CategoryOfProduct = new HashMap<>();
        try (BufferedReader in = new BufferedReader(new FileReader("C:/Users/naeri/Documents/plik.txt"))) {
            
            String s = in.readLine();
            String[] temp;

            while (s != null) {
                temp = s.split(";");
                Product temp2=new Product(temp[0],temp[1],Double.parseDouble(temp[3]),temp[2]) ;
                ListOfProduct.add(temp2);
                IdOfProduct.put(Integer.parseInt(temp[0]), temp2);
                CategoryOfProduct.put(temp[2], ListOfProduct);
                s = in.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        ListOfProduct.forEach((list) -> {
            System.out.println(list);
        });

    }
}
