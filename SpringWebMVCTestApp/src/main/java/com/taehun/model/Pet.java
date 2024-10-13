package com.taehun.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pet {
	
	@NotBlank(message = "Pet ID cannot be blank")
	@Size(max = 50, message = "Pet ID must be less than 50 characters")
	private String petId;
	
	@NotBlank(message = "Name cannot be blank")
	@Size(max = 100, message = "Name must be less than 100 characters")
	private String name;
	
	@NotBlank(message = "Type cannot be blank")
	@Size(max = 50, message = "Type must be less than 50 characters")
	private String type;
	
	@NotNull(message = "Age cannot be null")
	@Min(value = 0, message = "Age must be at least 0")
	@Max(value = 30, message = "Age must be less than or equal to 30")
	private int age;
	

}
