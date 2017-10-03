package edu.stanford.irt.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.SessionAttributes;

import edu.stanford.irt.domain.TodoItem;
import edu.stanford.irt.service.TodoItemService;

@RestController
//@SessionAttributes(value="TodoItem", types={TodoItem.class})
public class TodoItemController {
  @Autowired
  private TodoItemService todoItemService;

  @RequestMapping(value = "/api/todo-items", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  @Transactional(readOnly = true)
  public List<TodoItem> findTodoItems() {
    return todoItemService.list();
  }

  @RequestMapping(value = "/api/todo-items", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public TodoItem createTodoItem(TodoItem todoItem) {
    return todoItemService.create(todoItem);
  }
  
  @RequestMapping(value = "/api/todo-items", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public TodoItem editTodoItem(TodoItem todoItem) {
    return todoItemService.editItem(todoItem);
  }
  
  @RequestMapping(value = "/api/todo-items", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public void removeTodoItem(TodoItem todoItem) {
    return;
  }
  
  @RequestMapping(value = "/api/todo-items", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public TodoItem markCompleteTodoItem(TodoItem todoItem) {
    return todoItemService.saveAllItem(todoItem);
  }
}