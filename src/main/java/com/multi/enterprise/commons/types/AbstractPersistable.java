/**
 * 
 */
package com.multi.enterprise.commons.types;

import java.util.Date;

/**
 * @author Robot
 *
 */
public abstract class AbstractPersistable implements Persistable {

	protected String id;
	private Long casValue;
	private Date createdDate;
	private Date modifiedDate;

	/**
	 * @return the id
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	@Override
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the casValue
	 */
	@Override
	public Long getCasValue() {
		return casValue;
	}

	/**
	 * @param casValue
	 *            the casValue to set
	 */
	@Override
	public void setCasValue(Long casValue) {
		this.casValue = casValue;
	}

	/**
	 * @return the createdDate
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	@Override
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
