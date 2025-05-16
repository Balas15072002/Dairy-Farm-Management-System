package com.bala.lumen.features.orders.distributed.details;

public class DetailsView {
    private final DetailsModel model;

    public DetailsView(){
        model=new DetailsModel(this);
    }
}
