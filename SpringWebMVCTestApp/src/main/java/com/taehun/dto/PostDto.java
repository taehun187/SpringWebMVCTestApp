package com.taehun.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private Long id;

    @Size(min = 1, max = 100)
    private String name;

    @Size(min = 1, max = 100)
    @Email
    private String email;

    private String ipAddress;

    @Size(min = 1, max = 120)
    private String title;

    @Size(max = 250)
    private String web;

    private String text;
}

