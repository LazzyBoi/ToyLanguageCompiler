/* Generated By:JJTree: Do not edit this line. ASTassgstmt.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package Demo;

public
class ASTassgstmt extends SimpleNode {
  public ASTassgstmt(int id) {
    super(id);
  }

  public ASTassgstmt(CMinusParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CMinusParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a34ae63fa6d650597a31e0fea816c788 (do not edit this line) */
