package com.jdc.account.model;

import java.time.LocalDate;

import com.jdc.account.model.Student.Status;

public class LoginService {

	private LoginUser[] users;

	public LoginResult login(LoginUser account) {

		for (var user : users) {
			if (user.loginId().equals(account.loginId()) && user.password().equals(account.password())) {
				// return login result
				if (isActive(account)) {
					return getLoginResult(account, "Login Success");
				}
			}
		}

		return null;
	}

	// pattern matching in switch expression with record pattern
	private LoginResult getLoginResult(LoginUser account, String message) {
		return switch (account) {
		case Employee(var name, var loginId, var pass, var role, var status) -> new LoginResult(name, loginId, message);
		case Student(var code, var name, var password, var status, var entryDate, var finishedDate) ->
			new LoginResult(name, code, message);
		case Teacher(var loginId, var password, var name, var status) -> new LoginResult(name, loginId, message);
		};
	}

	// pattern matching in switch expression with type pattern
	private boolean isActive(LoginUser account) {
		return switch (account) {
		case Employee e -> isActive(e.status());
		case Student s -> isActive(s.status());
		case Teacher t -> isActive(t.status());
		};
	}

	// pattern matching in switch expression with enum
	private boolean isActive(AccountState state) {
		return switch (state) {
		case com.jdc.account.model.Student.Status.Active, com.jdc.account.model.Teacher.Status.Active,
				com.jdc.account.model.Employee.Status.Active, com.jdc.account.model.Employee.Status.Leave ->
			true;
		case com.jdc.account.model.Student.Status.Finished, com.jdc.account.model.Teacher.Status.Retired,
				com.jdc.account.model.Employee.Status.Retired ->
			true;
		default -> false;
		};
	}
}
