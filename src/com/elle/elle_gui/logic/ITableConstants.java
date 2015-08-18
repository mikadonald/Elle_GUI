/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elle.elle_gui.logic;

/**
 * ITableConstants
 * This interface stores all the table constants
 * @author Carlos Igreja
 * @since June 10, 2015
 * @version 0.6.3
 */
public interface ITableConstants {
    
    public static final String POSITIONS_TABLE_NAME = "positions";
    public static final String TRADES_TABLE_NAME = "trades";
    public static final String ALLOCATIONS_TABLE_NAME = "allocations";
    
    // column header name constants
    public static final String SYMBOL_COLUMN_NAME = "Symbol";
    
    // column width percent constants
    public static final float[] COL_WIDTH_PER_POSITIONS = {35, 65, 80, 70, 99, 99};
    public static final float[] COL_WIDTH_PER_TRADES = {35, 65, 80, 100, 160, 120, 123};
    public static final float[] COL_WIDTH_PER_ALLOCATIONS = {35, 65, 80, 70, 99, 99};
    
    // search fields for the comboBox for each table
    public static final String[] ASSIGNMENTS_SEARCH_FIELDS = {"Symbol","Analyst"};
    public static final String[] REPORTS_SEARCH_FIELDS = {"Symbol","Author"};
    public static final String[] ARCHIVE_SEARCH_FIELDS = {"Symbol","Analyst"};
    
    // batch edit combobox selections for each table
    public static final String[] ASSIGNMENTS_BATCHEDIT_CB_FIELDS = {"analyst", "priority", "dateAssigned", "notes", "symbol"};
    public static final String[] REPORTS_BATCHEDIT_CB_FIELDS = {"author", "analysisDate", "notes", "symbol"};
    public static final String[] ARCHIVE_BATCHEDIT_CB_FIELDS = {"analyst", "priority", "dateAssigned", "notes", "symbol"};
}
