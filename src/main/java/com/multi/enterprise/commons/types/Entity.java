/**
 * 
 */
package com.multi.enterprise.commons.types;

/**
 * @author Robot
 *
 */
public interface Entity extends Persistable {

	public String getRevisionId();

	public void setRevisionId(String revisionId);

}
