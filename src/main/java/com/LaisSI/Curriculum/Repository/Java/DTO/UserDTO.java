package com.LaisSI.Curriculum.Repository.Java.DTO;

import java.util.Date;

public record UserDTO(

        String name,
        Date date,
        int age
) {
}
