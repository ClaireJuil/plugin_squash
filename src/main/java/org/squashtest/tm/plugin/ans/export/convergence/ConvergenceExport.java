/*
 * Copyright ANS 2020-2022
 */
package org.squashtest.tm.plugin.ans.export.convergence;

import java.io.File;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.squashtest.tm.api.report.BasicDirectDownloadableReport;
import org.squashtest.tm.api.report.criteria.Criteria;
import org.squashtest.tm.plugin.ans.export.convergence.service.ReportGeneratorService;

/**
 * The Class SegurExcelReport.
 */
public class ConvergenceExport extends BasicDirectDownloadableReport {

	@Inject
	@Qualifier("export.convergence.reportGeneratorServiceImpl")
	ReportGeneratorService reportGeneratorService;

	@Override
	public File generateReport(Map<String, Criteria> criterias) {
		return reportGeneratorService.generateReport(criterias);
	}
}
