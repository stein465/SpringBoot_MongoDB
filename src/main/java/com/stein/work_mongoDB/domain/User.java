package com.stein.work_mongoDB.domain;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class User implements Serializable {
    private static final Long serialVersionUID = 1L;

    private String id;
    private String name;
    private String email;

}
