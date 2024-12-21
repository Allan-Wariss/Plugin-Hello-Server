package me.allan.plugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloServer extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Registra o evento quando o plugin é ativado
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Altera a mensagem de entrada do jogador
        String playerName = event.getPlayer().getName();
        event.setJoinMessage(null);

        if (playerName.equalsIgnoreCase("chifrudo")) {
            Bukkit.broadcastMessage(ChatColor.RED + "Cuidado" + ChatColor.YELLOW + ", o " + ChatColor.DARK_PURPLE + "chifrudo" + ChatColor.YELLOW + " está aqui!");
        } else if (playerName.equalsIgnoreCase("layzabb")) {
            Bukkit.broadcastMessage(ChatColor.RED + "Cuidado" + ChatColor.YELLOW + ", a " + ChatColor.LIGHT_PURPLE + "GOLPISTA "+ ChatColor.YELLOW + playerName+ ChatColor.GREEN + " está na área!");
        }
         else if (playerName.equalsIgnoreCase("mkszin")) {
            Bukkit.broadcastMessage(ChatColor.RED + "ATENÇÃO!" + ChatColor.YELLOW + " O " + ChatColor.DARK_RED + "CAGÃO "+ ChatColor.YELLOW + playerName+ ChatColor.GREEN + " chegou!");
        }
        else if (playerName.equalsIgnoreCase("Lex_Gamer")) {
            Bukkit.broadcastMessage(ChatColor.RED + "ATENÇÃO!" + ChatColor.GREEN + " DEUS"+ ChatColor.YELLOW + " entrou no server!");
        }
        else if (playerName.equalsIgnoreCase("LFirmiano07")) {
            Bukkit.broadcastMessage(ChatColor.RED + "Cuidado" + ChatColor.YELLOW + ", o " + ChatColor.DARK_PURPLE + "chifrudo" + ChatColor.YELLOW + " está aqui!");}
        else if (playerName.equalsIgnoreCase("kaleumelo")) {
            Bukkit.broadcastMessage(ChatColor.RED + "Cuidado" + ChatColor.YELLOW + ", o " + ChatColor.DARK_PURPLE + "COMEDOR DE MOTO" + ChatColor.YELLOW + " está aqui!");}
        else if (playerName.equalsIgnoreCase("LEODLCG")) {
            Bukkit.broadcastMessage(ChatColor.RED + "Cuidado" + ChatColor.YELLOW + ", o " + ChatColor.DARK_PURPLE + "Robert Patson Brasileiro" + ChatColor.YELLOW + " chegou!");}
        else if (playerName.equalsIgnoreCase("William_Tiago")) {
            Bukkit.broadcastMessage(ChatColor.GREEN + "Bem-Vindo" + ChatColor.YELLOW + ", de volta " + ChatColor.RED + "OLAVO DE CARALHO" + ChatColor.YELLOW + "!");}
        else {
            // Envia uma mensagem personalizada a todos os jogadores
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.sendMessage(ChatColor.GREEN + "O viadão " + ChatColor.YELLOW + playerName + ChatColor.GREEN + " entrou");
            }
        }
    }
}