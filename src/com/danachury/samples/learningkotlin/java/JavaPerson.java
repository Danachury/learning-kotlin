package com.danachury.samples.learningkotlin.java;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/** @noinspection WeakerAccess*/
public class JavaPerson {

    private final Long id;
    private final String title;
    private final String firstName;
    private final String surname;
    private final Calendar dateOfBirth;

    public JavaPerson(Long id, String title, String firstName, String surname, Calendar dateOfBirth) {
        if (Objects.isNull(id) || Objects.isNull(title) || Objects.isNull(firstName) || Objects.isNull(surname))
            throw new NullPointerException("Some parameters were passed as null, please verify your entries.");
        this.id = id;
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return getAge(this.dateOfBirth);
    }

    @Override
    public String toString() {
        return this.title + " " + this.firstName + " " + this.surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (Objects.isNull(obj) || this.getClass() != obj.getClass())
            return false;
        final JavaPerson that = (JavaPerson) obj;
        return Objects.equals(this.id, that.id)
            && Objects.equals(this.title, that.title)
            && Objects.equals(this.firstName, that.firstName)
            && Objects.equals(this.surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.title, this.firstName, this.surname);
    }

    public static int getAge(Calendar dateOfBirth) {
        if (Objects.isNull(dateOfBirth))
            return -1;
        final Calendar today = new GregorianCalendar();
        int years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR))
            return years - 1;
        else
            return years;
    }
}
