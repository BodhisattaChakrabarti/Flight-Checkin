package com.trainings.flightcheckin.integration;

import com.trainings.flightcheckin.integration.dto.Reservation;
import com.trainings.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(int id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
