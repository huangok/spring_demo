package org.version.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.version.bean.CsVisit;
import org.version.service.CsVisitService;

import com.alibaba.fastjson.JSON;
import com.huangok.vo.HttpResult;

@RestController
@RequestMapping("/visit")
public class CsVisitController {

	Log log=LogFactory.getLog(CsVisitController.class);
	private CsVisitService csVisitService;
	@RequestMapping("/v1/add")
	public String addVisit(CsVisit csVisit) {
		if(null==csVisit) {
			HttpResult result=new HttpResult(HttpResult.Code.FAIL,"内容不能为空！",null);
			return JSON.toJSON(result).toString();
		}else {
			log.info(csVisit.toString());
			csVisitService.addVisitRecord(csVisit);
			HttpResult result=new HttpResult(HttpResult.Code.SUCCESS,"插入记录成功！",csVisit);
			return JSON.toJSON(result).toString();
		}
	}
	public CsVisitService getCsVisitService() {
		return csVisitService;
	}
	@Autowired
	public void setCsVisitService(CsVisitService csVisitService) {
		this.csVisitService = csVisitService;
	}
	
	
}
