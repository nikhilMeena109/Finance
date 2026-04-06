package com.example.finance.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.example.finance.service.RecordService;
import com.example.finance.model.*;

@RestController
@RequestMapping("/records")
public class RecordController{
 @Autowired RecordService service;

 @PostMapping
 public com.example.finance.model.Record create(@RequestParam Double amount,@RequestParam Type type,@RequestParam String category){
  return service.create(amount,type,category);
 }

 @GetMapping
 public List<com.example.finance.model.Record> all(){return service.all();}
}