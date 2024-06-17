package com.app.entities.dto;

import java.util.Date;
import java.util.UUID;

public class TODOTaskDTO {
  public String title;
  public String description;
  public Date created;
  public Boolean solved;
  public UUID fromProfileId;
  public UUID toProfileId;
}
