package org.example;

import org.apache.poi.ss.formula.functions.T;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        enum StudyProfile {
            MEDICINE, PROGRAMMER, CONSTRUCTION, AGRONOMIST;
            String profileName = "Медицина, Программист, Строительства, Аграном";
        }

        University university = new University();
        Student student = new Student();

        university.id = "32";
        university.fullName = "Институт имени Павлова";
        university.shortName = "Павлов";
        university.yearOfFoundation = 1821;

        student.universityId = "Хирург";
        student.avgExamScore = 4.28F;
        student.fullName = "Петров Петр Петрович";
        student.currentCourseNumber = 3;

        System.out.println("Имя студента " + student.fullName + " Специальность " + student.universityId + " Курс " + student.currentCourseNumber + " Средний бал " + student.avgExamScore);
        System.out.println("Номер Института " + university.id + " Полное имя учебного заведения " + university.fullName + " Краткое имя " + university.shortName + " Основан в " + university.yearOfFoundation + " году");

    }
}