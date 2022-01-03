package com.ppretki.domain;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@RequiredArgsConstructor
@Builder
@Value
public class Center {
    // in the range [−90, 90]
    double latitude;
    // (−180, 180]
    double longitude;
}
