package ltd.lths.terminal.demo

import ltd.lths.terminal.demo.console.Console
import org.apache.logging.log4j.LogManager

/**
 * terminal-demo
 * ltd.lths.terminal.demo.Main
 *
 * @author Score2
 * @since 2022/06/08 16:35
 */
object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        Thread {
            Console.start()
        }
        val logger = LogManager.getLogger(Main::class.java)

        logger.info("§b打印彩色")

    }

}