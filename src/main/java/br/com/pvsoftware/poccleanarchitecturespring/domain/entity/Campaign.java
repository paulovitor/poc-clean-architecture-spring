package br.com.pvsoftware.poccleanarchitecturespring.domain.entity;

import br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.registercampaign.InvalidCampaignDateException;
import br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.campaign.CampaignDTO;
import java.time.LocalDate;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Campaign {

    @NonNull
    private final String name;

    @NonNull
    private final LocalDate start;

    @NonNull
    private final LocalDate end;

    @NonNull
    private final Long points;

    @NonNull
    private final Status status;

    public Campaign(final CampaignDTO dto) {
        this.name = dto.getName();
        this.start = dto.getStart();
        this.end = dto.getEnd();
        this.points = dto.getPoints();
        this.status = Status.AWAITING;

        failIfStartGreaterThanEnd();
    }

    private void failIfStartGreaterThanEnd() {
        if (start.isAfter(end)) {
            throw new InvalidCampaignDateException("Start date can't be greater than end date");
        }
    }

    public enum Status {
        AWAITING, ACTIVE, EXPIRED, FINISHED
    }
}
