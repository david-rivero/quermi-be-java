package com.app.users.dto;

import java.util.Date;
import com.app.users.dto.ProfileLanguageDTO;
import com.app.users.dto.ProfileServiceDTO;
import com.app.users.dto.UserDTO;

enum Role {
  CAREGIVER, PATIENT
}

public class ProfileDTO {
  public UserDTO user;
  public Role role;
  public String profilePhotoURI;
  public String docIDPhotoURI;
  public Date birth; // Use Joda time
  public ProfileServiceDTO[] services;
  public String description;
  public String hourFrom;
  public String hourTo;
  public ProfileLanguageDTO[] languages;
  public String address;
  public String phone;
  public Boolean status;
  public String paymentId;
  public Boolean verifiedProfile;
}
