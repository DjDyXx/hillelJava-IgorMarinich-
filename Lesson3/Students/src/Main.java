import java.util.Scanner;

/**
 * containsAll - есть ли группа студентов в другой группе
 */
public class Main {
    public static void main(String[] args) {

        String[][] journal = new String[2][];
        String[] marks1 = {"Marks :", "5 ,3 ,4", "4 ,5 ,4", "3 ,1 ,5", "4 ,4 ,4"};
        String[] marks2 = {"Marks :", "5 ,3 ,4", "4 ,5 ,4", "3 ,1 ,5", "5 ,5 ,5"};
        String[] visit1 = {"Visit :", "absend", "present", "present", "present"};
        String[] visit2 = {"Visit :", "absend", "absend", "present", "ansend"};
        String[] group1 = {"Names :", "Marinich", "Kalak", "Poxubaylo", "Popov"};
        //test for sort
        String[] group2 = {"Names :", "Mxrinich", "Maqinich", "Masinich", "Masimich"};
        journal[0] = group1;
        journal[1] = group2;
        System.out.println("Welcome to the students journal");
        choose(group1, group2, marks1, marks2, visit1, visit2);

    }

    public static void choose(String[] group1, String[] group2, String[] marks1, String[] marks2, String[] visit1, String[]
            visit2) {
        boolean continueChoose = false;
        do {
            System.out.println("Pls choose function : ");
            System.out.println("1. Add a student.");
            System.out.println("2. Delete a student.");
            System.out.println("3. Contain a student.");
            System.out.println("4. Clear and trim a group.");
            System.out.println("5. Merge a group.");
            System.out.println("6. Sort a group.");
            System.out.println("7. ContainsAll.");
            System.out.println("8. Equals groups.");
            System.out.println("9. PrintGroup.");

            Scanner choose = new Scanner(System.in);
            String chooseFunction = choose.nextLine();

            switch (chooseFunction) {
                case "1":
                    System.out.println("Choose group please,enter (1 or 2) : ");
                    String chooseGroup = choose.nextLine();
                    boolean temp = false;
                    while (!temp) {
                        if (chooseGroup.equals("1")) {
                            group1 = addStudent(group1);
                            temp = true;
                        } else if (chooseGroup.equals("2")) {
                            group2 = addStudent(group2);
                            temp = true;
                        } else {
                            System.out.println("Wrong input. Please try again (1 or 2) : ");
                            chooseGroup = choose.nextLine();
                        }
                    }
                    break;
                case "2":
                    System.out.println("Choose group please,enter (1 or 2) : ");
                    chooseGroup = choose.nextLine();
                    temp = false;
                    while (!temp) {
                        if (chooseGroup.equals("1")) {
                            group1 = deleteStudent(group1);
                            temp = true;
                        } else if (chooseGroup.equals("2")) {
                            group2 = deleteStudent(group2);
                            temp = true;
                        } else {
                            System.out.println("Wrong input. Please try again (1 or 2) : ");
                            chooseGroup = choose.nextLine();
                        }
                    }
                    break;
                case "3":
                    System.out.println("Choose group please,enter (1 or 2) : ");
                    chooseGroup = choose.nextLine();
                    temp = false;
                    while (!temp) {
                        if (chooseGroup.equals("1")) {
                            if (isContainStudent(group1)) {
                                System.out.println("Yes, this student contain in this group.");
                            } else {
                                System.out.println("No, this student don't contain in this group.");
                            }
                            temp = true;
                        } else if (chooseGroup.equals("2")) {
                            if (isContainStudent(group2)) {
                                System.out.println("Yes, this student contain in this group.");
                            } else {
                                System.out.println("No, this student don't contain in this group.");
                            }
                            temp = true;
                        } else {
                            System.out.println("Wrong input. Please try again (1 or 2) : ");
                            chooseGroup = choose.nextLine();
                        }
                    }
                    break;
                case "4":
                    System.out.println("Choose what group do you want to clean ? (1 / 2) : ");
                    chooseGroup = choose.nextLine();
                    temp = false;
                    while (!temp) {
                        if (chooseGroup.equals("1")) {
                            group1 = clearGroup(group1);
                            temp = true;
                        } else if (chooseGroup.equals("2")) {
                            group2 = clearGroup(group2);
                            temp = true;
                        } else {
                            System.out.println("Wrong input. Please try again (1 or 2) : ");
                            chooseGroup = choose.nextLine();
                        }
                    }
                    break;
                case "5":
                    System.out.println("Choose in which group will be merged two groups. (1 or 2)");
                    chooseGroup = choose.nextLine();
                    temp = false;
                    while (!temp) {
                        if (chooseGroup.equals("1")) {
                            System.out.println("Now will merged 2 groups into FIRST group");
                            group1 = mergeGroups(group1, group2);
                            System.out.println("Sucessfull merge into 1 group");
                            temp = true;
                        } else if (chooseGroup.equals("2")) {
                            System.out.println("Now will merged 2 groups into SECOND group");
                            group2 = mergeGroups(group2, group1);
                            System.out.println("Sucessfull merge into 2 group");
                            temp = true;
                        } else {
                            System.out.println("Wrong input. Please try again (1 or 2) : ");
                            chooseGroup = choose.nextLine();
                        }
                    }
                    break;
                case "6":
                    System.out.println("Choose what group do you want to sort? (1 / 2) : ");
                    chooseGroup = choose.nextLine();
                    temp = false;
                    while (!temp) {
                        if (chooseGroup.equals("1")) {
                            group1 = sortGroup(group1);
                            temp = true;
                        } else if (chooseGroup.equals("2")) {
                            group2 = sortGroup(group2);
                            temp = true;
                        } else {
                            System.out.println("Wrong input. Please try again (1 or 2) : ");
                            chooseGroup = choose.nextLine();
                        }
                    }
                    break;
                case "7":
                    System.out.println("Choose what group of students is contain in other group ? (1 / 2) : ");
                    chooseGroup = choose.nextLine();
                    temp = false;
                    while (!temp) {
                        if (chooseGroup.equals("1")) {
                            boolean Is = isContainGroup(group1, group2);
                            if (Is) {
                                System.out.println("Yes. This group of students contains in other group.");
                            } else {
                                System.out.println("No. This group of students don't contain in other group.");
                            }
                            temp = true;
                        } else if (chooseGroup.equals("2")) {
                            boolean Is = isContainGroup(group2, group1);
                            if (Is) {
                                System.out.println("Yes. This group of students contains in other group.");
                            } else {
                                System.out.println("No. This group of students don't contain in other group.");
                            }
                            temp = true;
                        } else {
                            System.out.println("Wrong input. Please try again (1 or 2) : ");
                            chooseGroup = choose.nextLine();
                        }
                    }
                    break;
                case "8":
                    System.out.println("Choose what group do you want to equal? (1 / 2) : ");
                    chooseGroup = choose.nextLine();
                    temp = false;
                    while (!temp) {
                        if (chooseGroup.equals("1")) {
                            boolean Is = isEqualGroup(group1, group2);
                            if (Is) {
                                System.out.println("Yes. 1 group  =  2 group.");
                            } else {
                                System.out.println("No.  1 group != 2 group. ");
                            }
                            temp = true;
                        } else if (chooseGroup.equals("2")) {
                            boolean Is = isEqualGroup(group2, group1);
                            if (Is) {
                                System.out.println("Yes. 2 group  =  1 group.");
                            } else {
                                System.out.println("No.  2 group !=  1 group.");
                            }
                            temp = true;
                        } else {
                            System.out.println("Wrong input. Please try again (1 or 2) : ");
                            chooseGroup = choose.nextLine();
                        }
                    }
                    break;
                case "9":
                    outPut(group1, group2, marks1, marks2, visit1, visit2);
                    break;
            }
            System.out.println();
            System.out.println("Do you want to continue? Y/N");
            Scanner sc = new Scanner(System.in);
            String inputContinue = sc.nextLine().toLowerCase();
            if (inputContinue.equals("y")) {
                continueChoose = false;
            } else {
                continueChoose = true;
            }
        } while (!continueChoose);
        System.out.println("Thank you. Good bye !");
    }

