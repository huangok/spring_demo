package org.version.service.imp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.version.bean.CsVisit;
import org.version.service.CsVisitService;

/**
 * 对数据库的实现
 * @author issuser
 *
 */
@Service("csVisitService")
public class DBCsVisitService implements CsVisitService {

	Log log=LogFactory.getLog(DBCsVisitService.class);
	@Override
	public Integer addVisitRecord(CsVisit csVisit) {
		log.info("To add visit record to db....");
		return null;
	}

}
