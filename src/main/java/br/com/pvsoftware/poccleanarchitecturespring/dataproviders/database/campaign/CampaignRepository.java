package br.com.pvsoftware.poccleanarchitecturespring.dataproviders.database.campaign;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CampaignRepository extends PagingAndSortingRepository<CampaignEntity, Integer> {

    boolean existsByName(String name);
}
