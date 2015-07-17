package com.srija.selenium.HRMS;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class CreateExcel {

	public static void main(String[] args) throws IOException,
			RowsExceededException, WriteException, FileNotFoundException {
		
		FileOutputStream fo = new FileOutputStream(
				"E:\\Selenium\\sample.xls");
		WritableWorkbook wwb = Workbook.createWorkbook(fo);
		WritableSheet ws = wwb.createSheet("Testing", 0);

		Label l1 = new Label(0, 0, "Username");
		ws.addCell(l1);

		Label l2 = new Label(1, 0, "Password");
		ws.addCell(l2);

		wwb.write();
		wwb.close();

	}

}
