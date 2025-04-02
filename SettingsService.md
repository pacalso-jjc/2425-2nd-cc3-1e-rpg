```mermaid
title: SettingsService Class
---
classDiagram
    class SettingsService {
        - int audioVolume
        - boolean isMuted
        - String resolution
        - boolean isFullscreen
        - String difficulty
        - Map<String, String> keyBindings
        
        + int getAudioVolume()
        + void setAudioVolume(int volume)
        + void toggleMute()
        + String getResolution()
        + void setResolution(String res)
        + void toggleFullscreen()
        + String getDifficulty()
        + void setDifficulty(String level)
        + Map<String, String> getKeyBindings()
        + void setKeyBinding(String action, String key)
        + void saveSettings()
        + void loadSettings()
    }
```