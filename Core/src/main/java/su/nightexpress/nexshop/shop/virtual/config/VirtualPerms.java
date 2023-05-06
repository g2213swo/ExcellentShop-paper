package su.nightexpress.nexshop.shop.virtual.config;

import su.nexmedia.engine.api.placeholder.PlaceholderConstants;
import su.nexmedia.engine.api.server.JPermission;
import su.nightexpress.nexshop.Perms;

public class VirtualPerms {

    private static final String PREFIX = Perms.PREFIX + "virtual.";
    public static final String PREFIX_SHOP = PREFIX + "shop.";
    private static final String PREFIX_COMMAND = PREFIX + "command.";
    private static final String PREFIX_BYPASS = PREFIX + "bypass.";

    public static final JPermission MODULE = new JPermission(PREFIX + PlaceholderConstants.WILDCARD, "Full access to the Virtual Shop module.");
    public static final JPermission SHOP = new JPermission(PREFIX_SHOP + PlaceholderConstants.WILDCARD, "Access to all the Virtual Shops.");
    public static final JPermission COMMAND = new JPermission(PREFIX_COMMAND + PlaceholderConstants.WILDCARD, "Access to all the Virtual Shop commands.");
    public static final JPermission BYPASS = new JPermission(PREFIX_BYPASS + PlaceholderConstants.WILDCARD, "Bypasses all Virtual Shop restrictions.");

    public static final JPermission COMMAND_EDITOR = new JPermission(PREFIX_COMMAND + "editor", "Access to '/virtualshop editor' command.");
    public static final JPermission COMMAND_OPEN = new JPermission(PREFIX_COMMAND + "open", "Access to '/virtualshop open' command.");
    public static final JPermission COMMAND_MENU = new JPermission(PREFIX_COMMAND + "menu", "Access to '/virtualshop menu' command.");
    public static final JPermission COMMAND_SELL_MENU = new JPermission(PREFIX_COMMAND + "sellmenu", "Access to the Sell Menu commands.");
    public static final JPermission COMMAND_SELL_MENU_OTHERS = new JPermission(PREFIX_COMMAND + "sellmenu.others", "Access to the Sell Menu commands.");
    public static final JPermission COMMAND_SHOP = new JPermission(PREFIX_COMMAND + "shop", "Access to the Shop Shortcut commands.");

    public static final JPermission BYPASS_WORLDS = new JPermission(PREFIX_BYPASS + "worlds", "Allows to use shops in any world.");
    public static final JPermission BYPASS_GAMEMODE = new JPermission(PREFIX_BYPASS + "gamemode", "Allows to use shops in any GameMode.");

    static {
        Perms.PLUGIN.addChildren(MODULE);

        MODULE.addChildren(SHOP, COMMAND, BYPASS);

        COMMAND.addChildren(COMMAND_EDITOR, COMMAND_OPEN, COMMAND_MENU, COMMAND_SELL_MENU, COMMAND_SHOP);

        BYPASS.addChildren(BYPASS_GAMEMODE, BYPASS_WORLDS);
    }
}