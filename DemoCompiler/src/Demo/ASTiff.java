/* Generated By:JJTree: Do not edit this line. ASTiff.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package Demo;

public
class ASTiff extends SimpleNode {
  public ASTiff(int id) {
    super(id);
  }

  public ASTiff(CMinusParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CMinusParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=40248c7e6ad61256a8ca148749355811 (do not edit this line) */
