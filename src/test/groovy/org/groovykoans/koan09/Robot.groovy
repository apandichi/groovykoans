/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

class Robot {
    // ------------ START EDITING HERE ----------------------
    Integer x = 0
    Integer y = 0

    def right() {
        x++
    }

    def up() {
        y++
    }

    def down() {
        y--
    }

    def left() {
        x--
    }

    def invokeMethod(String name, Object args) {
        if (name.startsWith("go")) {
            def regex = '(Left|Right|Down|Up)'
            name.findAll(regex) { String match, method ->
                this."${method.toLowerCase()}"()
            }
        }
    }
    // ------------ STOP EDITING HERE  ----------------------
}
