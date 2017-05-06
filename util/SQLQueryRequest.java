package util;

public final class SQLQueryRequest {
	//Query for company
	public static final String GET_ALL_COMPANY_INFO = "SELECT * FROM COMPANY;";
	public static final String GET_COMPANY_BY_NAME_AND_PASSWORD = "SELECT * FROM COMPANY WHERE (COMP_NAME = ? && PASSWORD = ?);";
	public static final String GET_ALL_COMPANY_NAMES = "SELECT COMP_NAME FROM COMPANY;";
	public static final String GET_ALL_COMPANY_EMAILS = "SELECT EMAIL FROM COMPANY;";
	public static final String GET_COMPANY_BY_ID = "SELECT * FROM COMPANY WHERE ID = ?;";
	public static final String ADD_NEW_COMPANY_TO_DB = "INSERT INTO COMPANY(COMP_NAME, PASSWORD, EMAIL) VALUES(?, ?, ?);";
	public static final String GET_ALL_COMPANY_ID = "SELECT ID FROM COMPANY;";
	public static final String SET_NEW_COMPANY_NAME_BY_ID = "UPDATE COMPANY SET COMP_NAME = ? WHERE ID = ?;";
	public static final String SET_NEW_COMPANY_PASSWORD_BY_ID = "UPDATE COMPANY SET PASSWORD = ? WHERE ID = ?;";
	public static final String SET_NEW_COMPANY_EMAIL_BY_ID = "UPDATE COMPANY SET EMAIL = ? WHERE ID = ?;";
	public static final String DELETE_COMPANY_BY_ID = "DELETE FROM COMPANY WHERE ID = ?;";
	public static final String GET_COMPANY_ID_BY_NAME = "SELECT ID FROM COMPANY WHERE COMP_NAME = ?;";
	
	//Query for customer
	public static final String GET_ALL_CUSTOMER_INFO = "SELECT * FROM CUSTOMER;";
	public static final String GET_ALL_CUSTOMER_NAMES = "SELECT CUST_NAME FROM COUPONSYSTEM.CUSTOMER;";
	public static final String GET_ALL_CUSTOMER_INFO_BY_ID = "SELECT * FROM CUSTOMER WHERE ID = ?;";
	public static final String ADD_NEW_CUSTOMER_TO_DB = "INSERT INTO COUPONSYSTEM.CUSTOMER(CUST_NAME, PASSWORD) VALUES(?, ?);";
	public static final String GET_ALL_CUSTOMER_ID = "SELECT ID FROM CUSTOMER;";
	public static final String DELETE_CUSTOMER_BY_ID = "DELETE FROM CUSTOMER WHERE ID = ?;";
	public static final String SET_NEW_CUSTOMER_NAME_BY_ID = "UPDATE CUSTOMER SET CUST_NAME = ?  WHERE ID = ?;";
	public static final String SET_NEW_CUSTOMER_PASSWORD_BY_ID = "UPDATE CUSTOMER SET PASSWORD = ? WHERE ID = ?;";
	public static final String GET_CUSTOMER_BY_NAME_AND_PASSWORD = "SELECT * FROM CUSTOMER WHERE CUST_NAME = ? && PASSWORD = ?;";
	public static final String GET_CUSTOMER_ID_BY_NAME = "SELECT ID FROM CUSTOMER WHERE CUST_NAME = ?;";
	
	//Query for coupon
	
