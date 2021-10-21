package com.journeyfy.journeyfytravelapplication.components.trips;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class TripDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("activity_entity_id")
    private Long activityEntityId;
    @JsonProperty("big_trip_name")
    private String bigTripName;

}
