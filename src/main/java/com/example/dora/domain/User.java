package com.example.dora.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: zhoupb
 * @Description: User
 * @since: version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;

    private Integer age;
}
