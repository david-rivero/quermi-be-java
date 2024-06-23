package com.app.users.models;

import java.util.UUID;

@Entity
public class User {
  private UUID id;
  private String fullName;
  private String email;
  private String password;
}
