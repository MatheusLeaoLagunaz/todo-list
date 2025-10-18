package br.com.matheusleao.todolist.controller;

import br.com.matheusleao.todolist.repository.ItaskRepository;
import br.com.matheusleao.todolist.model.TaskModel;
import br.com.matheusleao.todolist.service.TaskService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("")
    public ResponseEntity<TaskModel> creat(@RequestBody TaskModel taskModel) {
        var task = taskService.creat(taskModel);
        return ResponseEntity.status(HttpStatus.OK).body(task);
    }

//    @GetMapping("/listar")
//    public List<TaskModel> list() {
////        var idUser = request.getAttribute("idUser");
////        var tasks = this.taskRepository.findByIdUser((UUID)idUser);
//        return taskService.listar();
//    }

//    @PutMapping("/{id}")
//    public TaskModel update(@RequestBody TaskModel taskModel,@PathVariable UUID id) {
//        var idUser = request.getAttribute("idUser");
//        taskModel.setIdUser((UUID)idUser);
//        taskModel.setId(id);
//        return this.taskRepository.save(taskModel);
//    }

//
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity delete(@PathVariable UUID id, HttpServletRequest request) {
//        var task = this.taskRepository.findById(id).orElse(null);
//        var idUser = request.getAttribute("idUser");
//
//        if (task == null) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Tarefa não encontrada");
//        }
//
//        if (!task.getIdUser().equals(idUser)) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário não tem permissão para alterar essa tarefa");
//        }
//
//        this.taskRepository.delete(task);
//        return ResponseEntity.noContent().build();
//    }
}









