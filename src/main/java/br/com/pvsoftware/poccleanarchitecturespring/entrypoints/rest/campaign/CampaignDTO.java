package br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.campaign;

import java.time.LocalDate;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public final class CampaignDTO {

    @NotEmpty
    private final String name;

    @NotNull
    private final LocalDate start;

    @NotNull
    private final LocalDate end;

    @NotNull
    private final Long points;
}
