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
	@Override
	public Expense save(Expense expense) {
		// TODO Auto-generated method stub
		return expenseR.save(expense);
	}
	@Override
	public Expense findById(long id) {
		// TODO Auto-generated method stub
		if (expenseR.findById(id).isPresent())
			return expenseR.findById(id).get();
		return null;
	}

}
