package com.app.payments.dto;

import com.app.users.dto.ProfileDTO;

public class PaymentRegisterDTO {
  public ProfileDTO profile;
  public String paymentId;
  public Integer last4DigitsCard;
  public Integer expMonth;
  public Integer expYear;
  public String cardType;
}
