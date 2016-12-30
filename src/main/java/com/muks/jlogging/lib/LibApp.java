package com.muks.jlogging.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class LibApp {

    private static Logger log = LoggerFactory.getLogger(LibApp.class);
    private static String TAG = "# [LibApp]: ";

    public static void main(String[] args) {
        Printer();
    }
/*    private static Log log = LogFactory.getLog(LibApp.class);

    public static void main( String[] args ) {
        Printer();
    }
*/
    public static void Printer() {
        /**
         * Semantics for these methods are such that it is expected that the severity, from highest to lowest,
         * of messages is ordered as below.
         */
        //log.fatal("# Fatal: Hello World");    /** => Fatal is JCL implementation only */
        log.error(TAG + "Error World ========");
        log.warn(TAG + "Warn World");
        log.info(TAG + "Info World");
        log.debug(TAG + "Debug World");
        log.trace(TAG + "Trace World");
        log.error("======");


        //log.isFatalEnabled();     /** => Fatal is JCL implementation only
        log.isErrorEnabled();
        log.isWarnEnabled();
        log.isInfoEnabled();

        if (!log.isDebugEnabled()) {
            log.info(" Debug NOT enabled...");
        }
        if (!log.isTraceEnabled()) {
            log.info(" Trace NOT enabled...");
        }

    }
}
