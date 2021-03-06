package com.cs.iit.sar.dto.request;

import javax.json.bind.annotation.JsonbProperty;

import com.cs.iit.sar.dto.response.CarResponse;
import com.cs.iit.sar.dto.response.DateTimeResponse;
import com.cs.iit.sar.dto.response.LocationInfoResponse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RideRequest {
	private Integer aid;
	private Integer rid;
	@JsonbProperty("location_info")
	private LocationInfoResponse locationInfo;
	@JsonbProperty("date_time")
	private DateTimeResponse dateTime;
	@JsonbProperty("car_info")
	private CarResponse carInfo;
	@JsonbProperty("max_passengers")
	private Integer maxPassengers;
	@JsonbProperty("amount_per_passenger")
	private Double amountPerPassenger;
	private String conditions;
	
	public RideRequest(Integer aid, LocationInfoResponse locationInfo, DateTimeResponse dateTime, CarResponse carInfo,
			Integer maxPassengers, Double amountPerPassenger, String conditions) {
		super();
		this.aid = aid;
		this.locationInfo = locationInfo;
		this.dateTime = dateTime;
		this.carInfo = carInfo;
		this.maxPassengers = maxPassengers;
		this.amountPerPassenger = amountPerPassenger;
		this.conditions = conditions;
	}
	
	
}
