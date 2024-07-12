package com.test1;

public class EnterpriseMessageRouting {
	private Integer contentBasedRouter;
	private Integer messageFilter;
	private String dynamicRouter;
	private String recipientList;
	private String splittor;
	private String aggregator;
	private boolean resequenced;
	private String composedMessageProcessor;
	private String scaterGather;
	private String routingSlip;
	private String processManager;
	private String messageBroker;
	private String threads;
	private String throttler;
	private String sampling;
	private String loadBalancer;
	private boolean circuitBreaker;
	private String serviceCall;
	private String entityState;
	private String remarks;

	public EnterpriseMessageRouting() {

	}

	public EnterpriseMessageRouting(Integer contentBasedRouter, Integer messageFilter, String dynamicRouter,
			String recipientList, String splittor, String aggregator, boolean resequenced,
			String composedMessageProcessor, String scaterGather, String routingSlip, String processManager,
			String messageBroker, String threads, String throttler, String sampling, String loadBalancer,
			boolean circuitBreaker, String serviceCall, String entityState, String remarks) {
		super();
		this.contentBasedRouter = contentBasedRouter;
		this.messageFilter = messageFilter;
		this.dynamicRouter = dynamicRouter;
		this.recipientList = recipientList;
		this.splittor = splittor;
		this.aggregator = aggregator;
		this.resequenced = resequenced;
		this.composedMessageProcessor = composedMessageProcessor;
		this.scaterGather = scaterGather;
		this.routingSlip = routingSlip;
		this.processManager = processManager;
		this.messageBroker = messageBroker;
		this.threads = threads;
		this.throttler = throttler;
		this.sampling = sampling;
		this.loadBalancer = loadBalancer;
		this.circuitBreaker = circuitBreaker;
		this.serviceCall = serviceCall;
		this.entityState = entityState;
		this.remarks = remarks;
	}

	public Integer getContentBasedRouter() {
		return contentBasedRouter;
	}

	public void setContentBasedRouter(Integer contentBasedRouter) {
		this.contentBasedRouter = contentBasedRouter;
	}

	public Integer getMessageFilter() {
		return messageFilter;
	}

	public void setMessageFilter(Integer messageFilter) {
		this.messageFilter = messageFilter;
	}

	public String getDynamicRouter() {
		return dynamicRouter;
	}

	public void setDynamicRouter(String dynamicRouter) {
		this.dynamicRouter = dynamicRouter;
	}

	public String getRecipientList() {
		return recipientList;
	}

	public void setRecipientList(String recipientList) {
		this.recipientList = recipientList;
	}

	public String getSplittor() {
		return splittor;
	}

	public void setSplittor(String splittor) {
		this.splittor = splittor;
	}

	public String getAggregator() {
		return aggregator;
	}

	public void setAggregator(String aggregator) {
		this.aggregator = aggregator;
	}

	public boolean isResequenced() {
		return resequenced;
	}

	public void setResequenced(boolean resequenced) {
		this.resequenced = resequenced;
	}

	public String getComposedMessageProcessor() {
		return composedMessageProcessor;
	}

	public void setComposedMessageProcessor(String composedMessageProcessor) {
		this.composedMessageProcessor = composedMessageProcessor;
	}

	public String getScaterGather() {
		return scaterGather;
	}

	public void setScaterGather(String scaterGather) {
		this.scaterGather = scaterGather;
	}

	public String getRoutingSlip() {
		return routingSlip;
	}

	public void setRoutingSlip(String routingSlip) {
		this.routingSlip = routingSlip;
	}

	public String getProcessManager() {
		return processManager;
	}

	public void setProcessManager(String processManager) {
		this.processManager = processManager;
	}

	public String getMessageBroker() {
		return messageBroker;
	}

	public void setMessageBroker(String messageBroker) {
		this.messageBroker = messageBroker;
	}

	public String getThreads() {
		return threads;
	}

	public void setThreads(String threads) {
		this.threads = threads;
	}

	public String getThrottler() {
		return throttler;
	}

	public void setThrottler(String throttler) {
		this.throttler = throttler;
	}

	public String getSampling() {
		return sampling;
	}

	public void setSampling(String sampling) {
		this.sampling = sampling;
	}

	public String getLoadBalancer() {
		return loadBalancer;
	}

	public void setLoadBalancer(String loadBalancer) {
		this.loadBalancer = loadBalancer;
	}

	public boolean isCircuitBreaker() {
		return circuitBreaker;
	}

	public void setCircuitBreaker(boolean circuitBreaker) {
		this.circuitBreaker = circuitBreaker;
	}

	public String getServiceCall() {
		return serviceCall;
	}

	public void setServiceCall(String serviceCall) {
		this.serviceCall = serviceCall;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
