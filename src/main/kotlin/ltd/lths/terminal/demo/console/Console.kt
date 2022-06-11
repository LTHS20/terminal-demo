package ltd.lths.terminal.demo.console

import net.minecrell.terminalconsole.SimpleTerminalConsole
import org.apache.logging.log4j.LogManager

/**
 * ikuai-entourage
 * ltd.lths.wireless.ikuai.entourage.console.EntourageConsole
 *
 * @author Score2
 * @since 2022/06/08 13:37
 */
object Console : SimpleTerminalConsole() {
    val logger = LogManager.getLogger(Console::class.java)

    override fun isRunning(): Boolean {
        return true
    }

    override fun runCommand(command: String?) {
        println("已执行指令 $command")
    }

    override fun shutdown() {

    }
}