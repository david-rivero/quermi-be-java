package com.app.entities.dto;

import java.util.Date;
import com.app.users.dto.ProfileDTO;

enum ContractStatus {
  NEW,
  IN_PROGRESS,
  ACTIVE,
  FINISHED
}

public class ContractDTO {
  public ProfileDTO patient;
  public ProfileDTO carePerson;
  public Date startDate;
  public Date endDate;
  public ContractStatus status;
}
