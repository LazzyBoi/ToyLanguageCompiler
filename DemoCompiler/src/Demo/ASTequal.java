/* Generated By:JJTree: Do not edit this line. ASTequal.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package Demo;

public
class ASTequal extends SimpleNode {
  public ASTequal(int id) {
    super(id);
  }

  public ASTequal(CMinusParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CMinusParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ea8b7f45f17996e3b0e7896267db1fdc (do not edit this line) */