    //Добавления студента в группу
    private static String[] addStudent(String[] group) {
        System.out.println("What student do you want add ? Enter please Last Name : ");
        Scanner addStudent = new Scanner(System.in);
        String newStudent = addStudent.nextLine();
        String[] newGroup = new String[group.length + 1];
        for (int student = 0; student < group.length; student++) {
            newGroup[student] = group[student];
        }
        newGroup[group.length] = newStudent;
        return newGroup;
    }

    //Удаление студента из группы
    private static String[] deleteStudent(String[] group) {
        System.out.println("What student do you want delete ? Enter please Last Name of this LIST: ");
        outPutGroupLastName(group);
        Scanner deleteStudent = new Scanner(System.in);
        String delStudent = deleteStudent.nextLine();
        String[] newGroup = new String[group.length - 1];
        String buff = "";
        for (int i = 0; i < group.length - 1; i++) {
            if ((group[i].trim().equals(delStudent.trim())) || (buff.trim().equals(group[i].trim()))) {
                newGroup[i] = group[i + 1];
                buff = newGroup[i];
            } else {
                newGroup[i] = group[i];
            }
        }
        return newGroup;
    }

    //Есть ли студент в группе
    private static boolean isContainStudent(String[] group) {
        System.out.println("Please enter, what student do you search ? ");
        Scanner contain = new Scanner(System.in);
        String searchingStudent = contain.nextLine();
        for (String el : group) {
            if (searchingStudent.equals(el)) {
                return true;
            }
        }
        return false;
    }

