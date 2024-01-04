package com.wss.fund.search.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FundDTO{
	/**
	 * 基金代码
	 */
	@JsonProperty("CODE")
	private String fundCode;
	/**
	 * 分类描述
	 */
	@JsonProperty("CATEGORYDESC")
	private String categoryDesc;
	/**
	 * 分类
	 */
	@JsonProperty("CATEGORY")
	private int category;

	@JsonProperty("BACKCODE")
	private String backCode;

	@JsonProperty("JP")
	private String jP;

	/**
	 * 持有者
	 */
	@JsonProperty("StockHolder")
	private String stockHolder;

	@JsonProperty("MatchCount")
	private int matchCount;

	@JsonProperty("FundBaseInfo")
	private FundBaseInfo fundBaseInfo;

	@JsonProperty("ZTJJInfo")
	private List<IndustryFundInfoItem> zTJJInfo;

	@JsonProperty("_id")
	private String id;

	@JsonProperty("STOCKMARKET")
	private String stockMarket;
	/**
	 * 搜索优先级
	 */
	@JsonProperty("SEARCHWEIGHT")
	private String searchWeight;
	/**
	 * 搜索优先级
	 */
	@JsonProperty("NEWTEXCH")
	private String newTexch;

	@JsonProperty("NAME")
	private String name;
}