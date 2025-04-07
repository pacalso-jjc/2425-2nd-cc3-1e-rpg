---
title: SettingsViewModel Class diagram
---
classDiagram
    class SettingsViewModel {
        - SettingsModel model
        - boolean isDarkModeEnabled
        - int volumeLevel
        - String language
        - String region
        - Map~String, Object~ advancedSettings
        + void loadSettings()
        + void updateDarkMode(bool enabled)
        + void updateVolume(int level)
        + void updateLanguage(String lang)
        + void updateRegion(String region)
        + void updateAdvancedSetting(String key, Object value)
        + void saveSettings()
        + String exportSettings()
        + void importSettings(String settingsData)
    }

    class SettingsModel {
        - boolean darkMode
        - int volume
        - String language
        - String region
        - Map~String, Object~ advancedSettings
        + boolean getDarkMode()
        + void setDarkMode(bool enabled)
        + int getVolume()
        + void setVolume(int level)
        + String getLanguage()
        + void setLanguage(String lang)
        + String getRegion()
        + void setRegion(String region)
        + Object getAdvancedSetting(String key)
        + void setAdvancedSetting(String key, Object value)
        + String toJSON()
        + void fromJSON(String jsonData)
    }

    SettingsViewModel --> SettingsModel : references