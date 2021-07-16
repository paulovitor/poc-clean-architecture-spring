package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.registercampaign;

public interface DoesCampaignExist {

    boolean doesCampaignNameExist(String name);
}
