package dz.selma.expensestracker.service;

import java.util.List;

import dz.selma.expensestracker.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();
}
