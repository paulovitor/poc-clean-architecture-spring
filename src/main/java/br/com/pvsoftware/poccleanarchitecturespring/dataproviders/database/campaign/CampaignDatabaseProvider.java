package br.com.pvsoftware.poccleanarchitecturespring.dataproviders.database.campaign;

import br.com.pvsoftware.poccleanarchitecturespring.domain.entity.Campaign;
import br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.listcampaigns.ListCampaigns;
import br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.registercampaign.DoesCampaignExist;
import br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.registercampaign.RegisterCampaign;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CampaignDatabaseProvider implements ListCampaigns, RegisterCampaign, DoesCampaignExist {

    private final CampaignRepository campaignRepository;
    private final CampaignMapper mapper;

    @Override
    public Page<Campaign> findAll() {
        return campaignRepository.findAll(Pageable.unpaged())
                .map(it -> mapper.toDomainObject(it));
    }

    @Override
    public void save(final Campaign campaign) {
        campaignRepository.save(mapper.toEntity(campaign));
    }

    @Override
    public boolean doesCampaignNameExist(final String name) {
        return campaignRepository.existsByName(name);
    }
}
