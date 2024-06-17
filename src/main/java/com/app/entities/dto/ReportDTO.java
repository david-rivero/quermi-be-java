package com.app.entities.dto;

import com.app.users.dto.ProfileDTO;

import java.util.Date;

public class ReportDTO {
  public Date date;
  public String description;
  public Integer rate;
  public ProfileDTO fromProfile;
  public ProfileDTO toProfile;
}
