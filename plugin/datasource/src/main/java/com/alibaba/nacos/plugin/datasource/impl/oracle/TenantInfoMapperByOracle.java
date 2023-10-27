package com.alibaba.nacos.plugin.datasource.impl.oracle;

import com.alibaba.nacos.plugin.datasource.constants.DataSourceConstant;
import com.alibaba.nacos.plugin.datasource.constants.TableConstant;
import com.alibaba.nacos.plugin.datasource.mapper.TenantInfoMapper;

/**
 * @author ZhongMy
 **/
public class TenantInfoMapperByOracle extends OracleAbstractMapper implements TenantInfoMapper {

	@Override
	public String getTableName() {
		return TableConstant.TENANT_INFO;
	}

	@Override
	public String getDataSource() {
		return DataSourceConstant.ORACLE;
	}

}
