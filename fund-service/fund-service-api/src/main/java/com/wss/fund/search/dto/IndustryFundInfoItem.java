package com.wss.fund.search.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 行业信息
 */
@Setter
@Getter
public class IndustryFundInfoItem {
	/**
	 * 行业类型
	 */
	@JsonProperty("TTYPE")
	private String industryType;
	/**
	 * 行业类型中文
	 */
	@JsonProperty("TTYPENAME")
	private String industryTypeName;
}