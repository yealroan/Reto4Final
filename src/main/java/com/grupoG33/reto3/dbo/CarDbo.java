package com.grupoG33.reto3.dbo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupoG33.reto3.model.GamaModel;
import com.grupoG33.reto3.model.MessageModel;
import com.grupoG33.reto3.model.ReservationModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDbo {
    private Integer idCar;
    private String name;
    private String brand;
    private Integer year;
    private String description;

    private GamaModel gama;

    private List<MessageModel> messages;

    private List<ReservationModel> reservations;

}
