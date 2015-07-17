package com.srija.selenium.HRMS;

import java.util.concurrent.TimeUnit;


import java.awt.JobAttributes.DefaultSelectionType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.thoughtworks.selenium.DefaultSelenium;

public class LoginTest {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws BiffException, IOException,
			InterruptedException, RowsExceededException, WriteException {
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444,
				"*firefox", "http://");
		selenium.start();
		selenium.open("http://demo.open-emr.org:2101/openemr");
		selenium.windowMaximize();

		FileInputStream fi = new FileInputStream(
				"D:\\selenium\\Aakruthi\\login.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet sh = wb.getSheet(0);

		FileOutputStream fo = new FileOutputStream(
				"D:\\selenium\\Aakruthi\\login-out.xls");
		WritableWorkbook wwb = Workbook.createWorkbook(fo);
		WritableSheet ws = wwb.createSheet("Result", 0);

		String a[][] = new String[sh.getRows()][sh.getColumns()];
		String str = null;

		for (int i = 1; i < 6; i++) {

			Thread.sleep(2000);

			// Login
			selenium.selectFrame("Login");
			selenium.type("name=authUser", sh.getCell(0, i).getContents());
			selenium.type("name=clearPass", sh.getCell(1, i).getContents());
			selenium.click("css=input.button.large");
			Thread.sleep(2000);
			if (selenium.isElementPresent("name=Title")) {
				// Logout
				selenium.selectWindow("name=Title");
				selenium.click("css=#logout_link > span");
				str = "Pass";
				System.out.println("Result=" + str);
			} else {
				str = "Fail";
				System.out.println("Result=" + str);
			}

			for (int j = 0; j < sh.getColumns(); j++) {
				a[i][j] = sh.getCell(j, i).getContents();
				Label l = new Label(j, i, a[i][j]);
				ws.addCell(l);
				System.out.println(a[i][j]);
			}
			Label result = new Label(2, i, str);
			ws.addCell(result);

		}
		Label res = new Label(2, 0, "Result");
		Label un = new Label(0, 0, "UserName");
		Label pw = new Label(1, 0, "Password");
		ws.addCell(res);
		ws.addCell(un);
		ws.addCell(pw);
		wwb.write();
		wwb.close();

		return;
	}
}