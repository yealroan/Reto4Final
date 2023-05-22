package com.grupoG33.reto3.service;

import com.grupoG33.reto3.dbo.ReportStatusDbo;
import com.grupoG33.reto3.dbo.ReservationDbo;
import com.grupoG33.reto3.model.ClientModel;
import com.grupoG33.reto3.model.GamaModel;
import com.grupoG33.reto3.model.MessageModel;
import com.grupoG33.reto3.model.ReservationModel;
import com.grupoG33.reto3.repository.ClientRepository;
import com.grupoG33.reto3.repository.ReservationRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;


    public List<ReservationModel> obtener(){
        return reservationRepository.findAll();
    }

    public void crear(ReservationModel reservation){
        reservationRepository.save(reservation);
    }

    public void eliminar(int id){
        reservationRepository.deleteById(id);
    }

    public void actualizar(ReservationDbo reservationInput) {
        Optional<ReservationModel> reservationDB = reservationRepository.findById(reservationInput.getIdReservation());

        if (reservationDB.isPresent()) {
            ReservationModel reservation = reservationDB.get();

            if (reservationInput.getStartDate() != null) {
                reservation.setStartDate(reservationInput.getStartDate());
            }
            if (reservationInput.getDevolutionDate() != null) {
                reservation.setDevolutionDate(reservationInput.getDevolutionDate());
            }
            if (reservationInput.getScore() != null) {
                reservation.setScore(reservationInput.getScore());
            }
            if (reservationInput.getStatus() != null) {
                reservation.setStatus(reservationInput.getStatus());
            }
            if (reservationInput.getCar() != null) {
                reservation.setCar(reservationInput.getCar());
            }
            if (reservationInput.getClient() != null) {
                reservation.setClient(reservationInput.getClient());
            }
                reservationRepository.save(reservation);
        }
    }

    public Optional<ReservationModel> obtenerPorId(int id) {
        return reservationRepository.findById(id);
    }

    public List<ReservationModel> reporDate(String fechaInicio, String fechaFin) throws ParseException {


        SimpleDateFormat format = new SimpleDateFormat("yyyy-M-dd");
        Date fechaInicioDate = format.parse(fechaInicio);
        Date fechaFinDate = format. parse(fechaFin) ;
;
        if(fechaInicioDate.before(fechaFinDate)) {
          return reservationRepository.findByStartDateBetween(fechaInicioDate,fechaFinDate);

        }
        return null;
    }

    public ReportStatusDbo reportStatus() {

        Integer countCompleted = reservationRepository.countByStatus("completed");
        Integer countCancelled = reservationRepository.countByStatus("cancelled");
        return new ReportStatusDbo(countCompleted,countCancelled);
    }


}

