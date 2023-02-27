// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ADD=12, AFTER=13, ALL=14, ALTER=15, ANALYZE=16, AND=17, 
		ANTI=18, ANY=19, ARCHIVE=20, ARRAY=21, AS=22, ASC=23, AT=24, AUTHORIZATION=25, 
		BETWEEN=26, BOTH=27, BUCKET=28, BUCKETS=29, BY=30, CACHE=31, CASCADE=32, 
		CASE=33, CAST=34, CHANGE=35, CHECK=36, CLEAR=37, CLUSTER=38, CLUSTERED=39, 
		CODEGEN=40, COLLATE=41, COLLECTION=42, COLUMN=43, COLUMNS=44, COMMENT=45, 
		COMMIT=46, COMPACT=47, COMPACTIONS=48, COMPUTE=49, CONCATENATE=50, CONSTRAINT=51, 
		COST=52, CREATE=53, CROSS=54, CUBE=55, CURRENT=56, CURRENT_DATE=57, CURRENT_TIME=58, 
		CURRENT_TIMESTAMP=59, CURRENT_USER=60, DATA=61, DATABASE=62, DATABASES=63, 
		DBPROPERTIES=64, DEFINED=65, DELETE=66, DELIMITED=67, DESC=68, DESCRIBE=69, 
		DFS=70, DIRECTORIES=71, DIRECTORY=72, DISTINCT=73, DISTRIBUTE=74, DIV=75, 
		DROP=76, ELSE=77, END=78, ESCAPE=79, ESCAPED=80, EXCEPT=81, EXCHANGE=82, 
		EXISTS=83, EXPLAIN=84, EXPORT=85, EXTENDED=86, EXTERNAL=87, EXTRACT=88, 
		FALSE=89, FETCH=90, FIELDS=91, FILTER=92, FILEFORMAT=93, FIRST=94, FOLLOWING=95, 
		FOR=96, FOREIGN=97, FORMAT=98, FORMATTED=99, FROM=100, FULL=101, FUNCTION=102, 
		FUNCTIONS=103, GLOBAL=104, GRANT=105, GROUP=106, GROUPING=107, HAVING=108, 
		IF=109, IGNORE=110, IMPORT=111, IN=112, INDEX=113, INDEXES=114, INNER=115, 
		INPATH=116, INPUTFORMAT=117, INSERT=118, INTERSECT=119, INTERVAL=120, 
		INTO=121, IS=122, ITEMS=123, JOIN=124, KEYS=125, LAST=126, LATERAL=127, 
		LAZY=128, LEADING=129, LEFT=130, LIKE=131, LIMIT=132, LINES=133, LIST=134, 
		LOAD=135, LOCAL=136, LOCATION=137, LOCK=138, LOCKS=139, LOGICAL=140, MACRO=141, 
		MAP=142, MATCHED=143, MERGE=144, MSCK=145, NAMESPACE=146, NAMESPACES=147, 
		NATURAL=148, NO=149, NOT=150, NULL=151, NULLS=152, OF=153, ON=154, ONLY=155, 
		OPTION=156, OPTIONS=157, OR=158, ORDER=159, OUT=160, OUTER=161, OUTPUTFORMAT=162, 
		OVER=163, OVERLAPS=164, OVERLAY=165, OVERWRITE=166, PARTITION=167, PARTITIONED=168, 
		PARTITIONS=169, PERCENTLIT=170, PIVOT=171, PLACING=172, POSITION=173, 
		PRECEDING=174, PRIMARY=175, PRINCIPALS=176, PROPERTIES=177, PURGE=178, 
		QUERY=179, RANGE=180, RECORDREADER=181, RECORDWRITER=182, RECOVER=183, 
		REDUCE=184, REFERENCES=185, REFRESH=186, RENAME=187, REPAIR=188, REPLACE=189, 
		RESET=190, RESTRICT=191, REVOKE=192, RIGHT=193, RLIKE=194, ROLE=195, ROLES=196, 
		ROLLBACK=197, ROLLUP=198, ROW=199, ROWS=200, SCHEMA=201, SELECT=202, SEMI=203, 
		SEPARATED=204, SERDE=205, SERDEPROPERTIES=206, SESSION_USER=207, SET=208, 
		SETMINUS=209, SETS=210, SHOW=211, SKEWED=212, SOME=213, SORT=214, SORTED=215, 
		START=216, STATISTICS=217, STORED=218, STRATIFY=219, STRUCT=220, SUBSTR=221, 
		SUBSTRING=222, TABLE=223, TABLES=224, TABLESAMPLE=225, TBLPROPERTIES=226, 
		TEMPORARY=227, TERMINATED=228, THEN=229, TIME=230, TO=231, TOUCH=232, 
		TRAILING=233, TRANSACTION=234, TRANSACTIONS=235, TRANSFORM=236, TRIM=237, 
		TRUE=238, TRUNCATE=239, TYPE=240, UNARCHIVE=241, UNBOUNDED=242, UNCACHE=243, 
		UNION=244, UNIQUE=245, UNKNOWN=246, UNLOCK=247, UNSET=248, UPDATE=249, 
		USE=250, USER=251, USING=252, VALUES=253, VIEW=254, VIEWS=255, WHEN=256, 
		WHERE=257, WINDOW=258, WITH=259, ZONE=260, EQ=261, NSEQ=262, NEQ=263, 
		NEQJ=264, LT=265, LTE=266, GT=267, GTE=268, PLUS=269, MINUS=270, ASTERISK=271, 
		SLASH=272, PERCENT=273, TILDE=274, AMPERSAND=275, PIPE=276, CONCAT_PIPE=277, 
		HAT=278, STRING=279, BIGINT_LITERAL=280, SMALLINT_LITERAL=281, TINYINT_LITERAL=282, 
		INTEGER_VALUE=283, EXPONENT_VALUE=284, DECIMAL_VALUE=285, FLOAT_LITERAL=286, 
		DOUBLE_LITERAL=287, BIGDECIMAL_LITERAL=288, IDENTIFIER=289, BACKQUOTED_IDENTIFIER=290, 
		SIMPLE_COMMENT=291, BRACKETED_COMMENT=292, WS=293, UNRECOGNIZED=294;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_configKey = 8, RULE_configValue = 9, RULE_unsupportedHiveNativeCommands = 10, 
		RULE_createTableHeader = 11, RULE_replaceTableHeader = 12, RULE_bucketSpec = 13, 
		RULE_skewSpec = 14, RULE_locationSpec = 15, RULE_commentSpec = 16, RULE_query = 17, 
		RULE_insertInto = 18, RULE_partitionSpecLocation = 19, RULE_partitionSpec = 20, 
		RULE_partitionVal = 21, RULE_namespace = 22, RULE_describeFuncName = 23, 
		RULE_describeColName = 24, RULE_ctes = 25, RULE_namedQuery = 26, RULE_tableProvider = 27, 
		RULE_createTableClauses = 28, RULE_tablePropertyList = 29, RULE_tableProperty = 30, 
		RULE_tablePropertyKey = 31, RULE_tablePropertyValue = 32, RULE_constantList = 33, 
		RULE_nestedConstantList = 34, RULE_createFileFormat = 35, RULE_fileFormat = 36, 
		RULE_storageHandler = 37, RULE_resource = 38, RULE_dmlStatementNoWith = 39, 
		RULE_queryOrganization = 40, RULE_multiInsertQueryBody = 41, RULE_queryTerm = 42, 
		RULE_queryPrimary = 43, RULE_sortItem = 44, RULE_fromStatement = 45, RULE_fromStatementBody = 46, 
		RULE_querySpecification = 47, RULE_transformClause = 48, RULE_selectClause = 49, 
		RULE_setClause = 50, RULE_matchedClause = 51, RULE_notMatchedClause = 52, 
		RULE_matchedAction = 53, RULE_notMatchedAction = 54, RULE_assignmentList = 55, 
		RULE_assignment = 56, RULE_whereClause = 57, RULE_havingClause = 58, RULE_hint = 59, 
		RULE_hintStatement = 60, RULE_fromClause = 61, RULE_aggregationClause = 62, 
		RULE_groupingSet = 63, RULE_pivotClause = 64, RULE_pivotColumn = 65, RULE_pivotValue = 66, 
		RULE_lateralView = 67, RULE_setQuantifier = 68, RULE_relation = 69, RULE_joinRelation = 70, 
		RULE_joinType = 71, RULE_joinCriteria = 72, RULE_sample = 73, RULE_sampleMethod = 74, 
		RULE_identifierList = 75, RULE_identifierSeq = 76, RULE_orderedIdentifierList = 77, 
		RULE_orderedIdentifier = 78, RULE_identifierCommentList = 79, RULE_identifierComment = 80, 
		RULE_relationPrimary = 81, RULE_inlineTable = 82, RULE_functionTable = 83, 
		RULE_tableAlias = 84, RULE_rowFormat = 85, RULE_multipartIdentifierList = 86, 
		RULE_multipartIdentifier = 87, RULE_tableIdentifier = 88, RULE_functionIdentifier = 89, 
		RULE_namedExpression = 90, RULE_namedExpressionSeq = 91, RULE_partitionFieldList = 92, 
		RULE_partitionField = 93, RULE_transform = 94, RULE_transformArgument = 95, 
		RULE_expression = 96, RULE_booleanExpression = 97, RULE_predicate = 98, 
		RULE_valueExpression = 99, RULE_primaryExpression = 100, RULE_constant = 101, 
		RULE_comparisonOperator = 102, RULE_arithmeticOperator = 103, RULE_predicateOperator = 104, 
		RULE_booleanValue = 105, RULE_interval = 106, RULE_errorCapturingMultiUnitsInterval = 107, 
		RULE_multiUnitsInterval = 108, RULE_errorCapturingUnitToUnitInterval = 109, 
		RULE_unitToUnitInterval = 110, RULE_intervalValue = 111, RULE_colPosition = 112, 
		RULE_dataType = 113, RULE_qualifiedColTypeWithPositionList = 114, RULE_qualifiedColTypeWithPosition = 115, 
		RULE_colTypeList = 116, RULE_colType = 117, RULE_complexColTypeList = 118, 
		RULE_complexColType = 119, RULE_whenClause = 120, RULE_windowClause = 121, 
		RULE_namedWindow = 122, RULE_windowSpec = 123, RULE_windowFrame = 124, 
		RULE_frameBound = 125, RULE_qualifiedNameList = 126, RULE_functionName = 127, 
		RULE_qualifiedName = 128, RULE_errorCapturingIdentifier = 129, RULE_errorCapturingIdentifierExtra = 130, 
		RULE_identifier = 131, RULE_strictIdentifier = 132, RULE_quotedIdentifier = 133, 
		RULE_number = 134, RULE_alterColumnAction = 135, RULE_ansiNonReserved = 136, 
		RULE_strictNonReserved = 137, RULE_nonReserved = 138;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
			"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
			"configKey", "configValue", "unsupportedHiveNativeCommands", "createTableHeader", 
			"replaceTableHeader", "bucketSpec", "skewSpec", "locationSpec", "commentSpec", 
			"query", "insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
			"namespace", "describeFuncName", "describeColName", "ctes", "namedQuery", 
			"tableProvider", "createTableClauses", "tablePropertyList", "tableProperty", 
			"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
			"createFileFormat", "fileFormat", "storageHandler", "resource", "dmlStatementNoWith", 
			"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
			"sortItem", "fromStatement", "fromStatementBody", "querySpecification", 
			"transformClause", "selectClause", "setClause", "matchedClause", "notMatchedClause", 
			"matchedAction", "notMatchedAction", "assignmentList", "assignment", 
			"whereClause", "havingClause", "hint", "hintStatement", "fromClause", 
			"aggregationClause", "groupingSet", "pivotClause", "pivotColumn", "pivotValue", 
			"lateralView", "setQuantifier", "relation", "joinRelation", "joinType", 
			"joinCriteria", "sample", "sampleMethod", "identifierList", "identifierSeq", 
			"orderedIdentifierList", "orderedIdentifier", "identifierCommentList", 
			"identifierComment", "relationPrimary", "inlineTable", "functionTable", 
			"tableAlias", "rowFormat", "multipartIdentifierList", "multipartIdentifier", 
			"tableIdentifier", "functionIdentifier", "namedExpression", "namedExpressionSeq", 
			"partitionFieldList", "partitionField", "transform", "transformArgument", 
			"expression", "booleanExpression", "predicate", "valueExpression", "primaryExpression", 
			"constant", "comparisonOperator", "arithmeticOperator", "predicateOperator", 
			"booleanValue", "interval", "errorCapturingMultiUnitsInterval", "multiUnitsInterval", 
			"errorCapturingUnitToUnitInterval", "unitToUnitInterval", "intervalValue", 
			"colPosition", "dataType", "qualifiedColTypeWithPositionList", "qualifiedColTypeWithPosition", 
			"colTypeList", "colType", "complexColTypeList", "complexColType", "whenClause", 
			"windowClause", "namedWindow", "windowSpec", "windowFrame", "frameBound", 
			"qualifiedNameList", "functionName", "qualifiedName", "errorCapturingIdentifier", 
			"errorCapturingIdentifierExtra", "identifier", "strictIdentifier", "quotedIdentifier", 
			"number", "alterColumnAction", "ansiNonReserved", "strictNonReserved", 
			"nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", 
			"']'", "':'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", 
			"'ANTI'", "'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
			"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
			"'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
			"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
			"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
			"'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", 
			"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
			"'DATA'", "'DATABASE'", null, "'DBPROPERTIES'", "'DEFINED'", "'DELETE'", 
			"'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", "'DIRECTORY'", 
			"'DISTINCT'", "'DISTRIBUTE'", "'DIV'", "'DROP'", "'ELSE'", "'END'", "'ESCAPE'", 
			"'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", 
			"'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", 
			"'FILTER'", "'FILEFORMAT'", "'FIRST'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", 
			"'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", 
			"'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", "'IF'", "'IGNORE'", 
			"'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", "'INNER'", "'INPATH'", "'INPUTFORMAT'", 
			"'INSERT'", "'INTERSECT'", "'INTERVAL'", "'INTO'", "'IS'", "'ITEMS'", 
			"'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", "'LAZY'", "'LEADING'", "'LEFT'", 
			"'LIKE'", "'LIMIT'", "'LINES'", "'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", 
			"'LOCK'", "'LOCKS'", "'LOGICAL'", "'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", 
			"'MSCK'", "'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", 
			"'NULLS'", "'OF'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", 
			"'ORDER'", "'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", 
			"'OVERLAY'", "'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", 
			"'PERCENT'", "'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", 
			"'PRINCIPALS'", "'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", 
			"'RECORDWRITER'", "'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", 
			"'RENAME'", "'REPAIR'", "'REPLACE'", "'RESET'", "'RESTRICT'", "'REVOKE'", 
			"'RIGHT'", null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", 
			"'ROWS'", "'SCHEMA'", "'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", 
			"'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", "'MINUS'", "'SETS'", 
			"'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", "'START'", "'STATISTICS'", 
			"'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'TABLE'", 
			"'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", 
			"'THEN'", "'TIME'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", 
			"'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", 
			"'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", 
			"'UNLOCK'", "'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", 
			"'VIEW'", "'VIEWS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'ZONE'", 
			null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'~'", "'&'", "'|'", "'||'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", 
			"ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", 
			"BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", 
			"CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DATA", "DATABASE", "DATABASES", "DBPROPERTIES", "DEFINED", "DELETE", 
			"DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", 
			"DISTRIBUTE", "DIV", "DROP", "ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", 
			"EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", 
			"FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", 
			"FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", 
			"FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "IF", 
			"IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", 
			"INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", 
			"LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", "LINES", 
			"LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", "MACRO", 
			"MAP", "MATCHED", "MERGE", "MSCK", "NAMESPACE", "NAMESPACES", "NATURAL", 
			"NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", "OPTIONS", 
			"OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", "OVERLAY", 
			"OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PERCENTLIT", 
			"PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", 
			"PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", 
			"RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPLACE", 
			"RESET", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", 
			"ROLLUP", "ROW", "ROWS", "SCHEMA", "SELECT", "SEMI", "SEPARATED", "SERDE", 
			"SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", "SETS", "SHOW", 
			"SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", "STORED", 
			"STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "TABLE", "TABLES", "TABLESAMPLE", 
			"TBLPROPERTIES", "TEMPORARY", "TERMINATED", "THEN", "TIME", "TO", "TOUCH", 
			"TRAILING", "TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", 
			"TRUNCATE", "TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", 
			"UNKNOWN", "UNLOCK", "UNSET", "UPDATE", "USE", "USER", "USING", "VALUES", 
			"VIEW", "VIEWS", "WHEN", "WHERE", "WINDOW", "WITH", "ZONE", "EQ", "NSEQ", 
			"NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", 
			"SLASH", "PERCENT", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", 
			"STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", 
			"EXPONENT_VALUE", "DECIMAL_VALUE", "FLOAT_LITERAL", "DOUBLE_LITERAL", 
			"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			statement();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(279);
				match(T__0);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			namedExpression();
			setState(288);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			tableIdentifier();
			setState(291);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			multipartIdentifier();
			setState(294);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			functionIdentifier();
			setState(297);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			dataType();
			setState(300);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			colTypeList();
			setState(303);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTableContext extends StatementContext {
		public MultipartIdentifierContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCurrentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCurrentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext ns;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetNamespaceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetNamespaceLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetNamespaceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetNamespaceProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetQuotedConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConfigValueContext configValue() {
			return getRuleContext(ConfigValueContext.class,0);
		}
		public SetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTableContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HiveReplaceColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public HiveReplaceColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHiveReplaceColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHiveReplaceColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHiveReplaceColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentNamespaceContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResetQuotedConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public ResetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TablePropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HiveChangeColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public HiveChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHiveChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHiveChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHiveChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTimeZoneContext extends StatementContext {
		public Token timezone;
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public SetTimeZoneContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableAlterColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext column;
		public List<TerminalNode> ALTER() { return getTokens(SqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public AlterTableAlterColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterTableAlterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterTableAlterColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterTableAlterColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshFunctionContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentTableContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTblPropertiesContext extends StatementContext {
		public MultipartIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowViewsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowViewsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowViews(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowViews(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowViews(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CacheTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(306);
					ctes();
					}
				}

				setState(309);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				match(USE);
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(311);
					match(NAMESPACE);
					}
					break;
				}
				setState(314);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				match(CREATE);
				setState(316);
				namespace();
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(317);
					match(IF);
					setState(318);
					match(NOT);
					setState(319);
					match(EXISTS);
					}
					break;
				}
				setState(322);
				multipartIdentifier();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(328);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(323);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(324);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(325);
						match(WITH);
						setState(326);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(327);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				match(ALTER);
				setState(334);
				namespace();
				setState(335);
				multipartIdentifier();
				setState(336);
				match(SET);
				setState(337);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
				tablePropertyList();
				}
				break;
			case 6:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				match(ALTER);
				setState(341);
				namespace();
				setState(342);
				multipartIdentifier();
				setState(343);
				match(SET);
				setState(344);
				locationSpec();
				}
				break;
			case 7:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				match(DROP);
				setState(347);
				namespace();
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(348);
					match(IF);
					setState(349);
					match(EXISTS);
					}
					break;
				}
				setState(352);
				multipartIdentifier();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(353);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 8:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(356);
				match(SHOW);
				setState(357);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(358);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(359);
					multipartIdentifier();
					}
				}

				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(362);
						match(LIKE);
						}
					}

					setState(365);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(368);
				createTableHeader();
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(369);
					match(T__1);
					setState(370);
					colTypeList();
					setState(371);
					match(T__2);
					}
					break;
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(375);
					tableProvider();
					}
				}

				setState(378);
				createTableClauses();
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || (((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & 549756076033L) != 0 || _la==VALUES || _la==WITH) {
					{
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(379);
						match(AS);
						}
					}

					setState(382);
					query();
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(385);
				match(CREATE);
				setState(386);
				match(TABLE);
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(387);
					match(IF);
					setState(388);
					match(NOT);
					setState(389);
					match(EXISTS);
					}
					break;
				}
				setState(392);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(393);
				match(LIKE);
				setState(394);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || _la==ROW || (((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & 17179869441L) != 0) {
					{
					setState(401);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(395);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(396);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(397);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(398);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(399);
						match(TBLPROPERTIES);
						setState(400);
						((CreateTableLikeContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 11:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(406);
				replaceTableHeader();
				setState(411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(407);
					match(T__1);
					setState(408);
					colTypeList();
					setState(409);
					match(T__2);
					}
					break;
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(413);
					tableProvider();
					}
				}

				setState(416);
				createTableClauses();
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || (((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & 549756076033L) != 0 || _la==VALUES || _la==WITH) {
					{
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(417);
						match(AS);
						}
					}

					setState(420);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(423);
				match(ANALYZE);
				setState(424);
				match(TABLE);
				setState(425);
				multipartIdentifier();
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(426);
					partitionSpec();
					}
				}

				setState(429);
				match(COMPUTE);
				setState(430);
				match(STATISTICS);
				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(431);
					identifier();
					}
					break;
				case 2:
					{
					setState(432);
					match(FOR);
					setState(433);
					match(COLUMNS);
					setState(434);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(435);
					match(FOR);
					setState(436);
					match(ALL);
					setState(437);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(440);
				match(ALTER);
				setState(441);
				match(TABLE);
				setState(442);
				multipartIdentifier();
				setState(443);
				match(ADD);
				setState(444);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(445);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 14:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(447);
				match(ALTER);
				setState(448);
				match(TABLE);
				setState(449);
				multipartIdentifier();
				setState(450);
				match(ADD);
				setState(451);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(452);
				match(T__1);
				setState(453);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(454);
				match(T__2);
				}
				break;
			case 15:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(456);
				match(ALTER);
				setState(457);
				match(TABLE);
				setState(458);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(459);
				match(RENAME);
				setState(460);
				match(COLUMN);
				setState(461);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(462);
				match(TO);
				setState(463);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 16:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(465);
				match(ALTER);
				setState(466);
				match(TABLE);
				setState(467);
				multipartIdentifier();
				setState(468);
				match(DROP);
				setState(469);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(470);
				match(T__1);
				setState(471);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(472);
				match(T__2);
				}
				break;
			case 17:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(474);
				match(ALTER);
				setState(475);
				match(TABLE);
				setState(476);
				multipartIdentifier();
				setState(477);
				match(DROP);
				setState(478);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 18:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(481);
				match(ALTER);
				setState(482);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(483);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(484);
				match(RENAME);
				setState(485);
				match(TO);
				setState(486);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 19:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(488);
				match(ALTER);
				setState(489);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(490);
				multipartIdentifier();
				setState(491);
				match(SET);
				setState(492);
				match(TBLPROPERTIES);
				setState(493);
				tablePropertyList();
				}
				break;
			case 20:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(495);
				match(ALTER);
				setState(496);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(497);
				multipartIdentifier();
				setState(498);
				match(UNSET);
				setState(499);
				match(TBLPROPERTIES);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(500);
					match(IF);
					setState(501);
					match(EXISTS);
					}
				}

				setState(504);
				tablePropertyList();
				}
				break;
			case 21:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(506);
				match(ALTER);
				setState(507);
				match(TABLE);
				setState(508);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(509);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(511);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(510);
					match(COLUMN);
					}
					break;
				}
				setState(513);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(514);
					alterColumnAction();
					}
				}

				}
				break;
			case 22:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(517);
				match(ALTER);
				setState(518);
				match(TABLE);
				setState(519);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(520);
					partitionSpec();
					}
				}

				setState(523);
				match(CHANGE);
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(524);
					match(COLUMN);
					}
					break;
				}
				setState(527);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(528);
				colType();
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(529);
					colPosition();
					}
				}

				}
				break;
			case 23:
				_localctx = new HiveReplaceColumnsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(532);
				match(ALTER);
				setState(533);
				match(TABLE);
				setState(534);
				((HiveReplaceColumnsContext)_localctx).table = multipartIdentifier();
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(535);
					partitionSpec();
					}
				}

				setState(538);
				match(REPLACE);
				setState(539);
				match(COLUMNS);
				setState(540);
				match(T__1);
				setState(541);
				((HiveReplaceColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(542);
				match(T__2);
				}
				break;
			case 24:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(544);
				match(ALTER);
				setState(545);
				match(TABLE);
				setState(546);
				multipartIdentifier();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(547);
					partitionSpec();
					}
				}

				setState(550);
				match(SET);
				setState(551);
				match(SERDE);
				setState(552);
				match(STRING);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(553);
					match(WITH);
					setState(554);
					match(SERDEPROPERTIES);
					setState(555);
					tablePropertyList();
					}
				}

				}
				break;
			case 25:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(558);
				match(ALTER);
				setState(559);
				match(TABLE);
				setState(560);
				multipartIdentifier();
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(561);
					partitionSpec();
					}
				}

				setState(564);
				match(SET);
				setState(565);
				match(SERDEPROPERTIES);
				setState(566);
				tablePropertyList();
				}
				break;
			case 26:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(568);
				match(ALTER);
				setState(569);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(570);
				multipartIdentifier();
				setState(571);
				match(ADD);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(572);
					match(IF);
					setState(573);
					match(NOT);
					setState(574);
					match(EXISTS);
					}
				}

				setState(578); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(577);
					partitionSpecLocation();
					}
					}
					setState(580); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 27:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(582);
				match(ALTER);
				setState(583);
				match(TABLE);
				setState(584);
				multipartIdentifier();
				setState(585);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(586);
				match(RENAME);
				setState(587);
				match(TO);
				setState(588);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 28:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(590);
				match(ALTER);
				setState(591);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(592);
				multipartIdentifier();
				setState(593);
				match(DROP);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(594);
					match(IF);
					setState(595);
					match(EXISTS);
					}
				}

				setState(598);
				partitionSpec();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(599);
					match(T__3);
					setState(600);
					partitionSpec();
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(606);
					match(PURGE);
					}
				}

				}
				break;
			case 29:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(609);
				match(ALTER);
				setState(610);
				match(TABLE);
				setState(611);
				multipartIdentifier();
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(612);
					partitionSpec();
					}
				}

				setState(615);
				match(SET);
				setState(616);
				locationSpec();
				}
				break;
			case 30:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(618);
				match(ALTER);
				setState(619);
				match(TABLE);
				setState(620);
				multipartIdentifier();
				setState(621);
				match(RECOVER);
				setState(622);
				match(PARTITIONS);
				}
				break;
			case 31:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(624);
				match(DROP);
				setState(625);
				match(TABLE);
				setState(628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(626);
					match(IF);
					setState(627);
					match(EXISTS);
					}
					break;
				}
				setState(630);
				multipartIdentifier();
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(631);
					match(PURGE);
					}
				}

				}
				break;
			case 32:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(634);
				match(DROP);
				setState(635);
				match(VIEW);
				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(636);
					match(IF);
					setState(637);
					match(EXISTS);
					}
					break;
				}
				setState(640);
				multipartIdentifier();
				}
				break;
			case 33:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(641);
				match(CREATE);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(642);
					match(OR);
					setState(643);
					match(REPLACE);
					}
				}

				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(646);
						match(GLOBAL);
						}
					}

					setState(649);
					match(TEMPORARY);
					}
				}

				setState(652);
				match(VIEW);
				setState(656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(653);
					match(IF);
					setState(654);
					match(NOT);
					setState(655);
					match(EXISTS);
					}
					break;
				}
				setState(658);
				multipartIdentifier();
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(659);
					identifierCommentList();
					}
				}

				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(668);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(662);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(663);
						match(PARTITIONED);
						setState(664);
						match(ON);
						setState(665);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(666);
						match(TBLPROPERTIES);
						setState(667);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(673);
				match(AS);
				setState(674);
				query();
				}
				break;
			case 34:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(676);
				match(CREATE);
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(677);
					match(OR);
					setState(678);
					match(REPLACE);
					}
				}

				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(681);
					match(GLOBAL);
					}
				}

				setState(684);
				match(TEMPORARY);
				setState(685);
				match(VIEW);
				setState(686);
				tableIdentifier();
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(687);
					match(T__1);
					setState(688);
					colTypeList();
					setState(689);
					match(T__2);
					}
				}

				setState(693);
				tableProvider();
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(694);
					match(OPTIONS);
					setState(695);
					tablePropertyList();
					}
				}

				}
				break;
			case 35:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(698);
				match(ALTER);
				setState(699);
				match(VIEW);
				setState(700);
				multipartIdentifier();
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(701);
					match(AS);
					}
				}

				setState(704);
				query();
				}
				break;
			case 36:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(706);
				match(CREATE);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(707);
					match(OR);
					setState(708);
					match(REPLACE);
					}
				}

				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(711);
					match(TEMPORARY);
					}
				}

				setState(714);
				match(FUNCTION);
				setState(718);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(715);
					match(IF);
					setState(716);
					match(NOT);
					setState(717);
					match(EXISTS);
					}
					break;
				}
				setState(720);
				multipartIdentifier();
				setState(721);
				match(AS);
				setState(722);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(723);
					match(USING);
					setState(724);
					resource();
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(725);
						match(T__3);
						setState(726);
						resource();
						}
						}
						setState(731);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 37:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(734);
				match(DROP);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(735);
					match(TEMPORARY);
					}
				}

				setState(738);
				match(FUNCTION);
				setState(741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(739);
					match(IF);
					setState(740);
					match(EXISTS);
					}
					break;
				}
				setState(743);
				multipartIdentifier();
				}
				break;
			case 38:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(744);
				match(EXPLAIN);
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEGEN || _la==COST || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 18014398509490177L) != 0) {
					{
					setState(745);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 18014398509490177L) != 0) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(748);
				statement();
				}
				break;
			case 39:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(749);
				match(SHOW);
				setState(750);
				match(TABLES);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(751);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(752);
					multipartIdentifier();
					}
				}

				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(755);
						match(LIKE);
						}
					}

					setState(758);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 40:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(761);
				match(SHOW);
				setState(762);
				match(TABLE);
				setState(763);
				match(EXTENDED);
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(764);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(765);
					((ShowTableContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(768);
				match(LIKE);
				setState(769);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(770);
					partitionSpec();
					}
				}

				}
				break;
			case 41:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(773);
				match(SHOW);
				setState(774);
				match(TBLPROPERTIES);
				setState(775);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(776);
					match(T__1);
					setState(777);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(778);
					match(T__2);
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(782);
				match(SHOW);
				setState(783);
				match(COLUMNS);
				setState(784);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(785);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(786);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(787);
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(790);
				match(SHOW);
				setState(791);
				match(VIEWS);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(792);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(793);
					multipartIdentifier();
					}
				}

				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(796);
						match(LIKE);
						}
					}

					setState(799);
					((ShowViewsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(802);
				match(SHOW);
				setState(803);
				match(PARTITIONS);
				setState(804);
				multipartIdentifier();
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(805);
					partitionSpec();
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(808);
				match(SHOW);
				setState(810);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(809);
					identifier();
					}
					break;
				}
				setState(812);
				match(FUNCTIONS);
				setState(820);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(814);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(813);
						match(LIKE);
						}
						break;
					}
					setState(818);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(816);
						multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(817);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 46:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(822);
				match(SHOW);
				setState(823);
				match(CREATE);
				setState(824);
				match(TABLE);
				setState(825);
				multipartIdentifier();
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(826);
					match(AS);
					setState(827);
					match(SERDE);
					}
				}

				}
				break;
			case 47:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(830);
				match(SHOW);
				setState(831);
				match(CURRENT);
				setState(832);
				match(NAMESPACE);
				}
				break;
			case 48:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(833);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(834);
				match(FUNCTION);
				setState(836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(835);
					match(EXTENDED);
					}
					break;
				}
				setState(838);
				describeFuncName();
				}
				break;
			case 49:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(839);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(840);
				namespace();
				setState(842);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(841);
					match(EXTENDED);
					}
					break;
				}
				setState(844);
				multipartIdentifier();
				}
				break;
			case 50:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(846);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(847);
					match(TABLE);
					}
					break;
				}
				setState(851);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(850);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(853);
				multipartIdentifier();
				setState(855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(854);
					partitionSpec();
					}
					break;
				}
				setState(858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(857);
					describeColName();
					}
					break;
				}
				}
				break;
			case 51:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(860);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(861);
					match(QUERY);
					}
				}

				setState(864);
				query();
				}
				break;
			case 52:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(865);
				match(COMMENT);
				setState(866);
				match(ON);
				setState(867);
				namespace();
				setState(868);
				multipartIdentifier();
				setState(869);
				match(IS);
				setState(870);
				((CommentNamespaceContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentNamespaceContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 53:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(872);
				match(COMMENT);
				setState(873);
				match(ON);
				setState(874);
				match(TABLE);
				setState(875);
				multipartIdentifier();
				setState(876);
				match(IS);
				setState(877);
				((CommentTableContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentTableContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 54:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(879);
				match(REFRESH);
				setState(880);
				match(TABLE);
				setState(881);
				multipartIdentifier();
				}
				break;
			case 55:
				_localctx = new RefreshFunctionContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(882);
				match(REFRESH);
				setState(883);
				match(FUNCTION);
				setState(884);
				multipartIdentifier();
				}
				break;
			case 56:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(885);
				match(REFRESH);
				setState(893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(886);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(890);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(887);
							matchWildcard();
							}
							} 
						}
						setState(892);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 57:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(895);
				match(CACHE);
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(896);
					match(LAZY);
					}
				}

				setState(899);
				match(TABLE);
				setState(900);
				multipartIdentifier();
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(901);
					match(OPTIONS);
					setState(902);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || (((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & 549756076033L) != 0 || _la==VALUES || _la==WITH) {
					{
					setState(906);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(905);
						match(AS);
						}
					}

					setState(908);
					query();
					}
				}

				}
				break;
			case 58:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(911);
				match(UNCACHE);
				setState(912);
				match(TABLE);
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(913);
					match(IF);
					setState(914);
					match(EXISTS);
					}
					break;
				}
				setState(917);
				multipartIdentifier();
				}
				break;
			case 59:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(918);
				match(CLEAR);
				setState(919);
				match(CACHE);
				}
				break;
			case 60:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(920);
				match(LOAD);
				setState(921);
				match(DATA);
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(922);
					match(LOCAL);
					}
				}

				setState(925);
				match(INPATH);
				setState(926);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(927);
					match(OVERWRITE);
					}
				}

				setState(930);
				match(INTO);
				setState(931);
				match(TABLE);
				setState(932);
				multipartIdentifier();
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(933);
					partitionSpec();
					}
				}

				}
				break;
			case 61:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(936);
				match(TRUNCATE);
				setState(937);
				match(TABLE);
				setState(938);
				multipartIdentifier();
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(939);
					partitionSpec();
					}
				}

				}
				break;
			case 62:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(942);
				match(MSCK);
				setState(943);
				match(REPAIR);
				setState(944);
				match(TABLE);
				setState(945);
				multipartIdentifier();
				}
				break;
			case 63:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(946);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(947);
				identifier();
				setState(955);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(948);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(952);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(949);
							matchWildcard();
							}
							} 
						}
						setState(954);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 64:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(957);
				match(SET);
				setState(958);
				match(ROLE);
				setState(962);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(959);
						matchWildcard();
						}
						} 
					}
					setState(964);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				}
				break;
			case 65:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(965);
				match(SET);
				setState(966);
				match(TIME);
				setState(967);
				match(ZONE);
				setState(968);
				interval();
				}
				break;
			case 66:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(969);
				match(SET);
				setState(970);
				match(TIME);
				setState(971);
				match(ZONE);
				setState(972);
				((SetTimeZoneContext)_localctx).timezone = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LOCAL || _la==STRING) ) {
					((SetTimeZoneContext)_localctx).timezone = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 67:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(973);
				match(SET);
				setState(974);
				match(TIME);
				setState(975);
				match(ZONE);
				setState(979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(976);
						matchWildcard();
						}
						} 
					}
					setState(981);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
				break;
			case 68:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(982);
				match(SET);
				setState(983);
				configKey();
				setState(984);
				match(EQ);
				setState(985);
				configValue();
				}
				break;
			case 69:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(987);
				match(SET);
				setState(988);
				configKey();
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(989);
					match(EQ);
					setState(993);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(990);
							matchWildcard();
							}
							} 
						}
						setState(995);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
					}
					}
				}

				}
				break;
			case 70:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(998);
				match(SET);
				setState(1002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(999);
						matchWildcard();
						}
						} 
					}
					setState(1004);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				setState(1005);
				match(EQ);
				setState(1006);
				configValue();
				}
				break;
			case 71:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1007);
				match(SET);
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1008);
						matchWildcard();
						}
						} 
					}
					setState(1013);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				}
				break;
			case 72:
				_localctx = new ResetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1014);
				match(RESET);
				setState(1015);
				configKey();
				}
				break;
			case 73:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1016);
				match(RESET);
				setState(1020);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1017);
						matchWildcard();
						}
						} 
					}
					setState(1022);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				}
				break;
			case 74:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1023);
				unsupportedHiveNativeCommands();
				setState(1027);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1024);
						matchWildcard();
						}
						} 
					}
					setState(1029);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConfigKeyContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConfigKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConfigKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConfigKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigKeyContext configKey() throws RecognitionException {
		ConfigKeyContext _localctx = new ConfigKeyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_configKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			quotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConfigValueContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConfigValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConfigValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConfigValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			quotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1037);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1038);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1039);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1040);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1042);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1041);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1044);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1046);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1045);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1048);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1049);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1050);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1051);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1053);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1052);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1055);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1056);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1057);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1058);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1059);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1060);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1061);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1062);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1063);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1064);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1065);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1066);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1067);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1068);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1069);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1070);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1071);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1072);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1073);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1074);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1075);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1076);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1077);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1078);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1079);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1080);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1081);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1082);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1083);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1084);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1085);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1086);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1087);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1088);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1089);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1090);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1091);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1092);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1093);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1094);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1095);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1096);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1097);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1098);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1099);
				tableIdentifier();
				setState(1100);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1101);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1103);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1104);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1105);
				tableIdentifier();
				setState(1106);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1107);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1109);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1110);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1111);
				tableIdentifier();
				setState(1112);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1113);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1115);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1116);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1117);
				tableIdentifier();
				setState(1118);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1119);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1121);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1122);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1123);
				tableIdentifier();
				setState(1124);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1125);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1127);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1128);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1129);
				tableIdentifier();
				setState(1130);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1131);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1132);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1133);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1135);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1136);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1137);
				tableIdentifier();
				setState(1138);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1139);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1140);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1142);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1143);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1144);
				tableIdentifier();
				setState(1145);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1146);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1148);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1149);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1150);
				tableIdentifier();
				setState(1151);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1152);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1154);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1155);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1156);
				tableIdentifier();
				setState(1157);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1160);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1161);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1162);
				tableIdentifier();
				setState(1163);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1165);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1166);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1167);
				tableIdentifier();
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1168);
					partitionSpec();
					}
				}

				setState(1171);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1173);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1175);
				tableIdentifier();
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1176);
					partitionSpec();
					}
				}

				setState(1179);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1181);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1182);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1183);
				tableIdentifier();
				setState(1185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1184);
					partitionSpec();
					}
				}

				setState(1187);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1190);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1191);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1192);
				tableIdentifier();
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1193);
					partitionSpec();
					}
				}

				setState(1196);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1197);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1199);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1200);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1201);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1202);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1203);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(CREATE);
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1207);
				match(TEMPORARY);
				}
			}

			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1210);
				match(EXTERNAL);
				}
			}

			setState(1213);
			match(TABLE);
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1214);
				match(IF);
				setState(1215);
				match(NOT);
				setState(1216);
				match(EXISTS);
				}
				break;
			}
			setState(1219);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1221);
				match(CREATE);
				setState(1222);
				match(OR);
				}
			}

			setState(1225);
			match(REPLACE);
			setState(1226);
			match(TABLE);
			setState(1227);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(CLUSTERED);
			setState(1230);
			match(BY);
			setState(1231);
			identifierList();
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1232);
				match(SORTED);
				setState(1233);
				match(BY);
				setState(1234);
				orderedIdentifierList();
				}
			}

			setState(1237);
			match(INTO);
			setState(1238);
			match(INTEGER_VALUE);
			setState(1239);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(SKEWED);
			setState(1242);
			match(BY);
			setState(1243);
			identifierList();
			setState(1244);
			match(ON);
			setState(1247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1245);
				constantList();
				}
				break;
			case 2:
				{
				setState(1246);
				nestedConstantList();
				}
				break;
			}
			setState(1252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1249);
				match(STORED);
				setState(1250);
				match(AS);
				setState(1251);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(LOCATION);
			setState(1255);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			match(COMMENT);
			setState(1258);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1260);
				ctes();
				}
			}

			setState(1263);
			queryTerm(0);
			setState(1264);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_insertInto);
		int _la;
		try {
			setState(1327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				match(INSERT);
				setState(1267);
				match(OVERWRITE);
				setState(1269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1268);
					match(TABLE);
					}
					break;
				}
				setState(1271);
				multipartIdentifier();
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1272);
					partitionSpec();
					setState(1276);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1273);
						match(IF);
						setState(1274);
						match(NOT);
						setState(1275);
						match(EXISTS);
						}
					}

					}
				}

				setState(1281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1280);
					identifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
				match(INSERT);
				setState(1284);
				match(INTO);
				setState(1286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1285);
					match(TABLE);
					}
					break;
				}
				setState(1288);
				multipartIdentifier();
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1289);
					partitionSpec();
					}
				}

				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1292);
					match(IF);
					setState(1293);
					match(NOT);
					setState(1294);
					match(EXISTS);
					}
				}

				setState(1298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1297);
					identifierList();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1300);
				match(INSERT);
				setState(1301);
				match(OVERWRITE);
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1302);
					match(LOCAL);
					}
				}

				setState(1305);
				match(DIRECTORY);
				setState(1306);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1307);
					rowFormat();
					}
				}

				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1310);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1313);
				match(INSERT);
				setState(1314);
				match(OVERWRITE);
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1315);
					match(LOCAL);
					}
				}

				setState(1318);
				match(DIRECTORY);
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1319);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1322);
				tableProvider();
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1323);
					match(OPTIONS);
					setState(1324);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			partitionSpec();
			setState(1331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1330);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(PARTITION);
			setState(1334);
			match(T__1);
			setState(1335);
			partitionVal();
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1336);
				match(T__3);
				setState(1337);
				partitionVal();
				}
				}
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1343);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			identifier();
			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1346);
				match(EQ);
				setState(1347);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_describeFuncName);
		try {
			setState(1357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1353);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1354);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1355);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1356);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1360);
				match(T__4);
				setState(1361);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			match(WITH);
			setState(1368);
			namedQuery();
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1369);
				match(T__3);
				setState(1370);
				namedQuery();
				}
				}
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1377);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1380);
				match(AS);
				}
			}

			setState(1383);
			match(T__1);
			setState(1384);
			query();
			setState(1385);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			match(USING);
			setState(1388);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableClausesContext extends ParserRuleContext {
		public TablePropertyListContext options;
		public PartitionFieldListContext partitioning;
		public TablePropertyListContext tableProps;
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<PartitionFieldListContext> partitionFieldList() {
			return getRuleContexts(PartitionFieldListContext.class);
		}
		public PartitionFieldListContext partitionFieldList(int i) {
			return getRuleContext(PartitionFieldListContext.class,i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || (((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 4611686020575920129L) != 0 || (((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & 16449L) != 0) {
				{
				setState(1403);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1390);
					match(OPTIONS);
					setState(1391);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1392);
					match(PARTITIONED);
					setState(1393);
					match(BY);
					setState(1394);
					((CreateTableClausesContext)_localctx).partitioning = partitionFieldList();
					}
					}
					break;
				case SKEWED:
					{
					setState(1395);
					skewSpec();
					}
					break;
				case CLUSTERED:
					{
					setState(1396);
					bucketSpec();
					}
					break;
				case ROW:
					{
					setState(1397);
					rowFormat();
					}
					break;
				case STORED:
					{
					setState(1398);
					createFileFormat();
					}
					break;
				case LOCATION:
					{
					setState(1399);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1400);
					commentSpec();
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1401);
					match(TBLPROPERTIES);
					setState(1402);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			match(T__1);
			setState(1409);
			tableProperty();
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1410);
				match(T__3);
				setState(1411);
				tableProperty();
				}
				}
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1417);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || (((_la - 238)) & ~0x3f) == 0 && ((1L << (_la - 238)) & 178120892088321L) != 0) {
				{
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1420);
					match(EQ);
					}
				}

				setState(1423);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				identifier();
				setState(1431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1427);
					match(T__4);
					setState(1428);
					identifier();
					}
					}
					setState(1433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1434);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tablePropertyValue);
		try {
			setState(1441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1438);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1439);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1440);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			match(T__1);
			setState(1444);
			constant();
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1445);
				match(T__3);
				setState(1446);
				constant();
				}
				}
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1452);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			match(T__1);
			setState(1455);
			constantList();
			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1456);
				match(T__3);
				setState(1457);
				constantList();
				}
				}
				setState(1462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1463);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_createFileFormat);
		try {
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				match(STORED);
				setState(1466);
				match(AS);
				setState(1467);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1468);
				match(STORED);
				setState(1469);
				match(BY);
				setState(1470);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fileFormat);
		try {
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				match(INPUTFORMAT);
				setState(1474);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1475);
				match(OUTPUTFORMAT);
				setState(1476);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1477);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(STRING);
			setState(1484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1481);
				match(WITH);
				setState(1482);
				match(SERDEPROPERTIES);
				setState(1483);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			identifier();
			setState(1487);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1489);
				insertInto();
				setState(1490);
				queryTerm(0);
				setState(1491);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1493);
				fromClause();
				setState(1495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1494);
					multiInsertQueryBody();
					}
					}
					setState(1497); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1499);
				match(DELETE);
				setState(1500);
				match(FROM);
				setState(1501);
				multipartIdentifier();
				setState(1502);
				tableAlias();
				setState(1504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1503);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1506);
				match(UPDATE);
				setState(1507);
				multipartIdentifier();
				setState(1508);
				tableAlias();
				setState(1509);
				setClause();
				setState(1511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1510);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1513);
				match(MERGE);
				setState(1514);
				match(INTO);
				setState(1515);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1516);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1517);
				match(USING);
				setState(1523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1518);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1519);
					match(T__1);
					setState(1520);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1521);
					match(T__2);
					}
					break;
				}
				setState(1525);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1526);
				match(ON);
				setState(1527);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1528);
						matchedClause();
						}
						} 
					}
					setState(1533);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				}
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1534);
					notMatchedClause();
					}
					}
					setState(1539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1542);
				match(ORDER);
				setState(1543);
				match(BY);
				setState(1544);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1545);
						match(T__3);
						setState(1546);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1551);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				}
				}
				break;
			}
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1554);
				match(CLUSTER);
				setState(1555);
				match(BY);
				setState(1556);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1557);
						match(T__3);
						setState(1558);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1563);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				}
				break;
			}
			setState(1576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1566);
				match(DISTRIBUTE);
				setState(1567);
				match(BY);
				setState(1568);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1569);
						match(T__3);
						setState(1570);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1575);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				}
				break;
			}
			setState(1588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1578);
				match(SORT);
				setState(1579);
				match(BY);
				setState(1580);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1581);
						match(T__3);
						setState(1582);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1587);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				}
				}
				break;
			}
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1590);
				windowClause();
				}
				break;
			}
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1593);
				match(LIMIT);
				setState(1596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1594);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1595);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			insertInto();
			setState(1601);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1604);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1629);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1627);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1606);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1607);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1608);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1610);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1609);
							setQuantifier();
							}
						}

						setState(1612);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1613);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1614);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1615);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1617);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1616);
							setQuantifier();
							}
						}

						setState(1619);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1620);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1621);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1622);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1624);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1623);
							setQuantifier();
							}
						}

						setState(1626);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_queryPrimary);
		try {
			setState(1641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1632);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1633);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1634);
				match(TABLE);
				setState(1635);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1636);
				inlineTable();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1637);
				match(T__1);
				setState(1638);
				query();
				setState(1639);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			expression();
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1644);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1647);
				match(NULLS);
				setState(1648);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			fromClause();
			setState(1653); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1652);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1655); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1657);
				transformClause();
				setState(1659);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1658);
					whereClause();
					}
					break;
				}
				setState(1661);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1663);
				selectClause();
				setState(1667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1664);
						lateralView();
						}
						} 
					}
					setState(1669);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				}
				setState(1671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1670);
					whereClause();
					}
					break;
				}
				setState(1674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1673);
					aggregationClause();
					}
					break;
				}
				setState(1677);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1676);
					havingClause();
					}
					break;
				}
				setState(1680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1679);
					windowClause();
					}
					break;
				}
				setState(1682);
				queryOrganization();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_querySpecification);
		try {
			int _alt;
			setState(1715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1686);
				transformClause();
				setState(1688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1687);
					fromClause();
					}
					break;
				}
				setState(1691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1690);
					whereClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1693);
				selectClause();
				setState(1695);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1694);
					fromClause();
					}
					break;
				}
				setState(1700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1697);
						lateralView();
						}
						} 
					}
					setState(1702);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				setState(1704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1703);
					whereClause();
					}
					break;
				}
				setState(1707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1706);
					aggregationClause();
					}
					break;
				}
				setState(1710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1709);
					havingClause();
					}
					break;
				}
				setState(1713);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1712);
					windowClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1717);
				match(SELECT);
				setState(1718);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1719);
				match(T__1);
				setState(1720);
				namedExpressionSeq();
				setState(1721);
				match(T__2);
				}
				break;
			case MAP:
				{
				setState(1723);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1724);
				namedExpressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1725);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1726);
				namedExpressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1729);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1732);
				match(RECORDWRITER);
				setState(1733);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1736);
			match(USING);
			setState(1737);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1738);
				match(AS);
				setState(1748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1739);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1740);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1741);
					match(T__1);
					setState(1744);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
					case 1:
						{
						setState(1742);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1743);
						colTypeList();
						}
						break;
					}
					setState(1746);
					match(T__2);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1752);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1755);
				match(RECORDREADER);
				setState(1756);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			match(SELECT);
			setState(1763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1760);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			setState(1767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1766);
				setQuantifier();
				}
				break;
			}
			setState(1769);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			match(SET);
			setState(1772);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			match(WHEN);
			setState(1775);
			match(MATCHED);
			setState(1778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1776);
				match(AND);
				setState(1777);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1780);
			match(THEN);
			setState(1781);
			matchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			match(WHEN);
			setState(1784);
			match(NOT);
			setState(1785);
			match(MATCHED);
			setState(1788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1786);
				match(AND);
				setState(1787);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1790);
			match(THEN);
			setState(1791);
			notMatchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_matchedAction);
		try {
			setState(1800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1793);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1794);
				match(UPDATE);
				setState(1795);
				match(SET);
				setState(1796);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1797);
				match(UPDATE);
				setState(1798);
				match(SET);
				setState(1799);
				assignmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNotMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNotMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_notMatchedAction);
		int _la;
		try {
			setState(1820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1802);
				match(INSERT);
				setState(1803);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1804);
				match(INSERT);
				setState(1805);
				match(T__1);
				setState(1806);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1807);
				match(T__2);
				setState(1808);
				match(VALUES);
				setState(1809);
				match(T__1);
				setState(1810);
				expression();
				setState(1815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1811);
					match(T__3);
					setState(1812);
					expression();
					}
					}
					setState(1817);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1818);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			assignment();
			setState(1827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1823);
				match(T__3);
				setState(1824);
				assignment();
				}
				}
				setState(1829);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1831);
			match(EQ);
			setState(1832);
			((AssignmentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			match(WHERE);
			setState(1835);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			match(HAVING);
			setState(1838);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			match(T__5);
			setState(1841);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1843);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
					case 1:
						{
						setState(1842);
						match(T__3);
						}
						break;
					}
					setState(1845);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			}
			setState(1851);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_hintStatement);
		int _la;
		try {
			setState(1866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1853);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1854);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1855);
				match(T__1);
				setState(1856);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1857);
					match(T__3);
					setState(1858);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1864);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			match(FROM);
			setState(1869);
			relation();
			setState(1874);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1870);
					match(T__3);
					setState(1871);
					relation();
					}
					} 
				}
				setState(1876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			setState(1880);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1877);
					lateralView();
					}
					} 
				}
				setState(1882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
			setState(1884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1883);
				pivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(1930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1886);
				match(GROUP);
				setState(1887);
				match(BY);
				setState(1888);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1889);
						match(T__3);
						setState(1890);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1895);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				}
				setState(1913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1896);
					match(WITH);
					setState(1897);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1898);
					match(WITH);
					setState(1899);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1900);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1901);
					match(SETS);
					setState(1902);
					match(T__1);
					setState(1903);
					groupingSet();
					setState(1908);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1904);
						match(T__3);
						setState(1905);
						groupingSet();
						}
						}
						setState(1910);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1911);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1915);
				match(GROUP);
				setState(1916);
				match(BY);
				setState(1917);
				((AggregationClauseContext)_localctx).kind = match(GROUPING);
				setState(1918);
				match(SETS);
				setState(1919);
				match(T__1);
				setState(1920);
				groupingSet();
				setState(1925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1921);
					match(T__3);
					setState(1922);
					groupingSet();
					}
					}
					setState(1927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1928);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_groupingSet);
		int _la;
		try {
			setState(1945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1932);
				match(T__1);
				setState(1941);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1933);
					expression();
					setState(1938);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1934);
						match(T__3);
						setState(1935);
						expression();
						}
						}
						setState(1940);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1943);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1944);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			match(PIVOT);
			setState(1948);
			match(T__1);
			setState(1949);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1950);
			match(FOR);
			setState(1951);
			pivotColumn();
			setState(1952);
			match(IN);
			setState(1953);
			match(T__1);
			setState(1954);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1955);
				match(T__3);
				setState(1956);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1962);
			match(T__2);
			setState(1963);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_pivotColumn);
		int _la;
		try {
			setState(1977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1965);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1966);
				match(T__1);
				setState(1967);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(1972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1968);
					match(T__3);
					setState(1969);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(1974);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1975);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1979);
			expression();
			setState(1984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1981);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1980);
					match(AS);
					}
					break;
				}
				setState(1983);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			match(LATERAL);
			setState(1987);
			match(VIEW);
			setState(1989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1988);
				match(OUTER);
				}
				break;
			}
			setState(1991);
			qualifiedName();
			setState(1992);
			match(T__1);
			setState(2001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1993);
				expression();
				setState(1998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1994);
					match(T__3);
					setState(1995);
					expression();
					}
					}
					setState(2000);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2003);
			match(T__2);
			setState(2004);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(2006);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(2005);
					match(AS);
					}
					break;
				}
				setState(2008);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2009);
						match(T__3);
						setState(2010);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2015);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
			relationPrimary();
			setState(2024);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2021);
					joinRelation();
					}
					} 
				}
				setState(2026);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_joinRelation);
		try {
			setState(2038);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2027);
				joinType();
				}
				setState(2028);
				match(JOIN);
				setState(2029);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2030);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2033);
				match(NATURAL);
				setState(2034);
				joinType();
				setState(2035);
				match(JOIN);
				setState(2036);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_joinType);
		int _la;
		try {
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2040);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2043);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2044);
				match(LEFT);
				setState(2046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2045);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2048);
					match(LEFT);
					}
				}

				setState(2051);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2052);
				match(RIGHT);
				setState(2054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2053);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2056);
				match(FULL);
				setState(2058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2057);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2060);
					match(LEFT);
					}
				}

				setState(2063);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_joinCriteria);
		try {
			setState(2070);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2066);
				match(ON);
				setState(2067);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2068);
				match(USING);
				setState(2069);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2072);
			match(TABLESAMPLE);
			setState(2073);
			match(T__1);
			setState(2075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2074);
				sampleMethod();
				}
				break;
			}
			setState(2077);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_sampleMethod);
		int _la;
		try {
			setState(2103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2079);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2082);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2083);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2084);
				expression();
				setState(2085);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2087);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2088);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2089);
				match(OUT);
				setState(2090);
				match(OF);
				setState(2091);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2092);
					match(ON);
					setState(2098);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
						{
						setState(2093);
						identifier();
						}
						break;
					case 2:
						{
						setState(2094);
						qualifiedName();
						setState(2095);
						match(T__1);
						setState(2096);
						match(T__2);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2102);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2105);
			match(T__1);
			setState(2106);
			identifierSeq();
			setState(2107);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2109);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2110);
					match(T__3);
					setState(2111);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2117);
			match(T__1);
			setState(2118);
			orderedIdentifier();
			setState(2123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2119);
				match(T__3);
				setState(2120);
				orderedIdentifier();
				}
				}
				setState(2125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2126);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2128);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2129);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2132);
			match(T__1);
			setState(2133);
			identifierComment();
			setState(2138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2134);
				match(T__3);
				setState(2135);
				identifierComment();
				}
				}
				setState(2140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2141);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2143);
			identifier();
			setState(2145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2144);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_relationPrimary);
		try {
			setState(2171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2147);
				multipartIdentifier();
				setState(2149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(2148);
					sample();
					}
					break;
				}
				setState(2151);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2153);
				match(T__1);
				setState(2154);
				query();
				setState(2155);
				match(T__2);
				setState(2157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(2156);
					sample();
					}
					break;
				}
				setState(2159);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2161);
				match(T__1);
				setState(2162);
				relation();
				setState(2163);
				match(T__2);
				setState(2165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2164);
					sample();
					}
					break;
				}
				setState(2167);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2169);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2170);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
			match(VALUES);
			setState(2174);
			expression();
			setState(2179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2175);
					match(T__3);
					setState(2176);
					expression();
					}
					} 
				}
				setState(2181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			}
			setState(2182);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTableContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			((FunctionTableContext)_localctx).funcName = errorCapturingIdentifier();
			setState(2185);
			match(T__1);
			setState(2194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2186);
				expression();
				setState(2191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2187);
					match(T__3);
					setState(2188);
					expression();
					}
					}
					setState(2193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2196);
			match(T__2);
			setState(2197);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(2199);
					match(AS);
					}
					break;
				}
				setState(2202);
				strictIdentifier();
				setState(2204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2203);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_rowFormat);
		try {
			setState(2257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2208);
				match(ROW);
				setState(2209);
				match(FORMAT);
				setState(2210);
				match(SERDE);
				setState(2211);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(2212);
					match(WITH);
					setState(2213);
					match(SERDEPROPERTIES);
					setState(2214);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2217);
				match(ROW);
				setState(2218);
				match(FORMAT);
				setState(2219);
				match(DELIMITED);
				setState(2229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2220);
					match(FIELDS);
					setState(2221);
					match(TERMINATED);
					setState(2222);
					match(BY);
					setState(2223);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
					case 1:
						{
						setState(2224);
						match(ESCAPED);
						setState(2225);
						match(BY);
						setState(2226);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2231);
					match(COLLECTION);
					setState(2232);
					match(ITEMS);
					setState(2233);
					match(TERMINATED);
					setState(2234);
					match(BY);
					setState(2235);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2238);
					match(MAP);
					setState(2239);
					match(KEYS);
					setState(2240);
					match(TERMINATED);
					setState(2241);
					match(BY);
					setState(2242);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2245);
					match(LINES);
					setState(2246);
					match(TERMINATED);
					setState(2247);
					match(BY);
					setState(2248);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2251);
					match(NULL);
					setState(2252);
					match(DEFINED);
					setState(2253);
					match(AS);
					setState(2254);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipartIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2259);
			multipartIdentifier();
			setState(2264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2260);
				match(T__3);
				setState(2261);
				multipartIdentifier();
				}
				}
				setState(2266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2267);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2268);
					match(T__4);
					setState(2269);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2275);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2276);
				match(T__4);
				}
				break;
			}
			setState(2280);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2282);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2283);
				match(T__4);
				}
				break;
			}
			setState(2287);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2289);
			expression();
			setState(2297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2290);
					match(AS);
					}
					break;
				}
				setState(2295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2293);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2294);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2299);
			namedExpression();
			setState(2304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2300);
					match(T__3);
					setState(2301);
					namedExpression();
					}
					} 
				}
				setState(2306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionFieldListContext extends ParserRuleContext {
		public PartitionFieldContext partitionField;
		public List<PartitionFieldContext> fields = new ArrayList<PartitionFieldContext>();
		public List<PartitionFieldContext> partitionField() {
			return getRuleContexts(PartitionFieldContext.class);
		}
		public PartitionFieldContext partitionField(int i) {
			return getRuleContext(PartitionFieldContext.class,i);
		}
		public PartitionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionFieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldListContext partitionFieldList() throws RecognitionException {
		PartitionFieldListContext _localctx = new PartitionFieldListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_partitionFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2307);
			match(T__1);
			setState(2308);
			((PartitionFieldListContext)_localctx).partitionField = partitionField();
			((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
			setState(2313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2309);
				match(T__3);
				setState(2310);
				((PartitionFieldListContext)_localctx).partitionField = partitionField();
				((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
				}
				}
				setState(2315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2316);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionFieldContext extends ParserRuleContext {
		public PartitionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionField; }
	 
		public PartitionFieldContext() { }
		public void copyFrom(PartitionFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PartitionColumnContext extends PartitionFieldContext {
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionColumnContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PartitionTransformContext extends PartitionFieldContext {
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public PartitionTransformContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldContext partitionField() throws RecognitionException {
		PartitionFieldContext _localctx = new PartitionFieldContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_partitionField);
		try {
			setState(2320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				_localctx = new PartitionTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2318);
				transform();
				}
				break;
			case 2:
				_localctx = new PartitionColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2319);
				colType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_transform);
		int _la;
		try {
			setState(2335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2322);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2323);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2324);
				match(T__1);
				setState(2325);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2326);
					match(T__3);
					setState(2327);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2333);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_transformArgument);
		try {
			setState(2339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2337);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2338);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2344);
				match(NOT);
				setState(2345);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2346);
				match(EXISTS);
				setState(2347);
				match(T__1);
				setState(2348);
				query();
				setState(2349);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2351);
				valueExpression(0);
				setState(2353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2352);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2363);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2357);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2358);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2359);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2360);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2361);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2362);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token quantifier;
		public Token escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_predicate);
		int _la;
		try {
			setState(2450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2368);
					match(NOT);
					}
				}

				setState(2371);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2372);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2373);
				match(AND);
				setState(2374);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2376);
					match(NOT);
					}
				}

				setState(2379);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2380);
				match(T__1);
				setState(2381);
				expression();
				setState(2386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2382);
					match(T__3);
					setState(2383);
					expression();
					}
					}
					setState(2388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2389);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2391);
					match(NOT);
					}
				}

				setState(2394);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2395);
				match(T__1);
				setState(2396);
				query();
				setState(2397);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2399);
					match(NOT);
					}
				}

				setState(2402);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2403);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2404);
					match(NOT);
					}
				}

				setState(2407);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2408);
				((PredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((PredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2409);
					match(T__1);
					setState(2410);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(2411);
					match(T__1);
					setState(2412);
					expression();
					setState(2417);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2413);
						match(T__3);
						setState(2414);
						expression();
						}
						}
						setState(2419);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2420);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2424);
					match(NOT);
					}
				}

				setState(2427);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2428);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2431);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
				case 1:
					{
					setState(2429);
					match(ESCAPE);
					setState(2430);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2433);
				match(IS);
				setState(2435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2434);
					match(NOT);
					}
				}

				setState(2437);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2438);
				match(IS);
				setState(2440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2439);
					match(NOT);
					}
				}

				setState(2442);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2443);
				match(IS);
				setState(2445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2444);
					match(NOT);
					}
				}

				setState(2447);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2448);
				match(FROM);
				setState(2449);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 198;
		enterRecursionRule(_localctx, 198, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2453);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2454);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & 35L) != 0) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2455);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2477);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2458);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2459);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || (((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & 7L) != 0) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2460);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2461);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2462);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & 259L) != 0) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2463);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2464);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2465);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2466);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2467);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2468);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2469);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2470);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2471);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2472);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2473);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2474);
						comparisonOperator();
						setState(2475);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CurrentDatetimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public CurrentDatetimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentDatetime(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public BooleanExpressionContext where;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2483);
				((CurrentDatetimeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((CurrentDatetimeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2484);
				match(CASE);
				setState(2486); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2485);
					whenClause();
					}
					}
					setState(2488); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2490);
					match(ELSE);
					setState(2491);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2494);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2496);
				match(CASE);
				setState(2497);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2499); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2498);
					whenClause();
					}
					}
					setState(2501); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2503);
					match(ELSE);
					setState(2504);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2507);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2509);
				match(CAST);
				setState(2510);
				match(T__1);
				setState(2511);
				expression();
				setState(2512);
				match(AS);
				setState(2513);
				dataType();
				setState(2514);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2516);
				match(STRUCT);
				setState(2517);
				match(T__1);
				setState(2526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2518);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2523);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2519);
						match(T__3);
						setState(2520);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2525);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2528);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2529);
				match(FIRST);
				setState(2530);
				match(T__1);
				setState(2531);
				expression();
				setState(2534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2532);
					match(IGNORE);
					setState(2533);
					match(NULLS);
					}
				}

				setState(2536);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2538);
				match(LAST);
				setState(2539);
				match(T__1);
				setState(2540);
				expression();
				setState(2543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2541);
					match(IGNORE);
					setState(2542);
					match(NULLS);
					}
				}

				setState(2545);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2547);
				match(POSITION);
				setState(2548);
				match(T__1);
				setState(2549);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2550);
				match(IN);
				setState(2551);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2552);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2554);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2555);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2556);
				qualifiedName();
				setState(2557);
				match(T__4);
				setState(2558);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2560);
				match(T__1);
				setState(2561);
				namedExpression();
				setState(2564); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2562);
					match(T__3);
					setState(2563);
					namedExpression();
					}
					}
					setState(2566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2568);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2570);
				match(T__1);
				setState(2571);
				query();
				setState(2572);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2574);
				functionName();
				setState(2575);
				match(T__1);
				setState(2587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2577);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
					case 1:
						{
						setState(2576);
						setQuantifier();
						}
						break;
					}
					setState(2579);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2584);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2580);
						match(T__3);
						setState(2581);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2586);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2589);
				match(T__2);
				setState(2596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
				case 1:
					{
					setState(2590);
					match(FILTER);
					setState(2591);
					match(T__1);
					setState(2592);
					match(WHERE);
					setState(2593);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(2594);
					match(T__2);
					}
					break;
				}
				setState(2600);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(2598);
					match(OVER);
					setState(2599);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2602);
				identifier();
				setState(2603);
				match(T__7);
				setState(2604);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2606);
				match(T__1);
				setState(2607);
				identifier();
				setState(2610); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2608);
					match(T__3);
					setState(2609);
					identifier();
					}
					}
					setState(2612); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2614);
				match(T__2);
				setState(2615);
				match(T__7);
				setState(2616);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2618);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2619);
				match(T__1);
				setState(2620);
				expression();
				setState(2621);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2623);
				match(EXTRACT);
				setState(2624);
				match(T__1);
				setState(2625);
				((ExtractContext)_localctx).field = identifier();
				setState(2626);
				match(FROM);
				setState(2627);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2628);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2630);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2631);
				match(T__1);
				setState(2632);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2633);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2634);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==FOR) {
					{
					setState(2635);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2636);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2639);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2641);
				match(TRIM);
				setState(2642);
				match(T__1);
				setState(2644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(2643);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
				case 1:
					{
					setState(2646);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2649);
				match(FROM);
				setState(2650);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2651);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2653);
				match(OVERLAY);
				setState(2654);
				match(T__1);
				setState(2655);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2656);
				match(PLACING);
				setState(2657);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2658);
				match(FROM);
				setState(2659);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2660);
					match(FOR);
					setState(2661);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2664);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2676);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2668);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2669);
						match(T__8);
						setState(2670);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2671);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2673);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2674);
						match(T__4);
						setState(2675);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_constant);
		try {
			int _alt;
			setState(2693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2681);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2682);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2683);
				identifier();
				setState(2684);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2686);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2687);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2689); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2688);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2691); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2695);
			_la = _input.LA(1);
			if ( !((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & 255L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2697);
			_la = _input.LA(1);
			if ( !(_la==DIV || (((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & 1023L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2699);
			_la = _input.LA(1);
			if ( !(_la==AND || (((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 70643622084609L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2701);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2703);
			match(INTERVAL);
			setState(2706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				{
				setState(2704);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2705);
				errorCapturingUnitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2708);
			multiUnitsInterval();
			setState(2710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				{
				setState(2709);
				unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> unit = new ArrayList<IdentifierContext>();
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2715); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2712);
					intervalValue();
					setState(2713);
					((MultiUnitsIntervalContext)_localctx).identifier = identifier();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2717); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,344,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2719);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				{
				setState(2720);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2721);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2724);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2725);
			((UnitToUnitIntervalContext)_localctx).from = identifier();
			setState(2726);
			match(TO);
			setState(2727);
			((UnitToUnitIntervalContext)_localctx).to = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_intervalValue);
		int _la;
		try {
			setState(2734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2729);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2732);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2733);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_colPosition);
		try {
			setState(2739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2736);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2737);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2738);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_dataType);
		int _la;
		try {
			setState(2775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2741);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2742);
				match(LT);
				setState(2743);
				dataType();
				setState(2744);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2746);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2747);
				match(LT);
				setState(2748);
				dataType();
				setState(2749);
				match(T__3);
				setState(2750);
				dataType();
				setState(2751);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2753);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2760);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2754);
					match(LT);
					setState(2756);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
					case 1:
						{
						setState(2755);
						complexColTypeList();
						}
						break;
					}
					setState(2758);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2759);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2762);
				identifier();
				setState(2773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
				case 1:
					{
					setState(2763);
					match(T__1);
					setState(2764);
					match(INTEGER_VALUE);
					setState(2769);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2765);
						match(T__3);
						setState(2766);
						match(INTEGER_VALUE);
						}
						}
						setState(2771);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2772);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2777);
			qualifiedColTypeWithPosition();
			setState(2782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2778);
				match(T__3);
				setState(2779);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2784);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2785);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(2786);
			dataType();
			setState(2789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2787);
				match(NOT);
				setState(2788);
				match(NULL);
				}
			}

			setState(2792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2791);
				commentSpec();
				}
			}

			setState(2795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2794);
				colPosition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2797);
			colType();
			setState(2802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2798);
					match(T__3);
					setState(2799);
					colType();
					}
					} 
				}
				setState(2804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2805);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2806);
			dataType();
			setState(2809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				{
				setState(2807);
				match(NOT);
				setState(2808);
				match(NULL);
				}
				break;
			}
			setState(2812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
			case 1:
				{
				setState(2811);
				commentSpec();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2814);
			complexColType();
			setState(2819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2815);
				match(T__3);
				setState(2816);
				complexColType();
				}
				}
				setState(2821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2822);
			identifier();
			setState(2823);
			match(T__10);
			setState(2824);
			dataType();
			setState(2827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2825);
				match(NOT);
				setState(2826);
				match(NULL);
				}
			}

			setState(2830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2829);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2832);
			match(WHEN);
			setState(2833);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2834);
			match(THEN);
			setState(2835);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2837);
			match(WINDOW);
			setState(2838);
			namedWindow();
			setState(2843);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,364,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2839);
					match(T__3);
					setState(2840);
					namedWindow();
					}
					} 
				}
				setState(2845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,364,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2846);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2847);
			match(AS);
			setState(2848);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_windowSpec);
		int _la;
		try {
			setState(2896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2850);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2851);
				match(T__1);
				setState(2852);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2853);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2855);
				match(T__1);
				setState(2890);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2856);
					match(CLUSTER);
					setState(2857);
					match(BY);
					setState(2858);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2863);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2859);
						match(T__3);
						setState(2860);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2865);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(2876);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2866);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2867);
						match(BY);
						setState(2868);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2873);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2869);
							match(T__3);
							setState(2870);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2875);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2888);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2878);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2879);
						match(BY);
						setState(2880);
						sortItem();
						setState(2885);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2881);
							match(T__3);
							setState(2882);
							sortItem();
							}
							}
							setState(2887);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2892);
					windowFrame();
					}
				}

				setState(2895);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_windowFrame);
		try {
			setState(2914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2898);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2899);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2900);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2901);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2902);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2903);
				match(BETWEEN);
				setState(2904);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2905);
				match(AND);
				setState(2906);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2908);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2909);
				match(BETWEEN);
				setState(2910);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2911);
				match(AND);
				setState(2912);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_frameBound);
		int _la;
		try {
			setState(2923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2916);
				match(UNBOUNDED);
				setState(2917);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2918);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2919);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2920);
				expression();
				setState(2921);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2925);
			qualifiedName();
			setState(2930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2926);
				match(T__3);
				setState(2927);
				qualifiedName();
				}
				}
				setState(2932);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_functionName);
		try {
			setState(2937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2933);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2934);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2935);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2936);
				match(RIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2939);
			identifier();
			setState(2944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,377,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2940);
					match(T__4);
					setState(2941);
					identifier();
					}
					} 
				}
				setState(2946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,377,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2947);
			identifier();
			setState(2948);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(2957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2952); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2950);
						match(MINUS);
						setState(2951);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2954); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,378,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_identifier);
		try {
			setState(2962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2959);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2960);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(2961);
				strictNonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_strictIdentifier);
		try {
			setState(2970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2964);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2965);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2966);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(2967);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2968);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(2969);
				nonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2972);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLegacyDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLegacyDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SqlBaseParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_number);
		int _la;
		try {
			setState(3017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2974);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(2976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2975);
					match(MINUS);
					}
				}

				setState(2978);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2979);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(2981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2980);
					match(MINUS);
					}
				}

				setState(2983);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2984);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(2986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2985);
					match(MINUS);
					}
				}

				setState(2988);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2989);
					match(MINUS);
					}
				}

				setState(2992);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2993);
					match(MINUS);
					}
				}

				setState(2996);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2997);
					match(MINUS);
					}
				}

				setState(3000);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3001);
					match(MINUS);
					}
				}

				setState(3004);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3005);
					match(MINUS);
					}
				}

				setState(3008);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(3010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3009);
					match(MINUS);
					}
				}

				setState(3012);
				match(FLOAT_LITERAL);
				}
				break;
			case 10:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(3014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3013);
					match(MINUS);
					}
				}

				setState(3016);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterColumnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterColumnAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterColumnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_alterColumnAction);
		int _la;
		try {
			setState(3026);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3019);
				match(TYPE);
				setState(3020);
				dataType();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3021);
				commentSpec();
				}
				break;
			case AFTER:
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(3022);
				colPosition();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(3023);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3024);
				match(NOT);
				setState(3025);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3028);
			_la = _input.LA(1);
			if ( !((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & -2306377924328072357L) != 0 || (((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & -27418046384660527L) != 0 || (((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & -4620728436433669377L) != 0 || (((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & 94145682356043255L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3030);
			_la = _input.LA(1);
			if ( !((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & -9223371968135299071L) != 0 || (((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 9147937288634369L) != 0 || (((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & 578712552117175297L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3032);
			_la = _input.LA(1);
			if ( !((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & -4398046511169L) != 0 || (((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & -18305219368583201L) != 0 || (((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 9214364837600018175L) != 0 || (((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & 143832613587517407L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 97:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 99:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 100:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 131:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 132:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 134:
			return number_sempred((NumberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enbled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enbled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enbled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SQL_standard_keyword_behavior;
		case 18:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 20:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 21:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u0126\u0bdb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0001\u0000\u0001\u0000\u0005\u0000\u0119"+
		"\b\u0000\n\u0000\f\u0000\u011c\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0134\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0139\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0141\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0149\b\u0007"+
		"\n\u0007\f\u0007\u014c\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u015f\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0163\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0169\b\u0007\u0001\u0007\u0003\u0007\u016c\b\u0007\u0001\u0007"+
		"\u0003\u0007\u016f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0176\b\u0007\u0001\u0007\u0003\u0007\u0179\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u017d\b\u0007\u0001\u0007\u0003"+
		"\u0007\u0180\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0187\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u0192\b\u0007\n\u0007\f\u0007\u0195\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u019c\b\u0007\u0001\u0007"+
		"\u0003\u0007\u019f\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u01a3\b"+
		"\u0007\u0001\u0007\u0003\u0007\u01a6\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u01ac\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u01b7\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u01f7"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0200\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0204\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u020a\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u020e\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0213\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0219\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0225\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u022d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0233\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0240\b\u0007\u0001\u0007\u0004\u0007\u0243\b\u0007\u000b"+
		"\u0007\f\u0007\u0244\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0255\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u025a\b\u0007\n\u0007\f\u0007"+
		"\u025d\t\u0007\u0001\u0007\u0003\u0007\u0260\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0266\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0275\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0279\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u027f\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0285\b\u0007"+
		"\u0001\u0007\u0003\u0007\u0288\b\u0007\u0001\u0007\u0003\u0007\u028b\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0291"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0295\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u029d\b\u0007\n\u0007\f\u0007\u02a0\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02a8\b\u0007\u0001"+
		"\u0007\u0003\u0007\u02ab\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02b4\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02b9\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02bf\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02c6\b\u0007\u0001"+
		"\u0007\u0003\u0007\u02c9\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u02cf\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u02d8\b\u0007\n"+
		"\u0007\f\u0007\u02db\t\u0007\u0003\u0007\u02dd\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u02e1\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u02e6\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02eb"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u02f2\b\u0007\u0001\u0007\u0003\u0007\u02f5\b\u0007\u0001\u0007"+
		"\u0003\u0007\u02f8\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u02ff\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0304\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u030d\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0315\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u031b\b\u0007\u0001\u0007\u0003\u0007\u031e\b\u0007\u0001\u0007\u0003"+
		"\u0007\u0321\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0327\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u032b\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u032f\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0333\b\u0007\u0003\u0007\u0335\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u033d"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0345\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u034b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0351\b\u0007\u0001\u0007\u0003\u0007\u0354\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0358\b\u0007\u0001\u0007\u0003\u0007"+
		"\u035b\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u035f\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u0379\b\u0007\n\u0007\f\u0007\u037c\t\u0007\u0003\u0007\u037e\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0382\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0388\b\u0007\u0001\u0007\u0003"+
		"\u0007\u038b\b\u0007\u0001\u0007\u0003\u0007\u038e\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0394\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u039c\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03a1\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03a7"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03ad"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u03b7\b\u0007\n\u0007\f\u0007"+
		"\u03ba\t\u0007\u0003\u0007\u03bc\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u03c1\b\u0007\n\u0007\f\u0007\u03c4\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u03d2\b\u0007\n\u0007\f\u0007\u03d5\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u03e0\b\u0007\n\u0007\f\u0007\u03e3\t\u0007\u0003\u0007"+
		"\u03e5\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u03e9\b\u0007\n\u0007"+
		"\f\u0007\u03ec\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u03f2\b\u0007\n\u0007\f\u0007\u03f5\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u03fb\b\u0007\n\u0007\f\u0007"+
		"\u03fe\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0402\b\u0007\n\u0007"+
		"\f\u0007\u0405\t\u0007\u0003\u0007\u0407\b\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0413"+
		"\b\n\u0001\n\u0001\n\u0003\n\u0417\b\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u041e\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0492\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u049a\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u04a2"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u04ab"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u04b5\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u04b9\b\u000b\u0001\u000b"+
		"\u0003\u000b\u04bc\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u04c2\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003"+
		"\f\u04c8\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u04d4\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u04e0\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u04e5"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0003\u0011\u04ee\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u04f6\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u04fd"+
		"\b\u0012\u0003\u0012\u04ff\b\u0012\u0001\u0012\u0003\u0012\u0502\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0507\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u050b\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0510\b\u0012\u0001\u0012\u0003\u0012\u0513\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0518\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u051d\b\u0012\u0001\u0012\u0003\u0012\u0520"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0525\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0529\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u052e\b\u0012\u0003\u0012\u0530\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0534\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u053b\b\u0014\n\u0014\f\u0014"+
		"\u053e\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0545\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u054e\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u0553\b\u0018\n\u0018\f\u0018\u0556"+
		"\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u055c"+
		"\b\u0019\n\u0019\f\u0019\u055f\t\u0019\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0563\b\u001a\u0001\u001a\u0003\u001a\u0566\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u057c\b\u001c\n\u001c\f\u001c\u057f\t\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0585\b\u001d\n\u001d"+
		"\f\u001d\u0588\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u058e\b\u001e\u0001\u001e\u0003\u001e\u0591\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0596\b\u001f\n\u001f\f\u001f"+
		"\u0599\t\u001f\u0001\u001f\u0003\u001f\u059c\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u05a2\b \u0001!\u0001!\u0001!\u0001!\u0005!\u05a8\b!\n"+
		"!\f!\u05ab\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u05b3"+
		"\b\"\n\"\f\"\u05b6\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u05c0\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u05c7"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0003%\u05cd\b%\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0004\'\u05d8\b\'\u000b\'\f"+
		"\'\u05d9\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u05e1\b\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u05e8\b\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u05f4"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u05fa\b\'\n\'\f\'\u05fd\t"+
		"\'\u0001\'\u0005\'\u0600\b\'\n\'\f\'\u0603\t\'\u0003\'\u0605\b\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0005(\u060c\b(\n(\f(\u060f\t(\u0003(\u0611"+
		"\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0618\b(\n(\f(\u061b\t("+
		"\u0003(\u061d\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0624\b(\n"+
		"(\f(\u0627\t(\u0003(\u0629\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005"+
		"(\u0630\b(\n(\f(\u0633\t(\u0003(\u0635\b(\u0001(\u0003(\u0638\b(\u0001"+
		"(\u0001(\u0001(\u0003(\u063d\b(\u0003(\u063f\b(\u0001)\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u064b\b*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u0652\b*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u0659\b*\u0001*\u0005*\u065c\b*\n*\f*\u065f\t*\u0001+\u0001+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u066a\b+\u0001"+
		",\u0001,\u0003,\u066e\b,\u0001,\u0001,\u0003,\u0672\b,\u0001-\u0001-\u0004"+
		"-\u0676\b-\u000b-\f-\u0677\u0001.\u0001.\u0003.\u067c\b.\u0001.\u0001"+
		".\u0001.\u0001.\u0005.\u0682\b.\n.\f.\u0685\t.\u0001.\u0003.\u0688\b."+
		"\u0001.\u0003.\u068b\b.\u0001.\u0003.\u068e\b.\u0001.\u0003.\u0691\b."+
		"\u0001.\u0001.\u0003.\u0695\b.\u0001/\u0001/\u0003/\u0699\b/\u0001/\u0003"+
		"/\u069c\b/\u0001/\u0001/\u0003/\u06a0\b/\u0001/\u0005/\u06a3\b/\n/\f/"+
		"\u06a6\t/\u0001/\u0003/\u06a9\b/\u0001/\u0003/\u06ac\b/\u0001/\u0003/"+
		"\u06af\b/\u0001/\u0003/\u06b2\b/\u0003/\u06b4\b/\u00010\u00010\u00010"+
		"\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u06c0\b0\u0001"+
		"0\u00030\u06c3\b0\u00010\u00010\u00030\u06c7\b0\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00030\u06d1\b0\u00010\u00010\u00030\u06d5"+
		"\b0\u00030\u06d7\b0\u00010\u00030\u06da\b0\u00010\u00010\u00030\u06de"+
		"\b0\u00011\u00011\u00051\u06e2\b1\n1\f1\u06e5\t1\u00011\u00031\u06e8\b"+
		"1\u00011\u00011\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u0003"+
		"3\u06f3\b3\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u0003"+
		"4\u06fd\b4\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u0709\b5\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00056\u0716\b6\n6\f6\u0719\t6\u00016\u0001"+
		"6\u00036\u071d\b6\u00017\u00017\u00017\u00057\u0722\b7\n7\f7\u0725\t7"+
		"\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u0001:\u0001:\u0001"+
		":\u0001;\u0001;\u0001;\u0003;\u0734\b;\u0001;\u0005;\u0737\b;\n;\f;\u073a"+
		"\t;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0005<\u0744"+
		"\b<\n<\f<\u0747\t<\u0001<\u0001<\u0003<\u074b\b<\u0001=\u0001=\u0001="+
		"\u0001=\u0005=\u0751\b=\n=\f=\u0754\t=\u0001=\u0005=\u0757\b=\n=\f=\u075a"+
		"\t=\u0001=\u0003=\u075d\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0005>\u0764"+
		"\b>\n>\f>\u0767\t>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0005>\u0773\b>\n>\f>\u0776\t>\u0001>\u0001>\u0003>\u077a"+
		"\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0005>\u0784"+
		"\b>\n>\f>\u0787\t>\u0001>\u0001>\u0003>\u078b\b>\u0001?\u0001?\u0001?"+
		"\u0001?\u0005?\u0791\b?\n?\f?\u0794\t?\u0003?\u0796\b?\u0001?\u0001?\u0003"+
		"?\u079a\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0005@\u07a6\b@\n@\f@\u07a9\t@\u0001@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0005A\u07b3\bA\nA\fA\u07b6\tA\u0001A\u0001A\u0003"+
		"A\u07ba\bA\u0001B\u0001B\u0003B\u07be\bB\u0001B\u0003B\u07c1\bB\u0001"+
		"C\u0001C\u0001C\u0003C\u07c6\bC\u0001C\u0001C\u0001C\u0001C\u0001C\u0005"+
		"C\u07cd\bC\nC\fC\u07d0\tC\u0003C\u07d2\bC\u0001C\u0001C\u0001C\u0003C"+
		"\u07d7\bC\u0001C\u0001C\u0001C\u0005C\u07dc\bC\nC\fC\u07df\tC\u0003C\u07e1"+
		"\bC\u0001D\u0001D\u0001E\u0001E\u0005E\u07e7\bE\nE\fE\u07ea\tE\u0001F"+
		"\u0001F\u0001F\u0001F\u0003F\u07f0\bF\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u07f7\bF\u0001G\u0003G\u07fa\bG\u0001G\u0001G\u0001G\u0003G\u07ff"+
		"\bG\u0001G\u0003G\u0802\bG\u0001G\u0001G\u0001G\u0003G\u0807\bG\u0001"+
		"G\u0001G\u0003G\u080b\bG\u0001G\u0003G\u080e\bG\u0001G\u0003G\u0811\b"+
		"G\u0001H\u0001H\u0001H\u0001H\u0003H\u0817\bH\u0001I\u0001I\u0001I\u0003"+
		"I\u081c\bI\u0001I\u0001I\u0001J\u0003J\u0821\bJ\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0003J\u0833\bJ\u0003J\u0835\bJ\u0001J\u0003J\u0838\b"+
		"J\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0005L\u0841\bL\nL"+
		"\fL\u0844\tL\u0001M\u0001M\u0001M\u0001M\u0005M\u084a\bM\nM\fM\u084d\t"+
		"M\u0001M\u0001M\u0001N\u0001N\u0003N\u0853\bN\u0001O\u0001O\u0001O\u0001"+
		"O\u0005O\u0859\bO\nO\fO\u085c\tO\u0001O\u0001O\u0001P\u0001P\u0003P\u0862"+
		"\bP\u0001Q\u0001Q\u0003Q\u0866\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0003Q\u086e\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u0876"+
		"\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u087c\bQ\u0001R\u0001R\u0001R\u0001"+
		"R\u0005R\u0882\bR\nR\fR\u0885\tR\u0001R\u0001R\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0005S\u088e\bS\nS\fS\u0891\tS\u0003S\u0893\bS\u0001S\u0001S"+
		"\u0001S\u0001T\u0003T\u0899\bT\u0001T\u0001T\u0003T\u089d\bT\u0003T\u089f"+
		"\bT\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u08a8\bU\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003"+
		"U\u08b4\bU\u0003U\u08b6\bU\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u08bd"+
		"\bU\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u08c4\bU\u0001U\u0001U\u0001"+
		"U\u0001U\u0003U\u08ca\bU\u0001U\u0001U\u0001U\u0001U\u0003U\u08d0\bU\u0003"+
		"U\u08d2\bU\u0001V\u0001V\u0001V\u0005V\u08d7\bV\nV\fV\u08da\tV\u0001W"+
		"\u0001W\u0001W\u0005W\u08df\bW\nW\fW\u08e2\tW\u0001X\u0001X\u0001X\u0003"+
		"X\u08e7\bX\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0003Y\u08ee\bY\u0001Y\u0001"+
		"Y\u0001Z\u0001Z\u0003Z\u08f4\bZ\u0001Z\u0001Z\u0003Z\u08f8\bZ\u0003Z\u08fa"+
		"\bZ\u0001[\u0001[\u0001[\u0005[\u08ff\b[\n[\f[\u0902\t[\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0005\\\u0908\b\\\n\\\f\\\u090b\t\\\u0001\\\u0001\\"+
		"\u0001]\u0001]\u0003]\u0911\b]\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0005^\u0919\b^\n^\f^\u091c\t^\u0001^\u0001^\u0003^\u0920\b^\u0001_"+
		"\u0001_\u0003_\u0924\b_\u0001`\u0001`\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0003a\u0932\ba\u0003a\u0934\ba\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0005a\u093c\ba\na\fa\u093f\ta\u0001"+
		"b\u0003b\u0942\bb\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0003b\u094a"+
		"\bb\u0001b\u0001b\u0001b\u0001b\u0001b\u0005b\u0951\bb\nb\fb\u0954\tb"+
		"\u0001b\u0001b\u0001b\u0003b\u0959\bb\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0003b\u0961\bb\u0001b\u0001b\u0001b\u0003b\u0966\bb\u0001b\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0005b\u0970\bb\nb\fb\u0973"+
		"\tb\u0001b\u0001b\u0003b\u0977\bb\u0001b\u0003b\u097a\bb\u0001b\u0001"+
		"b\u0001b\u0001b\u0003b\u0980\bb\u0001b\u0001b\u0003b\u0984\bb\u0001b\u0001"+
		"b\u0001b\u0003b\u0989\bb\u0001b\u0001b\u0001b\u0003b\u098e\bb\u0001b\u0001"+
		"b\u0001b\u0003b\u0993\bb\u0001c\u0001c\u0001c\u0001c\u0003c\u0999\bc\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0005c\u09ae"+
		"\bc\nc\fc\u09b1\tc\u0001d\u0001d\u0001d\u0001d\u0004d\u09b7\bd\u000bd"+
		"\fd\u09b8\u0001d\u0001d\u0003d\u09bd\bd\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0004d\u09c4\bd\u000bd\fd\u09c5\u0001d\u0001d\u0003d\u09ca\bd\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0005d\u09da\bd\nd\fd\u09dd\td\u0003d\u09df\bd"+
		"\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0003d\u09e7\bd\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0003d\u09f0\bd\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0004d\u0a05\bd\u000bd\fd"+
		"\u0a06\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d"+
		"\u0003d\u0a12\bd\u0001d\u0001d\u0001d\u0005d\u0a17\bd\nd\fd\u0a1a\td\u0003"+
		"d\u0a1c\bd\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0003d\u0a25"+
		"\bd\u0001d\u0001d\u0003d\u0a29\bd\u0001d\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0004d\u0a33\bd\u000bd\fd\u0a34\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0003"+
		"d\u0a4e\bd\u0001d\u0001d\u0001d\u0001d\u0001d\u0003d\u0a55\bd\u0001d\u0003"+
		"d\u0a58\bd\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0003d\u0a67\bd\u0001d\u0001d\u0003d\u0a6b"+
		"\bd\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0005d\u0a75"+
		"\bd\nd\fd\u0a78\td\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0004e\u0a82\be\u000be\fe\u0a83\u0003e\u0a86\be\u0001f\u0001f\u0001"+
		"g\u0001g\u0001h\u0001h\u0001i\u0001i\u0001j\u0001j\u0001j\u0003j\u0a93"+
		"\bj\u0001k\u0001k\u0003k\u0a97\bk\u0001l\u0001l\u0001l\u0004l\u0a9c\b"+
		"l\u000bl\fl\u0a9d\u0001m\u0001m\u0001m\u0003m\u0aa3\bm\u0001n\u0001n\u0001"+
		"n\u0001n\u0001n\u0001o\u0003o\u0aab\bo\u0001o\u0001o\u0003o\u0aaf\bo\u0001"+
		"p\u0001p\u0001p\u0003p\u0ab4\bp\u0001q\u0001q\u0001q\u0001q\u0001q\u0001"+
		"q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0003"+
		"q\u0ac5\bq\u0001q\u0001q\u0003q\u0ac9\bq\u0001q\u0001q\u0001q\u0001q\u0001"+
		"q\u0005q\u0ad0\bq\nq\fq\u0ad3\tq\u0001q\u0003q\u0ad6\bq\u0003q\u0ad8\b"+
		"q\u0001r\u0001r\u0001r\u0005r\u0add\br\nr\fr\u0ae0\tr\u0001s\u0001s\u0001"+
		"s\u0001s\u0003s\u0ae6\bs\u0001s\u0003s\u0ae9\bs\u0001s\u0003s\u0aec\b"+
		"s\u0001t\u0001t\u0001t\u0005t\u0af1\bt\nt\ft\u0af4\tt\u0001u\u0001u\u0001"+
		"u\u0001u\u0003u\u0afa\bu\u0001u\u0003u\u0afd\bu\u0001v\u0001v\u0001v\u0005"+
		"v\u0b02\bv\nv\fv\u0b05\tv\u0001w\u0001w\u0001w\u0001w\u0001w\u0003w\u0b0c"+
		"\bw\u0001w\u0003w\u0b0f\bw\u0001x\u0001x\u0001x\u0001x\u0001x\u0001y\u0001"+
		"y\u0001y\u0001y\u0005y\u0b1a\by\ny\fy\u0b1d\ty\u0001z\u0001z\u0001z\u0001"+
		"z\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0005{\u0b2e\b{\n{\f{\u0b31\t{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0005{\u0b38\b{\n{\f{\u0b3b\t{\u0003{\u0b3d\b{\u0001{\u0001{\u0001{"+
		"\u0001{\u0001{\u0005{\u0b44\b{\n{\f{\u0b47\t{\u0003{\u0b49\b{\u0003{\u0b4b"+
		"\b{\u0001{\u0003{\u0b4e\b{\u0001{\u0003{\u0b51\b{\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0003|\u0b63\b|\u0001}\u0001}\u0001}\u0001}\u0001"+
		"}\u0001}\u0001}\u0003}\u0b6c\b}\u0001~\u0001~\u0001~\u0005~\u0b71\b~\n"+
		"~\f~\u0b74\t~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f"+
		"\u0b7a\b\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0005\u0080\u0b7f\b"+
		"\u0080\n\u0080\f\u0080\u0b82\t\u0080\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0082\u0001\u0082\u0004\u0082\u0b89\b\u0082\u000b\u0082\f\u0082"+
		"\u0b8a\u0001\u0082\u0003\u0082\u0b8e\b\u0082\u0001\u0083\u0001\u0083\u0001"+
		"\u0083\u0003\u0083\u0b93\b\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001"+
		"\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u0b9b\b\u0084\u0001\u0085\u0001"+
		"\u0085\u0001\u0086\u0001\u0086\u0003\u0086\u0ba1\b\u0086\u0001\u0086\u0001"+
		"\u0086\u0001\u0086\u0003\u0086\u0ba6\b\u0086\u0001\u0086\u0001\u0086\u0001"+
		"\u0086\u0003\u0086\u0bab\b\u0086\u0001\u0086\u0001\u0086\u0003\u0086\u0baf"+
		"\b\u0086\u0001\u0086\u0001\u0086\u0003\u0086\u0bb3\b\u0086\u0001\u0086"+
		"\u0001\u0086\u0003\u0086\u0bb7\b\u0086\u0001\u0086\u0001\u0086\u0003\u0086"+
		"\u0bbb\b\u0086\u0001\u0086\u0001\u0086\u0003\u0086\u0bbf\b\u0086\u0001"+
		"\u0086\u0001\u0086\u0003\u0086\u0bc3\b\u0086\u0001\u0086\u0001\u0086\u0003"+
		"\u0086\u0bc7\b\u0086\u0001\u0086\u0003\u0086\u0bca\b\u0086\u0001\u0087"+
		"\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087"+
		"\u0003\u0087\u0bd3\b\u0087\u0001\u0088\u0001\u0088\u0001\u0089\u0001\u0089"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\t\u037a\u03b8\u03c2\u03d3\u03e1\u03ea"+
		"\u03f3\u03fc\u0403\u0004T\u00c2\u00c6\u00c8\u008b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0000+\u0002"+
		"\u0000@@\u00b1\u00b1\u0002\u0000  \u00bf\u00bf\u0002\u0000??\u0093\u0093"+
		"\u0002\u0000ddpp\u0001\u0000+,\u0002\u0000\u00df\u00df\u00fe\u00fe\u0002"+
		"\u0000\u000f\u000f##\u0005\u0000((44VVcc\u008c\u008c\u0001\u0000DE\u0002"+
		"\u0000VVcc\u0002\u0000\u0097\u0097\u0117\u0117\u0002\u0000\f\f\u0086\u0086"+
		"\u0002\u0000\u0088\u0088\u0117\u0117\u0003\u0000>>\u0092\u0092\u00c9\u00c9"+
		"\u0004\u0000QQww\u00d1\u00d1\u00f4\u00f4\u0003\u0000QQ\u00d1\u00d1\u00f4"+
		"\u00f4\u0002\u0000\u0017\u0017DD\u0002\u0000^^~~\u0002\u0000\u000e\u000e"+
		"II\u0002\u0000\u011b\u011b\u011d\u011d\u0003\u0000\u000e\u000e\u0013\u0013"+
		"\u00d5\u00d5\u0003\u0000YY\u00ee\u00ee\u00f6\u00f6\u0002\u0000\u010d\u010e"+
		"\u0112\u0112\u0002\u0000KK\u010f\u0111\u0002\u0000\u010d\u010e\u0115\u0115"+
		"\u0002\u000099;;\u0001\u0000\u00dd\u00de\u0002\u0000\u0004\u0004dd\u0002"+
		"\u0000\u0004\u0004``\u0003\u0000\u001b\u001b\u0081\u0081\u00e9\u00e9\u0001"+
		"\u0000\u0105\u010c\u0002\u0000KK\u010d\u0116\u0004\u0000\u0011\u0011p"+
		"p\u0096\u0096\u009e\u009e\u0002\u0000YY\u00ee\u00ee\u0001\u0000\u010d"+
		"\u010e\u0002\u0000JJ\u00a7\u00a7\u0002\u0000\u009f\u009f\u00d6\u00d6\u0002"+
		"\u0000__\u00ae\u00ae\u0001\u0000\u011c\u011d\u0002\u0000LL\u00d0\u00d0"+
		"0\u0000\f\r\u000f\u0010\u0012\u0012\u0014\u0015\u0017\u0018\u001a\u001a"+
		"\u001c ##%(**,24478=HJLPPRX[[]_bcfhkkmoqrtvxx{{}\u0080\u0083\u0093\u0095"+
		"\u0095\u0098\u0099\u009c\u009d\u00a0\u00a0\u00a2\u00a3\u00a5\u00ae\u00b0"+
		"\u00b8\u00ba\u00c0\u00c2\u00c9\u00cb\u00ce\u00d0\u00d4\u00d6\u00de\u00e0"+
		"\u00e4\u00e8\u00e8\u00ea\u00f3\u00f7\u00fa\u00fd\u00ff\u0102\u0102\u0104"+
		"\u0104\u000f\u0000\u0012\u001266QQeessww||\u0082\u0082\u0094\u0094\u009a"+
		"\u009a\u00c1\u00c1\u00cb\u00cb\u00d1\u00d1\u00f4\u00f4\u00fc\u00fc\u0010"+
		"\u0000\f\u0011\u001357PRdfrtvx{}\u0081\u0083\u0093\u0095\u0099\u009b\u00c0"+
		"\u00c2\u00ca\u00cc\u00d0\u00d2\u00f3\u00f5\u00fb\u00fd\u0104\u0db0\u0000"+
		"\u0116\u0001\u0000\u0000\u0000\u0002\u011f\u0001\u0000\u0000\u0000\u0004"+
		"\u0122\u0001\u0000\u0000\u0000\u0006\u0125\u0001\u0000\u0000\u0000\b\u0128"+
		"\u0001\u0000\u0000\u0000\n\u012b\u0001\u0000\u0000\u0000\f\u012e\u0001"+
		"\u0000\u0000\u0000\u000e\u0406\u0001\u0000\u0000\u0000\u0010\u0408\u0001"+
		"\u0000\u0000\u0000\u0012\u040a\u0001\u0000\u0000\u0000\u0014\u04b4\u0001"+
		"\u0000\u0000\u0000\u0016\u04b6\u0001\u0000\u0000\u0000\u0018\u04c7\u0001"+
		"\u0000\u0000\u0000\u001a\u04cd\u0001\u0000\u0000\u0000\u001c\u04d9\u0001"+
		"\u0000\u0000\u0000\u001e\u04e6\u0001\u0000\u0000\u0000 \u04e9\u0001\u0000"+
		"\u0000\u0000\"\u04ed\u0001\u0000\u0000\u0000$\u052f\u0001\u0000\u0000"+
		"\u0000&\u0531\u0001\u0000\u0000\u0000(\u0535\u0001\u0000\u0000\u0000*"+
		"\u0541\u0001\u0000\u0000\u0000,\u0546\u0001\u0000\u0000\u0000.\u054d\u0001"+
		"\u0000\u0000\u00000\u054f\u0001\u0000\u0000\u00002\u0557\u0001\u0000\u0000"+
		"\u00004\u0560\u0001\u0000\u0000\u00006\u056b\u0001\u0000\u0000\u00008"+
		"\u057d\u0001\u0000\u0000\u0000:\u0580\u0001\u0000\u0000\u0000<\u058b\u0001"+
		"\u0000\u0000\u0000>\u059b\u0001\u0000\u0000\u0000@\u05a1\u0001\u0000\u0000"+
		"\u0000B\u05a3\u0001\u0000\u0000\u0000D\u05ae\u0001\u0000\u0000\u0000F"+
		"\u05bf\u0001\u0000\u0000\u0000H\u05c6\u0001\u0000\u0000\u0000J\u05c8\u0001"+
		"\u0000\u0000\u0000L\u05ce\u0001\u0000\u0000\u0000N\u0604\u0001\u0000\u0000"+
		"\u0000P\u0610\u0001\u0000\u0000\u0000R\u0640\u0001\u0000\u0000\u0000T"+
		"\u0643\u0001\u0000\u0000\u0000V\u0669\u0001\u0000\u0000\u0000X\u066b\u0001"+
		"\u0000\u0000\u0000Z\u0673\u0001\u0000\u0000\u0000\\\u0694\u0001\u0000"+
		"\u0000\u0000^\u06b3\u0001\u0000\u0000\u0000`\u06bf\u0001\u0000\u0000\u0000"+
		"b\u06df\u0001\u0000\u0000\u0000d\u06eb\u0001\u0000\u0000\u0000f\u06ee"+
		"\u0001\u0000\u0000\u0000h\u06f7\u0001\u0000\u0000\u0000j\u0708\u0001\u0000"+
		"\u0000\u0000l\u071c\u0001\u0000\u0000\u0000n\u071e\u0001\u0000\u0000\u0000"+
		"p\u0726\u0001\u0000\u0000\u0000r\u072a\u0001\u0000\u0000\u0000t\u072d"+
		"\u0001\u0000\u0000\u0000v\u0730\u0001\u0000\u0000\u0000x\u074a\u0001\u0000"+
		"\u0000\u0000z\u074c\u0001\u0000\u0000\u0000|\u078a\u0001\u0000\u0000\u0000"+
		"~\u0799\u0001\u0000\u0000\u0000\u0080\u079b\u0001\u0000\u0000\u0000\u0082"+
		"\u07b9\u0001\u0000\u0000\u0000\u0084\u07bb\u0001\u0000\u0000\u0000\u0086"+
		"\u07c2\u0001\u0000\u0000\u0000\u0088\u07e2\u0001\u0000\u0000\u0000\u008a"+
		"\u07e4\u0001\u0000\u0000\u0000\u008c\u07f6\u0001\u0000\u0000\u0000\u008e"+
		"\u0810\u0001\u0000\u0000\u0000\u0090\u0816\u0001\u0000\u0000\u0000\u0092"+
		"\u0818\u0001\u0000\u0000\u0000\u0094\u0837\u0001\u0000\u0000\u0000\u0096"+
		"\u0839\u0001\u0000\u0000\u0000\u0098\u083d\u0001\u0000\u0000\u0000\u009a"+
		"\u0845\u0001\u0000\u0000\u0000\u009c\u0850\u0001\u0000\u0000\u0000\u009e"+
		"\u0854\u0001\u0000\u0000\u0000\u00a0\u085f\u0001\u0000\u0000\u0000\u00a2"+
		"\u087b\u0001\u0000\u0000\u0000\u00a4\u087d\u0001\u0000\u0000\u0000\u00a6"+
		"\u0888\u0001\u0000\u0000\u0000\u00a8\u089e\u0001\u0000\u0000\u0000\u00aa"+
		"\u08d1\u0001\u0000\u0000\u0000\u00ac\u08d3\u0001\u0000\u0000\u0000\u00ae"+
		"\u08db\u0001\u0000\u0000\u0000\u00b0\u08e6\u0001\u0000\u0000\u0000\u00b2"+
		"\u08ed\u0001\u0000\u0000\u0000\u00b4\u08f1\u0001\u0000\u0000\u0000\u00b6"+
		"\u08fb\u0001\u0000\u0000\u0000\u00b8\u0903\u0001\u0000\u0000\u0000\u00ba"+
		"\u0910\u0001\u0000\u0000\u0000\u00bc\u091f\u0001\u0000\u0000\u0000\u00be"+
		"\u0923\u0001\u0000\u0000\u0000\u00c0\u0925\u0001\u0000\u0000\u0000\u00c2"+
		"\u0933\u0001\u0000\u0000\u0000\u00c4\u0992\u0001\u0000\u0000\u0000\u00c6"+
		"\u0998\u0001\u0000\u0000\u0000\u00c8\u0a6a\u0001\u0000\u0000\u0000\u00ca"+
		"\u0a85\u0001\u0000\u0000\u0000\u00cc\u0a87\u0001\u0000\u0000\u0000\u00ce"+
		"\u0a89\u0001\u0000\u0000\u0000\u00d0\u0a8b\u0001\u0000\u0000\u0000\u00d2"+
		"\u0a8d\u0001\u0000\u0000\u0000\u00d4\u0a8f\u0001\u0000\u0000\u0000\u00d6"+
		"\u0a94\u0001\u0000\u0000\u0000\u00d8\u0a9b\u0001\u0000\u0000\u0000\u00da"+
		"\u0a9f\u0001\u0000\u0000\u0000\u00dc\u0aa4\u0001\u0000\u0000\u0000\u00de"+
		"\u0aae\u0001\u0000\u0000\u0000\u00e0\u0ab3\u0001\u0000\u0000\u0000\u00e2"+
		"\u0ad7\u0001\u0000\u0000\u0000\u00e4\u0ad9\u0001\u0000\u0000\u0000\u00e6"+
		"\u0ae1\u0001\u0000\u0000\u0000\u00e8\u0aed\u0001\u0000\u0000\u0000\u00ea"+
		"\u0af5\u0001\u0000\u0000\u0000\u00ec\u0afe\u0001\u0000\u0000\u0000\u00ee"+
		"\u0b06\u0001\u0000\u0000\u0000\u00f0\u0b10\u0001\u0000\u0000\u0000\u00f2"+
		"\u0b15\u0001\u0000\u0000\u0000\u00f4\u0b1e\u0001\u0000\u0000\u0000\u00f6"+
		"\u0b50\u0001\u0000\u0000\u0000\u00f8\u0b62\u0001\u0000\u0000\u0000\u00fa"+
		"\u0b6b\u0001\u0000\u0000\u0000\u00fc\u0b6d\u0001\u0000\u0000\u0000\u00fe"+
		"\u0b79\u0001\u0000\u0000\u0000\u0100\u0b7b\u0001\u0000\u0000\u0000\u0102"+
		"\u0b83\u0001\u0000\u0000\u0000\u0104\u0b8d\u0001\u0000\u0000\u0000\u0106"+
		"\u0b92\u0001\u0000\u0000\u0000\u0108\u0b9a\u0001\u0000\u0000\u0000\u010a"+
		"\u0b9c\u0001\u0000\u0000\u0000\u010c\u0bc9\u0001\u0000\u0000\u0000\u010e"+
		"\u0bd2\u0001\u0000\u0000\u0000\u0110\u0bd4\u0001\u0000\u0000\u0000\u0112"+
		"\u0bd6\u0001\u0000\u0000\u0000\u0114\u0bd8\u0001\u0000\u0000\u0000\u0116"+
		"\u011a\u0003\u000e\u0007\u0000\u0117\u0119\u0005\u0001\u0000\u0000\u0118"+
		"\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0005\u0000\u0000\u0001\u011e\u0001\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0003\u00b4Z\u0000\u0120\u0121\u0005\u0000\u0000\u0001\u0121\u0003"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0003\u00b0X\u0000\u0123\u0124\u0005"+
		"\u0000\u0000\u0001\u0124\u0005\u0001\u0000\u0000\u0000\u0125\u0126\u0003"+
		"\u00aeW\u0000\u0126\u0127\u0005\u0000\u0000\u0001\u0127\u0007\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0003\u00b2Y\u0000\u0129\u012a\u0005\u0000\u0000"+
		"\u0001\u012a\t\u0001\u0000\u0000\u0000\u012b\u012c\u0003\u00e2q\u0000"+
		"\u012c\u012d\u0005\u0000\u0000\u0001\u012d\u000b\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0003\u00e8t\u0000\u012f\u0130\u0005\u0000\u0000\u0001\u0130"+
		"\r\u0001\u0000\u0000\u0000\u0131\u0407\u0003\"\u0011\u0000\u0132\u0134"+
		"\u00032\u0019\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0133\u0134\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0407\u0003"+
		"N\'\u0000\u0136\u0138\u0005\u00fa\u0000\u0000\u0137\u0139\u0005\u0092"+
		"\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u0407\u0003\u00ae"+
		"W\u0000\u013b\u013c\u00055\u0000\u0000\u013c\u0140\u0003,\u0016\u0000"+
		"\u013d\u013e\u0005m\u0000\u0000\u013e\u013f\u0005\u0096\u0000\u0000\u013f"+
		"\u0141\u0005S\u0000\u0000\u0140\u013d\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u014a"+
		"\u0003\u00aeW\u0000\u0143\u0149\u0003 \u0010\u0000\u0144\u0149\u0003\u001e"+
		"\u000f\u0000\u0145\u0146\u0005\u0103\u0000\u0000\u0146\u0147\u0007\u0000"+
		"\u0000\u0000\u0147\u0149\u0003:\u001d\u0000\u0148\u0143\u0001\u0000\u0000"+
		"\u0000\u0148\u0144\u0001\u0000\u0000\u0000\u0148\u0145\u0001\u0000\u0000"+
		"\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u0407\u0001\u0000\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u000f\u0000"+
		"\u0000\u014e\u014f\u0003,\u0016\u0000\u014f\u0150\u0003\u00aeW\u0000\u0150"+
		"\u0151\u0005\u00d0\u0000\u0000\u0151\u0152\u0007\u0000\u0000\u0000\u0152"+
		"\u0153\u0003:\u001d\u0000\u0153\u0407\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0005\u000f\u0000\u0000\u0155\u0156\u0003,\u0016\u0000\u0156\u0157\u0003"+
		"\u00aeW\u0000\u0157\u0158\u0005\u00d0\u0000\u0000\u0158\u0159\u0003\u001e"+
		"\u000f\u0000\u0159\u0407\u0001\u0000\u0000\u0000\u015a\u015b\u0005L\u0000"+
		"\u0000\u015b\u015e\u0003,\u0016\u0000\u015c\u015d\u0005m\u0000\u0000\u015d"+
		"\u015f\u0005S\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162"+
		"\u0003\u00aeW\u0000\u0161\u0163\u0007\u0001\u0000\u0000\u0162\u0161\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0407\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0005\u00d3\u0000\u0000\u0165\u0168\u0007"+
		"\u0002\u0000\u0000\u0166\u0167\u0007\u0003\u0000\u0000\u0167\u0169\u0003"+
		"\u00aeW\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000"+
		"\u0000\u0000\u0169\u016e\u0001\u0000\u0000\u0000\u016a\u016c\u0005\u0083"+
		"\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016f\u0005\u0117"+
		"\u0000\u0000\u016e\u016b\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000"+
		"\u0000\u0000\u016f\u0407\u0001\u0000\u0000\u0000\u0170\u0175\u0003\u0016"+
		"\u000b\u0000\u0171\u0172\u0005\u0002\u0000\u0000\u0172\u0173\u0003\u00e8"+
		"t\u0000\u0173\u0174\u0005\u0003\u0000\u0000\u0174\u0176\u0001\u0000\u0000"+
		"\u0000\u0175\u0171\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000"+
		"\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0179\u00036\u001b\u0000"+
		"\u0178\u0177\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017f\u00038\u001c\u0000\u017b"+
		"\u017d\u0005\u0016\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"\u0180\u0003\"\u0011\u0000\u017f\u017c\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0001\u0000\u0000\u0000\u0180\u0407\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u00055\u0000\u0000\u0182\u0186\u0005\u00df\u0000\u0000\u0183\u0184\u0005"+
		"m\u0000\u0000\u0184\u0185\u0005\u0096\u0000\u0000\u0185\u0187\u0005S\u0000"+
		"\u0000\u0186\u0183\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0003\u00b0X\u0000"+
		"\u0189\u018a\u0005\u0083\u0000\u0000\u018a\u0193\u0003\u00b0X\u0000\u018b"+
		"\u0192\u00036\u001b\u0000\u018c\u0192\u0003\u00aaU\u0000\u018d\u0192\u0003"+
		"F#\u0000\u018e\u0192\u0003\u001e\u000f\u0000\u018f\u0190\u0005\u00e2\u0000"+
		"\u0000\u0190\u0192\u0003:\u001d\u0000\u0191\u018b\u0001\u0000\u0000\u0000"+
		"\u0191\u018c\u0001\u0000\u0000\u0000\u0191\u018d\u0001\u0000\u0000\u0000"+
		"\u0191\u018e\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000"+
		"\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0407\u0001\u0000\u0000\u0000"+
		"\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u019b\u0003\u0018\f\u0000\u0197"+
		"\u0198\u0005\u0002\u0000\u0000\u0198\u0199\u0003\u00e8t\u0000\u0199\u019a"+
		"\u0005\u0003\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0197"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e"+
		"\u0001\u0000\u0000\u0000\u019d\u019f\u00036\u001b\u0000\u019e\u019d\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a5\u00038\u001c\u0000\u01a1\u01a3\u0005\u0016"+
		"\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6\u0003\"\u0011"+
		"\u0000\u01a5\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a6\u0407\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\u0010\u0000"+
		"\u0000\u01a8\u01a9\u0005\u00df\u0000\u0000\u01a9\u01ab\u0003\u00aeW\u0000"+
		"\u01aa\u01ac\u0003(\u0014\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u00051\u0000\u0000\u01ae\u01b6\u0005\u00d9\u0000\u0000\u01af\u01b7"+
		"\u0003\u0106\u0083\u0000\u01b0\u01b1\u0005`\u0000\u0000\u01b1\u01b2\u0005"+
		",\u0000\u0000\u01b2\u01b7\u0003\u0098L\u0000\u01b3\u01b4\u0005`\u0000"+
		"\u0000\u01b4\u01b5\u0005\u000e\u0000\u0000\u01b5\u01b7\u0005,\u0000\u0000"+
		"\u01b6\u01af\u0001\u0000\u0000\u0000\u01b6\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b7\u0407\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u000f\u0000\u0000"+
		"\u01b9\u01ba\u0005\u00df\u0000\u0000\u01ba\u01bb\u0003\u00aeW\u0000\u01bb"+
		"\u01bc\u0005\f\u0000\u0000\u01bc\u01bd\u0007\u0004\u0000\u0000\u01bd\u01be"+
		"\u0003\u00e4r\u0000\u01be\u0407\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		"\u000f\u0000\u0000\u01c0\u01c1\u0005\u00df\u0000\u0000\u01c1\u01c2\u0003"+
		"\u00aeW\u0000\u01c2\u01c3\u0005\f\u0000\u0000\u01c3\u01c4\u0007\u0004"+
		"\u0000\u0000\u01c4\u01c5\u0005\u0002\u0000\u0000\u01c5\u01c6\u0003\u00e4"+
		"r\u0000\u01c6\u01c7\u0005\u0003\u0000\u0000\u01c7\u0407\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0005\u000f\u0000\u0000\u01c9\u01ca\u0005\u00df\u0000"+
		"\u0000\u01ca\u01cb\u0003\u00aeW\u0000\u01cb\u01cc\u0005\u00bb\u0000\u0000"+
		"\u01cc\u01cd\u0005+\u0000\u0000\u01cd\u01ce\u0003\u00aeW\u0000\u01ce\u01cf"+
		"\u0005\u00e7\u0000\u0000\u01cf\u01d0\u0003\u0102\u0081\u0000\u01d0\u0407"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005\u000f\u0000\u0000\u01d2\u01d3"+
		"\u0005\u00df\u0000\u0000\u01d3\u01d4\u0003\u00aeW\u0000\u01d4\u01d5\u0005"+
		"L\u0000\u0000\u01d5\u01d6\u0007\u0004\u0000\u0000\u01d6\u01d7\u0005\u0002"+
		"\u0000\u0000\u01d7\u01d8\u0003\u00acV\u0000\u01d8\u01d9\u0005\u0003\u0000"+
		"\u0000\u01d9\u0407\u0001\u0000\u0000\u0000\u01da\u01db\u0005\u000f\u0000"+
		"\u0000\u01db\u01dc\u0005\u00df\u0000\u0000\u01dc\u01dd\u0003\u00aeW\u0000"+
		"\u01dd\u01de\u0005L\u0000\u0000\u01de\u01df\u0007\u0004\u0000\u0000\u01df"+
		"\u01e0\u0003\u00acV\u0000\u01e0\u0407\u0001\u0000\u0000\u0000\u01e1\u01e2"+
		"\u0005\u000f\u0000\u0000\u01e2\u01e3\u0007\u0005\u0000\u0000\u01e3\u01e4"+
		"\u0003\u00aeW\u0000\u01e4\u01e5\u0005\u00bb\u0000\u0000\u01e5\u01e6\u0005"+
		"\u00e7\u0000\u0000\u01e6\u01e7\u0003\u00aeW\u0000\u01e7\u0407\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0005\u000f\u0000\u0000\u01e9\u01ea\u0007\u0005"+
		"\u0000\u0000\u01ea\u01eb\u0003\u00aeW\u0000\u01eb\u01ec\u0005\u00d0\u0000"+
		"\u0000\u01ec\u01ed\u0005\u00e2\u0000\u0000\u01ed\u01ee\u0003:\u001d\u0000"+
		"\u01ee\u0407\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005\u000f\u0000\u0000"+
		"\u01f0\u01f1\u0007\u0005\u0000\u0000\u01f1\u01f2\u0003\u00aeW\u0000\u01f2"+
		"\u01f3\u0005\u00f8\u0000\u0000\u01f3\u01f6\u0005\u00e2\u0000\u0000\u01f4"+
		"\u01f5\u0005m\u0000\u0000\u01f5\u01f7\u0005S\u0000\u0000\u01f6\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f9\u0003:\u001d\u0000\u01f9\u0407\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0005\u000f\u0000\u0000\u01fb\u01fc\u0005\u00df"+
		"\u0000\u0000\u01fc\u01fd\u0003\u00aeW\u0000\u01fd\u01ff\u0007\u0006\u0000"+
		"\u0000\u01fe\u0200\u0005+\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000"+
		"\u0201\u0203\u0003\u00aeW\u0000\u0202\u0204\u0003\u010e\u0087\u0000\u0203"+
		"\u0202\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204"+
		"\u0407\u0001\u0000\u0000\u0000\u0205\u0206\u0005\u000f\u0000\u0000\u0206"+
		"\u0207\u0005\u00df\u0000\u0000\u0207\u0209\u0003\u00aeW\u0000\u0208\u020a"+
		"\u0003(\u0014\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001"+
		"\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020d\u0005"+
		"#\u0000\u0000\u020c\u020e\u0005+\u0000\u0000\u020d\u020c\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0003\u00aeW\u0000\u0210\u0212\u0003\u00eau\u0000\u0211"+
		"\u0213\u0003\u00e0p\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0001\u0000\u0000\u0000\u0213\u0407\u0001\u0000\u0000\u0000\u0214\u0215"+
		"\u0005\u000f\u0000\u0000\u0215\u0216\u0005\u00df\u0000\u0000\u0216\u0218"+
		"\u0003\u00aeW\u0000\u0217\u0219\u0003(\u0014\u0000\u0218\u0217\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000"+
		"\u0000\u0000\u021a\u021b\u0005\u00bd\u0000\u0000\u021b\u021c\u0005,\u0000"+
		"\u0000\u021c\u021d\u0005\u0002\u0000\u0000\u021d\u021e\u0003\u00e4r\u0000"+
		"\u021e\u021f\u0005\u0003\u0000\u0000\u021f\u0407\u0001\u0000\u0000\u0000"+
		"\u0220\u0221\u0005\u000f\u0000\u0000\u0221\u0222\u0005\u00df\u0000\u0000"+
		"\u0222\u0224\u0003\u00aeW\u0000\u0223\u0225\u0003(\u0014\u0000\u0224\u0223"+
		"\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0226"+
		"\u0001\u0000\u0000\u0000\u0226\u0227\u0005\u00d0\u0000\u0000\u0227\u0228"+
		"\u0005\u00cd\u0000\u0000\u0228\u022c\u0005\u0117\u0000\u0000\u0229\u022a"+
		"\u0005\u0103\u0000\u0000\u022a\u022b\u0005\u00ce\u0000\u0000\u022b\u022d"+
		"\u0003:\u001d\u0000\u022c\u0229\u0001\u0000\u0000\u0000\u022c\u022d\u0001"+
		"\u0000\u0000\u0000\u022d\u0407\u0001\u0000\u0000\u0000\u022e\u022f\u0005"+
		"\u000f\u0000\u0000\u022f\u0230\u0005\u00df\u0000\u0000\u0230\u0232\u0003"+
		"\u00aeW\u0000\u0231\u0233\u0003(\u0014\u0000\u0232\u0231\u0001\u0000\u0000"+
		"\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000"+
		"\u0000\u0234\u0235\u0005\u00d0\u0000\u0000\u0235\u0236\u0005\u00ce\u0000"+
		"\u0000\u0236\u0237\u0003:\u001d\u0000\u0237\u0407\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0005\u000f\u0000\u0000\u0239\u023a\u0007\u0005\u0000\u0000"+
		"\u023a\u023b\u0003\u00aeW\u0000\u023b\u023f\u0005\f\u0000\u0000\u023c"+
		"\u023d\u0005m\u0000\u0000\u023d\u023e\u0005\u0096\u0000\u0000\u023e\u0240"+
		"\u0005S\u0000\u0000\u023f\u023c\u0001\u0000\u0000\u0000\u023f\u0240\u0001"+
		"\u0000\u0000\u0000\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u0243\u0003"+
		"&\u0013\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000"+
		"\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000"+
		"\u0000\u0000\u0245\u0407\u0001\u0000\u0000\u0000\u0246\u0247\u0005\u000f"+
		"\u0000\u0000\u0247\u0248\u0005\u00df\u0000\u0000\u0248\u0249\u0003\u00ae"+
		"W\u0000\u0249\u024a\u0003(\u0014\u0000\u024a\u024b\u0005\u00bb\u0000\u0000"+
		"\u024b\u024c\u0005\u00e7\u0000\u0000\u024c\u024d\u0003(\u0014\u0000\u024d"+
		"\u0407\u0001\u0000\u0000\u0000\u024e\u024f\u0005\u000f\u0000\u0000\u024f"+
		"\u0250\u0007\u0005\u0000\u0000\u0250\u0251\u0003\u00aeW\u0000\u0251\u0254"+
		"\u0005L\u0000\u0000\u0252\u0253\u0005m\u0000\u0000\u0253\u0255\u0005S"+
		"\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000"+
		"\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u025b\u0003(\u0014"+
		"\u0000\u0257\u0258\u0005\u0004\u0000\u0000\u0258\u025a\u0003(\u0014\u0000"+
		"\u0259\u0257\u0001\u0000\u0000\u0000\u025a\u025d\u0001\u0000\u0000\u0000"+
		"\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000"+
		"\u025c\u025f\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000"+
		"\u025e\u0260\u0005\u00b2\u0000\u0000\u025f\u025e\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0407\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0005\u000f\u0000\u0000\u0262\u0263\u0005\u00df\u0000\u0000"+
		"\u0263\u0265\u0003\u00aeW\u0000\u0264\u0266\u0003(\u0014\u0000\u0265\u0264"+
		"\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0001\u0000\u0000\u0000\u0267\u0268\u0005\u00d0\u0000\u0000\u0268\u0269"+
		"\u0003\u001e\u000f\u0000\u0269\u0407\u0001\u0000\u0000\u0000\u026a\u026b"+
		"\u0005\u000f\u0000\u0000\u026b\u026c\u0005\u00df\u0000\u0000\u026c\u026d"+
		"\u0003\u00aeW\u0000\u026d\u026e\u0005\u00b7\u0000\u0000\u026e\u026f\u0005"+
		"\u00a9\u0000\u0000\u026f\u0407\u0001\u0000\u0000\u0000\u0270\u0271\u0005"+
		"L\u0000\u0000\u0271\u0274\u0005\u00df\u0000\u0000\u0272\u0273\u0005m\u0000"+
		"\u0000\u0273\u0275\u0005S\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000"+
		"\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000"+
		"\u0276\u0278\u0003\u00aeW\u0000\u0277\u0279\u0005\u00b2\u0000\u0000\u0278"+
		"\u0277\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279"+
		"\u0407\u0001\u0000\u0000\u0000\u027a\u027b\u0005L\u0000\u0000\u027b\u027e"+
		"\u0005\u00fe\u0000\u0000\u027c\u027d\u0005m\u0000\u0000\u027d\u027f\u0005"+
		"S\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000"+
		"\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0407\u0003\u00ae"+
		"W\u0000\u0281\u0284\u00055\u0000\u0000\u0282\u0283\u0005\u009e\u0000\u0000"+
		"\u0283\u0285\u0005\u00bd\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000"+
		"\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u028a\u0001\u0000\u0000\u0000"+
		"\u0286\u0288\u0005h\u0000\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289"+
		"\u028b\u0005\u00e3\u0000\u0000\u028a\u0287\u0001\u0000\u0000\u0000\u028a"+
		"\u028b\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c"+
		"\u0290\u0005\u00fe\u0000\u0000\u028d\u028e\u0005m\u0000\u0000\u028e\u028f"+
		"\u0005\u0096\u0000\u0000\u028f\u0291\u0005S\u0000\u0000\u0290\u028d\u0001"+
		"\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0292\u0001"+
		"\u0000\u0000\u0000\u0292\u0294\u0003\u00aeW\u0000\u0293\u0295\u0003\u009e"+
		"O\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000"+
		"\u0000\u0295\u029e\u0001\u0000\u0000\u0000\u0296\u029d\u0003 \u0010\u0000"+
		"\u0297\u0298\u0005\u00a8\u0000\u0000\u0298\u0299\u0005\u009a\u0000\u0000"+
		"\u0299\u029d\u0003\u0096K\u0000\u029a\u029b\u0005\u00e2\u0000\u0000\u029b"+
		"\u029d\u0003:\u001d\u0000\u029c\u0296\u0001\u0000\u0000\u0000\u029c\u0297"+
		"\u0001\u0000\u0000\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029d\u02a0"+
		"\u0001\u0000\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f"+
		"\u0001\u0000\u0000\u0000\u029f\u02a1\u0001\u0000\u0000\u0000\u02a0\u029e"+
		"\u0001\u0000\u0000\u0000\u02a1\u02a2\u0005\u0016\u0000\u0000\u02a2\u02a3"+
		"\u0003\"\u0011\u0000\u02a3\u0407\u0001\u0000\u0000\u0000\u02a4\u02a7\u0005"+
		"5\u0000\u0000\u02a5\u02a6\u0005\u009e\u0000\u0000\u02a6\u02a8\u0005\u00bd"+
		"\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000"+
		"\u0000\u0000\u02a8\u02aa\u0001\u0000\u0000\u0000\u02a9\u02ab\u0005h\u0000"+
		"\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005\u00e3\u0000"+
		"\u0000\u02ad\u02ae\u0005\u00fe\u0000\u0000\u02ae\u02b3\u0003\u00b0X\u0000"+
		"\u02af\u02b0\u0005\u0002\u0000\u0000\u02b0\u02b1\u0003\u00e8t\u0000\u02b1"+
		"\u02b2\u0005\u0003\u0000\u0000\u02b2\u02b4\u0001\u0000\u0000\u0000\u02b3"+
		"\u02af\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b8\u00036\u001b\u0000\u02b6\u02b7"+
		"\u0005\u009d\u0000\u0000\u02b7\u02b9\u0003:\u001d\u0000\u02b8\u02b6\u0001"+
		"\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u0407\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bb\u0005\u000f\u0000\u0000\u02bb\u02bc\u0005"+
		"\u00fe\u0000\u0000\u02bc\u02be\u0003\u00aeW\u0000\u02bd\u02bf\u0005\u0016"+
		"\u0000\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000"+
		"\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c1\u0003\"\u0011"+
		"\u0000\u02c1\u0407\u0001\u0000\u0000\u0000\u02c2\u02c5\u00055\u0000\u0000"+
		"\u02c3\u02c4\u0005\u009e\u0000\u0000\u02c4\u02c6\u0005\u00bd\u0000\u0000"+
		"\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000"+
		"\u02c6\u02c8\u0001\u0000\u0000\u0000\u02c7\u02c9\u0005\u00e3\u0000\u0000"+
		"\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000"+
		"\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02ce\u0005f\u0000\u0000\u02cb"+
		"\u02cc\u0005m\u0000\u0000\u02cc\u02cd\u0005\u0096\u0000\u0000\u02cd\u02cf"+
		"\u0005S\u0000\u0000\u02ce\u02cb\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001"+
		"\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d1\u0003"+
		"\u00aeW\u0000\u02d1\u02d2\u0005\u0016\u0000\u0000\u02d2\u02dc\u0005\u0117"+
		"\u0000\u0000\u02d3\u02d4\u0005\u00fc\u0000\u0000\u02d4\u02d9\u0003L&\u0000"+
		"\u02d5\u02d6\u0005\u0004\u0000\u0000\u02d6\u02d8\u0003L&\u0000\u02d7\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d8\u02db\u0001\u0000\u0000\u0000\u02d9\u02d7"+
		"\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02dd"+
		"\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02dc\u02d3"+
		"\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u0407"+
		"\u0001\u0000\u0000\u0000\u02de\u02e0\u0005L\u0000\u0000\u02df\u02e1\u0005"+
		"\u00e3\u0000\u0000\u02e0\u02df\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e5\u0005"+
		"f\u0000\u0000\u02e3\u02e4\u0005m\u0000\u0000\u02e4\u02e6\u0005S\u0000"+
		"\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000"+
		"\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u0407\u0003\u00aeW\u0000"+
		"\u02e8\u02ea\u0005T\u0000\u0000\u02e9\u02eb\u0007\u0007\u0000\u0000\u02ea"+
		"\u02e9\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ec\u0001\u0000\u0000\u0000\u02ec\u0407\u0003\u000e\u0007\u0000\u02ed"+
		"\u02ee\u0005\u00d3\u0000\u0000\u02ee\u02f1\u0005\u00e0\u0000\u0000\u02ef"+
		"\u02f0\u0007\u0003\u0000\u0000\u02f0\u02f2\u0003\u00aeW\u0000\u02f1\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f7"+
		"\u0001\u0000\u0000\u0000\u02f3\u02f5\u0005\u0083\u0000\u0000\u02f4\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f6"+
		"\u0001\u0000\u0000\u0000\u02f6\u02f8\u0005\u0117\u0000\u0000\u02f7\u02f4"+
		"\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u0407"+
		"\u0001\u0000\u0000\u0000\u02f9\u02fa\u0005\u00d3\u0000\u0000\u02fa\u02fb"+
		"\u0005\u00df\u0000\u0000\u02fb\u02fe\u0005V\u0000\u0000\u02fc\u02fd\u0007"+
		"\u0003\u0000\u0000\u02fd\u02ff\u0003\u00aeW\u0000\u02fe\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000"+
		"\u0000\u0000\u0300\u0301\u0005\u0083\u0000\u0000\u0301\u0303\u0005\u0117"+
		"\u0000\u0000\u0302\u0304\u0003(\u0014\u0000\u0303\u0302\u0001\u0000\u0000"+
		"\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304\u0407\u0001\u0000\u0000"+
		"\u0000\u0305\u0306\u0005\u00d3\u0000\u0000\u0306\u0307\u0005\u00e2\u0000"+
		"\u0000\u0307\u030c\u0003\u00aeW\u0000\u0308\u0309\u0005\u0002\u0000\u0000"+
		"\u0309\u030a\u0003>\u001f\u0000\u030a\u030b\u0005\u0003\u0000\u0000\u030b"+
		"\u030d\u0001\u0000\u0000\u0000\u030c\u0308\u0001\u0000\u0000\u0000\u030c"+
		"\u030d\u0001\u0000\u0000\u0000\u030d\u0407\u0001\u0000\u0000\u0000\u030e"+
		"\u030f\u0005\u00d3\u0000\u0000\u030f\u0310\u0005,\u0000\u0000\u0310\u0311"+
		"\u0007\u0003\u0000\u0000\u0311\u0314\u0003\u00aeW\u0000\u0312\u0313\u0007"+
		"\u0003\u0000\u0000\u0313\u0315\u0003\u00aeW\u0000\u0314\u0312\u0001\u0000"+
		"\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0407\u0001\u0000"+
		"\u0000\u0000\u0316\u0317\u0005\u00d3\u0000\u0000\u0317\u031a\u0005\u00ff"+
		"\u0000\u0000\u0318\u0319\u0007\u0003\u0000\u0000\u0319\u031b\u0003\u00ae"+
		"W\u0000\u031a\u0318\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000"+
		"\u0000\u031b\u0320\u0001\u0000\u0000\u0000\u031c\u031e\u0005\u0083\u0000"+
		"\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031d\u031e\u0001\u0000\u0000"+
		"\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u0321\u0005\u0117\u0000"+
		"\u0000\u0320\u031d\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000"+
		"\u0000\u0321\u0407\u0001\u0000\u0000\u0000\u0322\u0323\u0005\u00d3\u0000"+
		"\u0000\u0323\u0324\u0005\u00a9\u0000\u0000\u0324\u0326\u0003\u00aeW\u0000"+
		"\u0325\u0327\u0003(\u0014\u0000\u0326\u0325\u0001\u0000\u0000\u0000\u0326"+
		"\u0327\u0001\u0000\u0000\u0000\u0327\u0407\u0001\u0000\u0000\u0000\u0328"+
		"\u032a\u0005\u00d3\u0000\u0000\u0329\u032b\u0003\u0106\u0083\u0000\u032a"+
		"\u0329\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b"+
		"\u032c\u0001\u0000\u0000\u0000\u032c\u0334\u0005g\u0000\u0000\u032d\u032f"+
		"\u0005\u0083\u0000\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032e\u032f"+
		"\u0001\u0000\u0000\u0000\u032f\u0332\u0001\u0000\u0000\u0000\u0330\u0333"+
		"\u0003\u00aeW\u0000\u0331\u0333\u0005\u0117\u0000\u0000\u0332\u0330\u0001"+
		"\u0000\u0000\u0000\u0332\u0331\u0001\u0000\u0000\u0000\u0333\u0335\u0001"+
		"\u0000\u0000\u0000\u0334\u032e\u0001\u0000\u0000\u0000\u0334\u0335\u0001"+
		"\u0000\u0000\u0000\u0335\u0407\u0001\u0000\u0000\u0000\u0336\u0337\u0005"+
		"\u00d3\u0000\u0000\u0337\u0338\u00055\u0000\u0000\u0338\u0339\u0005\u00df"+
		"\u0000\u0000\u0339\u033c\u0003\u00aeW\u0000\u033a\u033b\u0005\u0016\u0000"+
		"\u0000\u033b\u033d\u0005\u00cd\u0000\u0000\u033c\u033a\u0001\u0000\u0000"+
		"\u0000\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u0407\u0001\u0000\u0000"+
		"\u0000\u033e\u033f\u0005\u00d3\u0000\u0000\u033f\u0340\u00058\u0000\u0000"+
		"\u0340\u0407\u0005\u0092\u0000\u0000\u0341\u0342\u0007\b\u0000\u0000\u0342"+
		"\u0344\u0005f\u0000\u0000\u0343\u0345\u0005V\u0000\u0000\u0344\u0343\u0001"+
		"\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345\u0346\u0001"+
		"\u0000\u0000\u0000\u0346\u0407\u0003.\u0017\u0000\u0347\u0348\u0007\b"+
		"\u0000\u0000\u0348\u034a\u0003,\u0016\u0000\u0349\u034b\u0005V\u0000\u0000"+
		"\u034a\u0349\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000"+
		"\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u034d\u0003\u00aeW\u0000\u034d"+
		"\u0407\u0001\u0000\u0000\u0000\u034e\u0350\u0007\b\u0000\u0000\u034f\u0351"+
		"\u0005\u00df\u0000\u0000\u0350\u034f\u0001\u0000\u0000\u0000\u0350\u0351"+
		"\u0001\u0000\u0000\u0000\u0351\u0353\u0001\u0000\u0000\u0000\u0352\u0354"+
		"\u0007\t\u0000\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0353\u0354\u0001"+
		"\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355\u0357\u0003"+
		"\u00aeW\u0000\u0356\u0358\u0003(\u0014\u0000\u0357\u0356\u0001\u0000\u0000"+
		"\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358\u035a\u0001\u0000\u0000"+
		"\u0000\u0359\u035b\u00030\u0018\u0000\u035a\u0359\u0001\u0000\u0000\u0000"+
		"\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u0407\u0001\u0000\u0000\u0000"+
		"\u035c\u035e\u0007\b\u0000\u0000\u035d\u035f\u0005\u00b3\u0000\u0000\u035e"+
		"\u035d\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f"+
		"\u0360\u0001\u0000\u0000\u0000\u0360\u0407\u0003\"\u0011\u0000\u0361\u0362"+
		"\u0005-\u0000\u0000\u0362\u0363\u0005\u009a\u0000\u0000\u0363\u0364\u0003"+
		",\u0016\u0000\u0364\u0365\u0003\u00aeW\u0000\u0365\u0366\u0005z\u0000"+
		"\u0000\u0366\u0367\u0007\n\u0000\u0000\u0367\u0407\u0001\u0000\u0000\u0000"+
		"\u0368\u0369\u0005-\u0000\u0000\u0369\u036a\u0005\u009a\u0000\u0000\u036a"+
		"\u036b\u0005\u00df\u0000\u0000\u036b\u036c\u0003\u00aeW\u0000\u036c\u036d"+
		"\u0005z\u0000\u0000\u036d\u036e\u0007\n\u0000\u0000\u036e\u0407\u0001"+
		"\u0000\u0000\u0000\u036f\u0370\u0005\u00ba\u0000\u0000\u0370\u0371\u0005"+
		"\u00df\u0000\u0000\u0371\u0407\u0003\u00aeW\u0000\u0372\u0373\u0005\u00ba"+
		"\u0000\u0000\u0373\u0374\u0005f\u0000\u0000\u0374\u0407\u0003\u00aeW\u0000"+
		"\u0375\u037d\u0005\u00ba\u0000\u0000\u0376\u037e\u0005\u0117\u0000\u0000"+
		"\u0377\u0379\t\u0000\u0000\u0000\u0378\u0377\u0001\u0000\u0000\u0000\u0379"+
		"\u037c\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037a"+
		"\u0378\u0001\u0000\u0000\u0000\u037b\u037e\u0001\u0000\u0000\u0000\u037c"+
		"\u037a\u0001\u0000\u0000\u0000\u037d\u0376\u0001\u0000\u0000\u0000\u037d"+
		"\u037a\u0001\u0000\u0000\u0000\u037e\u0407\u0001\u0000\u0000\u0000\u037f"+
		"\u0381\u0005\u001f\u0000\u0000\u0380\u0382\u0005\u0080\u0000\u0000\u0381"+
		"\u0380\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382"+
		"\u0383\u0001\u0000\u0000\u0000\u0383\u0384\u0005\u00df\u0000\u0000\u0384"+
		"\u0387\u0003\u00aeW\u0000\u0385\u0386\u0005\u009d\u0000\u0000\u0386\u0388"+
		"\u0003:\u001d\u0000\u0387\u0385\u0001\u0000\u0000\u0000\u0387\u0388\u0001"+
		"\u0000\u0000\u0000\u0388\u038d\u0001\u0000\u0000\u0000\u0389\u038b\u0005"+
		"\u0016\u0000\u0000\u038a\u0389\u0001\u0000\u0000\u0000\u038a\u038b\u0001"+
		"\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038e\u0003"+
		"\"\u0011\u0000\u038d\u038a\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000"+
		"\u0000\u0000\u038e\u0407\u0001\u0000\u0000\u0000\u038f\u0390\u0005\u00f3"+
		"\u0000\u0000\u0390\u0393\u0005\u00df\u0000\u0000\u0391\u0392\u0005m\u0000"+
		"\u0000\u0392\u0394\u0005S\u0000\u0000\u0393\u0391\u0001\u0000\u0000\u0000"+
		"\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000"+
		"\u0395\u0407\u0003\u00aeW\u0000\u0396\u0397\u0005%\u0000\u0000\u0397\u0407"+
		"\u0005\u001f\u0000\u0000\u0398\u0399\u0005\u0087\u0000\u0000\u0399\u039b"+
		"\u0005=\u0000\u0000\u039a\u039c\u0005\u0088\u0000\u0000\u039b\u039a\u0001"+
		"\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039c\u039d\u0001"+
		"\u0000\u0000\u0000\u039d\u039e\u0005t\u0000\u0000\u039e\u03a0\u0005\u0117"+
		"\u0000\u0000\u039f\u03a1\u0005\u00a6\u0000\u0000\u03a0\u039f\u0001\u0000"+
		"\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000"+
		"\u0000\u0000\u03a2\u03a3\u0005y\u0000\u0000\u03a3\u03a4\u0005\u00df\u0000"+
		"\u0000\u03a4\u03a6\u0003\u00aeW\u0000\u03a5\u03a7\u0003(\u0014\u0000\u03a6"+
		"\u03a5\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7"+
		"\u0407\u0001\u0000\u0000\u0000\u03a8\u03a9\u0005\u00ef\u0000\u0000\u03a9"+
		"\u03aa\u0005\u00df\u0000\u0000\u03aa\u03ac\u0003\u00aeW\u0000\u03ab\u03ad"+
		"\u0003(\u0014\u0000\u03ac\u03ab\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001"+
		"\u0000\u0000\u0000\u03ad\u0407\u0001\u0000\u0000\u0000\u03ae\u03af\u0005"+
		"\u0091\u0000\u0000\u03af\u03b0\u0005\u00bc\u0000\u0000\u03b0\u03b1\u0005"+
		"\u00df\u0000\u0000\u03b1\u0407\u0003\u00aeW\u0000\u03b2\u03b3\u0007\u000b"+
		"\u0000\u0000\u03b3\u03bb\u0003\u0106\u0083\u0000\u03b4\u03bc\u0005\u0117"+
		"\u0000\u0000\u03b5\u03b7\t\u0000\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000"+
		"\u0000\u03b7\u03ba\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000"+
		"\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b9\u03bc\u0001\u0000\u0000"+
		"\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03bb\u03b4\u0001\u0000\u0000"+
		"\u0000\u03bb\u03b8\u0001\u0000\u0000\u0000\u03bc\u0407\u0001\u0000\u0000"+
		"\u0000\u03bd\u03be\u0005\u00d0\u0000\u0000\u03be\u03c2\u0005\u00c3\u0000"+
		"\u0000\u03bf\u03c1\t\u0000\u0000\u0000\u03c0\u03bf\u0001\u0000\u0000\u0000"+
		"\u03c1\u03c4\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000"+
		"\u03c2\u03c0\u0001\u0000\u0000\u0000\u03c3\u0407\u0001\u0000\u0000\u0000"+
		"\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c5\u03c6\u0005\u00d0\u0000\u0000"+
		"\u03c6\u03c7\u0005\u00e6\u0000\u0000\u03c7\u03c8\u0005\u0104\u0000\u0000"+
		"\u03c8\u0407\u0003\u00d4j\u0000\u03c9\u03ca\u0005\u00d0\u0000\u0000\u03ca"+
		"\u03cb\u0005\u00e6\u0000\u0000\u03cb\u03cc\u0005\u0104\u0000\u0000\u03cc"+
		"\u0407\u0007\f\u0000\u0000\u03cd\u03ce\u0005\u00d0\u0000\u0000\u03ce\u03cf"+
		"\u0005\u00e6\u0000\u0000\u03cf\u03d3\u0005\u0104\u0000\u0000\u03d0\u03d2"+
		"\t\u0000\u0000\u0000\u03d1\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d5\u0001"+
		"\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d3\u03d1\u0001"+
		"\u0000\u0000\u0000\u03d4\u0407\u0001\u0000\u0000\u0000\u03d5\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d6\u03d7\u0005\u00d0\u0000\u0000\u03d7\u03d8\u0003"+
		"\u0010\b\u0000\u03d8\u03d9\u0005\u0105\u0000\u0000\u03d9\u03da\u0003\u0012"+
		"\t\u0000\u03da\u0407\u0001\u0000\u0000\u0000\u03db\u03dc\u0005\u00d0\u0000"+
		"\u0000\u03dc\u03e4\u0003\u0010\b\u0000\u03dd\u03e1\u0005\u0105\u0000\u0000"+
		"\u03de\u03e0\t\u0000\u0000\u0000\u03df\u03de\u0001\u0000\u0000\u0000\u03e0"+
		"\u03e3\u0001\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e1"+
		"\u03df\u0001\u0000\u0000\u0000\u03e2\u03e5\u0001\u0000\u0000\u0000\u03e3"+
		"\u03e1\u0001\u0000\u0000\u0000\u03e4\u03dd\u0001\u0000\u0000\u0000\u03e4"+
		"\u03e5\u0001\u0000\u0000\u0000\u03e5\u0407\u0001\u0000\u0000\u0000\u03e6"+
		"\u03ea\u0005\u00d0\u0000\u0000\u03e7\u03e9\t\u0000\u0000\u0000\u03e8\u03e7"+
		"\u0001\u0000\u0000\u0000\u03e9\u03ec\u0001\u0000\u0000\u0000\u03ea\u03eb"+
		"\u0001\u0000\u0000\u0000\u03ea\u03e8\u0001\u0000\u0000\u0000\u03eb\u03ed"+
		"\u0001\u0000\u0000\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ed\u03ee"+
		"\u0005\u0105\u0000\u0000\u03ee\u0407\u0003\u0012\t\u0000\u03ef\u03f3\u0005"+
		"\u00d0\u0000\u0000\u03f0\u03f2\t\u0000\u0000\u0000\u03f1\u03f0\u0001\u0000"+
		"\u0000\u0000\u03f2\u03f5\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f4\u0407\u0001\u0000"+
		"\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f6\u03f7\u0005\u00be"+
		"\u0000\u0000\u03f7\u0407\u0003\u0010\b\u0000\u03f8\u03fc\u0005\u00be\u0000"+
		"\u0000\u03f9\u03fb\t\u0000\u0000\u0000\u03fa\u03f9\u0001\u0000\u0000\u0000"+
		"\u03fb\u03fe\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000\u0000"+
		"\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fd\u0407\u0001\u0000\u0000\u0000"+
		"\u03fe\u03fc\u0001\u0000\u0000\u0000\u03ff\u0403\u0003\u0014\n\u0000\u0400"+
		"\u0402\t\u0000\u0000\u0000\u0401\u0400\u0001\u0000\u0000\u0000\u0402\u0405"+
		"\u0001\u0000\u0000\u0000\u0403\u0404\u0001\u0000\u0000\u0000\u0403\u0401"+
		"\u0001\u0000\u0000\u0000\u0404\u0407\u0001\u0000\u0000\u0000\u0405\u0403"+
		"\u0001\u0000\u0000\u0000\u0406\u0131\u0001\u0000\u0000\u0000\u0406\u0133"+
		"\u0001\u0000\u0000\u0000\u0406\u0136\u0001\u0000\u0000\u0000\u0406\u013b"+
		"\u0001\u0000\u0000\u0000\u0406\u014d\u0001\u0000\u0000\u0000\u0406\u0154"+
		"\u0001\u0000\u0000\u0000\u0406\u015a\u0001\u0000\u0000\u0000\u0406\u0164"+
		"\u0001\u0000\u0000\u0000\u0406\u0170\u0001\u0000\u0000\u0000\u0406\u0181"+
		"\u0001\u0000\u0000\u0000\u0406\u0196\u0001\u0000\u0000\u0000\u0406\u01a7"+
		"\u0001\u0000\u0000\u0000\u0406\u01b8\u0001\u0000\u0000\u0000\u0406\u01bf"+
		"\u0001\u0000\u0000\u0000\u0406\u01c8\u0001\u0000\u0000\u0000\u0406\u01d1"+
		"\u0001\u0000\u0000\u0000\u0406\u01da\u0001\u0000\u0000\u0000\u0406\u01e1"+
		"\u0001\u0000\u0000\u0000\u0406\u01e8\u0001\u0000\u0000\u0000\u0406\u01ef"+
		"\u0001\u0000\u0000\u0000\u0406\u01fa\u0001\u0000\u0000\u0000\u0406\u0205"+
		"\u0001\u0000\u0000\u0000\u0406\u0214\u0001\u0000\u0000\u0000\u0406\u0220"+
		"\u0001\u0000\u0000\u0000\u0406\u022e\u0001\u0000\u0000\u0000\u0406\u0238"+
		"\u0001\u0000\u0000\u0000\u0406\u0246\u0001\u0000\u0000\u0000\u0406\u024e"+
		"\u0001\u0000\u0000\u0000\u0406\u0261\u0001\u0000\u0000\u0000\u0406\u026a"+
		"\u0001\u0000\u0000\u0000\u0406\u0270\u0001\u0000\u0000\u0000\u0406\u027a"+
		"\u0001\u0000\u0000\u0000\u0406\u0281\u0001\u0000\u0000\u0000\u0406\u02a4"+
		"\u0001\u0000\u0000\u0000\u0406\u02ba\u0001\u0000\u0000\u0000\u0406\u02c2"+
		"\u0001\u0000\u0000\u0000\u0406\u02de\u0001\u0000\u0000\u0000\u0406\u02e8"+
		"\u0001\u0000\u0000\u0000\u0406\u02ed\u0001\u0000\u0000\u0000\u0406\u02f9"+
		"\u0001\u0000\u0000\u0000\u0406\u0305\u0001\u0000\u0000\u0000\u0406\u030e"+
		"\u0001\u0000\u0000\u0000\u0406\u0316\u0001\u0000\u0000\u0000\u0406\u0322"+
		"\u0001\u0000\u0000\u0000\u0406\u0328\u0001\u0000\u0000\u0000\u0406\u0336"+
		"\u0001\u0000\u0000\u0000\u0406\u033e\u0001\u0000\u0000\u0000\u0406\u0341"+
		"\u0001\u0000\u0000\u0000\u0406\u0347\u0001\u0000\u0000\u0000\u0406\u034e"+
		"\u0001\u0000\u0000\u0000\u0406\u035c\u0001\u0000\u0000\u0000\u0406\u0361"+
		"\u0001\u0000\u0000\u0000\u0406\u0368\u0001\u0000\u0000\u0000\u0406\u036f"+
		"\u0001\u0000\u0000\u0000\u0406\u0372\u0001\u0000\u0000\u0000\u0406\u0375"+
		"\u0001\u0000\u0000\u0000\u0406\u037f\u0001\u0000\u0000\u0000\u0406\u038f"+
		"\u0001\u0000\u0000\u0000\u0406\u0396\u0001\u0000\u0000\u0000\u0406\u0398"+
		"\u0001\u0000\u0000\u0000\u0406\u03a8\u0001\u0000\u0000\u0000\u0406\u03ae"+
		"\u0001\u0000\u0000\u0000\u0406\u03b2\u0001\u0000\u0000\u0000\u0406\u03bd"+
		"\u0001\u0000\u0000\u0000\u0406\u03c5\u0001\u0000\u0000\u0000\u0406\u03c9"+
		"\u0001\u0000\u0000\u0000\u0406\u03cd\u0001\u0000\u0000\u0000\u0406\u03d6"+
		"\u0001\u0000\u0000\u0000\u0406\u03db\u0001\u0000\u0000\u0000\u0406\u03e6"+
		"\u0001\u0000\u0000\u0000\u0406\u03ef\u0001\u0000\u0000\u0000\u0406\u03f6"+
		"\u0001\u0000\u0000\u0000\u0406\u03f8\u0001\u0000\u0000\u0000\u0406\u03ff"+
		"\u0001\u0000\u0000\u0000\u0407\u000f\u0001\u0000\u0000\u0000\u0408\u0409"+
		"\u0003\u010a\u0085\u0000\u0409\u0011\u0001\u0000\u0000\u0000\u040a\u040b"+
		"\u0003\u010a\u0085\u0000\u040b\u0013\u0001\u0000\u0000\u0000\u040c\u040d"+
		"\u00055\u0000\u0000\u040d\u04b5\u0005\u00c3\u0000\u0000\u040e\u040f\u0005"+
		"L\u0000\u0000\u040f\u04b5\u0005\u00c3\u0000\u0000\u0410\u0412\u0005i\u0000"+
		"\u0000\u0411\u0413\u0005\u00c3\u0000\u0000\u0412\u0411\u0001\u0000\u0000"+
		"\u0000\u0412\u0413\u0001\u0000\u0000\u0000\u0413\u04b5\u0001\u0000\u0000"+
		"\u0000\u0414\u0416\u0005\u00c0\u0000\u0000\u0415\u0417\u0005\u00c3\u0000"+
		"\u0000\u0416\u0415\u0001\u0000\u0000\u0000\u0416\u0417\u0001\u0000\u0000"+
		"\u0000\u0417\u04b5\u0001\u0000\u0000\u0000\u0418\u0419\u0005\u00d3\u0000"+
		"\u0000\u0419\u04b5\u0005i\u0000\u0000\u041a\u041b\u0005\u00d3\u0000\u0000"+
		"\u041b\u041d\u0005\u00c3\u0000\u0000\u041c\u041e\u0005i\u0000\u0000\u041d"+
		"\u041c\u0001\u0000\u0000\u0000\u041d\u041e\u0001\u0000\u0000\u0000\u041e"+
		"\u04b5\u0001\u0000\u0000\u0000\u041f\u0420\u0005\u00d3\u0000\u0000\u0420"+
		"\u04b5\u0005\u00b0\u0000\u0000\u0421\u0422\u0005\u00d3\u0000\u0000\u0422"+
		"\u04b5\u0005\u00c4\u0000\u0000\u0423\u0424\u0005\u00d3\u0000\u0000\u0424"+
		"\u0425\u00058\u0000\u0000\u0425\u04b5\u0005\u00c4\u0000\u0000\u0426\u0427"+
		"\u0005U\u0000\u0000\u0427\u04b5\u0005\u00df\u0000\u0000\u0428\u0429\u0005"+
		"o\u0000\u0000\u0429\u04b5\u0005\u00df\u0000\u0000\u042a\u042b\u0005\u00d3"+
		"\u0000\u0000\u042b\u04b5\u00050\u0000\u0000\u042c\u042d\u0005\u00d3\u0000"+
		"\u0000\u042d\u042e\u00055\u0000\u0000\u042e\u04b5\u0005\u00df\u0000\u0000"+
		"\u042f\u0430\u0005\u00d3\u0000\u0000\u0430\u04b5\u0005\u00eb\u0000\u0000"+
		"\u0431\u0432\u0005\u00d3\u0000\u0000\u0432\u04b5\u0005r\u0000\u0000\u0433"+
		"\u0434\u0005\u00d3\u0000\u0000\u0434\u04b5\u0005\u008b\u0000\u0000\u0435"+
		"\u0436\u00055\u0000\u0000\u0436\u04b5\u0005q\u0000\u0000\u0437\u0438\u0005"+
		"L\u0000\u0000\u0438\u04b5\u0005q\u0000\u0000\u0439\u043a\u0005\u000f\u0000"+
		"\u0000\u043a\u04b5\u0005q\u0000\u0000\u043b\u043c\u0005\u008a\u0000\u0000"+
		"\u043c\u04b5\u0005\u00df\u0000\u0000\u043d\u043e\u0005\u008a\u0000\u0000"+
		"\u043e\u04b5\u0005>\u0000\u0000\u043f\u0440\u0005\u00f7\u0000\u0000\u0440"+
		"\u04b5\u0005\u00df\u0000\u0000\u0441\u0442\u0005\u00f7\u0000\u0000\u0442"+
		"\u04b5\u0005>\u0000\u0000\u0443\u0444\u00055\u0000\u0000\u0444\u0445\u0005"+
		"\u00e3\u0000\u0000\u0445\u04b5\u0005\u008d\u0000\u0000\u0446\u0447\u0005"+
		"L\u0000\u0000\u0447\u0448\u0005\u00e3\u0000\u0000\u0448\u04b5\u0005\u008d"+
		"\u0000\u0000\u0449\u044a\u0005\u000f\u0000\u0000\u044a\u044b\u0005\u00df"+
		"\u0000\u0000\u044b\u044c\u0003\u00b0X\u0000\u044c\u044d\u0005\u0096\u0000"+
		"\u0000\u044d\u044e\u0005\'\u0000\u0000\u044e\u04b5\u0001\u0000\u0000\u0000"+
		"\u044f\u0450\u0005\u000f\u0000\u0000\u0450\u0451\u0005\u00df\u0000\u0000"+
		"\u0451\u0452\u0003\u00b0X\u0000\u0452\u0453\u0005\'\u0000\u0000\u0453"+
		"\u0454\u0005\u001e\u0000\u0000\u0454\u04b5\u0001\u0000\u0000\u0000\u0455"+
		"\u0456\u0005\u000f\u0000\u0000\u0456\u0457\u0005\u00df\u0000\u0000\u0457"+
		"\u0458\u0003\u00b0X\u0000\u0458\u0459\u0005\u0096\u0000\u0000\u0459\u045a"+
		"\u0005\u00d7\u0000\u0000\u045a\u04b5\u0001\u0000\u0000\u0000\u045b\u045c"+
		"\u0005\u000f\u0000\u0000\u045c\u045d\u0005\u00df\u0000\u0000\u045d\u045e"+
		"\u0003\u00b0X\u0000\u045e\u045f\u0005\u00d4\u0000\u0000\u045f\u0460\u0005"+
		"\u001e\u0000\u0000\u0460\u04b5\u0001\u0000\u0000\u0000\u0461\u0462\u0005"+
		"\u000f\u0000\u0000\u0462\u0463\u0005\u00df\u0000\u0000\u0463\u0464\u0003"+
		"\u00b0X\u0000\u0464\u0465\u0005\u0096\u0000\u0000\u0465\u0466\u0005\u00d4"+
		"\u0000\u0000\u0466\u04b5\u0001\u0000\u0000\u0000\u0467\u0468\u0005\u000f"+
		"\u0000\u0000\u0468\u0469\u0005\u00df\u0000\u0000\u0469\u046a\u0003\u00b0"+
		"X\u0000\u046a\u046b\u0005\u0096\u0000\u0000\u046b\u046c\u0005\u00da\u0000"+
		"\u0000\u046c\u046d\u0005\u0016\u0000\u0000\u046d\u046e\u0005G\u0000\u0000"+
		"\u046e\u04b5\u0001\u0000\u0000\u0000\u046f\u0470\u0005\u000f\u0000\u0000"+
		"\u0470\u0471\u0005\u00df\u0000\u0000\u0471\u0472\u0003\u00b0X\u0000\u0472"+
		"\u0473\u0005\u00d0\u0000\u0000\u0473\u0474\u0005\u00d4\u0000\u0000\u0474"+
		"\u0475\u0005\u0089\u0000\u0000\u0475\u04b5\u0001\u0000\u0000\u0000\u0476"+
		"\u0477\u0005\u000f\u0000\u0000\u0477\u0478\u0005\u00df\u0000\u0000\u0478"+
		"\u0479\u0003\u00b0X\u0000\u0479\u047a\u0005R\u0000\u0000\u047a\u047b\u0005"+
		"\u00a7\u0000\u0000\u047b\u04b5\u0001\u0000\u0000\u0000\u047c\u047d\u0005"+
		"\u000f\u0000\u0000\u047d\u047e\u0005\u00df\u0000\u0000\u047e\u047f\u0003"+
		"\u00b0X\u0000\u047f\u0480\u0005\u0014\u0000\u0000\u0480\u0481\u0005\u00a7"+
		"\u0000\u0000\u0481\u04b5\u0001\u0000\u0000\u0000\u0482\u0483\u0005\u000f"+
		"\u0000\u0000\u0483\u0484\u0005\u00df\u0000\u0000\u0484\u0485\u0003\u00b0"+
		"X\u0000\u0485\u0486\u0005\u00f1\u0000\u0000\u0486\u0487\u0005\u00a7\u0000"+
		"\u0000\u0487\u04b5\u0001\u0000\u0000\u0000\u0488\u0489\u0005\u000f\u0000"+
		"\u0000\u0489\u048a\u0005\u00df\u0000\u0000\u048a\u048b\u0003\u00b0X\u0000"+
		"\u048b\u048c\u0005\u00e8\u0000\u0000\u048c\u04b5\u0001\u0000\u0000\u0000"+
		"\u048d\u048e\u0005\u000f\u0000\u0000\u048e\u048f\u0005\u00df\u0000\u0000"+
		"\u048f\u0491\u0003\u00b0X\u0000\u0490\u0492\u0003(\u0014\u0000\u0491\u0490"+
		"\u0001\u0000\u0000\u0000\u0491\u0492\u0001\u0000\u0000\u0000\u0492\u0493"+
		"\u0001\u0000\u0000\u0000\u0493\u0494\u0005/\u0000\u0000\u0494\u04b5\u0001"+
		"\u0000\u0000\u0000\u0495\u0496\u0005\u000f\u0000\u0000\u0496\u0497\u0005"+
		"\u00df\u0000\u0000\u0497\u0499\u0003\u00b0X\u0000\u0498\u049a\u0003(\u0014"+
		"\u0000\u0499\u0498\u0001\u0000\u0000\u0000\u0499\u049a\u0001\u0000\u0000"+
		"\u0000\u049a\u049b\u0001\u0000\u0000\u0000\u049b\u049c\u00052\u0000\u0000"+
		"\u049c\u04b5\u0001\u0000\u0000\u0000\u049d\u049e\u0005\u000f\u0000\u0000"+
		"\u049e\u049f\u0005\u00df\u0000\u0000\u049f\u04a1\u0003\u00b0X\u0000\u04a0"+
		"\u04a2\u0003(\u0014\u0000\u04a1\u04a0\u0001\u0000\u0000\u0000\u04a1\u04a2"+
		"\u0001\u0000\u0000\u0000\u04a2\u04a3\u0001\u0000\u0000\u0000\u04a3\u04a4"+
		"\u0005\u00d0\u0000\u0000\u04a4\u04a5\u0005]\u0000\u0000\u04a5\u04b5\u0001"+
		"\u0000\u0000\u0000\u04a6\u04a7\u0005\u000f\u0000\u0000\u04a7\u04a8\u0005"+
		"\u00df\u0000\u0000\u04a8\u04aa\u0003\u00b0X\u0000\u04a9\u04ab\u0003(\u0014"+
		"\u0000\u04aa\u04a9\u0001\u0000\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000"+
		"\u0000\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac\u04ad\u0005\u00bd\u0000"+
		"\u0000\u04ad\u04ae\u0005,\u0000\u0000\u04ae\u04b5\u0001\u0000\u0000\u0000"+
		"\u04af\u04b0\u0005\u00d8\u0000\u0000\u04b0\u04b5\u0005\u00ea\u0000\u0000"+
		"\u04b1\u04b5\u0005.\u0000\u0000\u04b2\u04b5\u0005\u00c5\u0000\u0000\u04b3"+
		"\u04b5\u0005F\u0000\u0000\u04b4\u040c\u0001\u0000\u0000\u0000\u04b4\u040e"+
		"\u0001\u0000\u0000\u0000\u04b4\u0410\u0001\u0000\u0000\u0000\u04b4\u0414"+
		"\u0001\u0000\u0000\u0000\u04b4\u0418\u0001\u0000\u0000\u0000\u04b4\u041a"+
		"\u0001\u0000\u0000\u0000\u04b4\u041f\u0001\u0000\u0000\u0000\u04b4\u0421"+
		"\u0001\u0000\u0000\u0000\u04b4\u0423\u0001\u0000\u0000\u0000\u04b4\u0426"+
		"\u0001\u0000\u0000\u0000\u04b4\u0428\u0001\u0000\u0000\u0000\u04b4\u042a"+
		"\u0001\u0000\u0000\u0000\u04b4\u042c\u0001\u0000\u0000\u0000\u04b4\u042f"+
		"\u0001\u0000\u0000\u0000\u04b4\u0431\u0001\u0000\u0000\u0000\u04b4\u0433"+
		"\u0001\u0000\u0000\u0000\u04b4\u0435\u0001\u0000\u0000\u0000\u04b4\u0437"+
		"\u0001\u0000\u0000\u0000\u04b4\u0439\u0001\u0000\u0000\u0000\u04b4\u043b"+
		"\u0001\u0000\u0000\u0000\u04b4\u043d\u0001\u0000\u0000\u0000\u04b4\u043f"+
		"\u0001\u0000\u0000\u0000\u04b4\u0441\u0001\u0000\u0000\u0000\u04b4\u0443"+
		"\u0001\u0000\u0000\u0000\u04b4\u0446\u0001\u0000\u0000\u0000\u04b4\u0449"+
		"\u0001\u0000\u0000\u0000\u04b4\u044f\u0001\u0000\u0000\u0000\u04b4\u0455"+
		"\u0001\u0000\u0000\u0000\u04b4\u045b\u0001\u0000\u0000\u0000\u04b4\u0461"+
		"\u0001\u0000\u0000\u0000\u04b4\u0467\u0001\u0000\u0000\u0000\u04b4\u046f"+
		"\u0001\u0000\u0000\u0000\u04b4\u0476\u0001\u0000\u0000\u0000\u04b4\u047c"+
		"\u0001\u0000\u0000\u0000\u04b4\u0482\u0001\u0000\u0000\u0000\u04b4\u0488"+
		"\u0001\u0000\u0000\u0000\u04b4\u048d\u0001\u0000\u0000\u0000\u04b4\u0495"+
		"\u0001\u0000\u0000\u0000\u04b4\u049d\u0001\u0000\u0000\u0000\u04b4\u04a6"+
		"\u0001\u0000\u0000\u0000\u04b4\u04af\u0001\u0000\u0000\u0000\u04b4\u04b1"+
		"\u0001\u0000\u0000\u0000\u04b4\u04b2\u0001\u0000\u0000\u0000\u04b4\u04b3"+
		"\u0001\u0000\u0000\u0000\u04b5\u0015\u0001\u0000\u0000\u0000\u04b6\u04b8"+
		"\u00055\u0000\u0000\u04b7\u04b9\u0005\u00e3\u0000\u0000\u04b8\u04b7\u0001"+
		"\u0000\u0000\u0000\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u04bb\u0001"+
		"\u0000\u0000\u0000\u04ba\u04bc\u0005W\u0000\u0000\u04bb\u04ba\u0001\u0000"+
		"\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000\u0000\u04bc\u04bd\u0001\u0000"+
		"\u0000\u0000\u04bd\u04c1\u0005\u00df\u0000\u0000\u04be\u04bf\u0005m\u0000"+
		"\u0000\u04bf\u04c0\u0005\u0096\u0000\u0000\u04c0\u04c2\u0005S\u0000\u0000"+
		"\u04c1\u04be\u0001\u0000\u0000\u0000\u04c1\u04c2\u0001\u0000\u0000\u0000"+
		"\u04c2\u04c3\u0001\u0000\u0000\u0000\u04c3\u04c4\u0003\u00aeW\u0000\u04c4"+
		"\u0017\u0001\u0000\u0000\u0000\u04c5\u04c6\u00055\u0000\u0000\u04c6\u04c8"+
		"\u0005\u009e\u0000\u0000\u04c7\u04c5\u0001\u0000\u0000\u0000\u04c7\u04c8"+
		"\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9\u04ca"+
		"\u0005\u00bd\u0000\u0000\u04ca\u04cb\u0005\u00df\u0000\u0000\u04cb\u04cc"+
		"\u0003\u00aeW\u0000\u04cc\u0019\u0001\u0000\u0000\u0000\u04cd\u04ce\u0005"+
		"\'\u0000\u0000\u04ce\u04cf\u0005\u001e\u0000\u0000\u04cf\u04d3\u0003\u0096"+
		"K\u0000\u04d0\u04d1\u0005\u00d7\u0000\u0000\u04d1\u04d2\u0005\u001e\u0000"+
		"\u0000\u04d2\u04d4\u0003\u009aM\u0000\u04d3\u04d0\u0001\u0000\u0000\u0000"+
		"\u04d3\u04d4\u0001\u0000\u0000\u0000\u04d4\u04d5\u0001\u0000\u0000\u0000"+
		"\u04d5\u04d6\u0005y\u0000\u0000\u04d6\u04d7\u0005\u011b\u0000\u0000\u04d7"+
		"\u04d8\u0005\u001d\u0000\u0000\u04d8\u001b\u0001\u0000\u0000\u0000\u04d9"+
		"\u04da\u0005\u00d4\u0000\u0000\u04da\u04db\u0005\u001e\u0000\u0000\u04db"+
		"\u04dc\u0003\u0096K\u0000\u04dc\u04df\u0005\u009a\u0000\u0000\u04dd\u04e0"+
		"\u0003B!\u0000\u04de\u04e0\u0003D\"\u0000\u04df\u04dd\u0001\u0000\u0000"+
		"\u0000\u04df\u04de\u0001\u0000\u0000\u0000\u04e0\u04e4\u0001\u0000\u0000"+
		"\u0000\u04e1\u04e2\u0005\u00da\u0000\u0000\u04e2\u04e3\u0005\u0016\u0000"+
		"\u0000\u04e3\u04e5\u0005G\u0000\u0000\u04e4\u04e1\u0001\u0000\u0000\u0000"+
		"\u04e4\u04e5\u0001\u0000\u0000\u0000\u04e5\u001d\u0001\u0000\u0000\u0000"+
		"\u04e6\u04e7\u0005\u0089\u0000\u0000\u04e7\u04e8\u0005\u0117\u0000\u0000"+
		"\u04e8\u001f\u0001\u0000\u0000\u0000\u04e9\u04ea\u0005-\u0000\u0000\u04ea"+
		"\u04eb\u0005\u0117\u0000\u0000\u04eb!\u0001\u0000\u0000\u0000\u04ec\u04ee"+
		"\u00032\u0019\u0000\u04ed\u04ec\u0001\u0000\u0000\u0000\u04ed\u04ee\u0001"+
		"\u0000\u0000\u0000\u04ee\u04ef\u0001\u0000\u0000\u0000\u04ef\u04f0\u0003"+
		"T*\u0000\u04f0\u04f1\u0003P(\u0000\u04f1#\u0001\u0000\u0000\u0000\u04f2"+
		"\u04f3\u0005v\u0000\u0000\u04f3\u04f5\u0005\u00a6\u0000\u0000\u04f4\u04f6"+
		"\u0005\u00df\u0000\u0000\u04f5\u04f4\u0001\u0000\u0000\u0000\u04f5\u04f6"+
		"\u0001\u0000\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7\u04fe"+
		"\u0003\u00aeW\u0000\u04f8\u04fc\u0003(\u0014\u0000\u04f9\u04fa\u0005m"+
		"\u0000\u0000\u04fa\u04fb\u0005\u0096\u0000\u0000\u04fb\u04fd\u0005S\u0000"+
		"\u0000\u04fc\u04f9\u0001\u0000\u0000\u0000\u04fc\u04fd\u0001\u0000\u0000"+
		"\u0000\u04fd\u04ff\u0001\u0000\u0000\u0000\u04fe\u04f8\u0001\u0000\u0000"+
		"\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000\u04ff\u0501\u0001\u0000\u0000"+
		"\u0000\u0500\u0502\u0003\u0096K\u0000\u0501\u0500\u0001\u0000\u0000\u0000"+
		"\u0501\u0502\u0001\u0000\u0000\u0000\u0502\u0530\u0001\u0000\u0000\u0000"+
		"\u0503\u0504\u0005v\u0000\u0000\u0504\u0506\u0005y\u0000\u0000\u0505\u0507"+
		"\u0005\u00df\u0000\u0000\u0506\u0505\u0001\u0000\u0000\u0000\u0506\u0507"+
		"\u0001\u0000\u0000\u0000\u0507\u0508\u0001\u0000\u0000\u0000\u0508\u050a"+
		"\u0003\u00aeW\u0000\u0509\u050b\u0003(\u0014\u0000\u050a\u0509\u0001\u0000"+
		"\u0000\u0000\u050a\u050b\u0001\u0000\u0000\u0000\u050b\u050f\u0001\u0000"+
		"\u0000\u0000\u050c\u050d\u0005m\u0000\u0000\u050d\u050e\u0005\u0096\u0000"+
		"\u0000\u050e\u0510\u0005S\u0000\u0000\u050f\u050c\u0001\u0000\u0000\u0000"+
		"\u050f\u0510\u0001\u0000\u0000\u0000\u0510\u0512\u0001\u0000\u0000\u0000"+
		"\u0511\u0513\u0003\u0096K\u0000\u0512\u0511\u0001\u0000\u0000\u0000\u0512"+
		"\u0513\u0001\u0000\u0000\u0000\u0513\u0530\u0001\u0000\u0000\u0000\u0514"+
		"\u0515\u0005v\u0000\u0000\u0515\u0517\u0005\u00a6\u0000\u0000\u0516\u0518"+
		"\u0005\u0088\u0000\u0000\u0517\u0516\u0001\u0000\u0000\u0000\u0517\u0518"+
		"\u0001\u0000\u0000\u0000\u0518\u0519\u0001\u0000\u0000\u0000\u0519\u051a"+
		"\u0005H\u0000\u0000\u051a\u051c\u0005\u0117\u0000\u0000\u051b\u051d\u0003"+
		"\u00aaU\u0000\u051c\u051b\u0001\u0000\u0000\u0000\u051c\u051d\u0001\u0000"+
		"\u0000\u0000\u051d\u051f\u0001\u0000\u0000\u0000\u051e\u0520\u0003F#\u0000"+
		"\u051f\u051e\u0001\u0000\u0000\u0000\u051f\u0520\u0001\u0000\u0000\u0000"+
		"\u0520\u0530\u0001\u0000\u0000\u0000\u0521\u0522\u0005v\u0000\u0000\u0522"+
		"\u0524\u0005\u00a6\u0000\u0000\u0523\u0525\u0005\u0088\u0000\u0000\u0524"+
		"\u0523\u0001\u0000\u0000\u0000\u0524\u0525\u0001\u0000\u0000\u0000\u0525"+
		"\u0526\u0001\u0000\u0000\u0000\u0526\u0528\u0005H\u0000\u0000\u0527\u0529"+
		"\u0005\u0117\u0000\u0000\u0528\u0527\u0001\u0000\u0000\u0000\u0528\u0529"+
		"\u0001\u0000\u0000\u0000\u0529\u052a\u0001\u0000\u0000\u0000\u052a\u052d"+
		"\u00036\u001b\u0000\u052b\u052c\u0005\u009d\u0000\u0000\u052c\u052e\u0003"+
		":\u001d\u0000\u052d\u052b\u0001\u0000\u0000\u0000\u052d\u052e\u0001\u0000"+
		"\u0000\u0000\u052e\u0530\u0001\u0000\u0000\u0000\u052f\u04f2\u0001\u0000"+
		"\u0000\u0000\u052f\u0503\u0001\u0000\u0000\u0000\u052f\u0514\u0001\u0000"+
		"\u0000\u0000\u052f\u0521\u0001\u0000\u0000\u0000\u0530%\u0001\u0000\u0000"+
		"\u0000\u0531\u0533\u0003(\u0014\u0000\u0532\u0534\u0003\u001e\u000f\u0000"+
		"\u0533\u0532\u0001\u0000\u0000\u0000\u0533\u0534\u0001\u0000\u0000\u0000"+
		"\u0534\'\u0001\u0000\u0000\u0000\u0535\u0536\u0005\u00a7\u0000\u0000\u0536"+
		"\u0537\u0005\u0002\u0000\u0000\u0537\u053c\u0003*\u0015\u0000\u0538\u0539"+
		"\u0005\u0004\u0000\u0000\u0539\u053b\u0003*\u0015\u0000\u053a\u0538\u0001"+
		"\u0000\u0000\u0000\u053b\u053e\u0001\u0000\u0000\u0000\u053c\u053a\u0001"+
		"\u0000\u0000\u0000\u053c\u053d\u0001\u0000\u0000\u0000\u053d\u053f\u0001"+
		"\u0000\u0000\u0000\u053e\u053c\u0001\u0000\u0000\u0000\u053f\u0540\u0005"+
		"\u0003\u0000\u0000\u0540)\u0001\u0000\u0000\u0000\u0541\u0544\u0003\u0106"+
		"\u0083\u0000\u0542\u0543\u0005\u0105\u0000\u0000\u0543\u0545\u0003\u00ca"+
		"e\u0000\u0544\u0542\u0001\u0000\u0000\u0000\u0544\u0545\u0001\u0000\u0000"+
		"\u0000\u0545+\u0001\u0000\u0000\u0000\u0546\u0547\u0007\r\u0000\u0000"+
		"\u0547-\u0001\u0000\u0000\u0000\u0548\u054e\u0003\u0100\u0080\u0000\u0549"+
		"\u054e\u0005\u0117\u0000\u0000\u054a\u054e\u0003\u00ccf\u0000\u054b\u054e"+
		"\u0003\u00ceg\u0000\u054c\u054e\u0003\u00d0h\u0000\u054d\u0548\u0001\u0000"+
		"\u0000\u0000\u054d\u0549\u0001\u0000\u0000\u0000\u054d\u054a\u0001\u0000"+
		"\u0000\u0000\u054d\u054b\u0001\u0000\u0000\u0000\u054d\u054c\u0001\u0000"+
		"\u0000\u0000\u054e/\u0001\u0000\u0000\u0000\u054f\u0554\u0003\u0106\u0083"+
		"\u0000\u0550\u0551\u0005\u0005\u0000\u0000\u0551\u0553\u0003\u0106\u0083"+
		"\u0000\u0552\u0550\u0001\u0000\u0000\u0000\u0553\u0556\u0001\u0000\u0000"+
		"\u0000\u0554\u0552\u0001\u0000\u0000\u0000\u0554\u0555\u0001\u0000\u0000"+
		"\u0000\u05551\u0001\u0000\u0000\u0000\u0556\u0554\u0001\u0000\u0000\u0000"+
		"\u0557\u0558\u0005\u0103\u0000\u0000\u0558\u055d\u00034\u001a\u0000\u0559"+
		"\u055a\u0005\u0004\u0000\u0000\u055a\u055c\u00034\u001a\u0000\u055b\u0559"+
		"\u0001\u0000\u0000\u0000\u055c\u055f\u0001\u0000\u0000\u0000\u055d\u055b"+
		"\u0001\u0000\u0000\u0000\u055d\u055e\u0001\u0000\u0000\u0000\u055e3\u0001"+
		"\u0000\u0000\u0000\u055f\u055d\u0001\u0000\u0000\u0000\u0560\u0562\u0003"+
		"\u0102\u0081\u0000\u0561\u0563\u0003\u0096K\u0000\u0562\u0561\u0001\u0000"+
		"\u0000\u0000\u0562\u0563\u0001\u0000\u0000\u0000\u0563\u0565\u0001\u0000"+
		"\u0000\u0000\u0564\u0566\u0005\u0016\u0000\u0000\u0565\u0564\u0001\u0000"+
		"\u0000\u0000\u0565\u0566\u0001\u0000\u0000\u0000\u0566\u0567\u0001\u0000"+
		"\u0000\u0000\u0567\u0568\u0005\u0002\u0000\u0000\u0568\u0569\u0003\"\u0011"+
		"\u0000\u0569\u056a\u0005\u0003\u0000\u0000\u056a5\u0001\u0000\u0000\u0000"+
		"\u056b\u056c\u0005\u00fc\u0000\u0000\u056c\u056d\u0003\u00aeW\u0000\u056d"+
		"7\u0001\u0000\u0000\u0000\u056e\u056f\u0005\u009d\u0000\u0000\u056f\u057c"+
		"\u0003:\u001d\u0000\u0570\u0571\u0005\u00a8\u0000\u0000\u0571\u0572\u0005"+
		"\u001e\u0000\u0000\u0572\u057c\u0003\u00b8\\\u0000\u0573\u057c\u0003\u001c"+
		"\u000e\u0000\u0574\u057c\u0003\u001a\r\u0000\u0575\u057c\u0003\u00aaU"+
		"\u0000\u0576\u057c\u0003F#\u0000\u0577\u057c\u0003\u001e\u000f\u0000\u0578"+
		"\u057c\u0003 \u0010\u0000\u0579\u057a\u0005\u00e2\u0000\u0000\u057a\u057c"+
		"\u0003:\u001d\u0000\u057b\u056e\u0001\u0000\u0000\u0000\u057b\u0570\u0001"+
		"\u0000\u0000\u0000\u057b\u0573\u0001\u0000\u0000\u0000\u057b\u0574\u0001"+
		"\u0000\u0000\u0000\u057b\u0575\u0001\u0000\u0000\u0000\u057b\u0576\u0001"+
		"\u0000\u0000\u0000\u057b\u0577\u0001\u0000\u0000\u0000\u057b\u0578\u0001"+
		"\u0000\u0000\u0000\u057b\u0579\u0001\u0000\u0000\u0000\u057c\u057f\u0001"+
		"\u0000\u0000\u0000\u057d\u057b\u0001\u0000\u0000\u0000\u057d\u057e\u0001"+
		"\u0000\u0000\u0000\u057e9\u0001\u0000\u0000\u0000\u057f\u057d\u0001\u0000"+
		"\u0000\u0000\u0580\u0581\u0005\u0002\u0000\u0000\u0581\u0586\u0003<\u001e"+
		"\u0000\u0582\u0583\u0005\u0004\u0000\u0000\u0583\u0585\u0003<\u001e\u0000"+
		"\u0584\u0582\u0001\u0000\u0000\u0000\u0585\u0588\u0001\u0000\u0000\u0000"+
		"\u0586\u0584\u0001\u0000\u0000\u0000\u0586\u0587\u0001\u0000\u0000\u0000"+
		"\u0587\u0589\u0001\u0000\u0000\u0000\u0588\u0586\u0001\u0000\u0000\u0000"+
		"\u0589\u058a\u0005\u0003\u0000\u0000\u058a;\u0001\u0000\u0000\u0000\u058b"+
		"\u0590\u0003>\u001f\u0000\u058c\u058e\u0005\u0105\u0000\u0000\u058d\u058c"+
		"\u0001\u0000\u0000\u0000\u058d\u058e\u0001\u0000\u0000\u0000\u058e\u058f"+
		"\u0001\u0000\u0000\u0000\u058f\u0591\u0003@ \u0000\u0590\u058d\u0001\u0000"+
		"\u0000\u0000\u0590\u0591\u0001\u0000\u0000\u0000\u0591=\u0001\u0000\u0000"+
		"\u0000\u0592\u0597\u0003\u0106\u0083\u0000\u0593\u0594\u0005\u0005\u0000"+
		"\u0000\u0594\u0596\u0003\u0106\u0083\u0000\u0595\u0593\u0001\u0000\u0000"+
		"\u0000\u0596\u0599\u0001\u0000\u0000\u0000\u0597\u0595\u0001\u0000\u0000"+
		"\u0000\u0597\u0598\u0001\u0000\u0000\u0000\u0598\u059c\u0001\u0000\u0000"+
		"\u0000\u0599\u0597\u0001\u0000\u0000\u0000\u059a\u059c\u0005\u0117\u0000"+
		"\u0000\u059b\u0592\u0001\u0000\u0000\u0000\u059b\u059a\u0001\u0000\u0000"+
		"\u0000\u059c?\u0001\u0000\u0000\u0000\u059d\u05a2\u0005\u011b\u0000\u0000"+
		"\u059e\u05a2\u0005\u011d\u0000\u0000\u059f\u05a2\u0003\u00d2i\u0000\u05a0"+
		"\u05a2\u0005\u0117\u0000\u0000\u05a1\u059d\u0001\u0000\u0000\u0000\u05a1"+
		"\u059e\u0001\u0000\u0000\u0000\u05a1\u059f\u0001\u0000\u0000\u0000\u05a1"+
		"\u05a0\u0001\u0000\u0000\u0000\u05a2A\u0001\u0000\u0000\u0000\u05a3\u05a4"+
		"\u0005\u0002\u0000\u0000\u05a4\u05a9\u0003\u00cae\u0000\u05a5\u05a6\u0005"+
		"\u0004\u0000\u0000\u05a6\u05a8\u0003\u00cae\u0000\u05a7\u05a5\u0001\u0000"+
		"\u0000\u0000\u05a8\u05ab\u0001\u0000\u0000\u0000\u05a9\u05a7\u0001\u0000"+
		"\u0000\u0000\u05a9\u05aa\u0001\u0000\u0000\u0000\u05aa\u05ac\u0001\u0000"+
		"\u0000\u0000\u05ab\u05a9\u0001\u0000\u0000\u0000\u05ac\u05ad\u0005\u0003"+
		"\u0000\u0000\u05adC\u0001\u0000\u0000\u0000\u05ae\u05af\u0005\u0002\u0000"+
		"\u0000\u05af\u05b4\u0003B!\u0000\u05b0\u05b1\u0005\u0004\u0000\u0000\u05b1"+
		"\u05b3\u0003B!\u0000\u05b2\u05b0\u0001\u0000\u0000\u0000\u05b3\u05b6\u0001"+
		"\u0000\u0000\u0000\u05b4\u05b2\u0001\u0000\u0000\u0000\u05b4\u05b5\u0001"+
		"\u0000\u0000\u0000\u05b5\u05b7\u0001\u0000\u0000\u0000\u05b6\u05b4\u0001"+
		"\u0000\u0000\u0000\u05b7\u05b8\u0005\u0003\u0000\u0000\u05b8E\u0001\u0000"+
		"\u0000\u0000\u05b9\u05ba\u0005\u00da\u0000\u0000\u05ba\u05bb\u0005\u0016"+
		"\u0000\u0000\u05bb\u05c0\u0003H$\u0000\u05bc\u05bd\u0005\u00da\u0000\u0000"+
		"\u05bd\u05be\u0005\u001e\u0000\u0000\u05be\u05c0\u0003J%\u0000\u05bf\u05b9"+
		"\u0001\u0000\u0000\u0000\u05bf\u05bc\u0001\u0000\u0000\u0000\u05c0G\u0001"+
		"\u0000\u0000\u0000\u05c1\u05c2\u0005u\u0000\u0000\u05c2\u05c3\u0005\u0117"+
		"\u0000\u0000\u05c3\u05c4\u0005\u00a2\u0000\u0000\u05c4\u05c7\u0005\u0117"+
		"\u0000\u0000\u05c5\u05c7\u0003\u0106\u0083\u0000\u05c6\u05c1\u0001\u0000"+
		"\u0000\u0000\u05c6\u05c5\u0001\u0000\u0000\u0000\u05c7I\u0001\u0000\u0000"+
		"\u0000\u05c8\u05cc\u0005\u0117\u0000\u0000\u05c9\u05ca\u0005\u0103\u0000"+
		"\u0000\u05ca\u05cb\u0005\u00ce\u0000\u0000\u05cb\u05cd\u0003:\u001d\u0000"+
		"\u05cc\u05c9\u0001\u0000\u0000\u0000\u05cc\u05cd\u0001\u0000\u0000\u0000"+
		"\u05cdK\u0001\u0000\u0000\u0000\u05ce\u05cf\u0003\u0106\u0083\u0000\u05cf"+
		"\u05d0\u0005\u0117\u0000\u0000\u05d0M\u0001\u0000\u0000\u0000\u05d1\u05d2"+
		"\u0003$\u0012\u0000\u05d2\u05d3\u0003T*\u0000\u05d3\u05d4\u0003P(\u0000"+
		"\u05d4\u0605\u0001\u0000\u0000\u0000\u05d5\u05d7\u0003z=\u0000\u05d6\u05d8"+
		"\u0003R)\u0000\u05d7\u05d6\u0001\u0000\u0000\u0000\u05d8\u05d9\u0001\u0000"+
		"\u0000\u0000\u05d9\u05d7\u0001\u0000\u0000\u0000\u05d9\u05da\u0001\u0000"+
		"\u0000\u0000\u05da\u0605\u0001\u0000\u0000\u0000\u05db\u05dc\u0005B\u0000"+
		"\u0000\u05dc\u05dd\u0005d\u0000\u0000\u05dd\u05de\u0003\u00aeW\u0000\u05de"+
		"\u05e0\u0003\u00a8T\u0000\u05df\u05e1\u0003r9\u0000\u05e0\u05df\u0001"+
		"\u0000\u0000\u0000\u05e0\u05e1\u0001\u0000\u0000\u0000\u05e1\u0605\u0001"+
		"\u0000\u0000\u0000\u05e2\u05e3\u0005\u00f9\u0000\u0000\u05e3\u05e4\u0003"+
		"\u00aeW\u0000\u05e4\u05e5\u0003\u00a8T\u0000\u05e5\u05e7\u0003d2\u0000"+
		"\u05e6\u05e8\u0003r9\u0000\u05e7\u05e6\u0001\u0000\u0000\u0000\u05e7\u05e8"+
		"\u0001\u0000\u0000\u0000\u05e8\u0605\u0001\u0000\u0000\u0000\u05e9\u05ea"+
		"\u0005\u0090\u0000\u0000\u05ea\u05eb\u0005y\u0000\u0000\u05eb\u05ec\u0003"+
		"\u00aeW\u0000\u05ec\u05ed\u0003\u00a8T\u0000\u05ed\u05f3\u0005\u00fc\u0000"+
		"\u0000\u05ee\u05f4\u0003\u00aeW\u0000\u05ef\u05f0\u0005\u0002\u0000\u0000"+
		"\u05f0\u05f1\u0003\"\u0011\u0000\u05f1\u05f2\u0005\u0003\u0000\u0000\u05f2"+
		"\u05f4\u0001\u0000\u0000\u0000\u05f3\u05ee\u0001\u0000\u0000\u0000\u05f3"+
		"\u05ef\u0001\u0000\u0000\u0000\u05f4\u05f5\u0001\u0000\u0000\u0000\u05f5"+
		"\u05f6\u0003\u00a8T\u0000\u05f6\u05f7\u0005\u009a\u0000\u0000\u05f7\u05fb"+
		"\u0003\u00c2a\u0000\u05f8\u05fa\u0003f3\u0000\u05f9\u05f8\u0001\u0000"+
		"\u0000\u0000\u05fa\u05fd\u0001\u0000\u0000\u0000\u05fb\u05f9\u0001\u0000"+
		"\u0000\u0000\u05fb\u05fc\u0001\u0000\u0000\u0000\u05fc\u0601\u0001\u0000"+
		"\u0000\u0000\u05fd\u05fb\u0001\u0000\u0000\u0000\u05fe\u0600\u0003h4\u0000"+
		"\u05ff\u05fe\u0001\u0000\u0000\u0000\u0600\u0603\u0001\u0000\u0000\u0000"+
		"\u0601\u05ff\u0001\u0000\u0000\u0000\u0601\u0602\u0001\u0000\u0000\u0000"+
		"\u0602\u0605\u0001\u0000\u0000\u0000\u0603\u0601\u0001\u0000\u0000\u0000"+
		"\u0604\u05d1\u0001\u0000\u0000\u0000\u0604\u05d5\u0001\u0000\u0000\u0000"+
		"\u0604\u05db\u0001\u0000\u0000\u0000\u0604\u05e2\u0001\u0000\u0000\u0000"+
		"\u0604\u05e9\u0001\u0000\u0000\u0000\u0605O\u0001\u0000\u0000\u0000\u0606"+
		"\u0607\u0005\u009f\u0000\u0000\u0607\u0608\u0005\u001e\u0000\u0000\u0608"+
		"\u060d\u0003X,\u0000\u0609\u060a\u0005\u0004\u0000\u0000\u060a\u060c\u0003"+
		"X,\u0000\u060b\u0609\u0001\u0000\u0000\u0000\u060c\u060f\u0001\u0000\u0000"+
		"\u0000\u060d\u060b\u0001\u0000\u0000\u0000\u060d\u060e\u0001\u0000\u0000"+
		"\u0000\u060e\u0611\u0001\u0000\u0000\u0000\u060f\u060d\u0001\u0000\u0000"+
		"\u0000\u0610\u0606\u0001\u0000\u0000\u0000\u0610\u0611\u0001\u0000\u0000"+
		"\u0000\u0611\u061c\u0001\u0000\u0000\u0000\u0612\u0613\u0005&\u0000\u0000"+
		"\u0613\u0614\u0005\u001e\u0000\u0000\u0614\u0619\u0003\u00c0`\u0000\u0615"+
		"\u0616\u0005\u0004\u0000\u0000\u0616\u0618\u0003\u00c0`\u0000\u0617\u0615"+
		"\u0001\u0000\u0000\u0000\u0618\u061b\u0001\u0000\u0000\u0000\u0619\u0617"+
		"\u0001\u0000\u0000\u0000\u0619\u061a\u0001\u0000\u0000\u0000\u061a\u061d"+
		"\u0001\u0000\u0000\u0000\u061b\u0619\u0001\u0000\u0000\u0000\u061c\u0612"+
		"\u0001\u0000\u0000\u0000\u061c\u061d\u0001\u0000\u0000\u0000\u061d\u0628"+
		"\u0001\u0000\u0000\u0000\u061e\u061f\u0005J\u0000\u0000\u061f\u0620\u0005"+
		"\u001e\u0000\u0000\u0620\u0625\u0003\u00c0`\u0000\u0621\u0622\u0005\u0004"+
		"\u0000\u0000\u0622\u0624\u0003\u00c0`\u0000\u0623\u0621\u0001\u0000\u0000"+
		"\u0000\u0624\u0627\u0001\u0000\u0000\u0000\u0625\u0623\u0001\u0000\u0000"+
		"\u0000\u0625\u0626\u0001\u0000\u0000\u0000\u0626\u0629\u0001\u0000\u0000"+
		"\u0000\u0627\u0625\u0001\u0000\u0000\u0000\u0628\u061e\u0001\u0000\u0000"+
		"\u0000\u0628\u0629\u0001\u0000\u0000\u0000\u0629\u0634\u0001\u0000\u0000"+
		"\u0000\u062a\u062b\u0005\u00d6\u0000\u0000\u062b\u062c\u0005\u001e\u0000"+
		"\u0000\u062c\u0631\u0003X,\u0000\u062d\u062e\u0005\u0004\u0000\u0000\u062e"+
		"\u0630\u0003X,\u0000\u062f\u062d\u0001\u0000\u0000\u0000\u0630\u0633\u0001"+
		"\u0000\u0000\u0000\u0631\u062f\u0001\u0000\u0000\u0000\u0631\u0632\u0001"+
		"\u0000\u0000\u0000\u0632\u0635\u0001\u0000\u0000\u0000\u0633\u0631\u0001"+
		"\u0000\u0000\u0000\u0634\u062a\u0001\u0000\u0000\u0000\u0634\u0635\u0001"+
		"\u0000\u0000\u0000\u0635\u0637\u0001\u0000\u0000\u0000\u0636\u0638\u0003"+
		"\u00f2y\u0000\u0637\u0636\u0001\u0000\u0000\u0000\u0637\u0638\u0001\u0000"+
		"\u0000\u0000\u0638\u063e\u0001\u0000\u0000\u0000\u0639\u063c\u0005\u0084"+
		"\u0000\u0000\u063a\u063d\u0005\u000e\u0000\u0000\u063b\u063d\u0003\u00c0"+
		"`\u0000\u063c\u063a\u0001\u0000\u0000\u0000\u063c\u063b\u0001\u0000\u0000"+
		"\u0000\u063d\u063f\u0001\u0000\u0000\u0000\u063e\u0639\u0001\u0000\u0000"+
		"\u0000\u063e\u063f\u0001\u0000\u0000\u0000\u063fQ\u0001\u0000\u0000\u0000"+
		"\u0640\u0641\u0003$\u0012\u0000\u0641\u0642\u0003\\.\u0000\u0642S\u0001"+
		"\u0000\u0000\u0000\u0643\u0644\u0006*\uffff\uffff\u0000\u0644\u0645\u0003"+
		"V+\u0000\u0645\u065d\u0001\u0000\u0000\u0000\u0646\u0647\n\u0003\u0000"+
		"\u0000\u0647\u0648\u0004*\u0001\u0000\u0648\u064a\u0007\u000e\u0000\u0000"+
		"\u0649\u064b\u0003\u0088D\u0000\u064a\u0649\u0001\u0000\u0000\u0000\u064a"+
		"\u064b\u0001\u0000\u0000\u0000\u064b\u064c\u0001\u0000\u0000\u0000\u064c"+
		"\u065c\u0003T*\u0004\u064d\u064e\n\u0002\u0000\u0000\u064e\u064f\u0004"+
		"*\u0003\u0000\u064f\u0651\u0005w\u0000\u0000\u0650\u0652\u0003\u0088D"+
		"\u0000\u0651\u0650\u0001\u0000\u0000\u0000\u0651\u0652\u0001\u0000\u0000"+
		"\u0000\u0652\u0653\u0001\u0000\u0000\u0000\u0653\u065c\u0003T*\u0003\u0654"+
		"\u0655\n\u0001\u0000\u0000\u0655\u0656\u0004*\u0005\u0000\u0656\u0658"+
		"\u0007\u000f\u0000\u0000\u0657\u0659\u0003\u0088D\u0000\u0658\u0657\u0001"+
		"\u0000\u0000\u0000\u0658\u0659\u0001\u0000\u0000\u0000\u0659\u065a\u0001"+
		"\u0000\u0000\u0000\u065a\u065c\u0003T*\u0002\u065b\u0646\u0001\u0000\u0000"+
		"\u0000\u065b\u064d\u0001\u0000\u0000\u0000\u065b\u0654\u0001\u0000\u0000"+
		"\u0000\u065c\u065f\u0001\u0000\u0000\u0000\u065d\u065b\u0001\u0000\u0000"+
		"\u0000\u065d\u065e\u0001\u0000\u0000\u0000\u065eU\u0001\u0000\u0000\u0000"+
		"\u065f\u065d\u0001\u0000\u0000\u0000\u0660\u066a\u0003^/\u0000\u0661\u066a"+
		"\u0003Z-\u0000\u0662\u0663\u0005\u00df\u0000\u0000\u0663\u066a\u0003\u00ae"+
		"W\u0000\u0664\u066a\u0003\u00a4R\u0000\u0665\u0666\u0005\u0002\u0000\u0000"+
		"\u0666\u0667\u0003\"\u0011\u0000\u0667\u0668\u0005\u0003\u0000\u0000\u0668"+
		"\u066a\u0001\u0000\u0000\u0000\u0669\u0660\u0001\u0000\u0000\u0000\u0669"+
		"\u0661\u0001\u0000\u0000\u0000\u0669\u0662\u0001\u0000\u0000\u0000\u0669"+
		"\u0664\u0001\u0000\u0000\u0000\u0669\u0665\u0001\u0000\u0000\u0000\u066a"+
		"W\u0001\u0000\u0000\u0000\u066b\u066d\u0003\u00c0`\u0000\u066c\u066e\u0007"+
		"\u0010\u0000\u0000\u066d\u066c\u0001\u0000\u0000\u0000\u066d\u066e\u0001"+
		"\u0000\u0000\u0000\u066e\u0671\u0001\u0000\u0000\u0000\u066f\u0670\u0005"+
		"\u0098\u0000\u0000\u0670\u0672\u0007\u0011\u0000\u0000\u0671\u066f\u0001"+
		"\u0000\u0000\u0000\u0671\u0672\u0001\u0000\u0000\u0000\u0672Y\u0001\u0000"+
		"\u0000\u0000\u0673\u0675\u0003z=\u0000\u0674\u0676\u0003\\.\u0000\u0675"+
		"\u0674\u0001\u0000\u0000\u0000\u0676\u0677\u0001\u0000\u0000\u0000\u0677"+
		"\u0675\u0001\u0000\u0000\u0000\u0677\u0678\u0001\u0000\u0000\u0000\u0678"+
		"[\u0001\u0000\u0000\u0000\u0679\u067b\u0003`0\u0000\u067a\u067c\u0003"+
		"r9\u0000\u067b\u067a\u0001\u0000\u0000\u0000\u067b\u067c\u0001\u0000\u0000"+
		"\u0000\u067c\u067d\u0001\u0000\u0000\u0000\u067d\u067e\u0003P(\u0000\u067e"+
		"\u0695\u0001\u0000\u0000\u0000\u067f\u0683\u0003b1\u0000\u0680\u0682\u0003"+
		"\u0086C\u0000\u0681\u0680\u0001\u0000\u0000\u0000\u0682\u0685\u0001\u0000"+
		"\u0000\u0000\u0683\u0681\u0001\u0000\u0000\u0000\u0683\u0684\u0001\u0000"+
		"\u0000\u0000\u0684\u0687\u0001\u0000\u0000\u0000\u0685\u0683\u0001\u0000"+
		"\u0000\u0000\u0686\u0688\u0003r9\u0000\u0687\u0686\u0001\u0000\u0000\u0000"+
		"\u0687\u0688\u0001\u0000\u0000\u0000\u0688\u068a\u0001\u0000\u0000\u0000"+
		"\u0689\u068b\u0003|>\u0000\u068a\u0689\u0001\u0000\u0000\u0000\u068a\u068b"+
		"\u0001\u0000\u0000\u0000\u068b\u068d\u0001\u0000\u0000\u0000\u068c\u068e"+
		"\u0003t:\u0000\u068d\u068c\u0001\u0000\u0000\u0000\u068d\u068e\u0001\u0000"+
		"\u0000\u0000\u068e\u0690\u0001\u0000\u0000\u0000\u068f\u0691\u0003\u00f2"+
		"y\u0000\u0690\u068f\u0001\u0000\u0000\u0000\u0690\u0691\u0001\u0000\u0000"+
		"\u0000\u0691\u0692\u0001\u0000\u0000\u0000\u0692\u0693\u0003P(\u0000\u0693"+
		"\u0695\u0001\u0000\u0000\u0000\u0694\u0679\u0001\u0000\u0000\u0000\u0694"+
		"\u067f\u0001\u0000\u0000\u0000\u0695]\u0001\u0000\u0000\u0000\u0696\u0698"+
		"\u0003`0\u0000\u0697\u0699\u0003z=\u0000\u0698\u0697\u0001\u0000\u0000"+
		"\u0000\u0698\u0699\u0001\u0000\u0000\u0000\u0699\u069b\u0001\u0000\u0000"+
		"\u0000\u069a\u069c\u0003r9\u0000\u069b\u069a\u0001\u0000\u0000\u0000\u069b"+
		"\u069c\u0001\u0000\u0000\u0000\u069c\u06b4\u0001\u0000\u0000\u0000\u069d"+
		"\u069f\u0003b1\u0000\u069e\u06a0\u0003z=\u0000\u069f\u069e\u0001\u0000"+
		"\u0000\u0000\u069f\u06a0\u0001\u0000\u0000\u0000\u06a0\u06a4\u0001\u0000"+
		"\u0000\u0000\u06a1\u06a3\u0003\u0086C\u0000\u06a2\u06a1\u0001\u0000\u0000"+
		"\u0000\u06a3\u06a6\u0001\u0000\u0000\u0000\u06a4\u06a2\u0001\u0000\u0000"+
		"\u0000\u06a4\u06a5\u0001\u0000\u0000\u0000\u06a5\u06a8\u0001\u0000\u0000"+
		"\u0000\u06a6\u06a4\u0001\u0000\u0000\u0000\u06a7\u06a9\u0003r9\u0000\u06a8"+
		"\u06a7\u0001\u0000\u0000\u0000\u06a8\u06a9\u0001\u0000\u0000\u0000\u06a9"+
		"\u06ab\u0001\u0000\u0000\u0000\u06aa\u06ac\u0003|>\u0000\u06ab\u06aa\u0001"+
		"\u0000\u0000\u0000\u06ab\u06ac\u0001\u0000\u0000\u0000\u06ac\u06ae\u0001"+
		"\u0000\u0000\u0000\u06ad\u06af\u0003t:\u0000\u06ae\u06ad\u0001\u0000\u0000"+
		"\u0000\u06ae\u06af\u0001\u0000\u0000\u0000\u06af\u06b1\u0001\u0000\u0000"+
		"\u0000\u06b0\u06b2\u0003\u00f2y\u0000\u06b1\u06b0\u0001\u0000\u0000\u0000"+
		"\u06b1\u06b2\u0001\u0000\u0000\u0000\u06b2\u06b4\u0001\u0000\u0000\u0000"+
		"\u06b3\u0696\u0001\u0000\u0000\u0000\u06b3\u069d\u0001\u0000\u0000\u0000"+
		"\u06b4_\u0001\u0000\u0000\u0000\u06b5\u06b6\u0005\u00ca\u0000\u0000\u06b6"+
		"\u06b7\u0005\u00ec\u0000\u0000\u06b7\u06b8\u0005\u0002\u0000\u0000\u06b8"+
		"\u06b9\u0003\u00b6[\u0000\u06b9\u06ba\u0005\u0003\u0000\u0000\u06ba\u06c0"+
		"\u0001\u0000\u0000\u0000\u06bb\u06bc\u0005\u008e\u0000\u0000\u06bc\u06c0"+
		"\u0003\u00b6[\u0000\u06bd\u06be\u0005\u00b8\u0000\u0000\u06be\u06c0\u0003"+
		"\u00b6[\u0000\u06bf\u06b5\u0001\u0000\u0000\u0000\u06bf\u06bb\u0001\u0000"+
		"\u0000\u0000\u06bf\u06bd\u0001\u0000\u0000\u0000\u06c0\u06c2\u0001\u0000"+
		"\u0000\u0000\u06c1\u06c3\u0003\u00aaU\u0000\u06c2\u06c1\u0001\u0000\u0000"+
		"\u0000\u06c2\u06c3\u0001\u0000\u0000\u0000\u06c3\u06c6\u0001\u0000\u0000"+
		"\u0000\u06c4\u06c5\u0005\u00b6\u0000\u0000\u06c5\u06c7\u0005\u0117\u0000"+
		"\u0000\u06c6\u06c4\u0001\u0000\u0000\u0000\u06c6\u06c7\u0001\u0000\u0000"+
		"\u0000\u06c7\u06c8\u0001\u0000\u0000\u0000\u06c8\u06c9\u0005\u00fc\u0000"+
		"\u0000\u06c9\u06d6\u0005\u0117\u0000\u0000\u06ca\u06d4\u0005\u0016\u0000"+
		"\u0000\u06cb\u06d5\u0003\u0098L\u0000\u06cc\u06d5\u0003\u00e8t\u0000\u06cd"+
		"\u06d0\u0005\u0002\u0000\u0000\u06ce\u06d1\u0003\u0098L\u0000\u06cf\u06d1"+
		"\u0003\u00e8t\u0000\u06d0\u06ce\u0001\u0000\u0000\u0000\u06d0\u06cf\u0001"+
		"\u0000\u0000\u0000\u06d1\u06d2\u0001\u0000\u0000\u0000\u06d2\u06d3\u0005"+
		"\u0003\u0000\u0000\u06d3\u06d5\u0001\u0000\u0000\u0000\u06d4\u06cb\u0001"+
		"\u0000\u0000\u0000\u06d4\u06cc\u0001\u0000\u0000\u0000\u06d4\u06cd\u0001"+
		"\u0000\u0000\u0000\u06d5\u06d7\u0001\u0000\u0000\u0000\u06d6\u06ca\u0001"+
		"\u0000\u0000\u0000\u06d6\u06d7\u0001\u0000\u0000\u0000\u06d7\u06d9\u0001"+
		"\u0000\u0000\u0000\u06d8\u06da\u0003\u00aaU\u0000\u06d9\u06d8\u0001\u0000"+
		"\u0000\u0000\u06d9\u06da\u0001\u0000\u0000\u0000\u06da\u06dd\u0001\u0000"+
		"\u0000\u0000\u06db\u06dc\u0005\u00b5\u0000\u0000\u06dc\u06de\u0005\u0117"+
		"\u0000\u0000\u06dd\u06db\u0001\u0000\u0000\u0000\u06dd\u06de\u0001\u0000"+
		"\u0000\u0000\u06dea\u0001\u0000\u0000\u0000\u06df\u06e3\u0005\u00ca\u0000"+
		"\u0000\u06e0\u06e2\u0003v;\u0000\u06e1\u06e0\u0001\u0000\u0000\u0000\u06e2"+
		"\u06e5\u0001\u0000\u0000\u0000\u06e3\u06e1\u0001\u0000\u0000\u0000\u06e3"+
		"\u06e4\u0001\u0000\u0000\u0000\u06e4\u06e7\u0001\u0000\u0000\u0000\u06e5"+
		"\u06e3\u0001\u0000\u0000\u0000\u06e6\u06e8\u0003\u0088D\u0000\u06e7\u06e6"+
		"\u0001\u0000\u0000\u0000\u06e7\u06e8\u0001\u0000\u0000\u0000\u06e8\u06e9"+
		"\u0001\u0000\u0000\u0000\u06e9\u06ea\u0003\u00b6[\u0000\u06eac\u0001\u0000"+
		"\u0000\u0000\u06eb\u06ec\u0005\u00d0\u0000\u0000\u06ec\u06ed\u0003n7\u0000"+
		"\u06ede\u0001\u0000\u0000\u0000\u06ee\u06ef\u0005\u0100\u0000\u0000\u06ef"+
		"\u06f2\u0005\u008f\u0000\u0000\u06f0\u06f1\u0005\u0011\u0000\u0000\u06f1"+
		"\u06f3\u0003\u00c2a\u0000\u06f2\u06f0\u0001\u0000\u0000\u0000\u06f2\u06f3"+
		"\u0001\u0000\u0000\u0000\u06f3\u06f4\u0001\u0000\u0000\u0000\u06f4\u06f5"+
		"\u0005\u00e5\u0000\u0000\u06f5\u06f6\u0003j5\u0000\u06f6g\u0001\u0000"+
		"\u0000\u0000\u06f7\u06f8\u0005\u0100\u0000\u0000\u06f8\u06f9\u0005\u0096"+
		"\u0000\u0000\u06f9\u06fc\u0005\u008f\u0000\u0000\u06fa\u06fb\u0005\u0011"+
		"\u0000\u0000\u06fb\u06fd\u0003\u00c2a\u0000\u06fc\u06fa\u0001\u0000\u0000"+
		"\u0000\u06fc\u06fd\u0001\u0000\u0000\u0000\u06fd\u06fe\u0001\u0000\u0000"+
		"\u0000\u06fe\u06ff\u0005\u00e5\u0000\u0000\u06ff\u0700\u0003l6\u0000\u0700"+
		"i\u0001\u0000\u0000\u0000\u0701\u0709\u0005B\u0000\u0000\u0702\u0703\u0005"+
		"\u00f9\u0000\u0000\u0703\u0704\u0005\u00d0\u0000\u0000\u0704\u0709\u0005"+
		"\u010f\u0000\u0000\u0705\u0706\u0005\u00f9\u0000\u0000\u0706\u0707\u0005"+
		"\u00d0\u0000\u0000\u0707\u0709\u0003n7\u0000\u0708\u0701\u0001\u0000\u0000"+
		"\u0000\u0708\u0702\u0001\u0000\u0000\u0000\u0708\u0705\u0001\u0000\u0000"+
		"\u0000\u0709k\u0001\u0000\u0000\u0000\u070a\u070b\u0005v\u0000\u0000\u070b"+
		"\u071d\u0005\u010f\u0000\u0000\u070c\u070d\u0005v\u0000\u0000\u070d\u070e"+
		"\u0005\u0002\u0000\u0000\u070e\u070f\u0003\u00acV\u0000\u070f\u0710\u0005"+
		"\u0003\u0000\u0000\u0710\u0711\u0005\u00fd\u0000\u0000\u0711\u0712\u0005"+
		"\u0002\u0000\u0000\u0712\u0717\u0003\u00c0`\u0000\u0713\u0714\u0005\u0004"+
		"\u0000\u0000\u0714\u0716\u0003\u00c0`\u0000\u0715\u0713\u0001\u0000\u0000"+
		"\u0000\u0716\u0719\u0001\u0000\u0000\u0000\u0717\u0715\u0001\u0000\u0000"+
		"\u0000\u0717\u0718\u0001\u0000\u0000\u0000\u0718\u071a\u0001\u0000\u0000"+
		"\u0000\u0719\u0717\u0001\u0000\u0000\u0000\u071a\u071b\u0005\u0003\u0000"+
		"\u0000\u071b\u071d\u0001\u0000\u0000\u0000\u071c\u070a\u0001\u0000\u0000"+
		"\u0000\u071c\u070c\u0001\u0000\u0000\u0000\u071dm\u0001\u0000\u0000\u0000"+
		"\u071e\u0723\u0003p8\u0000\u071f\u0720\u0005\u0004\u0000\u0000\u0720\u0722"+
		"\u0003p8\u0000\u0721\u071f\u0001\u0000\u0000\u0000\u0722\u0725\u0001\u0000"+
		"\u0000\u0000\u0723\u0721\u0001\u0000\u0000\u0000\u0723\u0724\u0001\u0000"+
		"\u0000\u0000\u0724o\u0001\u0000\u0000\u0000\u0725\u0723\u0001\u0000\u0000"+
		"\u0000\u0726\u0727\u0003\u00aeW\u0000\u0727\u0728\u0005\u0105\u0000\u0000"+
		"\u0728\u0729\u0003\u00c0`\u0000\u0729q\u0001\u0000\u0000\u0000\u072a\u072b"+
		"\u0005\u0101\u0000\u0000\u072b\u072c\u0003\u00c2a\u0000\u072cs\u0001\u0000"+
		"\u0000\u0000\u072d\u072e\u0005l\u0000\u0000\u072e\u072f\u0003\u00c2a\u0000"+
		"\u072fu\u0001\u0000\u0000\u0000\u0730\u0731\u0005\u0006\u0000\u0000\u0731"+
		"\u0738\u0003x<\u0000\u0732\u0734\u0005\u0004\u0000\u0000\u0733\u0732\u0001"+
		"\u0000\u0000\u0000\u0733\u0734\u0001\u0000\u0000\u0000\u0734\u0735\u0001"+
		"\u0000\u0000\u0000\u0735\u0737\u0003x<\u0000\u0736\u0733\u0001\u0000\u0000"+
		"\u0000\u0737\u073a\u0001\u0000\u0000\u0000\u0738\u0736\u0001\u0000\u0000"+
		"\u0000\u0738\u0739\u0001\u0000\u0000\u0000\u0739\u073b\u0001\u0000\u0000"+
		"\u0000\u073a\u0738\u0001\u0000\u0000\u0000\u073b\u073c\u0005\u0007\u0000"+
		"\u0000\u073cw\u0001\u0000\u0000\u0000\u073d\u074b\u0003\u0106\u0083\u0000"+
		"\u073e\u073f\u0003\u0106\u0083\u0000\u073f\u0740\u0005\u0002\u0000\u0000"+
		"\u0740\u0745\u0003\u00c8d\u0000\u0741\u0742\u0005\u0004\u0000\u0000\u0742"+
		"\u0744\u0003\u00c8d\u0000\u0743\u0741\u0001\u0000\u0000\u0000\u0744\u0747"+
		"\u0001\u0000\u0000\u0000\u0745\u0743\u0001\u0000\u0000\u0000\u0745\u0746"+
		"\u0001\u0000\u0000\u0000\u0746\u0748\u0001\u0000\u0000\u0000\u0747\u0745"+
		"\u0001\u0000\u0000\u0000\u0748\u0749\u0005\u0003\u0000\u0000\u0749\u074b"+
		"\u0001\u0000\u0000\u0000\u074a\u073d\u0001\u0000\u0000\u0000\u074a\u073e"+
		"\u0001\u0000\u0000\u0000\u074by\u0001\u0000\u0000\u0000\u074c\u074d\u0005"+
		"d\u0000\u0000\u074d\u0752\u0003\u008aE\u0000\u074e\u074f\u0005\u0004\u0000"+
		"\u0000\u074f\u0751\u0003\u008aE\u0000\u0750\u074e\u0001\u0000\u0000\u0000"+
		"\u0751\u0754\u0001\u0000\u0000\u0000\u0752\u0750\u0001\u0000\u0000\u0000"+
		"\u0752\u0753\u0001\u0000\u0000\u0000\u0753\u0758\u0001\u0000\u0000\u0000"+
		"\u0754\u0752\u0001\u0000\u0000\u0000\u0755\u0757\u0003\u0086C\u0000\u0756"+
		"\u0755\u0001\u0000\u0000\u0000\u0757\u075a\u0001\u0000\u0000\u0000\u0758"+
		"\u0756\u0001\u0000\u0000\u0000\u0758\u0759\u0001\u0000\u0000\u0000\u0759"+
		"\u075c\u0001\u0000\u0000\u0000\u075a\u0758\u0001\u0000\u0000\u0000\u075b"+
		"\u075d\u0003\u0080@\u0000\u075c\u075b\u0001\u0000\u0000\u0000\u075c\u075d"+
		"\u0001\u0000\u0000\u0000\u075d{\u0001\u0000\u0000\u0000\u075e\u075f\u0005"+
		"j\u0000\u0000\u075f\u0760\u0005\u001e\u0000\u0000\u0760\u0765\u0003\u00c0"+
		"`\u0000\u0761\u0762\u0005\u0004\u0000\u0000\u0762\u0764\u0003\u00c0`\u0000"+
		"\u0763\u0761\u0001\u0000\u0000\u0000\u0764\u0767\u0001\u0000\u0000\u0000"+
		"\u0765\u0763\u0001\u0000\u0000\u0000\u0765\u0766\u0001\u0000\u0000\u0000"+
		"\u0766\u0779\u0001\u0000\u0000\u0000\u0767\u0765\u0001\u0000\u0000\u0000"+
		"\u0768\u0769\u0005\u0103\u0000\u0000\u0769\u077a\u0005\u00c6\u0000\u0000"+
		"\u076a\u076b\u0005\u0103\u0000\u0000\u076b\u077a\u00057\u0000\u0000\u076c"+
		"\u076d\u0005k\u0000\u0000\u076d\u076e\u0005\u00d2\u0000\u0000\u076e\u076f"+
		"\u0005\u0002\u0000\u0000\u076f\u0774\u0003~?\u0000\u0770\u0771\u0005\u0004"+
		"\u0000\u0000\u0771\u0773\u0003~?\u0000\u0772\u0770\u0001\u0000\u0000\u0000"+
		"\u0773\u0776\u0001\u0000\u0000\u0000\u0774\u0772\u0001\u0000\u0000\u0000"+
		"\u0774\u0775\u0001\u0000\u0000\u0000\u0775\u0777\u0001\u0000\u0000\u0000"+
		"\u0776\u0774\u0001\u0000\u0000\u0000\u0777\u0778\u0005\u0003\u0000\u0000"+
		"\u0778\u077a\u0001\u0000\u0000\u0000\u0779\u0768\u0001\u0000\u0000\u0000"+
		"\u0779\u076a\u0001\u0000\u0000\u0000\u0779\u076c\u0001\u0000\u0000\u0000"+
		"\u0779\u077a\u0001\u0000\u0000\u0000\u077a\u078b\u0001\u0000\u0000\u0000"+
		"\u077b\u077c\u0005j\u0000\u0000\u077c\u077d\u0005\u001e\u0000\u0000\u077d"+
		"\u077e\u0005k\u0000\u0000\u077e\u077f\u0005\u00d2\u0000\u0000\u077f\u0780"+
		"\u0005\u0002\u0000\u0000\u0780\u0785\u0003~?\u0000\u0781\u0782\u0005\u0004"+
		"\u0000\u0000\u0782\u0784\u0003~?\u0000\u0783\u0781\u0001\u0000\u0000\u0000"+
		"\u0784\u0787\u0001\u0000\u0000\u0000\u0785\u0783\u0001\u0000\u0000\u0000"+
		"\u0785\u0786\u0001\u0000\u0000\u0000\u0786\u0788\u0001\u0000\u0000\u0000"+
		"\u0787\u0785\u0001\u0000\u0000\u0000\u0788\u0789\u0005\u0003\u0000\u0000"+
		"\u0789\u078b\u0001\u0000\u0000\u0000\u078a\u075e\u0001\u0000\u0000\u0000"+
		"\u078a\u077b\u0001\u0000\u0000\u0000\u078b}\u0001\u0000\u0000\u0000\u078c"+
		"\u0795\u0005\u0002\u0000\u0000\u078d\u0792\u0003\u00c0`\u0000\u078e\u078f"+
		"\u0005\u0004\u0000\u0000\u078f\u0791\u0003\u00c0`\u0000\u0790\u078e\u0001"+
		"\u0000\u0000\u0000\u0791\u0794\u0001\u0000\u0000\u0000\u0792\u0790\u0001"+
		"\u0000\u0000\u0000\u0792\u0793\u0001\u0000\u0000\u0000\u0793\u0796\u0001"+
		"\u0000\u0000\u0000\u0794\u0792\u0001\u0000\u0000\u0000\u0795\u078d\u0001"+
		"\u0000\u0000\u0000\u0795\u0796\u0001\u0000\u0000\u0000\u0796\u0797\u0001"+
		"\u0000\u0000\u0000\u0797\u079a\u0005\u0003\u0000\u0000\u0798\u079a\u0003"+
		"\u00c0`\u0000\u0799\u078c\u0001\u0000\u0000\u0000\u0799\u0798\u0001\u0000"+
		"\u0000\u0000\u079a\u007f\u0001\u0000\u0000\u0000\u079b\u079c\u0005\u00ab"+
		"\u0000\u0000\u079c\u079d\u0005\u0002\u0000\u0000\u079d\u079e\u0003\u00b6"+
		"[\u0000\u079e\u079f\u0005`\u0000\u0000\u079f\u07a0\u0003\u0082A\u0000"+
		"\u07a0\u07a1\u0005p\u0000\u0000\u07a1\u07a2\u0005\u0002\u0000\u0000\u07a2"+
		"\u07a7\u0003\u0084B\u0000\u07a3\u07a4\u0005\u0004\u0000\u0000\u07a4\u07a6"+
		"\u0003\u0084B\u0000\u07a5\u07a3\u0001\u0000\u0000\u0000\u07a6\u07a9\u0001"+
		"\u0000\u0000\u0000\u07a7\u07a5\u0001\u0000\u0000\u0000\u07a7\u07a8\u0001"+
		"\u0000\u0000\u0000\u07a8\u07aa\u0001\u0000\u0000\u0000\u07a9\u07a7\u0001"+
		"\u0000\u0000\u0000\u07aa\u07ab\u0005\u0003\u0000\u0000\u07ab\u07ac\u0005"+
		"\u0003\u0000\u0000\u07ac\u0081\u0001\u0000\u0000\u0000\u07ad\u07ba\u0003"+
		"\u0106\u0083\u0000\u07ae\u07af\u0005\u0002\u0000\u0000\u07af\u07b4\u0003"+
		"\u0106\u0083\u0000\u07b0\u07b1\u0005\u0004\u0000\u0000\u07b1\u07b3\u0003"+
		"\u0106\u0083\u0000\u07b2\u07b0\u0001\u0000\u0000\u0000\u07b3\u07b6\u0001"+
		"\u0000\u0000\u0000\u07b4\u07b2\u0001\u0000\u0000\u0000\u07b4\u07b5\u0001"+
		"\u0000\u0000\u0000\u07b5\u07b7\u0001\u0000\u0000\u0000\u07b6\u07b4\u0001"+
		"\u0000\u0000\u0000\u07b7\u07b8\u0005\u0003\u0000\u0000\u07b8\u07ba\u0001"+
		"\u0000\u0000\u0000\u07b9\u07ad\u0001\u0000\u0000\u0000\u07b9\u07ae\u0001"+
		"\u0000\u0000\u0000\u07ba\u0083\u0001\u0000\u0000\u0000\u07bb\u07c0\u0003"+
		"\u00c0`\u0000\u07bc\u07be\u0005\u0016\u0000\u0000\u07bd\u07bc\u0001\u0000"+
		"\u0000\u0000\u07bd\u07be\u0001\u0000\u0000\u0000\u07be\u07bf\u0001\u0000"+
		"\u0000\u0000\u07bf\u07c1\u0003\u0106\u0083\u0000\u07c0\u07bd\u0001\u0000"+
		"\u0000\u0000\u07c0\u07c1\u0001\u0000\u0000\u0000\u07c1\u0085\u0001\u0000"+
		"\u0000\u0000\u07c2\u07c3\u0005\u007f\u0000\u0000\u07c3\u07c5\u0005\u00fe"+
		"\u0000\u0000\u07c4\u07c6\u0005\u00a1\u0000\u0000\u07c5\u07c4\u0001\u0000"+
		"\u0000\u0000\u07c5\u07c6\u0001\u0000\u0000\u0000\u07c6\u07c7\u0001\u0000"+
		"\u0000\u0000\u07c7\u07c8\u0003\u0100\u0080\u0000\u07c8\u07d1\u0005\u0002"+
		"\u0000\u0000\u07c9\u07ce\u0003\u00c0`\u0000\u07ca\u07cb\u0005\u0004\u0000"+
		"\u0000\u07cb\u07cd\u0003\u00c0`\u0000\u07cc\u07ca\u0001\u0000\u0000\u0000"+
		"\u07cd\u07d0\u0001\u0000\u0000\u0000\u07ce\u07cc\u0001\u0000\u0000\u0000"+
		"\u07ce\u07cf\u0001\u0000\u0000\u0000\u07cf\u07d2\u0001\u0000\u0000\u0000"+
		"\u07d0\u07ce\u0001\u0000\u0000\u0000\u07d1\u07c9\u0001\u0000\u0000\u0000"+
		"\u07d1\u07d2\u0001\u0000\u0000\u0000\u07d2\u07d3\u0001\u0000\u0000\u0000"+
		"\u07d3\u07d4\u0005\u0003\u0000\u0000\u07d4\u07e0\u0003\u0106\u0083\u0000"+
		"\u07d5\u07d7\u0005\u0016\u0000\u0000\u07d6\u07d5\u0001\u0000\u0000\u0000"+
		"\u07d6\u07d7\u0001\u0000\u0000\u0000\u07d7\u07d8\u0001\u0000\u0000\u0000"+
		"\u07d8\u07dd\u0003\u0106\u0083\u0000\u07d9\u07da\u0005\u0004\u0000\u0000"+
		"\u07da\u07dc\u0003\u0106\u0083\u0000\u07db\u07d9\u0001\u0000\u0000\u0000"+
		"\u07dc\u07df\u0001\u0000\u0000\u0000\u07dd\u07db\u0001\u0000\u0000\u0000"+
		"\u07dd\u07de\u0001\u0000\u0000\u0000\u07de\u07e1\u0001\u0000\u0000\u0000"+
		"\u07df\u07dd\u0001\u0000\u0000\u0000\u07e0\u07d6\u0001\u0000\u0000\u0000"+
		"\u07e0\u07e1\u0001\u0000\u0000\u0000\u07e1\u0087\u0001\u0000\u0000\u0000"+
		"\u07e2\u07e3\u0007\u0012\u0000\u0000\u07e3\u0089\u0001\u0000\u0000\u0000"+
		"\u07e4\u07e8\u0003\u00a2Q\u0000\u07e5\u07e7\u0003\u008cF\u0000\u07e6\u07e5"+
		"\u0001\u0000\u0000\u0000\u07e7\u07ea\u0001\u0000\u0000\u0000\u07e8\u07e6"+
		"\u0001\u0000\u0000\u0000\u07e8\u07e9\u0001\u0000\u0000\u0000\u07e9\u008b"+
		"\u0001\u0000\u0000\u0000\u07ea\u07e8\u0001\u0000\u0000\u0000\u07eb\u07ec"+
		"\u0003\u008eG\u0000\u07ec\u07ed\u0005|\u0000\u0000\u07ed\u07ef\u0003\u00a2"+
		"Q\u0000\u07ee\u07f0\u0003\u0090H\u0000\u07ef\u07ee\u0001\u0000\u0000\u0000"+
		"\u07ef\u07f0\u0001\u0000\u0000\u0000\u07f0\u07f7\u0001\u0000\u0000\u0000"+
		"\u07f1\u07f2\u0005\u0094\u0000\u0000\u07f2\u07f3\u0003\u008eG\u0000\u07f3"+
		"\u07f4\u0005|\u0000\u0000\u07f4\u07f5\u0003\u00a2Q\u0000\u07f5\u07f7\u0001"+
		"\u0000\u0000\u0000\u07f6\u07eb\u0001\u0000\u0000\u0000\u07f6\u07f1\u0001"+
		"\u0000\u0000\u0000\u07f7\u008d\u0001\u0000\u0000\u0000\u07f8\u07fa\u0005"+
		"s\u0000\u0000\u07f9\u07f8\u0001\u0000\u0000\u0000\u07f9\u07fa\u0001\u0000"+
		"\u0000\u0000\u07fa\u0811\u0001\u0000\u0000\u0000\u07fb\u0811\u00056\u0000"+
		"\u0000\u07fc\u07fe\u0005\u0082\u0000\u0000\u07fd\u07ff\u0005\u00a1\u0000"+
		"\u0000\u07fe\u07fd\u0001\u0000\u0000\u0000\u07fe\u07ff\u0001\u0000\u0000"+
		"\u0000\u07ff\u0811\u0001\u0000\u0000\u0000\u0800\u0802\u0005\u0082\u0000"+
		"\u0000\u0801\u0800\u0001\u0000\u0000\u0000\u0801\u0802\u0001\u0000\u0000"+
		"\u0000\u0802\u0803\u0001\u0000\u0000\u0000\u0803\u0811\u0005\u00cb\u0000"+
		"\u0000\u0804\u0806\u0005\u00c1\u0000\u0000\u0805\u0807\u0005\u00a1\u0000"+
		"\u0000\u0806\u0805\u0001\u0000\u0000\u0000\u0806\u0807\u0001\u0000\u0000"+
		"\u0000\u0807\u0811\u0001\u0000\u0000\u0000\u0808\u080a\u0005e\u0000\u0000"+
		"\u0809\u080b\u0005\u00a1\u0000\u0000\u080a\u0809\u0001\u0000\u0000\u0000"+
		"\u080a\u080b\u0001\u0000\u0000\u0000\u080b\u0811\u0001\u0000\u0000\u0000"+
		"\u080c\u080e\u0005\u0082\u0000\u0000\u080d\u080c\u0001\u0000\u0000\u0000"+
		"\u080d\u080e\u0001\u0000\u0000\u0000\u080e\u080f\u0001\u0000\u0000\u0000"+
		"\u080f\u0811\u0005\u0012\u0000\u0000\u0810\u07f9\u0001\u0000\u0000\u0000"+
		"\u0810\u07fb\u0001\u0000\u0000\u0000\u0810\u07fc\u0001\u0000\u0000\u0000"+
		"\u0810\u0801\u0001\u0000\u0000\u0000\u0810\u0804\u0001\u0000\u0000\u0000"+
		"\u0810\u0808\u0001\u0000\u0000\u0000\u0810\u080d\u0001\u0000\u0000\u0000"+
		"\u0811\u008f\u0001\u0000\u0000\u0000\u0812\u0813\u0005\u009a\u0000\u0000"+
		"\u0813\u0817\u0003\u00c2a\u0000\u0814\u0815\u0005\u00fc\u0000\u0000\u0815"+
		"\u0817\u0003\u0096K\u0000\u0816\u0812\u0001\u0000\u0000\u0000\u0816\u0814"+
		"\u0001\u0000\u0000\u0000\u0817\u0091\u0001\u0000\u0000\u0000\u0818\u0819"+
		"\u0005\u00e1\u0000\u0000\u0819\u081b\u0005\u0002\u0000\u0000\u081a\u081c"+
		"\u0003\u0094J\u0000\u081b\u081a\u0001\u0000\u0000\u0000\u081b\u081c\u0001"+
		"\u0000\u0000\u0000\u081c\u081d\u0001\u0000\u0000\u0000\u081d\u081e\u0005"+
		"\u0003\u0000\u0000\u081e\u0093\u0001\u0000\u0000\u0000\u081f\u0821\u0005"+
		"\u010e\u0000\u0000\u0820\u081f\u0001\u0000\u0000\u0000\u0820\u0821\u0001"+
		"\u0000\u0000\u0000\u0821\u0822\u0001\u0000\u0000\u0000\u0822\u0823\u0007"+
		"\u0013\u0000\u0000\u0823\u0838\u0005\u00aa\u0000\u0000\u0824\u0825\u0003"+
		"\u00c0`\u0000\u0825\u0826\u0005\u00c8\u0000\u0000\u0826\u0838\u0001\u0000"+
		"\u0000\u0000\u0827\u0828\u0005\u001c\u0000\u0000\u0828\u0829\u0005\u011b"+
		"\u0000\u0000\u0829\u082a\u0005\u00a0\u0000\u0000\u082a\u082b\u0005\u0099"+
		"\u0000\u0000\u082b\u0834\u0005\u011b\u0000\u0000\u082c\u0832\u0005\u009a"+
		"\u0000\u0000\u082d\u0833\u0003\u0106\u0083\u0000\u082e\u082f\u0003\u0100"+
		"\u0080\u0000\u082f\u0830\u0005\u0002\u0000\u0000\u0830\u0831\u0005\u0003"+
		"\u0000\u0000\u0831\u0833\u0001\u0000\u0000\u0000\u0832\u082d\u0001\u0000"+
		"\u0000\u0000\u0832\u082e\u0001\u0000\u0000\u0000\u0833\u0835\u0001\u0000"+
		"\u0000\u0000\u0834\u082c\u0001\u0000\u0000\u0000\u0834\u0835\u0001\u0000"+
		"\u0000\u0000\u0835\u0838\u0001\u0000\u0000\u0000\u0836\u0838\u0003\u00c0"+
		"`\u0000\u0837\u0820\u0001\u0000\u0000\u0000\u0837\u0824\u0001\u0000\u0000"+
		"\u0000\u0837\u0827\u0001\u0000\u0000\u0000\u0837\u0836\u0001\u0000\u0000"+
		"\u0000\u0838\u0095\u0001\u0000\u0000\u0000\u0839\u083a\u0005\u0002\u0000"+
		"\u0000\u083a\u083b\u0003\u0098L\u0000\u083b\u083c\u0005\u0003\u0000\u0000"+
		"\u083c\u0097\u0001\u0000\u0000\u0000\u083d\u0842\u0003\u0102\u0081\u0000"+
		"\u083e\u083f\u0005\u0004\u0000\u0000\u083f\u0841\u0003\u0102\u0081\u0000"+
		"\u0840\u083e\u0001\u0000\u0000\u0000\u0841\u0844\u0001\u0000\u0000\u0000"+
		"\u0842\u0840\u0001\u0000\u0000\u0000\u0842\u0843\u0001\u0000\u0000\u0000"+
		"\u0843\u0099\u0001\u0000\u0000\u0000\u0844\u0842\u0001\u0000\u0000\u0000"+
		"\u0845\u0846\u0005\u0002\u0000\u0000\u0846\u084b\u0003\u009cN\u0000\u0847"+
		"\u0848\u0005\u0004\u0000\u0000\u0848\u084a\u0003\u009cN\u0000\u0849\u0847"+
		"\u0001\u0000\u0000\u0000\u084a\u084d\u0001\u0000\u0000\u0000\u084b\u0849"+
		"\u0001\u0000\u0000\u0000\u084b\u084c\u0001\u0000\u0000\u0000\u084c\u084e"+
		"\u0001\u0000\u0000\u0000\u084d\u084b\u0001\u0000\u0000\u0000\u084e\u084f"+
		"\u0005\u0003\u0000\u0000\u084f\u009b\u0001\u0000\u0000\u0000\u0850\u0852"+
		"\u0003\u0102\u0081\u0000\u0851\u0853\u0007\u0010\u0000\u0000\u0852\u0851"+
		"\u0001\u0000\u0000\u0000\u0852\u0853\u0001\u0000\u0000\u0000\u0853\u009d"+
		"\u0001\u0000\u0000\u0000\u0854\u0855\u0005\u0002\u0000\u0000\u0855\u085a"+
		"\u0003\u00a0P\u0000\u0856\u0857\u0005\u0004\u0000\u0000\u0857\u0859\u0003"+
		"\u00a0P\u0000\u0858\u0856\u0001\u0000\u0000\u0000\u0859\u085c\u0001\u0000"+
		"\u0000\u0000\u085a\u0858\u0001\u0000\u0000\u0000\u085a\u085b\u0001\u0000"+
		"\u0000\u0000\u085b\u085d\u0001\u0000\u0000\u0000\u085c\u085a\u0001\u0000"+
		"\u0000\u0000\u085d\u085e\u0005\u0003\u0000\u0000\u085e\u009f\u0001\u0000"+
		"\u0000\u0000\u085f\u0861\u0003\u0106\u0083\u0000\u0860\u0862\u0003 \u0010"+
		"\u0000\u0861\u0860\u0001\u0000\u0000\u0000\u0861\u0862\u0001\u0000\u0000"+
		"\u0000\u0862\u00a1\u0001\u0000\u0000\u0000\u0863\u0865\u0003\u00aeW\u0000"+
		"\u0864\u0866\u0003\u0092I\u0000\u0865\u0864\u0001\u0000\u0000\u0000\u0865"+
		"\u0866\u0001\u0000\u0000\u0000\u0866\u0867\u0001\u0000\u0000\u0000\u0867"+
		"\u0868\u0003\u00a8T\u0000\u0868\u087c\u0001\u0000\u0000\u0000\u0869\u086a"+
		"\u0005\u0002\u0000\u0000\u086a\u086b\u0003\"\u0011\u0000\u086b\u086d\u0005"+
		"\u0003\u0000\u0000\u086c\u086e\u0003\u0092I\u0000\u086d\u086c\u0001\u0000"+
		"\u0000\u0000\u086d\u086e\u0001\u0000\u0000\u0000\u086e\u086f\u0001\u0000"+
		"\u0000\u0000\u086f\u0870\u0003\u00a8T\u0000\u0870\u087c\u0001\u0000\u0000"+
		"\u0000\u0871\u0872\u0005\u0002\u0000\u0000\u0872\u0873\u0003\u008aE\u0000"+
		"\u0873\u0875\u0005\u0003\u0000\u0000\u0874\u0876\u0003\u0092I\u0000\u0875"+
		"\u0874\u0001\u0000\u0000\u0000\u0875\u0876\u0001\u0000\u0000\u0000\u0876"+
		"\u0877\u0001\u0000\u0000\u0000\u0877\u0878\u0003\u00a8T\u0000\u0878\u087c"+
		"\u0001\u0000\u0000\u0000\u0879\u087c\u0003\u00a4R\u0000\u087a";
	private static final String _serializedATNSegment1 =
		"\u087c\u0003\u00a6S\u0000\u087b\u0863\u0001\u0000\u0000\u0000\u087b\u0869"+
		"\u0001\u0000\u0000\u0000\u087b\u0871\u0001\u0000\u0000\u0000\u087b\u0879"+
		"\u0001\u0000\u0000\u0000\u087b\u087a\u0001\u0000\u0000\u0000\u087c\u00a3"+
		"\u0001\u0000\u0000\u0000\u087d\u087e\u0005\u00fd\u0000\u0000\u087e\u0883"+
		"\u0003\u00c0`\u0000\u087f\u0880\u0005\u0004\u0000\u0000\u0880\u0882\u0003"+
		"\u00c0`\u0000\u0881\u087f\u0001\u0000\u0000\u0000\u0882\u0885\u0001\u0000"+
		"\u0000\u0000\u0883\u0881\u0001\u0000\u0000\u0000\u0883\u0884\u0001\u0000"+
		"\u0000\u0000\u0884\u0886\u0001\u0000\u0000\u0000\u0885\u0883\u0001\u0000"+
		"\u0000\u0000\u0886\u0887\u0003\u00a8T\u0000\u0887\u00a5\u0001\u0000\u0000"+
		"\u0000\u0888\u0889\u0003\u0102\u0081\u0000\u0889\u0892\u0005\u0002\u0000"+
		"\u0000\u088a\u088f\u0003\u00c0`\u0000\u088b\u088c\u0005\u0004\u0000\u0000"+
		"\u088c\u088e\u0003\u00c0`\u0000\u088d\u088b\u0001\u0000\u0000\u0000\u088e"+
		"\u0891\u0001\u0000\u0000\u0000\u088f\u088d\u0001\u0000\u0000\u0000\u088f"+
		"\u0890\u0001\u0000\u0000\u0000\u0890\u0893\u0001\u0000\u0000\u0000\u0891"+
		"\u088f\u0001\u0000\u0000\u0000\u0892\u088a\u0001\u0000\u0000\u0000\u0892"+
		"\u0893\u0001\u0000\u0000\u0000\u0893\u0894\u0001\u0000\u0000\u0000\u0894"+
		"\u0895\u0005\u0003\u0000\u0000\u0895\u0896\u0003\u00a8T\u0000\u0896\u00a7"+
		"\u0001\u0000\u0000\u0000\u0897\u0899\u0005\u0016\u0000\u0000\u0898\u0897"+
		"\u0001\u0000\u0000\u0000\u0898\u0899\u0001\u0000\u0000\u0000\u0899\u089a"+
		"\u0001\u0000\u0000\u0000\u089a\u089c\u0003\u0108\u0084\u0000\u089b\u089d"+
		"\u0003\u0096K\u0000\u089c\u089b\u0001\u0000\u0000\u0000\u089c\u089d\u0001"+
		"\u0000\u0000\u0000\u089d\u089f\u0001\u0000\u0000\u0000\u089e\u0898\u0001"+
		"\u0000\u0000\u0000\u089e\u089f\u0001\u0000\u0000\u0000\u089f\u00a9\u0001"+
		"\u0000\u0000\u0000\u08a0\u08a1\u0005\u00c7\u0000\u0000\u08a1\u08a2\u0005"+
		"b\u0000\u0000\u08a2\u08a3\u0005\u00cd\u0000\u0000\u08a3\u08a7\u0005\u0117"+
		"\u0000\u0000\u08a4\u08a5\u0005\u0103\u0000\u0000\u08a5\u08a6\u0005\u00ce"+
		"\u0000\u0000\u08a6\u08a8\u0003:\u001d\u0000\u08a7\u08a4\u0001\u0000\u0000"+
		"\u0000\u08a7\u08a8\u0001\u0000\u0000\u0000\u08a8\u08d2\u0001\u0000\u0000"+
		"\u0000\u08a9\u08aa\u0005\u00c7\u0000\u0000\u08aa\u08ab\u0005b\u0000\u0000"+
		"\u08ab\u08b5\u0005C\u0000\u0000\u08ac\u08ad\u0005[\u0000\u0000\u08ad\u08ae"+
		"\u0005\u00e4\u0000\u0000\u08ae\u08af\u0005\u001e\u0000\u0000\u08af\u08b3"+
		"\u0005\u0117\u0000\u0000\u08b0\u08b1\u0005P\u0000\u0000\u08b1\u08b2\u0005"+
		"\u001e\u0000\u0000\u08b2\u08b4\u0005\u0117\u0000\u0000\u08b3\u08b0\u0001"+
		"\u0000\u0000\u0000\u08b3\u08b4\u0001\u0000\u0000\u0000\u08b4\u08b6\u0001"+
		"\u0000\u0000\u0000\u08b5\u08ac\u0001\u0000\u0000\u0000\u08b5\u08b6\u0001"+
		"\u0000\u0000\u0000\u08b6\u08bc\u0001\u0000\u0000\u0000\u08b7\u08b8\u0005"+
		"*\u0000\u0000\u08b8\u08b9\u0005{\u0000\u0000\u08b9\u08ba\u0005\u00e4\u0000"+
		"\u0000\u08ba\u08bb\u0005\u001e\u0000\u0000\u08bb\u08bd\u0005\u0117\u0000"+
		"\u0000\u08bc\u08b7\u0001\u0000\u0000\u0000\u08bc\u08bd\u0001\u0000\u0000"+
		"\u0000\u08bd\u08c3\u0001\u0000\u0000\u0000\u08be\u08bf\u0005\u008e\u0000"+
		"\u0000\u08bf\u08c0\u0005}\u0000\u0000\u08c0\u08c1\u0005\u00e4\u0000\u0000"+
		"\u08c1\u08c2\u0005\u001e\u0000\u0000\u08c2\u08c4\u0005\u0117\u0000\u0000"+
		"\u08c3\u08be\u0001\u0000\u0000\u0000\u08c3\u08c4\u0001\u0000\u0000\u0000"+
		"\u08c4\u08c9\u0001\u0000\u0000\u0000\u08c5\u08c6\u0005\u0085\u0000\u0000"+
		"\u08c6\u08c7\u0005\u00e4\u0000\u0000\u08c7\u08c8\u0005\u001e\u0000\u0000"+
		"\u08c8\u08ca\u0005\u0117\u0000\u0000\u08c9\u08c5\u0001\u0000\u0000\u0000"+
		"\u08c9\u08ca\u0001\u0000\u0000\u0000\u08ca\u08cf\u0001\u0000\u0000\u0000"+
		"\u08cb\u08cc\u0005\u0097\u0000\u0000\u08cc\u08cd\u0005A\u0000\u0000\u08cd"+
		"\u08ce\u0005\u0016\u0000\u0000\u08ce\u08d0\u0005\u0117\u0000\u0000\u08cf"+
		"\u08cb\u0001\u0000\u0000\u0000\u08cf\u08d0\u0001\u0000\u0000\u0000\u08d0"+
		"\u08d2\u0001\u0000\u0000\u0000\u08d1\u08a0\u0001\u0000\u0000\u0000\u08d1"+
		"\u08a9\u0001\u0000\u0000\u0000\u08d2\u00ab\u0001\u0000\u0000\u0000\u08d3"+
		"\u08d8\u0003\u00aeW\u0000\u08d4\u08d5\u0005\u0004\u0000\u0000\u08d5\u08d7"+
		"\u0003\u00aeW\u0000\u08d6\u08d4\u0001\u0000\u0000\u0000\u08d7\u08da\u0001"+
		"\u0000\u0000\u0000\u08d8\u08d6\u0001\u0000\u0000\u0000\u08d8\u08d9\u0001"+
		"\u0000\u0000\u0000\u08d9\u00ad\u0001\u0000\u0000\u0000\u08da\u08d8\u0001"+
		"\u0000\u0000\u0000\u08db\u08e0\u0003\u0102\u0081\u0000\u08dc\u08dd\u0005"+
		"\u0005\u0000\u0000\u08dd\u08df\u0003\u0102\u0081\u0000\u08de\u08dc\u0001"+
		"\u0000\u0000\u0000\u08df\u08e2\u0001\u0000\u0000\u0000\u08e0\u08de\u0001"+
		"\u0000\u0000\u0000\u08e0\u08e1\u0001\u0000\u0000\u0000\u08e1\u00af\u0001"+
		"\u0000\u0000\u0000\u08e2\u08e0\u0001\u0000\u0000\u0000\u08e3\u08e4\u0003"+
		"\u0102\u0081\u0000\u08e4\u08e5\u0005\u0005\u0000\u0000\u08e5\u08e7\u0001"+
		"\u0000\u0000\u0000\u08e6\u08e3\u0001\u0000\u0000\u0000\u08e6\u08e7\u0001"+
		"\u0000\u0000\u0000\u08e7\u08e8\u0001\u0000\u0000\u0000\u08e8\u08e9\u0003"+
		"\u0102\u0081\u0000\u08e9\u00b1\u0001\u0000\u0000\u0000\u08ea\u08eb\u0003"+
		"\u0102\u0081\u0000\u08eb\u08ec\u0005\u0005\u0000\u0000\u08ec\u08ee\u0001"+
		"\u0000\u0000\u0000\u08ed\u08ea\u0001\u0000\u0000\u0000\u08ed\u08ee\u0001"+
		"\u0000\u0000\u0000\u08ee\u08ef\u0001\u0000\u0000\u0000\u08ef\u08f0\u0003"+
		"\u0102\u0081\u0000\u08f0\u00b3\u0001\u0000\u0000\u0000\u08f1\u08f9\u0003"+
		"\u00c0`\u0000\u08f2\u08f4\u0005\u0016\u0000\u0000\u08f3\u08f2\u0001\u0000"+
		"\u0000\u0000\u08f3\u08f4\u0001\u0000\u0000\u0000\u08f4\u08f7\u0001\u0000"+
		"\u0000\u0000\u08f5\u08f8\u0003\u0102\u0081\u0000\u08f6\u08f8\u0003\u0096"+
		"K\u0000\u08f7\u08f5\u0001\u0000\u0000\u0000\u08f7\u08f6\u0001\u0000\u0000"+
		"\u0000\u08f8\u08fa\u0001\u0000\u0000\u0000\u08f9\u08f3\u0001\u0000\u0000"+
		"\u0000\u08f9\u08fa\u0001\u0000\u0000\u0000\u08fa\u00b5\u0001\u0000\u0000"+
		"\u0000\u08fb\u0900\u0003\u00b4Z\u0000\u08fc\u08fd\u0005\u0004\u0000\u0000"+
		"\u08fd\u08ff\u0003\u00b4Z\u0000\u08fe\u08fc\u0001\u0000\u0000\u0000\u08ff"+
		"\u0902\u0001\u0000\u0000\u0000\u0900\u08fe\u0001\u0000\u0000\u0000\u0900"+
		"\u0901\u0001\u0000\u0000\u0000\u0901\u00b7\u0001\u0000\u0000\u0000\u0902"+
		"\u0900\u0001\u0000\u0000\u0000\u0903\u0904\u0005\u0002\u0000\u0000\u0904"+
		"\u0909\u0003\u00ba]\u0000\u0905\u0906\u0005\u0004\u0000\u0000\u0906\u0908"+
		"\u0003\u00ba]\u0000\u0907\u0905\u0001\u0000\u0000\u0000\u0908\u090b\u0001"+
		"\u0000\u0000\u0000\u0909\u0907\u0001\u0000\u0000\u0000\u0909\u090a\u0001"+
		"\u0000\u0000\u0000\u090a\u090c\u0001\u0000\u0000\u0000\u090b\u0909\u0001"+
		"\u0000\u0000\u0000\u090c\u090d\u0005\u0003\u0000\u0000\u090d\u00b9\u0001"+
		"\u0000\u0000\u0000\u090e\u0911\u0003\u00bc^\u0000\u090f\u0911\u0003\u00ea"+
		"u\u0000\u0910\u090e\u0001\u0000\u0000\u0000\u0910\u090f\u0001\u0000\u0000"+
		"\u0000\u0911\u00bb\u0001\u0000\u0000\u0000\u0912\u0920\u0003\u0100\u0080"+
		"\u0000\u0913\u0914\u0003\u0106\u0083\u0000\u0914\u0915\u0005\u0002\u0000"+
		"\u0000\u0915\u091a\u0003\u00be_\u0000\u0916\u0917\u0005\u0004\u0000\u0000"+
		"\u0917\u0919\u0003\u00be_\u0000\u0918\u0916\u0001\u0000\u0000\u0000\u0919"+
		"\u091c\u0001\u0000\u0000\u0000\u091a\u0918\u0001\u0000\u0000\u0000\u091a"+
		"\u091b\u0001\u0000\u0000\u0000\u091b\u091d\u0001\u0000\u0000\u0000\u091c"+
		"\u091a\u0001\u0000\u0000\u0000\u091d\u091e\u0005\u0003\u0000\u0000\u091e"+
		"\u0920\u0001\u0000\u0000\u0000\u091f\u0912\u0001\u0000\u0000\u0000\u091f"+
		"\u0913\u0001\u0000\u0000\u0000\u0920\u00bd\u0001\u0000\u0000\u0000\u0921"+
		"\u0924\u0003\u0100\u0080\u0000\u0922\u0924\u0003\u00cae\u0000\u0923\u0921"+
		"\u0001\u0000\u0000\u0000\u0923\u0922\u0001\u0000\u0000\u0000\u0924\u00bf"+
		"\u0001\u0000\u0000\u0000\u0925\u0926\u0003\u00c2a\u0000\u0926\u00c1\u0001"+
		"\u0000\u0000\u0000\u0927\u0928\u0006a\uffff\uffff\u0000\u0928\u0929\u0005"+
		"\u0096\u0000\u0000\u0929\u0934\u0003\u00c2a\u0005\u092a\u092b\u0005S\u0000"+
		"\u0000\u092b\u092c\u0005\u0002\u0000\u0000\u092c\u092d\u0003\"\u0011\u0000"+
		"\u092d\u092e\u0005\u0003\u0000\u0000\u092e\u0934\u0001\u0000\u0000\u0000"+
		"\u092f\u0931\u0003\u00c6c\u0000\u0930\u0932\u0003\u00c4b\u0000\u0931\u0930"+
		"\u0001\u0000\u0000\u0000\u0931\u0932\u0001\u0000\u0000\u0000\u0932\u0934"+
		"\u0001\u0000\u0000\u0000\u0933\u0927\u0001\u0000\u0000\u0000\u0933\u092a"+
		"\u0001\u0000\u0000\u0000\u0933\u092f\u0001\u0000\u0000\u0000\u0934\u093d"+
		"\u0001\u0000\u0000\u0000\u0935\u0936\n\u0002\u0000\u0000\u0936\u0937\u0005"+
		"\u0011\u0000\u0000\u0937\u093c\u0003\u00c2a\u0003\u0938\u0939\n\u0001"+
		"\u0000\u0000\u0939\u093a\u0005\u009e\u0000\u0000\u093a\u093c\u0003\u00c2"+
		"a\u0002\u093b\u0935\u0001\u0000\u0000\u0000\u093b\u0938\u0001\u0000\u0000"+
		"\u0000\u093c\u093f\u0001\u0000\u0000\u0000\u093d\u093b\u0001\u0000\u0000"+
		"\u0000\u093d\u093e\u0001\u0000\u0000\u0000\u093e\u00c3\u0001\u0000\u0000"+
		"\u0000\u093f\u093d\u0001\u0000\u0000\u0000\u0940\u0942\u0005\u0096\u0000"+
		"\u0000\u0941\u0940\u0001\u0000\u0000\u0000\u0941\u0942\u0001\u0000\u0000"+
		"\u0000\u0942\u0943\u0001\u0000\u0000\u0000\u0943\u0944\u0005\u001a\u0000"+
		"\u0000\u0944\u0945\u0003\u00c6c\u0000\u0945\u0946\u0005\u0011\u0000\u0000"+
		"\u0946\u0947\u0003\u00c6c\u0000\u0947\u0993\u0001\u0000\u0000\u0000\u0948"+
		"\u094a\u0005\u0096\u0000\u0000\u0949\u0948\u0001\u0000\u0000\u0000\u0949"+
		"\u094a\u0001\u0000\u0000\u0000\u094a\u094b\u0001\u0000\u0000\u0000\u094b"+
		"\u094c\u0005p\u0000\u0000\u094c\u094d\u0005\u0002\u0000\u0000\u094d\u0952"+
		"\u0003\u00c0`\u0000\u094e\u094f\u0005\u0004\u0000\u0000\u094f\u0951\u0003"+
		"\u00c0`\u0000\u0950\u094e\u0001\u0000\u0000\u0000\u0951\u0954\u0001\u0000"+
		"\u0000\u0000\u0952\u0950\u0001\u0000\u0000\u0000\u0952\u0953\u0001\u0000"+
		"\u0000\u0000\u0953\u0955\u0001\u0000\u0000\u0000\u0954\u0952\u0001\u0000"+
		"\u0000\u0000\u0955\u0956\u0005\u0003\u0000\u0000\u0956\u0993\u0001\u0000"+
		"\u0000\u0000\u0957\u0959\u0005\u0096\u0000\u0000\u0958\u0957\u0001\u0000"+
		"\u0000\u0000\u0958\u0959\u0001\u0000\u0000\u0000\u0959\u095a\u0001\u0000"+
		"\u0000\u0000\u095a\u095b\u0005p\u0000\u0000\u095b\u095c\u0005\u0002\u0000"+
		"\u0000\u095c\u095d\u0003\"\u0011\u0000\u095d\u095e\u0005\u0003\u0000\u0000"+
		"\u095e\u0993\u0001\u0000\u0000\u0000\u095f\u0961\u0005\u0096\u0000\u0000"+
		"\u0960\u095f\u0001\u0000\u0000\u0000\u0960\u0961\u0001\u0000\u0000\u0000"+
		"\u0961\u0962\u0001\u0000\u0000\u0000\u0962\u0963\u0005\u00c2\u0000\u0000"+
		"\u0963\u0993\u0003\u00c6c\u0000\u0964\u0966\u0005\u0096\u0000\u0000\u0965"+
		"\u0964\u0001\u0000\u0000\u0000\u0965\u0966\u0001\u0000\u0000\u0000\u0966"+
		"\u0967\u0001\u0000\u0000\u0000\u0967\u0968\u0005\u0083\u0000\u0000\u0968"+
		"\u0976\u0007\u0014\u0000\u0000\u0969\u096a\u0005\u0002\u0000\u0000\u096a"+
		"\u0977\u0005\u0003\u0000\u0000\u096b\u096c\u0005\u0002\u0000\u0000\u096c"+
		"\u0971\u0003\u00c0`\u0000\u096d\u096e\u0005\u0004\u0000\u0000\u096e\u0970"+
		"\u0003\u00c0`\u0000\u096f\u096d\u0001\u0000\u0000\u0000\u0970\u0973\u0001"+
		"\u0000\u0000\u0000\u0971\u096f\u0001\u0000\u0000\u0000\u0971\u0972\u0001"+
		"\u0000\u0000\u0000\u0972\u0974\u0001\u0000\u0000\u0000\u0973\u0971\u0001"+
		"\u0000\u0000\u0000\u0974\u0975\u0005\u0003\u0000\u0000\u0975\u0977\u0001"+
		"\u0000\u0000\u0000\u0976\u0969\u0001\u0000\u0000\u0000\u0976\u096b\u0001"+
		"\u0000\u0000\u0000\u0977\u0993\u0001\u0000\u0000\u0000\u0978\u097a\u0005"+
		"\u0096\u0000\u0000\u0979\u0978\u0001\u0000\u0000\u0000\u0979\u097a\u0001"+
		"\u0000\u0000\u0000\u097a\u097b\u0001\u0000\u0000\u0000\u097b\u097c\u0005"+
		"\u0083\u0000\u0000\u097c\u097f\u0003\u00c6c\u0000\u097d\u097e\u0005O\u0000"+
		"\u0000\u097e\u0980\u0005\u0117\u0000\u0000\u097f\u097d\u0001\u0000\u0000"+
		"\u0000\u097f\u0980\u0001\u0000\u0000\u0000\u0980\u0993\u0001\u0000\u0000"+
		"\u0000\u0981\u0983\u0005z\u0000\u0000\u0982\u0984\u0005\u0096\u0000\u0000"+
		"\u0983\u0982\u0001\u0000\u0000\u0000\u0983\u0984\u0001\u0000\u0000\u0000"+
		"\u0984\u0985\u0001\u0000\u0000\u0000\u0985\u0993\u0005\u0097\u0000\u0000"+
		"\u0986\u0988\u0005z\u0000\u0000\u0987\u0989\u0005\u0096\u0000\u0000\u0988"+
		"\u0987\u0001\u0000\u0000\u0000\u0988\u0989\u0001\u0000\u0000\u0000\u0989"+
		"\u098a\u0001\u0000\u0000\u0000\u098a\u0993\u0007\u0015\u0000\u0000\u098b"+
		"\u098d\u0005z\u0000\u0000\u098c\u098e\u0005\u0096\u0000\u0000\u098d\u098c"+
		"\u0001\u0000\u0000\u0000\u098d\u098e\u0001\u0000\u0000\u0000\u098e\u098f"+
		"\u0001\u0000\u0000\u0000\u098f\u0990\u0005I\u0000\u0000\u0990\u0991\u0005"+
		"d\u0000\u0000\u0991\u0993\u0003\u00c6c\u0000\u0992\u0941\u0001\u0000\u0000"+
		"\u0000\u0992\u0949\u0001\u0000\u0000\u0000\u0992\u0958\u0001\u0000\u0000"+
		"\u0000\u0992\u0960\u0001\u0000\u0000\u0000\u0992\u0965\u0001\u0000\u0000"+
		"\u0000\u0992\u0979\u0001\u0000\u0000\u0000\u0992\u0981\u0001\u0000\u0000"+
		"\u0000\u0992\u0986\u0001\u0000\u0000\u0000\u0992\u098b\u0001\u0000\u0000"+
		"\u0000\u0993\u00c5\u0001\u0000\u0000\u0000\u0994\u0995\u0006c\uffff\uffff"+
		"\u0000\u0995\u0999\u0003\u00c8d\u0000\u0996\u0997\u0007\u0016\u0000\u0000"+
		"\u0997\u0999\u0003\u00c6c\u0007\u0998\u0994\u0001\u0000\u0000\u0000\u0998"+
		"\u0996\u0001\u0000\u0000\u0000\u0999\u09af\u0001\u0000\u0000\u0000\u099a"+
		"\u099b\n\u0006\u0000\u0000\u099b\u099c\u0007\u0017\u0000\u0000\u099c\u09ae"+
		"\u0003\u00c6c\u0007\u099d\u099e\n\u0005\u0000\u0000\u099e\u099f\u0007"+
		"\u0018\u0000\u0000\u099f\u09ae\u0003\u00c6c\u0006\u09a0\u09a1\n\u0004"+
		"\u0000\u0000\u09a1\u09a2\u0005\u0113\u0000\u0000\u09a2\u09ae\u0003\u00c6"+
		"c\u0005\u09a3\u09a4\n\u0003\u0000\u0000\u09a4\u09a5\u0005\u0116\u0000"+
		"\u0000\u09a5\u09ae\u0003\u00c6c\u0004\u09a6\u09a7\n\u0002\u0000\u0000"+
		"\u09a7\u09a8\u0005\u0114\u0000\u0000\u09a8\u09ae\u0003\u00c6c\u0003\u09a9"+
		"\u09aa\n\u0001\u0000\u0000\u09aa\u09ab\u0003\u00ccf\u0000\u09ab\u09ac"+
		"\u0003\u00c6c\u0002\u09ac\u09ae\u0001\u0000\u0000\u0000\u09ad\u099a\u0001"+
		"\u0000\u0000\u0000\u09ad\u099d\u0001\u0000\u0000\u0000\u09ad\u09a0\u0001"+
		"\u0000\u0000\u0000\u09ad\u09a3\u0001\u0000\u0000\u0000\u09ad\u09a6\u0001"+
		"\u0000\u0000\u0000\u09ad\u09a9\u0001\u0000\u0000\u0000\u09ae\u09b1\u0001"+
		"\u0000\u0000\u0000\u09af\u09ad\u0001\u0000\u0000\u0000\u09af\u09b0\u0001"+
		"\u0000\u0000\u0000\u09b0\u00c7\u0001\u0000\u0000\u0000\u09b1\u09af\u0001"+
		"\u0000\u0000\u0000\u09b2\u09b3\u0006d\uffff\uffff\u0000\u09b3\u0a6b\u0007"+
		"\u0019\u0000\u0000\u09b4\u09b6\u0005!\u0000\u0000\u09b5\u09b7\u0003\u00f0"+
		"x\u0000\u09b6\u09b5\u0001\u0000\u0000\u0000\u09b7\u09b8\u0001\u0000\u0000"+
		"\u0000\u09b8\u09b6\u0001\u0000\u0000\u0000\u09b8\u09b9\u0001\u0000\u0000"+
		"\u0000\u09b9\u09bc\u0001\u0000\u0000\u0000\u09ba\u09bb\u0005M\u0000\u0000"+
		"\u09bb\u09bd\u0003\u00c0`\u0000\u09bc\u09ba\u0001\u0000\u0000\u0000\u09bc"+
		"\u09bd\u0001\u0000\u0000\u0000\u09bd\u09be\u0001\u0000\u0000\u0000\u09be"+
		"\u09bf\u0005N\u0000\u0000\u09bf\u0a6b\u0001\u0000\u0000\u0000\u09c0\u09c1"+
		"\u0005!\u0000\u0000\u09c1\u09c3\u0003\u00c0`\u0000\u09c2\u09c4\u0003\u00f0"+
		"x\u0000\u09c3\u09c2\u0001\u0000\u0000\u0000\u09c4\u09c5\u0001\u0000\u0000"+
		"\u0000\u09c5\u09c3\u0001\u0000\u0000\u0000\u09c5\u09c6\u0001\u0000\u0000"+
		"\u0000\u09c6\u09c9\u0001\u0000\u0000\u0000\u09c7\u09c8\u0005M\u0000\u0000"+
		"\u09c8\u09ca\u0003\u00c0`\u0000\u09c9\u09c7\u0001\u0000\u0000\u0000\u09c9"+
		"\u09ca\u0001\u0000\u0000\u0000\u09ca\u09cb\u0001\u0000\u0000\u0000\u09cb"+
		"\u09cc\u0005N\u0000\u0000\u09cc\u0a6b\u0001\u0000\u0000\u0000\u09cd\u09ce"+
		"\u0005\"\u0000\u0000\u09ce\u09cf\u0005\u0002\u0000\u0000\u09cf\u09d0\u0003"+
		"\u00c0`\u0000\u09d0\u09d1\u0005\u0016\u0000\u0000\u09d1\u09d2\u0003\u00e2"+
		"q\u0000\u09d2\u09d3\u0005\u0003\u0000\u0000\u09d3\u0a6b\u0001\u0000\u0000"+
		"\u0000\u09d4\u09d5\u0005\u00dc\u0000\u0000\u09d5\u09de\u0005\u0002\u0000"+
		"\u0000\u09d6\u09db\u0003\u00b4Z\u0000\u09d7\u09d8\u0005\u0004\u0000\u0000"+
		"\u09d8\u09da\u0003\u00b4Z\u0000\u09d9\u09d7\u0001\u0000\u0000\u0000\u09da"+
		"\u09dd\u0001\u0000\u0000\u0000\u09db\u09d9\u0001\u0000\u0000\u0000\u09db"+
		"\u09dc\u0001\u0000\u0000\u0000\u09dc\u09df\u0001\u0000\u0000\u0000\u09dd"+
		"\u09db\u0001\u0000\u0000\u0000\u09de\u09d6\u0001\u0000\u0000\u0000\u09de"+
		"\u09df\u0001\u0000\u0000\u0000\u09df\u09e0\u0001\u0000\u0000\u0000\u09e0"+
		"\u0a6b\u0005\u0003\u0000\u0000\u09e1\u09e2\u0005^\u0000\u0000\u09e2\u09e3"+
		"\u0005\u0002\u0000\u0000\u09e3\u09e6\u0003\u00c0`\u0000\u09e4\u09e5\u0005"+
		"n\u0000\u0000\u09e5\u09e7\u0005\u0098\u0000\u0000\u09e6\u09e4\u0001\u0000"+
		"\u0000\u0000\u09e6\u09e7\u0001\u0000\u0000\u0000\u09e7\u09e8\u0001\u0000"+
		"\u0000\u0000\u09e8\u09e9\u0005\u0003\u0000\u0000\u09e9\u0a6b\u0001\u0000"+
		"\u0000\u0000\u09ea\u09eb\u0005~\u0000\u0000\u09eb\u09ec\u0005\u0002\u0000"+
		"\u0000\u09ec\u09ef\u0003\u00c0`\u0000\u09ed\u09ee\u0005n\u0000\u0000\u09ee"+
		"\u09f0\u0005\u0098\u0000\u0000\u09ef\u09ed\u0001\u0000\u0000\u0000\u09ef"+
		"\u09f0\u0001\u0000\u0000\u0000\u09f0\u09f1\u0001\u0000\u0000\u0000\u09f1"+
		"\u09f2\u0005\u0003\u0000\u0000\u09f2\u0a6b\u0001\u0000\u0000\u0000\u09f3"+
		"\u09f4\u0005\u00ad\u0000\u0000\u09f4\u09f5\u0005\u0002\u0000\u0000\u09f5"+
		"\u09f6\u0003\u00c6c\u0000\u09f6\u09f7\u0005p\u0000\u0000\u09f7\u09f8\u0003"+
		"\u00c6c\u0000\u09f8\u09f9\u0005\u0003\u0000\u0000\u09f9\u0a6b\u0001\u0000"+
		"\u0000\u0000\u09fa\u0a6b\u0003\u00cae\u0000\u09fb\u0a6b\u0005\u010f\u0000"+
		"\u0000\u09fc\u09fd\u0003\u0100\u0080\u0000\u09fd\u09fe\u0005\u0005\u0000"+
		"\u0000\u09fe\u09ff\u0005\u010f\u0000\u0000\u09ff\u0a6b\u0001\u0000\u0000"+
		"\u0000\u0a00\u0a01\u0005\u0002\u0000\u0000\u0a01\u0a04\u0003\u00b4Z\u0000"+
		"\u0a02\u0a03\u0005\u0004\u0000\u0000\u0a03\u0a05\u0003\u00b4Z\u0000\u0a04"+
		"\u0a02\u0001\u0000\u0000\u0000\u0a05\u0a06\u0001\u0000\u0000\u0000\u0a06"+
		"\u0a04\u0001\u0000\u0000\u0000\u0a06\u0a07\u0001\u0000\u0000\u0000\u0a07"+
		"\u0a08\u0001\u0000\u0000\u0000\u0a08\u0a09\u0005\u0003\u0000\u0000\u0a09"+
		"\u0a6b\u0001\u0000\u0000\u0000\u0a0a\u0a0b\u0005\u0002\u0000\u0000\u0a0b"+
		"\u0a0c\u0003\"\u0011\u0000\u0a0c\u0a0d\u0005\u0003\u0000\u0000\u0a0d\u0a6b"+
		"\u0001\u0000\u0000\u0000\u0a0e\u0a0f\u0003\u00fe\u007f\u0000\u0a0f\u0a1b"+
		"\u0005\u0002\u0000\u0000\u0a10\u0a12\u0003\u0088D\u0000\u0a11\u0a10\u0001"+
		"\u0000\u0000\u0000\u0a11\u0a12\u0001\u0000\u0000\u0000\u0a12\u0a13\u0001"+
		"\u0000\u0000\u0000\u0a13\u0a18\u0003\u00c0`\u0000\u0a14\u0a15\u0005\u0004"+
		"\u0000\u0000\u0a15\u0a17\u0003\u00c0`\u0000\u0a16\u0a14\u0001\u0000\u0000"+
		"\u0000\u0a17\u0a1a\u0001\u0000\u0000\u0000\u0a18\u0a16\u0001\u0000\u0000"+
		"\u0000\u0a18\u0a19\u0001\u0000\u0000\u0000\u0a19\u0a1c\u0001\u0000\u0000"+
		"\u0000\u0a1a\u0a18\u0001\u0000\u0000\u0000\u0a1b\u0a11\u0001\u0000\u0000"+
		"\u0000\u0a1b\u0a1c\u0001\u0000\u0000\u0000\u0a1c\u0a1d\u0001\u0000\u0000"+
		"\u0000\u0a1d\u0a24\u0005\u0003\u0000\u0000\u0a1e\u0a1f\u0005\\\u0000\u0000"+
		"\u0a1f\u0a20\u0005\u0002\u0000\u0000\u0a20\u0a21\u0005\u0101\u0000\u0000"+
		"\u0a21\u0a22\u0003\u00c2a\u0000\u0a22\u0a23\u0005\u0003\u0000\u0000\u0a23"+
		"\u0a25\u0001\u0000\u0000\u0000\u0a24\u0a1e\u0001\u0000\u0000\u0000\u0a24"+
		"\u0a25\u0001\u0000\u0000\u0000\u0a25\u0a28\u0001\u0000\u0000\u0000\u0a26"+
		"\u0a27\u0005\u00a3\u0000\u0000\u0a27\u0a29\u0003\u00f6{\u0000\u0a28\u0a26"+
		"\u0001\u0000\u0000\u0000\u0a28\u0a29\u0001\u0000\u0000\u0000\u0a29\u0a6b"+
		"\u0001\u0000\u0000\u0000\u0a2a\u0a2b\u0003\u0106\u0083\u0000\u0a2b\u0a2c"+
		"\u0005\b\u0000\u0000\u0a2c\u0a2d\u0003\u00c0`\u0000\u0a2d\u0a6b\u0001"+
		"\u0000\u0000\u0000\u0a2e\u0a2f\u0005\u0002\u0000\u0000\u0a2f\u0a32\u0003"+
		"\u0106\u0083\u0000\u0a30\u0a31\u0005\u0004\u0000\u0000\u0a31\u0a33\u0003"+
		"\u0106\u0083\u0000\u0a32\u0a30\u0001\u0000\u0000\u0000\u0a33\u0a34\u0001"+
		"\u0000\u0000\u0000\u0a34\u0a32\u0001\u0000\u0000\u0000\u0a34\u0a35\u0001"+
		"\u0000\u0000\u0000\u0a35\u0a36\u0001\u0000\u0000\u0000\u0a36\u0a37\u0005"+
		"\u0003\u0000\u0000\u0a37\u0a38\u0005\b\u0000\u0000\u0a38\u0a39\u0003\u00c0"+
		"`\u0000\u0a39\u0a6b\u0001\u0000\u0000\u0000\u0a3a\u0a6b\u0003\u0106\u0083"+
		"\u0000\u0a3b\u0a3c\u0005\u0002\u0000\u0000\u0a3c\u0a3d\u0003\u00c0`\u0000"+
		"\u0a3d\u0a3e\u0005\u0003\u0000\u0000\u0a3e\u0a6b\u0001\u0000\u0000\u0000"+
		"\u0a3f\u0a40\u0005X\u0000\u0000\u0a40\u0a41\u0005\u0002\u0000\u0000\u0a41"+
		"\u0a42\u0003\u0106\u0083\u0000\u0a42\u0a43\u0005d\u0000\u0000\u0a43\u0a44"+
		"\u0003\u00c6c\u0000\u0a44\u0a45\u0005\u0003\u0000\u0000\u0a45\u0a6b\u0001"+
		"\u0000\u0000\u0000\u0a46\u0a47\u0007\u001a\u0000\u0000\u0a47\u0a48\u0005"+
		"\u0002\u0000\u0000\u0a48\u0a49\u0003\u00c6c\u0000\u0a49\u0a4a\u0007\u001b"+
		"\u0000\u0000\u0a4a\u0a4d\u0003\u00c6c\u0000\u0a4b\u0a4c\u0007\u001c\u0000"+
		"\u0000\u0a4c\u0a4e\u0003\u00c6c\u0000\u0a4d\u0a4b\u0001\u0000\u0000\u0000"+
		"\u0a4d\u0a4e\u0001\u0000\u0000\u0000\u0a4e\u0a4f\u0001\u0000\u0000\u0000"+
		"\u0a4f\u0a50\u0005\u0003\u0000\u0000\u0a50\u0a6b\u0001\u0000\u0000\u0000"+
		"\u0a51\u0a52\u0005\u00ed\u0000\u0000\u0a52\u0a54\u0005\u0002\u0000\u0000"+
		"\u0a53\u0a55\u0007\u001d\u0000\u0000\u0a54\u0a53\u0001\u0000\u0000\u0000"+
		"\u0a54\u0a55\u0001\u0000\u0000\u0000\u0a55\u0a57\u0001\u0000\u0000\u0000"+
		"\u0a56\u0a58\u0003\u00c6c\u0000\u0a57\u0a56\u0001\u0000\u0000\u0000\u0a57"+
		"\u0a58\u0001\u0000\u0000\u0000\u0a58\u0a59\u0001\u0000\u0000\u0000\u0a59"+
		"\u0a5a\u0005d\u0000\u0000\u0a5a\u0a5b\u0003\u00c6c\u0000\u0a5b\u0a5c\u0005"+
		"\u0003\u0000\u0000\u0a5c\u0a6b\u0001\u0000\u0000\u0000\u0a5d\u0a5e\u0005"+
		"\u00a5\u0000\u0000\u0a5e\u0a5f\u0005\u0002\u0000\u0000\u0a5f\u0a60\u0003"+
		"\u00c6c\u0000\u0a60\u0a61\u0005\u00ac\u0000\u0000\u0a61\u0a62\u0003\u00c6"+
		"c\u0000\u0a62\u0a63\u0005d\u0000\u0000\u0a63\u0a66\u0003\u00c6c\u0000"+
		"\u0a64\u0a65\u0005`\u0000\u0000\u0a65\u0a67\u0003\u00c6c\u0000\u0a66\u0a64"+
		"\u0001\u0000\u0000\u0000\u0a66\u0a67\u0001\u0000\u0000\u0000\u0a67\u0a68"+
		"\u0001\u0000\u0000\u0000\u0a68\u0a69\u0005\u0003\u0000\u0000\u0a69\u0a6b"+
		"\u0001\u0000\u0000\u0000\u0a6a\u09b2\u0001\u0000\u0000\u0000\u0a6a\u09b4"+
		"\u0001\u0000\u0000\u0000\u0a6a\u09c0\u0001\u0000\u0000\u0000\u0a6a\u09cd"+
		"\u0001\u0000\u0000\u0000\u0a6a\u09d4\u0001\u0000\u0000\u0000\u0a6a\u09e1"+
		"\u0001\u0000\u0000\u0000\u0a6a\u09ea\u0001\u0000\u0000\u0000\u0a6a\u09f3"+
		"\u0001\u0000\u0000\u0000\u0a6a\u09fa\u0001\u0000\u0000\u0000\u0a6a\u09fb"+
		"\u0001\u0000\u0000\u0000\u0a6a\u09fc\u0001\u0000\u0000\u0000\u0a6a\u0a00"+
		"\u0001\u0000\u0000\u0000\u0a6a\u0a0a\u0001\u0000\u0000\u0000\u0a6a\u0a0e"+
		"\u0001\u0000\u0000\u0000\u0a6a\u0a2a\u0001\u0000\u0000\u0000\u0a6a\u0a2e"+
		"\u0001\u0000\u0000\u0000\u0a6a\u0a3a\u0001\u0000\u0000\u0000\u0a6a\u0a3b"+
		"\u0001\u0000\u0000\u0000\u0a6a\u0a3f\u0001\u0000\u0000\u0000\u0a6a\u0a46"+
		"\u0001\u0000\u0000\u0000\u0a6a\u0a51\u0001\u0000\u0000\u0000\u0a6a\u0a5d"+
		"\u0001\u0000\u0000\u0000\u0a6b\u0a76\u0001\u0000\u0000\u0000\u0a6c\u0a6d"+
		"\n\b\u0000\u0000\u0a6d\u0a6e\u0005\t\u0000\u0000\u0a6e\u0a6f\u0003\u00c6"+
		"c\u0000\u0a6f\u0a70\u0005\n\u0000\u0000\u0a70\u0a75\u0001\u0000\u0000"+
		"\u0000\u0a71\u0a72\n\u0006\u0000\u0000\u0a72\u0a73\u0005\u0005\u0000\u0000"+
		"\u0a73\u0a75\u0003\u0106\u0083\u0000\u0a74\u0a6c\u0001\u0000\u0000\u0000"+
		"\u0a74\u0a71\u0001\u0000\u0000\u0000\u0a75\u0a78\u0001\u0000\u0000\u0000"+
		"\u0a76\u0a74\u0001\u0000\u0000\u0000\u0a76\u0a77\u0001\u0000\u0000\u0000"+
		"\u0a77\u00c9\u0001\u0000\u0000\u0000\u0a78\u0a76\u0001\u0000\u0000\u0000"+
		"\u0a79\u0a86\u0005\u0097\u0000\u0000\u0a7a\u0a86\u0003\u00d4j\u0000\u0a7b"+
		"\u0a7c\u0003\u0106\u0083\u0000\u0a7c\u0a7d\u0005\u0117\u0000\u0000\u0a7d"+
		"\u0a86\u0001\u0000\u0000\u0000\u0a7e\u0a86\u0003\u010c\u0086\u0000\u0a7f"+
		"\u0a86\u0003\u00d2i\u0000\u0a80\u0a82\u0005\u0117\u0000\u0000\u0a81\u0a80"+
		"\u0001\u0000\u0000\u0000\u0a82\u0a83\u0001\u0000\u0000\u0000\u0a83\u0a81"+
		"\u0001\u0000\u0000\u0000\u0a83\u0a84\u0001\u0000\u0000\u0000\u0a84\u0a86"+
		"\u0001\u0000\u0000\u0000\u0a85\u0a79\u0001\u0000\u0000\u0000\u0a85\u0a7a"+
		"\u0001\u0000\u0000\u0000\u0a85\u0a7b\u0001\u0000\u0000\u0000\u0a85\u0a7e"+
		"\u0001\u0000\u0000\u0000\u0a85\u0a7f\u0001\u0000\u0000\u0000\u0a85\u0a81"+
		"\u0001\u0000\u0000\u0000\u0a86\u00cb\u0001\u0000\u0000\u0000\u0a87\u0a88"+
		"\u0007\u001e\u0000\u0000\u0a88\u00cd\u0001\u0000\u0000\u0000\u0a89\u0a8a"+
		"\u0007\u001f\u0000\u0000\u0a8a\u00cf\u0001\u0000\u0000\u0000\u0a8b\u0a8c"+
		"\u0007 \u0000\u0000\u0a8c\u00d1\u0001\u0000\u0000\u0000\u0a8d\u0a8e\u0007"+
		"!\u0000\u0000\u0a8e\u00d3\u0001\u0000\u0000\u0000\u0a8f\u0a92\u0005x\u0000"+
		"\u0000\u0a90\u0a93\u0003\u00d6k\u0000\u0a91\u0a93\u0003\u00dam\u0000\u0a92"+
		"\u0a90\u0001\u0000\u0000\u0000\u0a92\u0a91\u0001\u0000\u0000\u0000\u0a92"+
		"\u0a93\u0001\u0000\u0000\u0000\u0a93\u00d5\u0001\u0000\u0000\u0000\u0a94"+
		"\u0a96\u0003\u00d8l\u0000\u0a95\u0a97\u0003\u00dcn\u0000\u0a96\u0a95\u0001"+
		"\u0000\u0000\u0000\u0a96\u0a97\u0001\u0000\u0000\u0000\u0a97\u00d7\u0001"+
		"\u0000\u0000\u0000\u0a98\u0a99\u0003\u00deo\u0000\u0a99\u0a9a\u0003\u0106"+
		"\u0083\u0000\u0a9a\u0a9c\u0001\u0000\u0000\u0000\u0a9b\u0a98\u0001\u0000"+
		"\u0000\u0000\u0a9c\u0a9d\u0001\u0000\u0000\u0000\u0a9d\u0a9b\u0001\u0000"+
		"\u0000\u0000\u0a9d\u0a9e\u0001\u0000\u0000\u0000\u0a9e\u00d9\u0001\u0000"+
		"\u0000\u0000\u0a9f\u0aa2\u0003\u00dcn\u0000\u0aa0\u0aa3\u0003\u00d8l\u0000"+
		"\u0aa1\u0aa3\u0003\u00dcn\u0000\u0aa2\u0aa0\u0001\u0000\u0000\u0000\u0aa2"+
		"\u0aa1\u0001\u0000\u0000\u0000\u0aa2\u0aa3\u0001\u0000\u0000\u0000\u0aa3"+
		"\u00db\u0001\u0000\u0000\u0000\u0aa4\u0aa5\u0003\u00deo\u0000\u0aa5\u0aa6"+
		"\u0003\u0106\u0083\u0000\u0aa6\u0aa7\u0005\u00e7\u0000\u0000\u0aa7\u0aa8"+
		"\u0003\u0106\u0083\u0000\u0aa8\u00dd\u0001\u0000\u0000\u0000\u0aa9\u0aab"+
		"\u0007\"\u0000\u0000\u0aaa\u0aa9\u0001\u0000\u0000\u0000\u0aaa\u0aab\u0001"+
		"\u0000\u0000\u0000\u0aab\u0aac\u0001\u0000\u0000\u0000\u0aac\u0aaf\u0007"+
		"\u0013\u0000\u0000\u0aad\u0aaf\u0005\u0117\u0000\u0000\u0aae\u0aaa\u0001"+
		"\u0000\u0000\u0000\u0aae\u0aad\u0001\u0000\u0000\u0000\u0aaf\u00df\u0001"+
		"\u0000\u0000\u0000\u0ab0\u0ab4\u0005^\u0000\u0000\u0ab1\u0ab2\u0005\r"+
		"\u0000\u0000\u0ab2\u0ab4\u0003\u0102\u0081\u0000\u0ab3\u0ab0\u0001\u0000"+
		"\u0000\u0000\u0ab3\u0ab1\u0001\u0000\u0000\u0000\u0ab4\u00e1\u0001\u0000"+
		"\u0000\u0000\u0ab5\u0ab6\u0005\u0015\u0000\u0000\u0ab6\u0ab7\u0005\u0109"+
		"\u0000\u0000\u0ab7\u0ab8\u0003\u00e2q\u0000\u0ab8\u0ab9\u0005\u010b\u0000"+
		"\u0000\u0ab9\u0ad8\u0001\u0000\u0000\u0000\u0aba\u0abb\u0005\u008e\u0000"+
		"\u0000\u0abb\u0abc\u0005\u0109\u0000\u0000\u0abc\u0abd\u0003\u00e2q\u0000"+
		"\u0abd\u0abe\u0005\u0004\u0000\u0000\u0abe\u0abf\u0003\u00e2q\u0000\u0abf"+
		"\u0ac0\u0005\u010b\u0000\u0000\u0ac0\u0ad8\u0001\u0000\u0000\u0000\u0ac1"+
		"\u0ac8\u0005\u00dc\u0000\u0000\u0ac2\u0ac4\u0005\u0109\u0000\u0000\u0ac3"+
		"\u0ac5\u0003\u00ecv\u0000\u0ac4\u0ac3\u0001\u0000\u0000\u0000\u0ac4\u0ac5"+
		"\u0001\u0000\u0000\u0000\u0ac5\u0ac6\u0001\u0000\u0000\u0000\u0ac6\u0ac9"+
		"\u0005\u010b\u0000\u0000\u0ac7\u0ac9\u0005\u0107\u0000\u0000\u0ac8\u0ac2"+
		"\u0001\u0000\u0000\u0000\u0ac8\u0ac7\u0001\u0000\u0000\u0000\u0ac9\u0ad8"+
		"\u0001\u0000\u0000\u0000\u0aca\u0ad5\u0003\u0106\u0083\u0000\u0acb\u0acc"+
		"\u0005\u0002\u0000\u0000\u0acc\u0ad1\u0005\u011b\u0000\u0000\u0acd\u0ace"+
		"\u0005\u0004\u0000\u0000\u0ace\u0ad0\u0005\u011b\u0000\u0000\u0acf\u0acd"+
		"\u0001\u0000\u0000\u0000\u0ad0\u0ad3\u0001\u0000\u0000\u0000\u0ad1\u0acf"+
		"\u0001\u0000\u0000\u0000\u0ad1\u0ad2\u0001\u0000\u0000\u0000\u0ad2\u0ad4"+
		"\u0001\u0000\u0000\u0000\u0ad3\u0ad1\u0001\u0000\u0000\u0000\u0ad4\u0ad6"+
		"\u0005\u0003\u0000\u0000\u0ad5\u0acb\u0001\u0000\u0000\u0000\u0ad5\u0ad6"+
		"\u0001\u0000\u0000\u0000\u0ad6\u0ad8\u0001\u0000\u0000\u0000\u0ad7\u0ab5"+
		"\u0001\u0000\u0000\u0000\u0ad7\u0aba\u0001\u0000\u0000\u0000\u0ad7\u0ac1"+
		"\u0001\u0000\u0000\u0000\u0ad7\u0aca\u0001\u0000\u0000\u0000\u0ad8\u00e3"+
		"\u0001\u0000\u0000\u0000\u0ad9\u0ade\u0003\u00e6s\u0000\u0ada\u0adb\u0005"+
		"\u0004\u0000\u0000\u0adb\u0add\u0003\u00e6s\u0000\u0adc\u0ada\u0001\u0000"+
		"\u0000\u0000\u0add\u0ae0\u0001\u0000\u0000\u0000\u0ade\u0adc\u0001\u0000"+
		"\u0000\u0000\u0ade\u0adf\u0001\u0000\u0000\u0000\u0adf\u00e5\u0001\u0000"+
		"\u0000\u0000\u0ae0\u0ade\u0001\u0000\u0000\u0000\u0ae1\u0ae2\u0003\u00ae"+
		"W\u0000\u0ae2\u0ae5\u0003\u00e2q\u0000\u0ae3\u0ae4\u0005\u0096\u0000\u0000"+
		"\u0ae4\u0ae6\u0005\u0097\u0000\u0000\u0ae5\u0ae3\u0001\u0000\u0000\u0000"+
		"\u0ae5\u0ae6\u0001\u0000\u0000\u0000\u0ae6\u0ae8\u0001\u0000\u0000\u0000"+
		"\u0ae7\u0ae9\u0003 \u0010\u0000\u0ae8\u0ae7\u0001\u0000\u0000\u0000\u0ae8"+
		"\u0ae9\u0001\u0000\u0000\u0000\u0ae9\u0aeb\u0001\u0000\u0000\u0000\u0aea"+
		"\u0aec\u0003\u00e0p\u0000\u0aeb\u0aea\u0001\u0000\u0000\u0000\u0aeb\u0aec"+
		"\u0001\u0000\u0000\u0000\u0aec\u00e7\u0001\u0000\u0000\u0000\u0aed\u0af2"+
		"\u0003\u00eau\u0000\u0aee\u0aef\u0005\u0004\u0000\u0000\u0aef\u0af1\u0003"+
		"\u00eau\u0000\u0af0\u0aee\u0001\u0000\u0000\u0000\u0af1\u0af4\u0001\u0000"+
		"\u0000\u0000\u0af2\u0af0\u0001\u0000\u0000\u0000\u0af2\u0af3\u0001\u0000"+
		"\u0000\u0000\u0af3\u00e9\u0001\u0000\u0000\u0000\u0af4\u0af2\u0001\u0000"+
		"\u0000\u0000\u0af5\u0af6\u0003\u0102\u0081\u0000\u0af6\u0af9\u0003\u00e2"+
		"q\u0000\u0af7\u0af8\u0005\u0096\u0000\u0000\u0af8\u0afa\u0005\u0097\u0000"+
		"\u0000\u0af9\u0af7\u0001\u0000\u0000\u0000\u0af9\u0afa\u0001\u0000\u0000"+
		"\u0000\u0afa\u0afc\u0001\u0000\u0000\u0000\u0afb\u0afd\u0003 \u0010\u0000"+
		"\u0afc\u0afb\u0001\u0000\u0000\u0000\u0afc\u0afd\u0001\u0000\u0000\u0000"+
		"\u0afd\u00eb\u0001\u0000\u0000\u0000\u0afe\u0b03\u0003\u00eew\u0000\u0aff"+
		"\u0b00\u0005\u0004\u0000\u0000\u0b00\u0b02\u0003\u00eew\u0000\u0b01\u0aff"+
		"\u0001\u0000\u0000\u0000\u0b02\u0b05\u0001\u0000\u0000\u0000\u0b03\u0b01"+
		"\u0001\u0000\u0000\u0000\u0b03\u0b04\u0001\u0000\u0000\u0000\u0b04\u00ed"+
		"\u0001\u0000\u0000\u0000\u0b05\u0b03\u0001\u0000\u0000\u0000\u0b06\u0b07"+
		"\u0003\u0106\u0083\u0000\u0b07\u0b08\u0005\u000b\u0000\u0000\u0b08\u0b0b"+
		"\u0003\u00e2q\u0000\u0b09\u0b0a\u0005\u0096\u0000\u0000\u0b0a\u0b0c\u0005"+
		"\u0097\u0000\u0000\u0b0b\u0b09\u0001\u0000\u0000\u0000\u0b0b\u0b0c\u0001"+
		"\u0000\u0000\u0000\u0b0c\u0b0e\u0001\u0000\u0000\u0000\u0b0d\u0b0f\u0003"+
		" \u0010\u0000\u0b0e\u0b0d\u0001\u0000\u0000\u0000\u0b0e\u0b0f\u0001\u0000"+
		"\u0000\u0000\u0b0f\u00ef\u0001\u0000\u0000\u0000\u0b10\u0b11\u0005\u0100"+
		"\u0000\u0000\u0b11\u0b12\u0003\u00c0`\u0000\u0b12\u0b13\u0005\u00e5\u0000"+
		"\u0000\u0b13\u0b14\u0003\u00c0`\u0000\u0b14\u00f1\u0001\u0000\u0000\u0000"+
		"\u0b15\u0b16\u0005\u0102\u0000\u0000\u0b16\u0b1b\u0003\u00f4z\u0000\u0b17"+
		"\u0b18\u0005\u0004\u0000\u0000\u0b18\u0b1a\u0003\u00f4z\u0000\u0b19\u0b17"+
		"\u0001\u0000\u0000\u0000\u0b1a\u0b1d\u0001\u0000\u0000\u0000\u0b1b\u0b19"+
		"\u0001\u0000\u0000\u0000\u0b1b\u0b1c\u0001\u0000\u0000\u0000\u0b1c\u00f3"+
		"\u0001\u0000\u0000\u0000\u0b1d\u0b1b\u0001\u0000\u0000\u0000\u0b1e\u0b1f"+
		"\u0003\u0102\u0081\u0000\u0b1f\u0b20\u0005\u0016\u0000\u0000\u0b20\u0b21"+
		"\u0003\u00f6{\u0000\u0b21\u00f5\u0001\u0000\u0000\u0000\u0b22\u0b51\u0003"+
		"\u0102\u0081\u0000\u0b23\u0b24\u0005\u0002\u0000\u0000\u0b24\u0b25\u0003"+
		"\u0102\u0081\u0000\u0b25\u0b26\u0005\u0003\u0000\u0000\u0b26\u0b51\u0001"+
		"\u0000\u0000\u0000\u0b27\u0b4a\u0005\u0002\u0000\u0000\u0b28\u0b29\u0005"+
		"&\u0000\u0000\u0b29\u0b2a\u0005\u001e\u0000\u0000\u0b2a\u0b2f\u0003\u00c0"+
		"`\u0000\u0b2b\u0b2c\u0005\u0004\u0000\u0000\u0b2c\u0b2e\u0003\u00c0`\u0000"+
		"\u0b2d\u0b2b\u0001\u0000\u0000\u0000\u0b2e\u0b31\u0001\u0000\u0000\u0000"+
		"\u0b2f\u0b2d\u0001\u0000\u0000\u0000\u0b2f\u0b30\u0001\u0000\u0000\u0000"+
		"\u0b30\u0b4b\u0001\u0000\u0000\u0000\u0b31\u0b2f\u0001\u0000\u0000\u0000"+
		"\u0b32\u0b33\u0007#\u0000\u0000\u0b33\u0b34\u0005\u001e\u0000\u0000\u0b34"+
		"\u0b39\u0003\u00c0`\u0000\u0b35\u0b36\u0005\u0004\u0000\u0000\u0b36\u0b38"+
		"\u0003\u00c0`\u0000\u0b37\u0b35\u0001\u0000\u0000\u0000\u0b38\u0b3b\u0001"+
		"\u0000\u0000\u0000\u0b39\u0b37\u0001\u0000\u0000\u0000\u0b39\u0b3a\u0001"+
		"\u0000\u0000\u0000\u0b3a\u0b3d\u0001\u0000\u0000\u0000\u0b3b\u0b39\u0001"+
		"\u0000\u0000\u0000\u0b3c\u0b32\u0001\u0000\u0000\u0000\u0b3c\u0b3d\u0001"+
		"\u0000\u0000\u0000\u0b3d\u0b48\u0001\u0000\u0000\u0000\u0b3e\u0b3f\u0007"+
		"$\u0000\u0000\u0b3f\u0b40\u0005\u001e\u0000\u0000\u0b40\u0b45\u0003X,"+
		"\u0000\u0b41\u0b42\u0005\u0004\u0000\u0000\u0b42\u0b44\u0003X,\u0000\u0b43"+
		"\u0b41\u0001\u0000\u0000\u0000\u0b44\u0b47\u0001\u0000\u0000\u0000\u0b45"+
		"\u0b43\u0001\u0000\u0000\u0000\u0b45\u0b46\u0001\u0000\u0000\u0000\u0b46"+
		"\u0b49\u0001\u0000\u0000\u0000\u0b47\u0b45\u0001\u0000\u0000\u0000\u0b48"+
		"\u0b3e\u0001\u0000\u0000\u0000\u0b48\u0b49\u0001\u0000\u0000\u0000\u0b49"+
		"\u0b4b\u0001\u0000\u0000\u0000\u0b4a\u0b28\u0001\u0000\u0000\u0000\u0b4a"+
		"\u0b3c\u0001\u0000\u0000\u0000\u0b4b\u0b4d\u0001\u0000\u0000\u0000\u0b4c"+
		"\u0b4e\u0003\u00f8|\u0000\u0b4d\u0b4c\u0001\u0000\u0000\u0000\u0b4d\u0b4e"+
		"\u0001\u0000\u0000\u0000\u0b4e\u0b4f\u0001\u0000\u0000\u0000\u0b4f\u0b51"+
		"\u0005\u0003\u0000\u0000\u0b50\u0b22\u0001\u0000\u0000\u0000\u0b50\u0b23"+
		"\u0001\u0000\u0000\u0000\u0b50\u0b27\u0001\u0000\u0000\u0000\u0b51\u00f7"+
		"\u0001\u0000\u0000\u0000\u0b52\u0b53\u0005\u00b4\u0000\u0000\u0b53\u0b63"+
		"\u0003\u00fa}\u0000\u0b54\u0b55\u0005\u00c8\u0000\u0000\u0b55\u0b63\u0003"+
		"\u00fa}\u0000\u0b56\u0b57\u0005\u00b4\u0000\u0000\u0b57\u0b58\u0005\u001a"+
		"\u0000\u0000\u0b58\u0b59\u0003\u00fa}\u0000\u0b59\u0b5a\u0005\u0011\u0000"+
		"\u0000\u0b5a\u0b5b\u0003\u00fa}\u0000\u0b5b\u0b63\u0001\u0000\u0000\u0000"+
		"\u0b5c\u0b5d\u0005\u00c8\u0000\u0000\u0b5d\u0b5e\u0005\u001a\u0000\u0000"+
		"\u0b5e\u0b5f\u0003\u00fa}\u0000\u0b5f\u0b60\u0005\u0011\u0000\u0000\u0b60"+
		"\u0b61\u0003\u00fa}\u0000\u0b61\u0b63\u0001\u0000\u0000\u0000\u0b62\u0b52"+
		"\u0001\u0000\u0000\u0000\u0b62\u0b54\u0001\u0000\u0000\u0000\u0b62\u0b56"+
		"\u0001\u0000\u0000\u0000\u0b62\u0b5c\u0001\u0000\u0000\u0000\u0b63\u00f9"+
		"\u0001\u0000\u0000\u0000\u0b64\u0b65\u0005\u00f2\u0000\u0000\u0b65\u0b6c"+
		"\u0007%\u0000\u0000\u0b66\u0b67\u00058\u0000\u0000\u0b67\u0b6c\u0005\u00c7"+
		"\u0000\u0000\u0b68\u0b69\u0003\u00c0`\u0000\u0b69\u0b6a\u0007%\u0000\u0000"+
		"\u0b6a\u0b6c\u0001\u0000\u0000\u0000\u0b6b\u0b64\u0001\u0000\u0000\u0000"+
		"\u0b6b\u0b66\u0001\u0000\u0000\u0000\u0b6b\u0b68\u0001\u0000\u0000\u0000"+
		"\u0b6c\u00fb\u0001\u0000\u0000\u0000\u0b6d\u0b72\u0003\u0100\u0080\u0000"+
		"\u0b6e\u0b6f\u0005\u0004\u0000\u0000\u0b6f\u0b71\u0003\u0100\u0080\u0000"+
		"\u0b70\u0b6e\u0001\u0000\u0000\u0000\u0b71\u0b74\u0001\u0000\u0000\u0000"+
		"\u0b72\u0b70\u0001\u0000\u0000\u0000\u0b72\u0b73\u0001\u0000\u0000\u0000"+
		"\u0b73\u00fd\u0001\u0000\u0000\u0000\u0b74\u0b72\u0001\u0000\u0000\u0000"+
		"\u0b75\u0b7a\u0003\u0100\u0080\u0000\u0b76\u0b7a\u0005\\\u0000\u0000\u0b77"+
		"\u0b7a\u0005\u0082\u0000\u0000\u0b78\u0b7a\u0005\u00c1\u0000\u0000\u0b79"+
		"\u0b75\u0001\u0000\u0000\u0000\u0b79\u0b76\u0001\u0000\u0000\u0000\u0b79"+
		"\u0b77\u0001\u0000\u0000\u0000\u0b79\u0b78\u0001\u0000\u0000\u0000\u0b7a"+
		"\u00ff\u0001\u0000\u0000\u0000\u0b7b\u0b80\u0003\u0106\u0083\u0000\u0b7c"+
		"\u0b7d\u0005\u0005\u0000\u0000\u0b7d\u0b7f\u0003\u0106\u0083\u0000\u0b7e"+
		"\u0b7c\u0001\u0000\u0000\u0000\u0b7f\u0b82\u0001\u0000\u0000\u0000\u0b80"+
		"\u0b7e\u0001\u0000\u0000\u0000\u0b80\u0b81\u0001\u0000\u0000\u0000\u0b81"+
		"\u0101\u0001\u0000\u0000\u0000\u0b82\u0b80\u0001\u0000\u0000\u0000\u0b83"+
		"\u0b84\u0003\u0106\u0083\u0000\u0b84\u0b85\u0003\u0104\u0082\u0000\u0b85"+
		"\u0103\u0001\u0000\u0000\u0000\u0b86\u0b87\u0005\u010e\u0000\u0000\u0b87"+
		"\u0b89\u0003\u0106\u0083\u0000\u0b88\u0b86\u0001\u0000\u0000\u0000\u0b89"+
		"\u0b8a\u0001\u0000\u0000\u0000\u0b8a\u0b88\u0001\u0000\u0000\u0000\u0b8a"+
		"\u0b8b\u0001\u0000\u0000\u0000\u0b8b\u0b8e\u0001\u0000\u0000\u0000\u0b8c"+
		"\u0b8e\u0001\u0000\u0000\u0000\u0b8d\u0b88\u0001\u0000\u0000\u0000\u0b8d"+
		"\u0b8c\u0001\u0000\u0000\u0000\u0b8e\u0105\u0001\u0000\u0000\u0000\u0b8f"+
		"\u0b93\u0003\u0108\u0084\u0000\u0b90\u0b91\u0004\u0083\u0010\u0000\u0b91"+
		"\u0b93\u0003\u0112\u0089\u0000\u0b92\u0b8f\u0001\u0000\u0000\u0000\u0b92"+
		"\u0b90\u0001\u0000\u0000\u0000\u0b93\u0107\u0001\u0000\u0000\u0000\u0b94"+
		"\u0b9b\u0005\u0121\u0000\u0000\u0b95\u0b9b\u0003\u010a\u0085\u0000\u0b96"+
		"\u0b97\u0004\u0084\u0011\u0000\u0b97\u0b9b\u0003\u0110\u0088\u0000\u0b98"+
		"\u0b99\u0004\u0084\u0012\u0000\u0b99\u0b9b\u0003\u0114\u008a\u0000\u0b9a"+
		"\u0b94\u0001\u0000\u0000\u0000\u0b9a\u0b95\u0001\u0000\u0000\u0000\u0b9a"+
		"\u0b96\u0001\u0000\u0000\u0000\u0b9a\u0b98\u0001\u0000\u0000\u0000\u0b9b"+
		"\u0109\u0001\u0000\u0000\u0000\u0b9c\u0b9d\u0005\u0122\u0000\u0000\u0b9d"+
		"\u010b\u0001\u0000\u0000\u0000\u0b9e\u0ba0\u0004\u0086\u0013\u0000\u0b9f"+
		"\u0ba1\u0005\u010e\u0000\u0000\u0ba0\u0b9f\u0001\u0000\u0000\u0000\u0ba0"+
		"\u0ba1\u0001\u0000\u0000\u0000\u0ba1\u0ba2\u0001\u0000\u0000\u0000\u0ba2"+
		"\u0bca\u0005\u011c\u0000\u0000\u0ba3\u0ba5\u0004\u0086\u0014\u0000\u0ba4"+
		"\u0ba6\u0005\u010e\u0000\u0000\u0ba5\u0ba4\u0001\u0000\u0000\u0000\u0ba5"+
		"\u0ba6\u0001\u0000\u0000\u0000\u0ba6\u0ba7\u0001\u0000\u0000\u0000\u0ba7"+
		"\u0bca\u0005\u011d\u0000\u0000\u0ba8\u0baa\u0004\u0086\u0015\u0000\u0ba9"+
		"\u0bab\u0005\u010e\u0000\u0000\u0baa\u0ba9\u0001\u0000\u0000\u0000\u0baa"+
		"\u0bab\u0001\u0000\u0000\u0000\u0bab\u0bac\u0001\u0000\u0000\u0000\u0bac"+
		"\u0bca\u0007&\u0000\u0000\u0bad\u0baf\u0005\u010e\u0000\u0000\u0bae\u0bad"+
		"\u0001\u0000\u0000\u0000\u0bae\u0baf\u0001\u0000\u0000\u0000\u0baf\u0bb0"+
		"\u0001\u0000\u0000\u0000\u0bb0\u0bca\u0005\u011b\u0000\u0000\u0bb1\u0bb3"+
		"\u0005\u010e\u0000\u0000\u0bb2\u0bb1\u0001\u0000\u0000\u0000\u0bb2\u0bb3"+
		"\u0001\u0000\u0000\u0000\u0bb3\u0bb4\u0001\u0000\u0000\u0000\u0bb4\u0bca"+
		"\u0005\u0118\u0000\u0000\u0bb5\u0bb7\u0005\u010e\u0000\u0000\u0bb6\u0bb5"+
		"\u0001\u0000\u0000\u0000\u0bb6\u0bb7\u0001\u0000\u0000\u0000\u0bb7\u0bb8"+
		"\u0001\u0000\u0000\u0000\u0bb8\u0bca\u0005\u0119\u0000\u0000\u0bb9\u0bbb"+
		"\u0005\u010e\u0000\u0000\u0bba\u0bb9\u0001\u0000\u0000\u0000\u0bba\u0bbb"+
		"\u0001\u0000\u0000\u0000\u0bbb\u0bbc\u0001\u0000\u0000\u0000\u0bbc\u0bca"+
		"\u0005\u011a\u0000\u0000\u0bbd\u0bbf\u0005\u010e\u0000\u0000\u0bbe\u0bbd"+
		"\u0001\u0000\u0000\u0000\u0bbe\u0bbf\u0001\u0000\u0000\u0000\u0bbf\u0bc0"+
		"\u0001\u0000\u0000\u0000\u0bc0\u0bca\u0005\u011f\u0000\u0000\u0bc1\u0bc3"+
		"\u0005\u010e\u0000\u0000\u0bc2\u0bc1\u0001\u0000\u0000\u0000\u0bc2\u0bc3"+
		"\u0001\u0000\u0000\u0000\u0bc3\u0bc4\u0001\u0000\u0000\u0000\u0bc4\u0bca"+
		"\u0005\u011e\u0000\u0000\u0bc5\u0bc7\u0005\u010e\u0000\u0000\u0bc6\u0bc5"+
		"\u0001\u0000\u0000\u0000\u0bc6\u0bc7\u0001\u0000\u0000\u0000\u0bc7\u0bc8"+
		"\u0001\u0000\u0000\u0000\u0bc8\u0bca\u0005\u0120\u0000\u0000\u0bc9\u0b9e"+
		"\u0001\u0000\u0000\u0000\u0bc9\u0ba3\u0001\u0000\u0000\u0000\u0bc9\u0ba8"+
		"\u0001\u0000\u0000\u0000\u0bc9\u0bae\u0001\u0000\u0000\u0000\u0bc9\u0bb2"+
		"\u0001\u0000\u0000\u0000\u0bc9\u0bb6\u0001\u0000\u0000\u0000\u0bc9\u0bba"+
		"\u0001\u0000\u0000\u0000\u0bc9\u0bbe\u0001\u0000\u0000\u0000\u0bc9\u0bc2"+
		"\u0001\u0000\u0000\u0000\u0bc9\u0bc6\u0001\u0000\u0000\u0000\u0bca\u010d"+
		"\u0001\u0000\u0000\u0000\u0bcb\u0bcc\u0005\u00f0\u0000\u0000\u0bcc\u0bd3"+
		"\u0003\u00e2q\u0000\u0bcd\u0bd3\u0003 \u0010\u0000\u0bce\u0bd3\u0003\u00e0"+
		"p\u0000\u0bcf\u0bd0\u0007\'\u0000\u0000\u0bd0\u0bd1\u0005\u0096\u0000"+
		"\u0000\u0bd1\u0bd3\u0005\u0097\u0000\u0000\u0bd2\u0bcb\u0001\u0000\u0000"+
		"\u0000\u0bd2\u0bcd\u0001\u0000\u0000\u0000\u0bd2\u0bce\u0001\u0000\u0000"+
		"\u0000\u0bd2\u0bcf\u0001\u0000\u0000\u0000\u0bd3\u010f\u0001\u0000\u0000"+
		"\u0000\u0bd4\u0bd5\u0007(\u0000\u0000\u0bd5\u0111\u0001\u0000\u0000\u0000"+
		"\u0bd6\u0bd7\u0007)\u0000\u0000\u0bd7\u0113\u0001\u0000\u0000\u0000\u0bd8"+
		"\u0bd9\u0007*\u0000\u0000\u0bd9\u0115\u0001\u0000\u0000\u0000\u018a\u011a"+
		"\u0133\u0138\u0140\u0148\u014a\u015e\u0162\u0168\u016b\u016e\u0175\u0178"+
		"\u017c\u017f\u0186\u0191\u0193\u019b\u019e\u01a2\u01a5\u01ab\u01b6\u01f6"+
		"\u01ff\u0203\u0209\u020d\u0212\u0218\u0224\u022c\u0232\u023f\u0244\u0254"+
		"\u025b\u025f\u0265\u0274\u0278\u027e\u0284\u0287\u028a\u0290\u0294\u029c"+
		"\u029e\u02a7\u02aa\u02b3\u02b8\u02be\u02c5\u02c8\u02ce\u02d9\u02dc\u02e0"+
		"\u02e5\u02ea\u02f1\u02f4\u02f7\u02fe\u0303\u030c\u0314\u031a\u031d\u0320"+
		"\u0326\u032a\u032e\u0332\u0334\u033c\u0344\u034a\u0350\u0353\u0357\u035a"+
		"\u035e\u037a\u037d\u0381\u0387\u038a\u038d\u0393\u039b\u03a0\u03a6\u03ac"+
		"\u03b8\u03bb\u03c2\u03d3\u03e1\u03e4\u03ea\u03f3\u03fc\u0403\u0406\u0412"+
		"\u0416\u041d\u0491\u0499\u04a1\u04aa\u04b4\u04b8\u04bb\u04c1\u04c7\u04d3"+
		"\u04df\u04e4\u04ed\u04f5\u04fc\u04fe\u0501\u0506\u050a\u050f\u0512\u0517"+
		"\u051c\u051f\u0524\u0528\u052d\u052f\u0533\u053c\u0544\u054d\u0554\u055d"+
		"\u0562\u0565\u057b\u057d\u0586\u058d\u0590\u0597\u059b\u05a1\u05a9\u05b4"+
		"\u05bf\u05c6\u05cc\u05d9\u05e0\u05e7\u05f3\u05fb\u0601\u0604\u060d\u0610"+
		"\u0619\u061c\u0625\u0628\u0631\u0634\u0637\u063c\u063e\u064a\u0651\u0658"+
		"\u065b\u065d\u0669\u066d\u0671\u0677\u067b\u0683\u0687\u068a\u068d\u0690"+
		"\u0694\u0698\u069b\u069f\u06a4\u06a8\u06ab\u06ae\u06b1\u06b3\u06bf\u06c2"+
		"\u06c6\u06d0\u06d4\u06d6\u06d9\u06dd\u06e3\u06e7\u06f2\u06fc\u0708\u0717"+
		"\u071c\u0723\u0733\u0738\u0745\u074a\u0752\u0758\u075c\u0765\u0774\u0779"+
		"\u0785\u078a\u0792\u0795\u0799\u07a7\u07b4\u07b9\u07bd\u07c0\u07c5\u07ce"+
		"\u07d1\u07d6\u07dd\u07e0\u07e8\u07ef\u07f6\u07f9\u07fe\u0801\u0806\u080a"+
		"\u080d\u0810\u0816\u081b\u0820\u0832\u0834\u0837\u0842\u084b\u0852\u085a"+
		"\u0861\u0865\u086d\u0875\u087b\u0883\u088f\u0892\u0898\u089c\u089e\u08a7"+
		"\u08b3\u08b5\u08bc\u08c3\u08c9\u08cf\u08d1\u08d8\u08e0\u08e6\u08ed\u08f3"+
		"\u08f7\u08f9\u0900\u0909\u0910\u091a\u091f\u0923\u0931\u0933\u093b\u093d"+
		"\u0941\u0949\u0952\u0958\u0960\u0965\u0971\u0976\u0979\u097f\u0983\u0988"+
		"\u098d\u0992\u0998\u09ad\u09af\u09b8\u09bc\u09c5\u09c9\u09db\u09de\u09e6"+
		"\u09ef\u0a06\u0a11\u0a18\u0a1b\u0a24\u0a28\u0a34\u0a4d\u0a54\u0a57\u0a66"+
		"\u0a6a\u0a74\u0a76\u0a83\u0a85\u0a92\u0a96\u0a9d\u0aa2\u0aaa\u0aae\u0ab3"+
		"\u0ac4\u0ac8\u0ad1\u0ad5\u0ad7\u0ade\u0ae5\u0ae8\u0aeb\u0af2\u0af9\u0afc"+
		"\u0b03\u0b0b\u0b0e\u0b1b\u0b2f\u0b39\u0b3c\u0b45\u0b48\u0b4a\u0b4d\u0b50"+
		"\u0b62\u0b6b\u0b72\u0b79\u0b80\u0b8a\u0b8d\u0b92\u0b9a\u0ba0\u0ba5\u0baa"+
		"\u0bae\u0bb2\u0bb6\u0bba\u0bbe\u0bc2\u0bc6\u0bc9\u0bd2";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}