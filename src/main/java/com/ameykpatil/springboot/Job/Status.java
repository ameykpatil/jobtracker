package com.ameykpatil.springboot.Job;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by ameypatil on 16/08/18.
 */
public enum Status {
    APPLIED("Applied"),
    REJECTED("Rejected"),
    YET_TO_APPLY("Yet-To-Apply"),
    OFFERED("Offered"),
    OFFER_REJECTED("Offer-Rejected"),
    OFFER_ACCEPTED("Offer-Accepted");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    @JsonCreator
    public static Status fromValue(String s) {
        for (Status enumObj : Status.values()) {
            if (enumObj.status.equals(s)) {
                return enumObj;
            }
        }
        return null;
    }

    @Override
    @JsonValue
    public String toString() {
        return status;
    }
}
