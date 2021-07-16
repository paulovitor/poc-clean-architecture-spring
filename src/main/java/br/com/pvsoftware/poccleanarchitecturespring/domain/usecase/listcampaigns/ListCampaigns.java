package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.listcampaigns;

import br.com.pvsoftware.poccleanarchitecturespring.domain.entity.Campaign;
import org.springframework.data.domain.Page;

public interface ListCampaigns {

    Page<Campaign> findAll();
}
