package edu.stanford.irt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.data.repository.CrudRepository;

import edu.stanford.irt.domain.TodoItem;

@Service
public class TodoItemService {
  @Autowired
  private TodoItemRepository todoItemRepository;

  public List<TodoItem> list() {
    return todoItemRepository.findAll();
  }

  public TodoItem create(TodoItem todoItem) {
    return todoItemRepository.save(todoItem);
  }
  
  public TodoItem editItem(TodoItem todoItem) {
	return todoItemRepository.edit(todoItem);
  }
  
  public TodoItem saveAllItem(TodoItem todoItem) {
	return todoItemRepository.saveAll(todoItem);
  }
  
  public void removeItem(TodoItem todoItem) {
	return;
  }  
  
}
