package org.hibernate.HibernateProjectFirst;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class File {
	
	@Override
	public String toString() {
		return "File [fileId=" + fileId + ", fileName=" + fileName + ", fileInfo=" + fileInfo + "]";
	}
	@Id
	@Column(name="file_id")
	private int fileId;
	@Column(name="file_name")
	private String fileName;
	@Column(name="file_info")
	private String fileInfo;
	
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileInfo() {
		return fileInfo;
	}
	public void setFileInfo(String fileInfo) {
		this.fileInfo = fileInfo;
	}
	public File(int fileId, String fileName, String fileInfo) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
		this.fileInfo = fileInfo;
	}
	public File() {
		super();
	}

}
