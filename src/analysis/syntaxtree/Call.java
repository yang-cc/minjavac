package analysis.syntaxtree;import analysis.visitors.TypeVisitor;import analysis.visitors.Visitor;public class Call extends Exp {  public Exp objectExpr;  public Identifier methodId;  public ExpList paramExprList;  public Call(Exp ae, Identifier ai, ExpList ael) {    objectExpr = ae;    methodId = ai;    paramExprList = ael;  }  public void accept(Visitor v) {    v.visit(this);  }  public Type accept(TypeVisitor v) {    return v.visit(this);  }}