package com.example.onlineschool_2_0.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AdditionalMaterials {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private Integer lectureId;

    private String video;

    private String book;

    private Boolean isAvailable;

    ResourceType resourceType;

    public AdditionalMaterials() {
    }


}
