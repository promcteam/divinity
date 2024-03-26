package com.promcteam.divinity.modules.list.party.event;

import com.promcteam.codex.manager.api.event.IEvent;
import com.promcteam.divinity.modules.list.party.PartyManager.PartyMember;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PlayerLeavePartyEvent extends IEvent {

    private Player      player;
    private PartyMember member;

    public PlayerLeavePartyEvent(
            @Nullable Player player,
            @NotNull PartyMember member
    ) {
        this.player = player;
        this.member = member;
    }

    @Nullable
    public Player getPlayer() {
        return this.player;
    }

    @NotNull
    public PartyMember getPartyMember() {
        return this.member;
    }
}
