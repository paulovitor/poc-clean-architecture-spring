package br.com.pvsoftware.poccleanarchitecturespring.dataproviders.database.campaign;

import br.com.pvsoftware.poccleanarchitecturespring.domain.entity.Campaign;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface CampaignMapper {

    Campaign toDomainObject(CampaignEntity campaignEntity);

    CampaignEntity toEntity(Campaign campaign);
}
