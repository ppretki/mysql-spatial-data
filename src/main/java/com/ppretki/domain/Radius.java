package com.ppretki.domain;

import lombok.Value;

@Value
public class Radius {
    int value;

    public int asMeters() {
        return value;
    }

    public static Radius fromMeters(int value) {
        return new Radius(value);
    }

}
