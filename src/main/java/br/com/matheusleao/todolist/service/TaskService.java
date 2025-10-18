package br.com.matheusleao.todolist.service;

import br.com.matheusleao.todolist.repository.ItaskRepository;
import br.com.matheusleao.todolist.model.TaskModel;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    @Autowired
    private ItaskRepository taskRepository;


    public TaskModel creat(TaskModel taskModel) {
//        var idUser = request.getAttribute("idUser");
//        taskModel.setIdUser((UUID) idUser);

        var currentDate = LocalDateTime.now();
//        if(currentDate.isAfter(taskModel.getStartAt())){
//            return;
//        }
        return this.taskRepository.save(taskModel);
    }

        public List<TaskModel> listar() {
        return taskRepository.findAll();
    }




}
