package me.dragonzuke.eldoria.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricDataOutput dataGenerator) { super(dataGenerator, "en_us"); }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        // Item Groups

        // Items

        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/eldoria/lang/en_us.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
