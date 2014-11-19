package com.target.trak.system.web.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.target.trak.system.web.models.landing.Alert;
import com.target.trak.system.web.models.landing.MatterStatusBreakdownChart;

@Controller
public class HomepageController {

	// /context-root/app/homepage/index.htm
	
	@RequestMapping(value = "/index.htm", method=RequestMethod.GET)
	public String getHomepage() {
		return "homepage";
	}
	
	@RequestMapping(value = "/homepage/getMatterStatusBreakdown.json", method=RequestMethod.GET)
	public @ResponseBody Map<String, Object> getMatterStatusBreakdown() {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("data", buildChartList());
		return data;
	}
	
	
	@RequestMapping(value = "/homepage/getHomepageAlerts.json", method=RequestMethod.GET)
	public @ResponseBody Map<String, Object> getAlerts() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", buildHomepageAlerts());
		map.put("success", Boolean.TRUE);
		return map;
	}
	
	private List<Alert> buildHomepageAlerts() {
		List<Alert> alerts = new ArrayList<Alert>();
		alerts.add(new Alert(1, "Matter", "Matter #2124 Updated by admin"));
		alerts.add(new Alert(2, "Service", "Service #9080 cancelled by client"));
		alerts.add(new Alert(3, "Court Filing", "Filing #4394 missed"));
		alerts.add(new Alert(4, "Matter", "Matter #4124 updated by admin"));
		alerts.add(new Alert(5, "Court Filing", "Filing completed successfully"));
		alerts.add(new Alert(6, "Matter", "Matter #6124 Updated by admin"));
		alerts.add(new Alert(7, "Matter", "Matter #5164 in-activated by admin"));
		/*alerts.add(new Alert(8, "Service", "Service #788 updated by client"));
		alerts.add(new Alert(16, "Matter", "Matter #6124 Updated by admin"));
		alerts.add(new Alert(17, "Matter", "Matter #5164 in-activated by admin"));
		alerts.add(new Alert(18, "Service", "Service #788 updated by client"));*/
		return alerts;
	}
	
	private List<MatterStatusBreakdownChart> buildChartList() {
		List<MatterStatusBreakdownChart> list = new ArrayList<MatterStatusBreakdownChart>();
		
		MatterStatusBreakdownChart open = buildChartData("Open", 78, "20%", "Open (78)");
		MatterStatusBreakdownChart inactive = buildChartData("In-active", 28, "15%", "In-active (28)");
		MatterStatusBreakdownChart completed = buildChartData("Completed", 108, "36%", "Completed (108)");
		MatterStatusBreakdownChart created = buildChartData("Created", 20, "15%", "Created (20)");
		MatterStatusBreakdownChart inProgress = buildChartData("In-Progress", 10, "14%", "In-Progress (10)");
		
		list.add(open);
		list.add(inactive);
		list.add(completed);
		list.add(created);
		list.add(inProgress);
		return list;
	}

	private MatterStatusBreakdownChart buildChartData(String status, int count, String percentage, String label) {
		MatterStatusBreakdownChart chart = new MatterStatusBreakdownChart();
		chart.setStatus(status);
		chart.setCount(count);
		chart.setPercentage(percentage);
		chart.setLabel(label);
		return chart;
	}
}
