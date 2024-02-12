package com.task.educsvapp.educsvapp.service;

import com.task.educsvapp.educsvapp.model.Schools;
import com.task.educsvapp.educsvapp.repository.SchoolsRepo;
import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Service
@NoArgsConstructor //lombok
@AllArgsConstructor //lombok
@Setter
@Getter
public class SchoolsService {

    private SchoolsRepo schoolsRepo;
    private Schools schools;
    String line="";
    public void saveSchoolsData() throws IOException {

        BufferedReader bufferedReaderOBJ = new BufferedReader(new FileReader("src/main/resources/schools.csv"));
        while((line=bufferedReaderOBJ.readLine())!=null){
            String [] data=line.split(",");

            System.out.println(data[0]);

            //convert string csv value of id to Long data type
            /* long id = Long.parseLong("2");
             schools.setId(id);
             schools.setName("");
             schools.setStatus(data[2]);
             schools.setSector(data[3]);
             schools.setType(data[4]);
             schools.setPhase(data[5]);
             schools.setSpecialization(data[6]);
             schools.setExamNo(Integer.parseInt(data[7]));
             schools.setProvince(data[8]);
             schools.setDistrictMunicipality(data[9]);
             schools.setLocalMunicipality(data[10]);
             schools.setSuburb(data[11]);
             schools.setPostalCode(Integer.parseInt(data[12]));
            schoolsRepo.save(schools);
            System.out.println(data[1]);

            */

        }
    }
}
