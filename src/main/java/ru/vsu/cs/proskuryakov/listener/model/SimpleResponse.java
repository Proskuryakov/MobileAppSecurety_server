package ru.vsu.cs.proskuryakov.listener.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SimpleResponse {
    private int status;
    private String data;
}
