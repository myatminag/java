package com.jdc.account.model;

public sealed interface AccountState permits Student.Status, Teacher.Status, Employee.Status {

}
