package com.jdc.demo.bridge;

public class AccessDecisionManager {

	public boolean canAccess(AccountStatus status) {
		return switch (status) {
			case EmployeeStatus.Assigned, StudentStatus.Approved -> true;
			case EmployeeStatus.Resigned, StudentStatus.Applied -> false;
			default -> false;
		};
	}
}
