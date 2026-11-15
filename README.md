# College Student Record Management and Ranking System

A console-based Java project to store student records, search them by roll number, and rank students by their marks.



## Features

- Add a student with roll number, name and marks in 3 subjects
- Display all students
- Search a student by roll number
- Delete a student
- Rank list by total marks
- Sort students by name
- Sort students by percentage
- Save the rank list to a text file (`report.txt`)
- Records are saved automatically on exit and loaded again when the program starts

## Concepts Used

| Concept | Where it is used |

| `ArrayList` | Stores all the students |
| `HashMap` | Finds a student quickly using the roll number |
| `TreeSet` | Arranges the students in ranking order |
| `Comparable` | `Student.compareTo()` sorts by total marks (highest first) |
| `Comparator` | `NameComparator` and `PercentageComparator` for other orders |
| Serialization | Saves and loads the student list in `students.dat` |
| File I/O | `FileWriter` writes the rank list to `report.txt` |

## Project Structure

```
.
├── Main.java                  // menu and all operations
├── Student.java               // student details (Serializable, Comparable)
├── NameComparator.java        // sort by name
└── PercentageComparator.java  // sort by percentage
```

## How to Run

You need JDK installed.

```
javac *.java
java Main
```

Two files are created when you run the program: `students.dat` (saved records) and `report.txt` (rank list, only if you choose option 8).

## Menu

```
--- STUDENT RECORD SYSTEM ---
1. Add student
2. Display all students
3. Search by roll number
4. Delete student
5. Rank list (by total marks)
6. Sort by name
7. Sort by percentage
8. Save report to text file
0. Save and exit
```

## Sample Output

Rank list (option 5) after adding four students:

```
Roll    Name    M1    M2    M3    Total    Percentage
101     Ravi    80    75    90    245      81.67
102     Sneha   90    85    70    245      81.67
104     Anita   80    75    90    245      81.67
103     Kiran   60    70    65    195      65.0
```

Ravi, Sneha and Anita have the same total, and all three are shown. This is because `compareTo()` checks the roll number when the totals are equal. Without that, `TreeSet` would treat them as duplicates and remove two of them.

## Things to Note

- Enter the name as a single word (for example `Ravi`), because the program reads it with `sc.next()`.
- Marks must be between 0 and 100.
- Roll numbers must be unique.
- Only the `ArrayList` is saved to the file. The `HashMap` is filled again from the list when the data is loaded.

## Future Improvements

- Add more subjects and grades
- Add an option to update marks
- Make a GUI using Swing or JavaFX
- Store data in a database like MySQL

## Made by 
B Varun
B.E. Information Technology, CBIT, Hyderabad
