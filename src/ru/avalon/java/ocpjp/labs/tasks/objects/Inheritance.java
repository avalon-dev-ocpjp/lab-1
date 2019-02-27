package ru.avalon.java.ocpjp.labs.tasks.objects;

import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;
import ru.avalon.java.ocpjp.labs.common.ObjectWriterImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.management.BufferPoolMXBean;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Задание, направленное на изучение следующих тем:
 * 1. наследование;
 * 2. полиморфизм;
 * 3. использование коллекции ArrayList
 */
public final class Inheritance implements Exercise {

    /**
     * Объект, выполняющий сравнение объектов типа
     * {@link Citizen}.
     */
    private Comparator<Citizen> comparator;

    /**
     * Источник случайного набора экземпляров класса
     * {@link Citizen}.
     * <p>
     * Объектов в источнике должно быть случайное количечство
     * в диапазоне от {@code 20} до {@code 30}.
     * <p>
     * Формировать экземпляры следует с использованием данных
     * словарей, расположенных в пакете
     * {@link ru.avalon.java.ocpjp.labs.resources}.
     */
    private Iterable<Citizen> source;

    /**
     * Объект, отвечающий за вывод экземпляров {@link Citizen}
     * в консоль.
     */
    private ObjectWriter<Citizen> writer;

    private int fileLength(String fileName) {
        int counter = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            do {
                counter++;
            } while (reader.readLine() != null);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return counter;
    }

    private List<Integer> randomNum(int fileLength, int objCount) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < objCount; i++) {
            list.add(random.nextInt(fileLength));
        }
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    private List<String> readFile(String fileName, List<Integer> list) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int ctr = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (i < list.size()) {
                Boolean wasInWhile = false;
                while (ctr != list.get(i)) {
                    reader.readLine();
                    ctr++;
                }
                String string = reader.readLine();
                while (i < list.size() - 1 && list.get(i) == list.get(i + 1).intValue()) {
                    result.add(string);
                    i++;
                    wasInWhile = true;
                }
                if (!wasInWhile) {
                    result.add(string);
                    i++;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        return result;
    }

    public Inheritance() {
        int objCount = 20 + new Random().nextInt(10);
        List<Citizen> list = new ArrayList<>();
        URL firstNamesURL = getClass().getResource("/ru/avalon/java/ocpjp/labs/resources/first-names.txt");
        URL lastNamesURL = getClass().getResource("/ru/avalon/java/ocpjp/labs/resources/last-names.txt");
        URL countriesURL = getClass().getResource("/ru/avalon/java/ocpjp/labs/resources/countries.txt");

        List<String> listOfNames =
                readFile(firstNamesURL.getPath(), randomNum(fileLength(firstNamesURL.getPath()), objCount));
        List<String> listOfLastNames =
                readFile(lastNamesURL.getPath(), randomNum(fileLength(lastNamesURL.getPath()), objCount));
        List<String> listOfCountries =
                readFile(countriesURL.getPath(), randomNum(fileLength(countriesURL.getPath()), objCount));

        for (int i = 0; i < objCount; i++) {
            String[] country = new String[2];
            if(listOfCountries.get(i) != null)
                country = listOfCountries.get(i).split(":");
            else country = new String[]{"--", "Not a citizen"};
            list.add(new CitizenImpl(
                    listOfNames.get(i),
                    listOfLastNames.get(i),
                    new CountryImpl(country[0], country[1]))
            );
        }
        source = list;

        comparator = Comparator.comparing(obj -> obj.getLastName());
        comparator.thenComparing(obj -> obj.getName());
        comparator.thenComparing(obj -> obj.getCountry().getCode());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        List<Citizen> citizens = new ArrayList<>();
        for(Citizen citizen : source) {
            citizens.add(citizen);
        }
        citizens.sort(comparator);
        writer = new ObjectWriterImpl();

        for (int i = 0; i < citizens.size(); i++) {
            try {
                writer.write(citizens.get(i));
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        }
    }
}
