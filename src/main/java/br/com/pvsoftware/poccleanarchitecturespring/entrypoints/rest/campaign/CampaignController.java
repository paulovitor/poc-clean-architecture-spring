package br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.campaign;

import br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.listcampaigns.ListCampaignsUseCase;
import br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.registercampaign.RegisterCampaignUseCase;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CampaignController {

    private final RegisterCampaignUseCase registerCampaignUseCase;
    private final ListCampaignsUseCase listCampaignsUseCase;
    private final CampaignDTOMapper campaignDTOMapper;

    @GetMapping("/campaigns")
    public ResponseEntity<List<CampaignDTO>> listCampaigns() {
        val campaigns = listCampaignsUseCase.listAll();
        return ResponseEntity.ok(campaigns.map(it -> campaignDTOMapper.toDTO(it)).toList());
    }

    @PostMapping("/campaigns")
    public ResponseEntity<Void> registerCampaign(@Valid final CampaignDTO campaignDTO) {
        registerCampaignUseCase.registerCampaign(campaignDTO);
        return ResponseEntity.noContent().build();
    }
}
