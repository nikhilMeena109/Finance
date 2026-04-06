package com.example.finance.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.example.finance.repository.RecordRepository;

@RestController
@RequestMapping("/dashboard")
public class DashboardController{
 @Autowired RecordRepository repo;

 @GetMapping("/summary")
 public Map<String,Object> summary(){
  Double income=repo.totalIncome();
  Double expense=repo.totalExpense();
  Map<String,Object> m=new HashMap<>();
  m.put("income",income);
  m.put("expense",expense);
  m.put("net", (income==null?0:income)-(expense==null?0:expense));
  return m;
 }
}