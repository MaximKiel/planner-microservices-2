package ru.javabegin.micro.planner.todo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javabegin.micro.planner.entity.Stat;
import ru.javabegin.micro.planner.todo.repo.StatRepository;

@Service
@Transactional
public class StatService {
    private final StatRepository repository;

    public StatService(StatRepository repository) {
        this.repository = repository;
    }

    public Stat findStat(Long id) {
        return repository.findByUserId(id);
    }
}
