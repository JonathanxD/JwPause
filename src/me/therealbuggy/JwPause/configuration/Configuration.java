package me.therealbuggy.JwPause.configuration;

import org.bukkit.configuration.file.FileConfiguration;

/**
 * Created by jonathan on 28/12/15.
 */
public class Configuration {

    enum Section {
        MENSAGEM( "mensagem"),
        PAUSE(MENSAGEM, "pausar"),
        DESPAUSE(MENSAGEM, "despausar");

        final Section parent;
        final String secName;

        Section(Section parent, String secName) {
            this.parent = parent;
            this.secName = secName;
        }

        Section(String secName) {
            this(null, secName);
        }

        public String getSection() {
            return (this.parent != null ? this.parent.getSection() + "." : "") + secName;
        }

        public Object get(FileConfiguration configuration) {
            return configuration.get(getSection());
        }

        public <T> T castGet(FileConfiguration configuration) {
            return (T) get(configuration);
        }
    }

    private final String mensagemPausar;
    private final String mensagemDespausar;

    public Configuration(FileConfiguration fileConfiguration) {
        mensagemPausar = Section.PAUSE.castGet(fileConfiguration);
        mensagemDespausar = Section.DESPAUSE.castGet(fileConfiguration);
    }

    private String replaceColors(String text){
        return text.replaceAll("(&([a-fk-or0-9]))", "§$2");
    }

    public String getMensagemPausar() {
        return replaceColors(mensagemPausar);
    }

    public String getMensagemDespausar() {
        return replaceColors(mensagemDespausar);
    }
}
