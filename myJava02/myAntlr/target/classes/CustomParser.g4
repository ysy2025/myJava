grammar CustomParser;
@header{
package customparser;
}

testParser: 'test' ID;          //match keyword test followed by an identifier
ID: [A-Za-z0-9]+;               //match identifiers
WS: [ \t\r\n]+ -> skip;         //skip spaces,tabs,newlines