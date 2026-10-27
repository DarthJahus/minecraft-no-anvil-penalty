package me.tmshader.norepairpenalty;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(NoRepairPenalty.MOD_ID)
public class NoRepairPenalty {
    public static final String MOD_ID = "no_repair_penalty";
    private static final Logger LOGGER = LogUtils.getLogger();

    public NoRepairPenalty(IEventBus modEventBus) {
        LOGGER.info("Anvil repair penalties have been removed! (NeoForge)");
    }
}
