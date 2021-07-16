package br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.campaign;

import br.com.pvsoftware.poccleanarchitecturespring.domain.entity.Campaign;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface CampaignDTOMapper {

    CampaignDTO toDTO(Campaign campaign);
}
