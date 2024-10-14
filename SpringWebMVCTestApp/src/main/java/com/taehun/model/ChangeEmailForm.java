package com.taehun.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChangeEmailForm {

	private String oldEmailAddress;
	private String newEmailAddress;
}
