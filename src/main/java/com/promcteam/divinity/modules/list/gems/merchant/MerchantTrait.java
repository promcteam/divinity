package com.promcteam.divinity.modules.list.gems.merchant;

import com.promcteam.divinity.api.DivinityAPI;
import com.promcteam.divinity.modules.api.socketing.merchant.MerchantSocket;
import com.promcteam.divinity.modules.list.gems.GemManager;
import net.citizensnpcs.api.event.NPCRightClickEvent;
import net.citizensnpcs.api.trait.Trait;
import net.citizensnpcs.api.trait.TraitName;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

@TraitName("gems-merchant")
public class MerchantTrait extends Trait {

    public MerchantTrait() {
        super("gems-merchant");
    }

    @EventHandler
    public void click(NPCRightClickEvent e) {
        if (e.getNPC() == this.getNPC()) {
            GemManager gemManager = DivinityAPI.getModuleManager().getGemManager();
            if (gemManager == null) return;

            MerchantSocket merchant = gemManager.getMerchant();
            if (merchant != null) {
                Player player = e.getClicker();
                merchant.openMerchantGUI(player, false);
            }
        }
    }
}
