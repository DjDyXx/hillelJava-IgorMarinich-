package Students;


import java.util.ArrayList;

/**
 * Created by DyXx on 20.02.2017.
 */
public class Group {
    private String nameGroup;
    private ArrayList<Student> group = new ArrayList<Student>();

    public Group(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void addStudent(Student someStudent) {
        this.group.add(someStudent);
    }

    public void deleteStudentOfSurname(String surname) {
        group.remove(searchStudentOfSurname(surname));
    }

    public boolean isContains(String surname) {
        if (searchStudentOfSurname(surname) >= 0) {
            return true;
        } else return false;
    }

    public void showContainStudent(String surname) {
        if (isContains(surname)) {
            System.out.println("Yes," + surname + " contain in group.");
        } else {
            System.out.println("No," + surname + " is not contain in group. ");
        }
    }

    public void clear() {
        this.group = new ArrayList<Student>();
    }


    public boolean isEquals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof Group) {
            Group anotherGroup = (Group) anObject;
            int n = group.size();
            if (n == anotherGroup.group.size()) {
                ArrayList<Student> v1 = this.group;
                ArrayList<Student> v2 = anotherGroup.group;
                int i = 0;
                while (n-- != 0) {
                    if (v1.get(i) != v2.get(i))
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }

    public boolean isContainsGroupOfStudents(Group anotherGroup) {
        int counter = 0;
        for (int i = 0; i < anotherGroup.group.size(); i++) {
            for (int j = 0; j < this.group.size(); j++) {
                if (anotherGroup.group.get(i).equals(this.group.get(j))) {
                    counter++;
                }
            }
        }
        if (anotherGroup.group.size() == counter) {
            return true;
        } else {
            return false;
        }
    }

    public void printIsContainsGroupOfStudents(Group anotherGroup) {
        if (isContainsGroupOfStudents(anotherGroup)) {
            System.out.println("Yes, this group of students contains in other group. ");
        } else {
            System.out.println("No, this group of students is not contains in other group. ");
        }
    }

    public void mergeGroups(Group anotherGroup) {
        for (Student students : anotherGroup.group) {
            group.add(students);
        }
    }

    public void quickSort() {
        int start = 0;
        int end = group.size() - 1;
        sorting(start, end);
        System.out.println("Sorted : ");
    }

    private void sorting(int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int current = i - (i - j) / 2;
        while (i < j) {
            while (i < current && (group.get(i).getSurname().compareTo(group.get(current).getSurname()) <= group.get(current).getSurname().compareTo(group.get(i).getSurname()))) {
                i++;
            }
            while (j > current && (group.get(current).getSurname().compareTo(group.get(i).getSurname()) <= group.get(j).getSurname().compareTo(group.get(current).getSurname()))) {
                j--;
            }
            if (i < j) {
                Student temp = group.get(i);
                group.set(i, group.get(j));
                group.set(j, temp);
                if (i == current)
                    current = j;
                else if (j == current)
                    current = i;
            }
        }
        sorting(start, current);
        sorting(current + 1, end);
    }

    public void printIsEquals(Object anObject) {
        if (isEquals(anObject)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    public int searchStudentOfSurname(String surname) {
        for (Student someStudent : this.group) {
            if (someStudent.getSurname().equals(surname)) {
                return group.indexOf(someStudent);
            }
        }
        return -1;
    }

    public void printStudentsInGroup() {
        System.out.println(this.nameGroup + " : ");
        for (Student someStudent : this.group) {
            System.out.println(" - " + someStudent.getSurname() + " " + someStudent.getName());
        }
    }

}
