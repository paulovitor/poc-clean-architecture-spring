package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.registercampaign;

public final class InvalidCampaignDateException extends RuntimeException {

    public InvalidCampaignDateException(String message) {
        super(message);
    }
}