    //Очистка группы
    private static String[] clearGroup(String[] group) {
        String[] newGroup = new String[group.length - (group.length - 2)];
        newGroup[0] = group[0];
        newGroup[1] = "No students";
        return newGroup;
    }

    //Слияние групп
    private static String[] mergeGroups(String[] group1, String[] group2) {
        String[] newGroup = new String[group1.length + group2.length - 1];
        for (int i = 0; i < group1.length; i++) {
            newGroup[i] = group1[i];
        }
        for (int i = group1.length; i < newGroup.length; i++) {
            newGroup[i] = group2[i - group1.length + 1];
        }
        return newGroup;
    }

    //Сортировка группы
    private static String[] sortGroup(String[] group) {
        for (int i = group.length - 1; i >= 0; i--) {
            for (int j = 1; j < i; j++) {
                if (group[j].compareTo(group[j + 1]) > 0) {
                    String temp = group[j];
                    group[j] = group[j + 1];
                    group[j + 1] = temp;
                }
            }
        }
        return group;
    }

    //Есть ли группа студентов в группе
    private static boolean isContainGroup(String[] group1, String[] group2) {
        int count = 0;
        for (int i = 0; i < group1.length; i++) {
            for (int j = 0; j < group2.length; j++) {
                if (group1[i].equals(group2[j])) {
                    count++;
                }
            }
        }if(group1.length==count) {
            return true;
        }else {
            return false;
        }
    }

    //Полное сравнение групп
    private static boolean isEqualGroup(String[] group1, String[] group2) {
        if (group1.length != group2.length) {
            System.out.println("This groups can't be equal. In group more students then in other group.");
            return false;
        } else {
            for (int i = 0; i < group1.length; i++) {
                if (!group1[i].equals(group2[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    //Вывод группы
    public static void outPutGroup(String[] group, String[] visit, String[] marks) {
        for (int i = 0; i < group.length; i++) {
            System.out.print(group[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < visit.length; i++) {
            System.out.print(visit[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    //Вывод только фамилий
    public static void outPutGroupLastName(String[] group) {
        for (int i = 0; i < group.length; i++) {
            System.out.print(group[i] + " ");
        }
    }

    //Выбор для вывода группы
    public static void outPut(String[] group1, String[] group2, String[] marks1, String[] marks2, String[] visit1, String[]
            visit2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose group please,enter 1 or 2 : ");
        String inputGroup = sc.nextLine();
        boolean temp = false;
        while (!temp) {
            if (inputGroup.equals("1")) {
                outPutGroup(group1, visit1, marks1);
                temp = true;
            } else if (inputGroup.equals("2")) {
                outPutGroup(group2, visit2, marks2);
                temp = true;
            } else {
                System.out.println("Wrong input");
                inputGroup = sc.nextLine();
            }
        }
    }
}
