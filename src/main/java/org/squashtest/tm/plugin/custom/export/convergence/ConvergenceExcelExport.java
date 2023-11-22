/*
 * Copyright ANS 2020-2022
 */
package org.squashtest.tm.plugin.custom.export.convergence;

import java.io.File;
import java.util.Map;

import javax.inject.Inject;

import org.squashtest.tm.api.report.BasicDirectDownloadableReport;
import org.squashtest.tm.api.report.criteria.Criteria;
import org.squashtest.tm.plugin.custom.export.convergence.service.ExportGeneratorService;

/**
 * The Class SegurExcelReport.
 */
public class ConvergenceExcelExport extends BasicDirectDownloadableReport {

	@Inject
	ExportGeneratorService reportGeneratorService;

	@Override
	public File generateReport(Map<String, Criteria> criterias) {
		return reportGeneratorService.generateReport(criterias);
	}
}
