package com.example.finance.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Record{
 @Id @GeneratedValue
 private Long id;
 private Double amount;
 @Enumerated(EnumType.STRING)
 private Type type;
 private String category;
 private LocalDate date;
 public Double getAmount(){return amount;}
 public void setAmount(Double a){this.amount=a;}
 public void setType(Type t){this.type=t;}
 public void setCategory(String c){this.category=c;}
 public void setDate(LocalDate d){this.date=d;}
}