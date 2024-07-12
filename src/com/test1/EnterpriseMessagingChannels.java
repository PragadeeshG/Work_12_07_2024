package com.test1;

public class EnterpriseMessagingChannels {
	private Integer pointToPointChannelId;
	private String pubsubChannel;
	private boolean isApproved;
	private Integer deadLetterChannel;
	private String gauranteedDelivery;
	private String chanelAdapter;
	private Integer messagingBridge;
	private Integer messageCode;
	private String messageBus;
	private Integer changeDataCapture;
	private String encryptionMechanism;
	private String status;
	private String remarks;

	public EnterpriseMessagingChannels() {

	}

	public EnterpriseMessagingChannels(Integer pointToPointChannelId, String pubsubChannel, boolean isApproved,
			Integer deadLetterChannel, String gauranteedDelivery, String chanelAdapter, Integer messagingBridge,
			Integer messageCode, String messageBus, Integer changeDataCapture, String encryptionMechanism,
			String status, String remarks) {
		super();
		this.pointToPointChannelId = pointToPointChannelId;
		this.pubsubChannel = pubsubChannel;
		this.isApproved = isApproved;
		this.deadLetterChannel = deadLetterChannel;
		this.gauranteedDelivery = gauranteedDelivery;
		this.chanelAdapter = chanelAdapter;
		this.messagingBridge = messagingBridge;
		this.messageCode = messageCode;
		this.messageBus = messageBus;
		this.changeDataCapture = changeDataCapture;
		this.encryptionMechanism = encryptionMechanism;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getPointToPointChannelId() {
		return pointToPointChannelId;
	}

	public void setPointToPointChannelId(Integer pointToPointChannelId) {
		this.pointToPointChannelId = pointToPointChannelId;
	}

	public String getPubsubChannel() {
		return pubsubChannel;
	}

	public void setPubsubChannel(String pubsubChannel) {
		this.pubsubChannel = pubsubChannel;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public Integer getDeadLetterChannel() {
		return deadLetterChannel;
	}

	public void setDeadLetterChannel(Integer deadLetterChannel) {
		this.deadLetterChannel = deadLetterChannel;
	}

	public String getGauranteedDelivery() {
		return gauranteedDelivery;
	}

	public void setGauranteedDelivery(String gauranteedDelivery) {
		this.gauranteedDelivery = gauranteedDelivery;
	}

	public String getChanelAdapter() {
		return chanelAdapter;
	}

	public void setChanelAdapter(String chanelAdapter) {
		this.chanelAdapter = chanelAdapter;
	}

	public Integer getMessagingBridge() {
		return messagingBridge;
	}

	public void setMessagingBridge(Integer messagingBridge) {
		this.messagingBridge = messagingBridge;
	}

	public Integer getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(Integer messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessageBus() {
		return messageBus;
	}

	public void setMessageBus(String messageBus) {
		this.messageBus = messageBus;
	}

	public Integer getChangeDataCapture() {
		return changeDataCapture;
	}

	public void setChangeDataCapture(Integer changeDataCapture) {
		this.changeDataCapture = changeDataCapture;
	}

	public String getEncryptionMechanism() {
		return encryptionMechanism;
	}

	public void setEncryptionMechanism(String encryptionMechanism) {
		this.encryptionMechanism = encryptionMechanism;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
