/* Generated By:JJTree: Do not edit this line. ASTsimpleexpr.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package Demo;

public
class ASTsimpleexpr extends SimpleNode {
  public ASTsimpleexpr(int id) {
    super(id);
  }

  public ASTsimpleexpr(CMinusParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CMinusParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d7c93b3f23de172d74e0d8f0c56c45a2 (do not edit this line) */
