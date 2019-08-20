package com.ofsoft.cms.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({ "serial", "unchecked" })
public abstract class BaseSysParam<M extends BaseSysParam<M>> extends Model<M>
		implements IBean {

	public M setParamId(Integer paramId) {
		set("param_id", paramId);
		return (M) this;
	}

	public Integer getParamId() {
		return getInt("param_id");
	}

	public M setParamName(String paramName) {
		set("param_name", paramName);
		return (M) this;
	}

	public String getParamName() {
		return getStr("param_name");
	}

	public M setParamValue(String paramValue) {
		set("param_value", paramValue);
		return (M) this;
	}

	public String getParamValue() {
		return getStr("param_value");
	}

	public M setParamDesc(String paramDesc) {
		set("param_desc", paramDesc);
		return (M) this;
	}

	public String getParamDesc() {
		return getStr("param_desc");
	}

	public M setParamGroup(String paramGroup) {
		set("param_group", paramGroup);
		return (M) this;
	}

	public String getParamGroup() {
		return getStr("param_group");
	}

	public M setParamType(String paramType) {
		set("param_type", paramType);
		return (M) this;
	}

	public String getParamType() {
		return getStr("param_type");
	}

	public M setIsShow(String isShow) {
		set("is_show", isShow);
		return (M) this;
	}

	public String getIsShow() {
		return getStr("is_show");
	}

	public M setStatus(String status) {
		set("status", status);
		return (M) this;
	}

	public String getStatus() {
		return getStr("status");
	}

	public M setRemark(String remark) {
		set("remark", remark);
		return (M) this;
	}

	public String getRemark() {
		return getStr("remark");
	}

}
