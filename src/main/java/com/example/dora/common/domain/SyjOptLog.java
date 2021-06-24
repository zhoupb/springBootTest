package com.example.dora.common.domain;

import lombok.Data;

@Data
public class SyjOptLog {

    String optId;
    Integer optType;
    String method;
    Object params;
    Object result;
    Integer resCode = 0;

}
