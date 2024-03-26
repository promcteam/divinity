package com.promcteam.divinity.utils.actions.params;

import com.promcteam.codex.hooks.Hooks;
import com.promcteam.codex.util.actions.params.IParamValue;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class AttackableParam extends com.promcteam.codex.util.actions.params.list.AttackableParam {

    public AttackableParam() {
        super();
    }

    @Override
    public void autoValidate(@NotNull Entity exe, @NotNull Set<Entity> targets, @NotNull IParamValue val) {
        boolean b = val.getBoolean();
        for (Entity e : new HashSet<>(targets)) {
            boolean attackable = Hooks.canFights(exe, e);
            if (attackable != b) {
                targets.remove(e);
            }
        }
    }
}
