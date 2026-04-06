package com.example.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.finance.model.Record;
import com.example.finance.model.Type;
import com.example.finance.repository.RecordRepository;
import java.util.List;

@Service
public class RecordService {
    
    @Autowired
    private RecordRepository repository;
    
    public Record create(Double amount, Type type, String category) {
        Record record = new Record();
        record.setAmount(amount);
        record.setType(type);
        record.setCategory(category);
        return repository.save(record);
    }
    
    public List<Record> all() {
        return repository.findAll();
    }
}