package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ilyas on 09.01.2019.
 */
@Data
@Entity
public class Result {
    @Id
    Long id;
    Code code;
    Number number;
    String filenames;
    String error;
}
