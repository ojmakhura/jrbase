package com.systemsjr.jrbase.user.validation;

import org.springframework.rules.Rules;
import org.springframework.rules.constraint.Constraint;
import org.springframework.rules.support.DefaultRulesSource;

import com.systemsjr.jrbase.user.vo.UserVO;

public class UserValidationRules extends DefaultRulesSource {
	
	private final Constraint USERNAME_CONSTRAINT = all(new Constraint[]{
			required(),
			minLength(5), 
			regexp("[-'.a-zA-Z ]*", "alphabeticConstraint")
		});
	
	private final Constraint PASSWORD_CONSTRAINT = all(new Constraint[]{
			required(),
			minLength(6),
			regexp("[$@!&-'.a-zA-Z ]*", "alphabeticConstraint")
		});
	
	public UserValidationRules(){
		super();
		addRules(createUserRules());
	}

	private Rules createUserRules() {
		return new org.springframework.rules.Rules(UserVO.class){
			@Override
			protected void initRules(){
				add("username", USERNAME_CONSTRAINT);
				add(eqProperty("password2", "password1"));
				add("status", required());
				add("userId", required());
				add("individual", required());
				add("password1", PASSWORD_CONSTRAINT);
				add("password2", PASSWORD_CONSTRAINT);
			}
		};
	}
}
