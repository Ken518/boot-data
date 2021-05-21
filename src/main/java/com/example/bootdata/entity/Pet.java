package com.example.bootdata.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * user: ken
 * data: 2021/5/18 15:59
 */
@Data
public class Pet {

    private Integer id;
    private String name;
    private Integer health;
    private Integer love;
    private String strain;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;
}
