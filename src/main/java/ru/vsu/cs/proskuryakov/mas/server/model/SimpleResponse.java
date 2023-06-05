package ru.vsu.cs.proskuryakov.mas.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SimpleResponse {
    private int status;
    private String data;
}
