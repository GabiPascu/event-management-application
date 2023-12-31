package com.blue.team.event.management.application.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Builder
public class EventDto {

    private Long id;
    @NotNull
    private String location;
    @NotNull
    private String name;
    @NotNull
    private LocalDate date;
    @NotNull
    private LocalTime time;
    @NotNull
    private String description;
    @Min(1)
    @NotNull
    private Integer maximumParticipants;
    @NotNull
    private OrganizerDto organizer;
    private List< ParticipantDto > participants;
}
