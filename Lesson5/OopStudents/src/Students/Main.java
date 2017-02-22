package Students;

/**
 * Created by DyXx on 20.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        //создаём новую группу
        Group firstGroup = new Group("First Group");

        //создаём студентов
        Student marinichI = new Student("Marinich","Igor");
        Student kalakK = new Student("Kalak","Kristina");
        Student popov = new Student("Popov","Ruslan");
        Student sulevsky = new Student("Sulevsky","Vladimir");
        Student rihtorovich = new Student("Rihtorovich","Rostik");

        //добавляем студентов в группу
        firstGroup.addStudent(marinichI);
        firstGroup.addStudent(kalakK);
        firstGroup.addStudent(popov);
        firstGroup.addStudent(sulevsky);
        firstGroup.addStudent(rihtorovich);
        firstGroup.printStudentsInGroup();
        System.out.println();
        marinichI.marks.addElement(4);
        System.out.println("Marks : ");
        marinichI.marks.print();
        System.out.println();

        //проверяем функционал группы :
        //делаем сортировку 1-ой группы
        firstGroup.printStudentsInGroup();
        System.out.println();
        firstGroup.quickSort();
        firstGroup.printStudentsInGroup();

/*
        //удаляем студента
        //если студента нету - возвращаем - " Нету такого студента."
        firstGroup.deleteStudentOfSurname("Sulevsky");
        firstGroup.printStudentsInGroup();
*/

        //проверяем наличие студента в группе
        System.out.println();
        firstGroup.showContainStudent("Popov");

        //очищаем группу
        firstGroup.clear();

        //добавляем студента
        firstGroup.addStudent(kalakK);
        firstGroup.printStudentsInGroup();

        //проверяем наличие ( или добавили студента ) и выводим этой функцией
        firstGroup.showContainStudent("Kalak");

        //создаём новую группу номер 2
        Group secondGroup = new Group("Second Group");

        Student marinichV = new Student("Marinich","Viktoria");
        Student kalakE = new Student("Kalak","Evgenia");
        Student shelest = new Student("Shelest","Ibragim");
        Student lee = new Student("Lee","Huan");
        Student fizik = new Student("Fizik","Teoretik");

        secondGroup.addStudent(marinichV);
        secondGroup.addStudent(kalakE);
        secondGroup.addStudent(shelest);
        secondGroup.addStudent(lee);
        secondGroup.addStudent(fizik);

        //проверяем или группа 1 равна группе 2 , и выводим этой функцией
        firstGroup.printIsEquals(secondGroup);


        //создаём новую группу номер 3
        Group thirdGroup = new Group("Third Group");

        thirdGroup.addStudent(marinichI);
        thirdGroup.addStudent(kalakK);
        thirdGroup.addStudent(popov);
        thirdGroup.addStudent(sulevsky);
        thirdGroup.addStudent(rihtorovich);
        System.out.println();

        //проверяем или 1 группа равна 3 , и выводим этой функцией
        firstGroup.printIsEquals(thirdGroup);
        //делаем слияние 1 группы и 2ой.
        firstGroup.mergeGroups(secondGroup);
        //выводим студентов в консоль
        firstGroup.printStudentsInGroup();
        //проверяем есть ли 2ая группа студентов в 1ой
        firstGroup.printIsContainsGroupOfStudents(secondGroup);
    }
}
