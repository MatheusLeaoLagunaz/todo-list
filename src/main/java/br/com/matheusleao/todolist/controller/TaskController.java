package br.com.matheusleao.todolist.controller;

import br.com.matheusleao.todolist.repository.ItaskRepository;
import br.com.matheusleao.todolist.model.TaskModel;
import br.com.matheusleao.todolist.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary = "Create Task")
    public ResponseEntity<TaskModel> creat(@RequestBody TaskModel taskModel) {
        var task = taskService.creat(taskModel);
        return ResponseEntity.status(HttpStatus.OK).body(task);
    }


    @GetMapping("/listar")
    @Operation(summary = "List All")
    public ResponseEntity<List<TaskModel>> list() {
        List<TaskModel> lista = taskService.listar();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Delete Task")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        taskService.excluir(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


    @PutMapping("atualizar/{id}")
    @Operation(summary = "Update Task")
    public ResponseEntity<TaskModel> atualizar(@PathVariable UUID id, @RequestBody TaskModel taskAtualizada) {

        TaskModel task = taskService.atualizar(id, taskAtualizada);

        if (task == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(task);
    }

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









