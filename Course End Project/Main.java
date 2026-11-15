import java.io.*;
import java.util.*;



public class Main {

    static ArrayList<Student> list = new ArrayList<Student>();          // stores all students
    static HashMap<Integer, Student> map = new HashMap<Integer, Student>(); // roll no -> student
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        loadFromFile();   // load old records if file is there

        int choice = -1;
        while (choice != 0) {
            System.out.println("\n--- STUDENT RECORD SYSTEM ---");
            System.out.println("1. Add student");
            System.out.println("2. Display all students");
            System.out.println("3. Search by roll number");
            System.out.println("4. Delete student");
            System.out.println("5. Rank list (by total marks)");
            System.out.println("6. Sort by name");
            System.out.println("7. Sort by percentage");
            System.out.println("8. Save report to text file");
            System.out.println("0. Save and exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                display(list);
            } else if (choice == 3) {
                search();
            } else if (choice == 4) {
                deleteStudent();
            } else if (choice == 5) {
                TreeSet<Student> ts = new TreeSet<Student>(list);   // uses compareTo
                display(ts);
            } else if (choice == 6) {
                TreeSet<Student> ts = new TreeSet<Student>(new NameComparator());
                ts.addAll(list);
                display(ts);
            } else if (choice == 7) {
                TreeSet<Student> ts = new TreeSet<Student>(new PercentageComparator());
                ts.addAll(list);
                display(ts);
            } else if (choice == 8) {
                writeReport();
            } else if (choice == 0) {
                saveToFile();
                System.out.println("Bye!");
            } else {
                System.out.println("Wrong choice");
            }
        }
    }

    static void addStudent() {
        System.out.print("Roll number: ");
        int roll = sc.nextInt();
        if (map.containsKey(roll)) {
            System.out.println("Roll number already exists!");
            return;
        }
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Marks in 3 subjects: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100) {
            System.out.println("Marks should be between 0 and 100");
            return;
        }
        Student s = new Student(roll, name, a, b, c);
        list.add(s);
        map.put(roll, s);
        System.out.println("Student added");
    }

    static void display(Collection<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No records");
            return;
        }
        System.out.println("Roll\tName\tM1\tM2\tM3\tTotal\tPercentage");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    static void search() {
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        Student s = map.get(roll);   // HashMap gives the student directly
        if (s == null) {
            System.out.println("Student not found");
        } else {
            System.out.println("Roll\tName\tM1\tM2\tM3\tTotal\tPercentage");
            System.out.println(s);
        }
    }

    static void deleteStudent() {
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        Student s = map.get(roll);
        if (s == null) {
            System.out.println("Student not found");
        } else {
            list.remove(s);
            map.remove(roll);
            System.out.println("Deleted");
        }
    }

    // Serialization - save the whole list in a file
    static void saveToFile() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.dat"));
            out.writeObject(list);
            out.close();
            System.out.println("Saved " + list.size() + " records in students.dat");
        } catch (IOException e) {
            System.out.println("Error while saving: " + e);
        }
    }

    // Deserialization - read the list back from the file
    @SuppressWarnings("unchecked")
    static void loadFromFile() {
        File f = new File("students.dat");
        if (!f.exists()) {
            return;
        }
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
            list = (ArrayList<Student>) in.readObject();
            in.close();
            for (Student s : list) {
                map.put(s.rollNo, s);   // fill the HashMap again
            }
            System.out.println("Loaded " + list.size() + " records from file");
        } catch (Exception e) {
            System.out.println("Error while loading: " + e);
        }
    }

    // File I/O - write rank list into a normal text file
    static void writeReport() {
        try {
            FileWriter fw = new FileWriter("report.txt");
            TreeSet<Student> ts = new TreeSet<Student>(list);
            int rank = 1;
            fw.write("Rank\tRoll\tName\tM1\tM2\tM3\tTotal\tPercentage\n");
            for (Student s : ts) {
                fw.write(rank + "\t" + s + "\n");
                rank++;
            }
            fw.close();
            System.out.println("report.txt created");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
