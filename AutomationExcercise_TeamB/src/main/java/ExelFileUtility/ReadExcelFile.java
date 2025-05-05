package ExelFileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import GenericRepository.FrameworkConstant;

/**
 * This Class is used to provied the utility methods to handle Excel File
 * 
 * 
 * 
 * 
 * @author hi
 **/
public class ReadExcelFile implements FrameworkConstant {
	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	public Workbook wb = null;

	public String readData(String LoginDetails, int row, int column) {
		// Step1:convert physical file into java readable object by using
		// FileInputStream class
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Step2: open the workbook by creating WB-factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Step3: Fetch the data
		String data = wb.getSheet(LoginDetails).getRow(row).getCell(column).toString();

		// Step4:Close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;

	}

	public void updateData(String sheet, int row, int column) {
		// Step1:convert physical file into java readable object by using
		// FileInputStream class
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Step2: open the workbook by creating WB-factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Step3: Write the data
		wb.getSheet(sheet).getRow(row).createCell(column).setCellValue("data");
		wb.getSheet(sheet).createRow(row).createCell(column).setCellValue("data");

		// Step4:convert java readable into physical file object by using
		// FileOutputStream class
		try {
			fos = new FileOutputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Step5:Save the data
		try {
			wb.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Step6:Close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeData(String sheet, int row, int column) {
		// Step1:convert physical file into java readable object by using
		// FileInputStream class
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Step2: open the workbook by creating WB-factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Step3: Write the data
		wb.createSheet(sheet).createRow(row).createCell(column).setCellValue("data");


		// Step4:convert java readable into physical file object by using
		// FileOutputStream class
		try {
			fos = new FileOutputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Step5:Save the data
		try {
			wb.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Step6:Close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
