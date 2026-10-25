class Main {
static class Student {
String name;
        
    int[] quizzes;
    double average;

    Student(String name, int[] quizzes) {
    this.name = name;
    this.quizzes = quizzes;

    int total = 0;
    for (int score : quizzes) {
    total += score;
    }

    average = (double) total / quizzes.length;
    }
    }

    static int linearSearch(Student[] students, String target) {
    for (int i = 0; i < students.length; i++) {
    if (students[i].name.equalsIgnoreCase(target)) {
    return i + 1;
    }
    }
    return -1;
    }

    public static void main(String[] args) {
    String[] names = {
    "Kevin", 
    "Gabriel", 
    "Mark", 
    "John", 
    "Sarah"
    };

    int[][] quizData = {
    {92, 86, 90, 95},
    {93, 95, 84, 89},
    {84, 87, 85, 90},
    {85, 95, 92, 87},
    {85, 83, 81, 90}
    };

    Student[] students = new Student[names.length];

    for (int i = 0; i < students.length; i++) {
    students[i] = new Student(names[i], quizData[i]);
    }
    
    for (int i = 0; i < students.length - 1; i++) {
    for (int j = 0; j < students.length - 1 - i; j++) {

    if (students[j].average < students[j + 1].average) {
    Student temp = students[j];
    students[j] = students[j + 1];
    students[j + 1] = temp;
    }
    }
    }

    System.out.println("========== STUDENT LEADERBOARD ==========");
    System.out.printf("%-8s %-12s %-10s%n", "Rank", "Name", "Average");
    System.out.println("-----------------------------------------");

    int rank = 1;

    for (int i = 0; i < students.length; i++) {

    if (i > 0 && students[i].average == students[i - 1].average) {
    
    } else {
    rank = i + 1;
    }

    System.out.printf("%-8d %-12s %-10.2f%n",
    rank, students[i].name, students[i].average);
    }

    String target = "Kevin";
    int foundRank = linearSearch(students, target);

    if (foundRank != -1) {
    System.out.println("\n" + target + " found at position " + foundRank);
    } else {
    System.out.println("\n" + target + " was not found.");
    
    }
  }
}