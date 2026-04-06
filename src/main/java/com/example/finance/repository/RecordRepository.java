package com.example.finance.repository;
import org.springframework.data.jpa.repository.*;
import java.util.*;
import com.example.finance.model.Record;

public interface RecordRepository extends JpaRepository<Record,Long>{
 @Query("SELECT SUM(r.amount) FROM Record r WHERE r.type='INCOME'")
 Double totalIncome();
 @Query("SELECT SUM(r.amount) FROM Record r WHERE r.type='EXPENSE'")
 Double totalExpense();
}