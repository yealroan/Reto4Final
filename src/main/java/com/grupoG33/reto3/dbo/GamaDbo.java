package com.grupoG33.reto3.dbo;

import com.grupoG33.reto3.model.CarModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamaDbo {
    private int idGama;
    private String name;
    private String description;
    private List<CarModel> cars;
}
