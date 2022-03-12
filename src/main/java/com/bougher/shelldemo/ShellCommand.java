package com.bougher.shelldemo;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.logging.Logger;

@ShellComponent
public class ShellCommand {

    Logger log = Logger.getLogger(this.getClass().getName());

    @ShellMethod("echo text")
    public void echo(@ShellOption("-u") Boolean uppercase, String text) {
        log.info("Echoing " + (uppercase ? "Uppercased " : "") + text);

        System.out.println(uppercase ? text.toUpperCase() : text);
    }

    @ShellMethod("echo reverse")
    public void echor(String text) {
        StringBuilder builder = new StringBuilder(text);
        String reverseText = builder.reverse().toString();

        log.info("Echoing " + text + " as " + reverseText);

        System.out.println(reverseText);
    }
}
