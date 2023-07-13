package com.bhanu.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="app_service_info")
public class UserEntity implements Serializable
{
    @Id
    @Column(name="alt_key")
    private int altKey;
    
    @Column(name="service_name")
    private String serviceName;
    
    @Column(name="url")
    private String url;
    
    @Column(name="status")
    private String status;
    
    @Column(name="created_date")
    private String createdDate;
    
    @Column(name="created_by")
    private String createdBy;
    
    @Column(name="modified_date")
    private String modifiedDate;
    
    @Column(name="modified_by")
    private String modifiedBy;

	public int getAltKey() {
		return altKey;
	}

	public void setAltKey(int altKey) {
		this.altKey = altKey;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Override
	public String toString() {
		return "UserEntity [altKey=" + altKey + ", serviceName=" + serviceName + ", url=" + url + ", status=" + status
				+ ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate
				+ ", modifiedBy=" + modifiedBy + "]";
	}
    
	
    
}
