package {{namespace}}.{{name}};

import io.papermc.lib.PaperLib;
import org.bukkit.plugin.java.JavaPlugin;

public class {{name}} extends JavaPlugin {

  @Override
  public void onEnable() {
    PaperLib.suggestPaper(this);

    saveDefaultConfig();
  }
}
