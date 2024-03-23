package org.activite.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "PATIENT")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Patient {
       @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long  id;
       private String nom;
       private Date dateNaissane;
       private  boolean malade;
       private int score;
}
