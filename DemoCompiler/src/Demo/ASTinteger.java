/* Generated By:JJTree: Do not edit this line. ASTinteger.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package Demo;

public
class ASTinteger extends SimpleNode {
  public ASTinteger(int id) {
    super(id);
  }

  public ASTinteger(CMinusParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CMinusParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9d6e1318fc7a63f3ceae9c985c3fba2e (do not edit this line) */
