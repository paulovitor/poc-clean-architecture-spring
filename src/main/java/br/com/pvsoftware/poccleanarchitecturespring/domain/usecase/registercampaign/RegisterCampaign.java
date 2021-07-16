package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.registercampaign;

import br.com.pvsoftware.poccleanarchitecturespring.domain.entity.Campaign;

public interface RegisterCampaign {

    void save(Campaign campaign);
}
