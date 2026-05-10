// Generated from AgentLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AgentLangParser}.
 */
public interface AgentLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AgentLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AgentLangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AgentLangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentLangParser#agente}.
	 * @param ctx the parse tree
	 */
	void enterAgente(AgentLangParser.AgenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentLangParser#agente}.
	 * @param ctx the parse tree
	 */
	void exitAgente(AgentLangParser.AgenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentLangParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(AgentLangParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentLangParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(AgentLangParser.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentLangParser#estadoDecl}.
	 * @param ctx the parse tree
	 */
	void enterEstadoDecl(AgentLangParser.EstadoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentLangParser#estadoDecl}.
	 * @param ctx the parse tree
	 */
	void exitEstadoDecl(AgentLangParser.EstadoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentLangParser#percepcion}.
	 * @param ctx the parse tree
	 */
	void enterPercepcion(AgentLangParser.PercepcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentLangParser#percepcion}.
	 * @param ctx the parse tree
	 */
	void exitPercepcion(AgentLangParser.PercepcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentLangParser#regla}.
	 * @param ctx the parse tree
	 */
	void enterRegla(AgentLangParser.ReglaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentLangParser#regla}.
	 * @param ctx the parse tree
	 */
	void exitRegla(AgentLangParser.ReglaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentLangParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(AgentLangParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentLangParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(AgentLangParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AgentLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AgentLangParser.ExprContext ctx);
}