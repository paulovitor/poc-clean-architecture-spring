package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.registercampaign;

import br.com.pvsoftware.poccleanarchitecturespring.domain.entity.Campaign;
import br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.campaign.CampaignDTO;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RegisterCampaignService implements RegisterCampaignUseCase {

    private final RegisterCampaign registerCampaign;
    private final DoesCampaignExist doesCampaignExist;

    @Transactional
    @Override
    public void registerCampaign(CampaignDTO dto) throws NonUniqueCampaignNameException {
        failIfDoesCampaignNameExist(dto.getName());
        registerCampaign.save(new Campaign(dto));
    }

    private void failIfDoesCampaignNameExist(String name) {
        val exist = doesCampaignExist.doesCampaignNameExist(name);
        if (exist) {
            throw new NonUniqueCampaignNameException(name);
        }
    }
}
