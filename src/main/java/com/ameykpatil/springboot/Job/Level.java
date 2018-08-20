package com.ameykpatil.springboot.Job;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by ameypatil on 16/08/18.
 */
public enum Level {

    RESUME("Resume"),
    ASSIGNMENT("Assignment"),
    CODING_ROUND("Coding Round"),
    TECHNICAL_INTERVIEW("Technical Interview"),
    TECHNICAL_INTERVIEW_2("Technical Interview 2"),
    HR_INTERVIEW("HR Interview");

    private final String level;

    Level(String level) {
        this.level = level;
    }

    @JsonCreator
    public static Level fromValue(String s) {
        for (Level enumObj : Level.values()) {
            if (enumObj.level.equals(s)) {
                return enumObj;
            }
        }
        return null;
    }

    @Override
    @JsonValue
    public String toString() {
        return level;
    }
}
