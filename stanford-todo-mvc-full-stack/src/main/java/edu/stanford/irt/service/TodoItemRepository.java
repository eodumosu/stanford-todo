package edu.stanford.irt.service;

//import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.stanford.irt.domain.TodoItem;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
	/**
	 * Find an ToDoItem by specified id 
	 */
	public TodoItem findItemById(Long id);
	
	/**
	 * Find an ToDoItem by description 
	 */
	public TodoItem findItemByDescription(String description);
	
	/**
	 * Find an ToDoItem by created date 
	 */
	public TodoItem findItemByCreated();
	
	/**
	 * Find all ToDoItem 
	 */
	public TodoItem findAll(TodoItem todoItem);
	
	/**
	 * Save ToDoItem 
	 */
	public TodoItem save();
	
	/**
	 * Edit ToDoItem 
	 * @param todoItem 
	 */
	public TodoItem edit(TodoItem todoItem);
	
	/**
	 * Save all ToDoItem 
	 */
	public TodoItem saveAll(TodoItem todoItem);
	
	/**
	 * Remove ToDoItem 
	 */
	public void delete();
	
	/**
	 * Fetch the number of accounts known to the system.
	 * 
	 * @return The number of accounts.
	 */
	@Query("SELECT count(*) from Item")
	public int countItems();

	

	

}