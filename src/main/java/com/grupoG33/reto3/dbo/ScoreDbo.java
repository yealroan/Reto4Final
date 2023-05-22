package com.grupoG33.reto3.dbo;

import com.grupoG33.reto3.model.ReservationModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreDbo {
    private int idScore;
    private Integer stars;

}
