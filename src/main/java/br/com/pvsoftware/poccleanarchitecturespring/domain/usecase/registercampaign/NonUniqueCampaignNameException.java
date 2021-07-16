package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.registercampaign;

public final class NonUniqueCampaignNameException extends RuntimeException {

    public NonUniqueCampaignNameException(String name) {
        super(String.format("A campaign name must be unique, you can't use: '%s'", name));
    }
}
