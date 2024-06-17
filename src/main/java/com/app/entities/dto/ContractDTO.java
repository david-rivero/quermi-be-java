package com.app.entities.dto;

import java.util.Date;
import java.util.UUID;

enum ContractStatus {
  NEW,
  IN_PROGRESS,
  ACTIVE,
  FINISHED
}

public class ContractDTO {
  public UUID patientId;
  public UUID carePersonId;
  public Date startDate;
  public Date endDate;
  public ContractStatus status;
}
