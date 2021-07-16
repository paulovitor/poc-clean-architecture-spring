package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.listcampaigns;

import br.com.pvsoftware.poccleanarchitecturespring.domain.entity.Campaign;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ListCampaignsService implements ListCampaignsUseCase {

    private final ListCampaigns listCampaigns;

    @Override
    public Page<Campaign> listAll() {
        return listCampaigns.findAll();
    }
}
