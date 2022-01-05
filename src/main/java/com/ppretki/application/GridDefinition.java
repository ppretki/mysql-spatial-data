package com.ppretki.application;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class GridDefinition {
    public static final GridDefinition ENTIRE_WORLD = GridDefinition.builder()
            .maxLatitude(90)
            .minLatitude(-90)
            .maxLongitude(180)
            .minLongitude(-180)
            .numberOfHorizontalPoints(100)
            .numberOfVerticalPoints(100)
            .build();
    public static final GridDefinition WARSAW = GridDefinition.builder()
            .maxLatitude(52.28833104051637)
            .minLatitude(52.18236130580118)
            .maxLongitude(21.164872128389266)
            .minLongitude(20.86755461460592)
            .numberOfHorizontalPoints(100)
            .numberOfVerticalPoints(100)
            .build();


    double minLatitude;
    double maxLatitude;
    double minLongitude;
    double maxLongitude;
    int numberOfHorizontalPoints;
    int numberOfVerticalPoints;
}