	public static final String GET_COUPON_ID_BY_TITLE = "SELECT ID FROM COUPON WHERE TITLE = ?;";
	public static final String GET_ALL_COUPON_INFO = "SELECT * FROM COUPON;";
	public static final String GET_ALL_COUPON_TITLES = "SELECT TITLE FROM COUPONSYSTEM.COUPON;";
	public static final String ADD_NEW_COUPON_TO_DB = 
			"INSERT INTO COUPONSYSTEM.COUPON(TITLE, START_DATE, END_DATE, AMOUNT, TYPE, MESSAGE, PRICE, IMAGE) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
	public static final String SET_COUPON_TITLE_BY_ID = "UPDATE COUPON SET TITLE = ? WHERE ID = ?;";
	public static final String SET_COUPON_START_DATE_BY_ID = "UPDATE COUPON SET START_DATE = ? WHERE ID = ?;";
	public static final String SET_COUPON_END_DATE_BY_ID = "UPDATE COUPON SET END_DATE = ? WHERE ID = ?;";
	public static final String SET_COUPON_AMOUNT_BY_ID = "UPDATE COUPON SET AMOUNT = ? WHERE ID = ?;";
	public static final String SET_COUPON_TYPE_BY_ID = "UPDATE COUPON SET TYPE = ? WHERE ID = ?;";
	public static final String SET_COUPON_MESSAGE_BY_ID = "UPDATE COUPON SET MESSAGE = ? WHERE ID = ?;";
	public static final String SET_COUPON_PRICE_BY_ID = "UPDATE COUPON SET PRICE = ? WHERE ID = ?;";
	public static final String SET_COUPON_IMAGE_BY_ID = "UPDATE COUPON SET IMAGE = ? WHERE ID = ?;";
	public static final String GET_ALL_COUPON_ID = "SELECT ID FROM COUPON;";
	public static final String GET_ALL_COUPON_ID_BY_TYPE = "SELECT ID FROM COUPON WHERE TYPE = ?;";
	public static final String GET_COUPON_BY_ID = "SELECT * FROM COUPON WHERE ID = ?;";
	public static final String REMOVE_COUPON_BY_ID = "DELETE FROM COUPON WHERE ID = ?;";
	public static final String GET_ALL_COUPON_ID_BY_END_DATE = "SELECT ID FROM COUPON WHERE END_DATE = ?;";
	//Query for company_coupon
	public static final String ADD_COUPON_AND_COMP_ID_TO_COMPANY_COUPON_JOIN_TABLE = "INSERT INTO COMPANY_COUPON(COMP_ID, COUPON_ID) VALUES (?, ?);";
	public static final String ADD_COMPANY_TO_COMPANY_COUPON_JOIN_TABLE = "INSERT INTO COMPANY_COUPON(COMP_ID) VALUES(?);";
	public static final String GET_COUPON_FROM_COMPANY_COUPON_JOIN_TABLE_BY_COMPANY_ID = "SELECT COUPON_ID FROM COMPANY_COUPON WHERE COMP_ID =?;";
	public static final String REMOVE_COMPANY_FROM_COMPANY_COUPON_JOIN_TABLE = "DELETE FROM COMPANY_COUPON WHERE COMP_ID = ?;";
	public static final String REMOVE_COUPON_FROM_COMPANY_COUPON_BY_COUPON_ID = "DELETE FROM COMPANY_COUPON WHERE COUPON_ID = ?;";
	
	//Query for customer_coupon
	public static final String ADD_CUSTOMER_TO_CUSTOMER_COUPON_JOIN_TABLE = "INSERT INTO CUSTOMER_COUPON(CUST_ID) VALUES(?);";
	public static final String ADD_COUPON_TO_CUSTOMER_COUPON_JOIN_TABLE_BY_CUSTOMER_ID = "INSERT INTO COUPONSYSTEM.CUSTOMER_COUPON(CUST_ID, COUPON_ID) VALUES(?, ?) ;";
	public static final String GET_COUPON_FROM_CUSTOMER_COUPON_JOIN_TABLE_BY_CUSTOMER_ID = "SELECT COUPON_ID FROM CUSTOMER_COUPON WHERE CUST_ID = ?;";
	public static final String REMOVE_CUSTOMER_FROM_CUSTOMER_COUPON_JOIN_TABLE = "DELETE FROM CUSTOMER_COUPON WHERE CUST_ID = ?;";
	public static final String REMOVE_COUPON_FROM_CUSTOMER_COUPON_BY_COUPON_ID = "DELETE FROM CUSTOMER_COUPON WHERE COUPON_ID = ?;";
}
