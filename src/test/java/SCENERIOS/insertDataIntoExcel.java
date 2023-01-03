package SCENERIOS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class insertDataIntoExcel {

	public static void main(String [] args) throws Throwable, IOException {


		File src = new File("./workbook.txt");
		FileInputStream fis = new FileInputStream(src);
		Workbook wb = WorkbookFactory.create(src);
		Sheet sheet = wb.getSheetAt(0);

		// write data into workbook

		sheet.getRow(1).getCell(1).setCellValue("name");
		FileOutputStream fos = new FileOutputStream(src);
		wb.write(fos);
		wb.close();

	}
	
}

	


