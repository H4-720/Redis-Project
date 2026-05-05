package com.redis.redisproject.entity;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private String userId;
    private String userName;
    private String phoneNumber;
    private String email;
}
