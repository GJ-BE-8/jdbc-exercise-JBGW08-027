package com.nhnacademy.jdbc.student.domain;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Objects;

public class Student {

    public enum GENDER{
        M,F
    }
    @Getter
    private final String id;
    @Getter
    private final String name;
    @Getter
    private final GENDER gender;
    @Getter
    private final Integer age;
    @Getter
    private final LocalDateTime createdAt;

    public Student(String id, String name, GENDER gender, Integer age){
        this(id, name, gender, age, LocalDateTime.now());
    }
    //todo#0 필요한 method가 있다면 추가합니다.
    public Student(String id, String name, GENDER gender, Integer age, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id)
                && Objects.equals(name, student.name)
                && Objects.equals(gender, student.gender)
                && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, age);
    }
}
