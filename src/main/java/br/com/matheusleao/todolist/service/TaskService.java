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

    public void excluir(UUID id) {
        taskRepository.deleteById(id);
    }

    public TaskModel buscarPorId(UUID id) {
        return taskRepository.findById(id).orElse(null); // retorna null se não existir
    }

    // UPDATE
    public TaskModel atualizar(UUID id, TaskModel taskAtualizada) {
        TaskModel taskExistente = taskRepository.findById(id).orElse(null);

        if (taskExistente == null) {
            return null;
        }

        if (taskAtualizada.getTitle() != null)
            taskExistente.setTitle(taskAtualizada.getTitle());

        if (taskAtualizada.getDescription() != null)
            taskExistente.setDescription(taskAtualizada.getDescription());

        return taskRepository.save(taskExistente);
    }


}
