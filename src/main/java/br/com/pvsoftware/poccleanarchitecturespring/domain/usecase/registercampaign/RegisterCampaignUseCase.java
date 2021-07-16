package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.registercampaign;

import br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.campaign.CampaignDTO;

public interface RegisterCampaignUseCase {

    void registerCampaign(CampaignDTO dto) throws NonUniqueCampaignNameException;
}
