import java.util.*;

public class PhoneBook {
    
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        addContact(phoneBook, "Сидоров", "1234567");
        addContact(phoneBook, "Сидоров", "7654321");
        addContact(phoneBook, "Сидоров", "6660666");
        addContact(phoneBook, "Петров", "12345");
        addContact(phoneBook, "Петров", "54321");
        printPhoneBook(phoneBook);
    }

    public static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(name, numbers);
    }

    public static void printPhoneBook(Map<String, List<String>> phoneBook) {
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());

        sortedEntries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            String name = entry.getKey();
            List<String> numbers = entry.getValue();

            System.out.println(name + ":");
            for (String number : numbers) {
                System.out.println(number);
            }

            System.out.println();
        }
    }
}