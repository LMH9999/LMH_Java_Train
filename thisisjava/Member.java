package com.mystudy.run.jungsuk.thisisjava;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private String id;
    private String name;
    private int age;
}
