@file:Suppress("NOTHING_TO_INLINE")

package com.slin.tools.version.log

import java.util.function.Supplier
import java.util.logging.Level

/**
 * author: slin
 * date: 2020/9/4
 * description: 日志类
 *
 */

// val logger: Logger = Logger.getLogger("")

inline fun log(
    level: Level = Level.INFO,
    supplier: Supplier<String>,
    throwable: Throwable? = null
) {
//    logger.log(level, throwable, supplier)
    println(supplier.get())
    throwable?.printStackTrace()
}

inline fun log(supplier: Supplier<String>) = logd(supplier)

inline fun logd(supplier: Supplier<String>) = log(Level.INFO, supplier)

inline fun logi(supplier: Supplier<String>) = log(Level.INFO, supplier)

inline fun logw(supplier: Supplier<String>) = log(Level.WARNING, supplier)

inline fun loge(t: Throwable? = null, supplier: Supplier<String>) =
    if (t == null) {
        log(Level.SEVERE, supplier)
    } else {
        log(Level.SEVERE, supplier, t)
    }
