package com.kodilla.good.patterns.challenges.AlleGit;

public class ProductOrderService {
    private InformationService informationService;
    private BoughtService boughtService;
    private BoughtRepository boughtRepository;

    public ProductOrderService(final InformationService informationService,
                           final BoughtService boughtService,
                           final BoughtRepository rentalRepository) {
        this.informationService = informationService;
        this.boughtService = boughtService;
        this.boughtRepository = rentalRepository;
    }

    public BoughtDto process(final BoughtRequest boughtRequest) {
        boolean isRented = boughtService.bought(boughtRequest.getUser(), boughtRequest.getBoughtTime());

        if(isRented) {
            informationService.inform(boughtRequest.getUser());
            boughtRepository.createBought(boughtRequest.getUser(), boughtRequest.getBoughtTime());
            return new BoughtDto(boughtRequest.getUser(), true);
        } else {
            return new BoughtDto(boughtRequest.getUser(), false);
        }
    }
}
