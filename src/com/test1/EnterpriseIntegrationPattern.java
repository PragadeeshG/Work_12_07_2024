package com.test1;

public class EnterpriseIntegrationPattern {
	private String eipPatterns;
	private String messageChannel;
	private String mesage;
	private String pipesAndFilters;
	private String messageRouters;
	private String messageTranslator;
	private String messageEndpoint;
	private Integer transferStatus;
	private String downStreamApp;
	private String notifyData;
	private String entityState;

	public EnterpriseIntegrationPattern() {

	}

	public EnterpriseIntegrationPattern(String eipPatterns, String messageChannel, String mesage,
			String pipesAndFilters, String messageRouters, String messageTranslator, String messageEndpoint,
			Integer transferStatus, String downStreamApp, String notifyData, String entityState) {
		super();
		this.eipPatterns = eipPatterns;
		this.messageChannel = messageChannel;
		this.mesage = mesage;
		this.pipesAndFilters = pipesAndFilters;
		this.messageRouters = messageRouters;
		this.messageTranslator = messageTranslator;
		this.messageEndpoint = messageEndpoint;
		this.transferStatus = transferStatus;
		this.downStreamApp = downStreamApp;
		this.notifyData = notifyData;
		this.entityState = entityState;
	}

	public String getEipPatterns() {
		return eipPatterns;
	}

	public void setEipPatterns(String eipPatterns) {
		this.eipPatterns = eipPatterns;
	}

	public String getMessageChannel() {
		return messageChannel;
	}

	public void setMessageChannel(String messageChannel) {
		this.messageChannel = messageChannel;
	}

	public String getMesage() {
		return mesage;
	}

	public void setMesage(String mesage) {
		this.mesage = mesage;
	}

	public String getPipesAndFilters() {
		return pipesAndFilters;
	}

	public void setPipesAndFilters(String pipesAndFilters) {
		this.pipesAndFilters = pipesAndFilters;
	}

	public String getMessageRouters() {
		return messageRouters;
	}

	public void setMessageRouters(String messageRouters) {
		this.messageRouters = messageRouters;
	}

	public String getMessageTranslator() {
		return messageTranslator;
	}

	public void setMessageTranslator(String messageTranslator) {
		this.messageTranslator = messageTranslator;
	}

	public String getMessageEndpoint() {
		return messageEndpoint;
	}

	public void setMessageEndpoint(String messageEndpoint) {
		this.messageEndpoint = messageEndpoint;
	}

	public Integer getTransferStatus() {
		return transferStatus;
	}

	public void setTransferStatus(Integer transferStatus) {
		this.transferStatus = transferStatus;
	}

	public String getDownStreamApp() {
		return downStreamApp;
	}

	public void setDownStreamApp(String downStreamApp) {
		this.downStreamApp = downStreamApp;
	}

	public String getNotifyData() {
		return notifyData;
	}

	public void setNotifyData(String notifyData) {
		this.notifyData = notifyData;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
