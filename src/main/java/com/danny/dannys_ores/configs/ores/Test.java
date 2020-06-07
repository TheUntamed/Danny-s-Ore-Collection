package com.danny.dannys_ores.configs.ores;

import com.danny.dannys_ores.util.CommentHandler;
import com.danny.dannys_ores.util.PathHandler;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class Test {
    private ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    private ForgeConfigSpec spec;
    private ForgeConfigSpec.IntValue testInt;

    public ForgeConfigSpec create(String path, int number) {
        BUILDER.comment("Test_" + number).push(PathHandler.getGeneralPath());
        testInt = BUILDER.comment(CommentHandler.getEffectLevelComment()).defineInRange(PathHandler.getEffectLevelPath(), number, 1, 256);
        BUILDER.pop();
        spec = BUILDER.build();
        System.err.println("The spec of Test_" + number + ": " + ((ForgeConfigSpec.IntValue) spec.getValues().get(PathHandler.getGeneralPath() + "." + PathHandler.getEffectLevelPath())).get());
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, spec, path + "/test_" + number + ".toml");
        return spec;
    }

    public ForgeConfigSpec getSpec() {
        return spec;
    }

    public ForgeConfigSpec.IntValue getTestInt() {
        return testInt;
    }
}
