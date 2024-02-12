package com.task.educsvapp.educsvapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data //lombok
@NoArgsConstructor //lombok
@AllArgsConstructor //lombok
@Setter
@Getter
public class Schools {


    @Id
    @GeneratedValue
    private Long Id;

    private String name;

    private String status;

    private String sector;

    private String type;

    private String phase;

    private String specialization;

    private int    examNo;

    private String province;

    private String districtMunicipality;

    private String localMunicipality;

    private String suburb;

    private int postalCode;

}
