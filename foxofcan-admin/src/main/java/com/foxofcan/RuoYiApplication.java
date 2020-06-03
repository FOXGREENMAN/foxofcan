package com.foxofcan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author foxofcan
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication{
    public static void main(String[] args){
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("      ___           ___           ___           ___           ___           ___              \n" +
                "     /\\  \\         /\\  \\         |\\__\\         /\\__\\         /\\  \\         /\\__\\             \n" +
                "    /::\\  \\       /::\\  \\        |:|  |       /::|  |       /::\\  \\       /::|  |            \n" +
                "   /:/\\:\\  \\     /:/\\:\\  \\       |:|  |      /:|:|  |      /:/\\:\\  \\     /:|:|  |            \n" +
                "  /::\\~\\:\\  \\   /:/  \\:\\  \\      |:|__|__   /:/|:|__|__   /::\\~\\:\\  \\   /:/|:|  |__          \n" +
                " /:/\\:\\ \\:\\__\\ /:/__/ \\:\\__\\ ____/::::\\__\\ /:/ |::::\\__\\ /:/\\:\\ \\:\\__\\ /:/ |:| /\\__\\         \n" +
                " \\/__\\:\\ \\/__/ \\:\\  \\ /:/  / \\::::/~~/~    \\/__/~~/:/  / \\/__\\:\\/:/  / \\/__|:|/:/  /         \n" +
                "      \\:\\__\\    \\:\\  /:/  /   ~~|:|~~|           /:/  /       \\::/  /      |:/:/  /          \n" +
                "       \\/__/     \\:\\/:/  /      |:|  |          /:/  /        /:/  /       |::/  /           \n" +
                "                  \\::/  /       |:|  |         /:/  /        /:/  /        /:/  /            \n" +
                "                   \\/__/         \\|__|         \\/__/         \\/__/         \\/__/             \n" +
                "      ___           ___           ___           ___           ___                            \n" +
                "     /\\  \\         /\\  \\         /\\  \\         /\\  \\         /\\  \\                           \n" +
                "    /::\\  \\        \\:\\  \\       /::\\  \\       /::\\  \\        \\:\\  \\                          \n" +
                "   /:/\\ \\  \\        \\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\        \\:\\  \\                         \n" +
                "  _\\:\\~\\ \\  \\       /::\\  \\   /::\\~\\:\\  \\   /::\\~\\:\\  \\       /::\\  \\                        \n" +
                " /\\ \\:\\ \\ \\__\\     /:/\\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\     /:/\\:\\__\\                       \n" +
                " \\:\\ \\:\\ \\/__/    /:/  \\/__/ \\/__\\:\\/:/  / \\/_|::\\/:/  /    /:/  \\/__/                       \n" +
                "  \\:\\ \\:\\__\\     /:/  /           \\::/  /     |:|::/  /    /:/  /                            \n" +
                "   \\:\\/:/  /     \\/__/            /:/  /      |:|\\/__/     \\/__/                             \n" +
                "    \\::/  /                      /:/  /       |:|  |                                         \n" +
                "     \\/__/                       \\/__/         \\|__| ");
    }
}