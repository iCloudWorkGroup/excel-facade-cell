package com.excel.facade;

import com.excel.model.Cell;
import com.excel.model.complete.rows.ColOperate;
import com.excel.model.complete.rows.RowOperate;

import acmr.excel.pojo.ExcelSheet;


public interface CellFacade {
	/**
	 * 合并单元格
	 * 
	 * @param cell
	 *            Cell对象
	 */
	public void mergeCell(ExcelSheet excelSheet, Cell cell) ;
	/**
	 * 单元格拆分
	 * 
	 * @param excelSheet
	 *            ExcelSheet对象
	 * @param cell
	 *            Cell对象
	 */

	public void splitCell(ExcelSheet excelSheet, Cell cell);
	/**
	 * 增加行
	 * 
	 * @param sheet
	 *            SpreadSheet对象
	 * @param cell
	 *            Cell对象
	 */
	public void addRow(ExcelSheet excelSheet, RowOperate rowOperate);
	/**
	 * 删除行
	 * 
	 * @param sheet
	 *            SpreadSheet对象
	 * @param cell
	 *            Cell对象
	 */
	public void deleteRow(ExcelSheet excelSheet, RowOperate rowOperate);
	/**
	 * 增加列
	 * 
	 * @param sheet
	 *            SpreadSheet对象
	 * @param cell
	 *            Cell对象
	 */
	public void addCol(ExcelSheet excelSheet, ColOperate colOperate);
	/**
	 * 删除列
	 * 
	 * @param sheet
	 *            SpreadSheet对象
	 * @param cell
	 *            Cell对象
	 */
	public void deleteCol(ExcelSheet excelSheet, ColOperate colOperate);
	/**
	 * 调整列宽
	 * 
	 * @param excelSheet
	 *            SpreadSheet对象
	 * @param colAlais
	 *            列索引
	 * @param offset
	 *            偏移量
	 */
	public void controlColWidth(ExcelSheet excelSheet, String colAlias,String offset);
	/**
	 * 调整行高
	 * 
	 * @param excelSheet
	 *            SpreadSheet对象
	 * @param rowAlais
	 *            行索引
	 * @param offset
	 *            偏移量
	 */
	public void controlRowHeight(ExcelSheet excelSheet, String rowAlais, String offset);
}
