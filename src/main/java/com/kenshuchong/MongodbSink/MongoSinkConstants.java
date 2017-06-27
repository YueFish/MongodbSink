package com.kenshuchong.MongodbSink;

public class MongoSinkConstants {

	  /**
	   * Comma-separated list of hostname:port. If the port is not present the
	   * default port 27017 will be used.
	   */
	  public static final String HOSTNAMES = "hostNames";

	  /**
	   * Database name.
	   */
	  public static final String DATABASE = "database";

	  /**
	   * Collection name.
	   */
	  public static final String COLLECTION = "collection";

	  /**
	   * User name.
	   */
	  public static final String USER = "user";

	  /**
	   * Password.
	   */
	  public static final String PASSWORD = "password";

	  /**
	   * Maximum number of events the sink should take from the channel per
	   * transaction, if available. Defaults to 100.
	   */
	  public static final String BATCH_SIZE = "batchSize";

	  /**
	   * The default batch size.
	   */
	  public static final int DEFAULT_BATCH_SIZE = 100;
	  
	  public static final String AUTHENTICALTION ="authentication_enabled";
	  
	}