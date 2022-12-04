package su.nightexpress.nexshop.shop.auction.command;

import org.bukkit.permissions.Permission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.nightexpress.nexshop.Perms;
import su.nightexpress.nexshop.shop.auction.AuctionManager;
import su.nightexpress.nexshop.shop.auction.config.AuctionLang;
import su.nightexpress.nexshop.shop.auction.menu.AuctionSellingMenu;

public class AuctionSellingCommand extends AbstractOpenCommand {

    public AuctionSellingCommand(@NotNull AuctionManager module) {
        super(module, new String[]{"selling", "listings"}, Perms.AUCTION_COMMAND_SELLING);
    }

    @Override
    @NotNull
    public String getUsage() {
        return plugin.getMessage(AuctionLang.COMMAND_SELLING_USAGE).getLocalized();
    }

    @Override
    @NotNull
    public String getDescription() {
        return plugin.getMessage(AuctionLang.COMMAND_SELLING_DESC).getLocalized();
    }

    @Override
    @NotNull
    protected AuctionSellingMenu getMenu() {
        return this.module.getSellingMenu();
    }

    @Override
    @Nullable
    protected Permission getPermissionsOthers() {
        return Perms.AUCTION_COMMAND_SELLING_OTHERS;
    }
}