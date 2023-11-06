package com.learn.app.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UUIDUtil {

    public static UUID getUUID() {
        return UUID.randomUUID();
    }

    public static String getStringUUID() {
        return UUID.randomUUID().toString();
    }
}
