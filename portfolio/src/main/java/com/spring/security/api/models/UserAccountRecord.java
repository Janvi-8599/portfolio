package com.spring.security.api.models;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class UserAccountRecord {
	@Id
	private BigInteger id;

	@Indexed
	private String userId;

	@Indexed
	private String username;

	private String password;

	private String profilePicFileName;

	private boolean isEnabled;

	private boolean isAccountNonExpired;

	private boolean isCredentialsNonExpired;

	private boolean isAccountNonLocked;
	
	private Boolean isTwoFactorAuth;
	private String fusionScrete;
	private String fusionBase32Encode;

	public BigInteger getId() {

		return this.id;
	}

	public void setDi(BigInteger id) {

		this.id = id;
	}

	public UserAccountRecord(String username, String password, boolean isEnabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked) {
		this.username = username;
		this.password = password;
		this.isEnabled = isEnabled;
		this.isAccountNonExpired = accountNonExpired;
		this.isCredentialsNonExpired = credentialsNonExpired;
		this.isAccountNonLocked = accountNonLocked;
	}

	public UserAccountRecord() {
	}

	public String getUserId() {

		return this.userId;
	}

	public void setUserId(String userId) {

		this.userId = userId;
	}

	public String getPassword() {

		return this.password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	public String getUsername() {

		return this.username;
	}

	public void setUsername(String username) {

		this.username = username;
	}

	public boolean getIsAccountNonExpired() {

		return this.isAccountNonExpired;
	}

	public void setIsAccountNonExpired(boolean isAccountNonExpired) {

		this.isAccountNonExpired = isAccountNonExpired;
	}

	public boolean getIsAccountNonLocked() {

		return this.isAccountNonLocked;
	}

	public void setIsAccountNonLocked(boolean isAccountNonLocked) {

		this.isAccountNonLocked = isAccountNonLocked;
	}

	public boolean getIsCredentialsNonExpired() {

		return this.isCredentialsNonExpired;
	}

	public void setIsCredentialsNonExpired(boolean isCredentialsNonExpired) {

		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	public boolean getIsEnabled() {

		return this.isEnabled;
	}

	public void setIsEnabled(boolean isEnabled) {

		this.isEnabled = isEnabled;
	}

	public String getProfilePicFileName() {

		return profilePicFileName;
	}

	public void setProfilePicFileName(String profileFileName) {

		this.profilePicFileName = profileFileName;
	}

	public Boolean getIsTwoFactorAuth() {
		return isTwoFactorAuth;
	}

	public void setIsTwoFactorAuth(Boolean isTwoFactorAuth) {
		this.isTwoFactorAuth = isTwoFactorAuth;
	}

	public String getFusionScrete() {
		return fusionScrete;
	}

	public void setFusionScrete(String fusionScrete) {
		this.fusionScrete = fusionScrete;
	}

	public String getFusionBase32Encode() {
		return fusionBase32Encode;
	}

	public void setFusionBase32Encode(String fusionBase32Encode) {
		this.fusionBase32Encode = fusionBase32Encode;
	}

	@Override
	public String toString() {
		return "UserAccountRecord [id=" + id + ", userId=" + userId + ", username=" + username + ", password="
				+ password + ", profilePicFileName=" + profilePicFileName + ", isEnabled=" + isEnabled
				+ ", isAccountNonExpired=" + isAccountNonExpired + ", isCredentialsNonExpired="
				+ isCredentialsNonExpired + ", isAccountNonLocked=" + isAccountNonLocked + ", isTwoFactorAuth="
				+ isTwoFactorAuth + ", fusionScrete=" + fusionScrete + ", fusionBase32Encode=" + fusionBase32Encode
				+ "]";
	}
}
