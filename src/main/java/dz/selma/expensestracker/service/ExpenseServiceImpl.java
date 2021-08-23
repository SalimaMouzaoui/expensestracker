package dz.selma.expensestracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.selma.expensestracker.model.Expense;
import dz.selma.expensestracker.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseR;
	@Override
	public List<Expense> findAll() {
		// TODO Auto-generated method stub
		return expenseR.findAll();
	}

}
