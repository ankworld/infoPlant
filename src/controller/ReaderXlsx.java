package controller;

import dataStruct.tbMYield;
import dataStruct.tbYield;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;

/**
 * Created by anukul on 2/14/16.
 */
class ReaderXlsx {

    ObservableList<tbYield> readToYield(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next();
        rowIterator.next();
        ObservableList<tbYield> LIST_Y = FXCollections.observableArrayList();

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next(); // For each row, iterate through each columns
            if (row.getCell(0) != null) {
                final Cell[] cell = new Cell[9];
                for (int i = 0; i < 9; i++) {
                    if (row.getCell(i) == null) cell[i] = row.createCell(i);
                    cell[i] = row.getCell(i);
                }

                DataFormatter dateFormatter = new DataFormatter(Locale.US);
                DataFormatter strFormatter = new DataFormatter();
                FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();
                LIST_Y.addAll(new tbYield(dateFormatter.formatCellValue(cell[0],formulaEvaluator), strFormatter.formatCellValue(cell[1],formulaEvaluator),
                        strFormatter.formatCellValue(cell[2],formulaEvaluator), strFormatter.formatCellValue(cell[3],formulaEvaluator), strFormatter.formatCellValue(cell[4],formulaEvaluator),
                        strFormatter.formatCellValue(cell[5],formulaEvaluator), strFormatter.formatCellValue(cell[6],formulaEvaluator), strFormatter.formatCellValue(cell[7],formulaEvaluator),
                        strFormatter.formatCellValue(cell[8],formulaEvaluator)));
            }
        }
        return LIST_Y;
    }

    ObservableList<tbMYield> readToMYield(File file, int iSheet) throws IOException {
        ObservableList<tbMYield> LIST_MY = FXCollections.observableArrayList();
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(iSheet);
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next();
        rowIterator.next();

        while (rowIterator.hasNext()){
            Row row = rowIterator.next(); // For each row, iterate through each columns
            if (row.getCell(0) != null){
                final Cell[] cell = new Cell[16];
                for (int i = 0; i < 16; i++) {
                    if (row.getCell(i) == null) cell[i] = row.createCell(i);
                    cell[i] = row.getCell(i);
                }
                DataFormatter strformatter = new DataFormatter();
                FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();
                LIST_MY.addAll(
                        new tbMYield(
                                strformatter.formatCellValue(cell[0],formulaEvaluator),
                                strformatter.formatCellValue(cell[1],formulaEvaluator),
                                strformatter.formatCellValue(cell[2],formulaEvaluator),
                                strformatter.formatCellValue(cell[3],formulaEvaluator),
                                strformatter.formatCellValue(cell[4],formulaEvaluator),
                                strformatter.formatCellValue(cell[5],formulaEvaluator),
                                strformatter.formatCellValue(cell[6],formulaEvaluator),
                                strformatter.formatCellValue(cell[7],formulaEvaluator),
                                strformatter.formatCellValue(cell[8],formulaEvaluator),
                                strformatter.formatCellValue(cell[9],formulaEvaluator),
                                strformatter.formatCellValue(cell[10],formulaEvaluator),
                                strformatter.formatCellValue(cell[11],formulaEvaluator),
                                strformatter.formatCellValue(cell[12],formulaEvaluator),
                                strformatter.formatCellValue(cell[13],formulaEvaluator),
                                strformatter.formatCellValue(cell[14],formulaEvaluator),
                                strformatter.formatCellValue(cell[15],formulaEvaluator)
                        )
                );
            }
        }
        LIST_MY.addAll(new tbMYield(
                "","","","","","","","","","","","","","","",""
        ));
        return LIST_MY;
    }

}
