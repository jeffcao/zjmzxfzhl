package com.zjmzxfzhl.modules.flowable.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdentityRequest {
	private String processDefinitionId;
	private String taskId;
	private String identityId;
	private String identityType;
}
