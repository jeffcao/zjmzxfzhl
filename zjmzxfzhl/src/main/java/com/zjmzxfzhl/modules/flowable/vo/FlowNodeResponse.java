package com.zjmzxfzhl.modules.flowable.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowNodeResponse {
	/**
	 * 节点id
	 */
	private String nodeId;
	/**
	 * 节点名称
	 */
	private String nodeName;
	/**
	 * 执行人的id
	 */
	private String userId;
	/**
	 * 执行人姓名
	 */
	private String userName;

	/**
	 * 任务节点结束时间
	 */
	private Date endTime;

}
