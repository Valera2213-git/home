package org.example;

import java.util.function.Predicate;

public enum UniversityList implements Predicate<University> {
    PHYSICS, MEDICINE, LINGUISTICS;

    @Override
    public boolean test(University university) {
        return false;
    }
}
