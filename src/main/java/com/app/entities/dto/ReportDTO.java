package com.app.entities.dto;

import java.util.Date;
import java.util.UUID;

public class ReportDTO {
  public Date date;
  public String description;
  public Integer rate;
  public UUID fromProfileId;
  public UUID toProfileId;
}
