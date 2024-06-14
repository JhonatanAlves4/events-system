package com.jhonatan.eventsmicroservice.domain;

import com.jhonatan.eventsmicroservice.dtos.EventRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="events")
@Table(name="events")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int maxParticipants;
    private int registeredParticipants;
    private String date;
    private String title;
    private String description;

    public Event(EventRequestDTO eventRequest) {
        System.out.println(eventRequest);
        this.maxParticipants = eventRequest.maxParticipants();
        this.registeredParticipants = eventRequest.registeredParticipants();
        this.date = eventRequest.date();
        this.title = eventRequest.title();
        this.description = eventRequest.description();
    }
}
