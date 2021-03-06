package com.okay.family.common.bean.pubdata.request

import com.okay.family.common.bean.pubdata.PubDataDetailBean
import com.okay.family.fun.base.bean.AbstractBean

import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

class SavePubDataBean extends AbstractBean {

    private static final long serialVersionUID = 6293172188474L;

    @NotNull(message = "id不能为空")
    @Min(value = 1L)
    Integer id

    @NotNull(message = "uid不能为空")
    @Min(value = 1L)
    Integer uid

    @NotEmpty(message = "公共数据不能为空")
    List<PubDataDetailBean> list

}
