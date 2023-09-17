package com.example.lombok;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class Employee {

    private long eId;
    private String eName;
    private String job;
}
