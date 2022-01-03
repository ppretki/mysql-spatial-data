package com.ppretki.domain;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@RequiredArgsConstructor
@Builder
@Value
public class Area {
    Center center;
    Radius radius;
}
