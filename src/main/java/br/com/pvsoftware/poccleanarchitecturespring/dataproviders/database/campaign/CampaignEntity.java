package br.com.pvsoftware.poccleanarchitecturespring.dataproviders.database.campaign;

import br.com.pvsoftware.poccleanarchitecturespring.domain.entity.Campaign;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CAMPAIGN")
public class CampaignEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private LocalDate start;

    private LocalDate end;

    private Long points;

    @Enumerated(EnumType.STRING)
    private Campaign.Status status;
}
