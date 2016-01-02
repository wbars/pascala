package lexical.tokens.const

import lexical.tokens.Token

/**
	* Created by wannabe on 29.12.15.
	*/
class StringToken(override val line: Int, override val position: Int, override val text: String) extends Token[String](line, position, text){
	override val value = text
}
