package com.sachin.ood.parkinglot.dtos;

public class UpdateParkingLotRequestDto extends ResponseDto {

  private   Long id;
  private   String Address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
