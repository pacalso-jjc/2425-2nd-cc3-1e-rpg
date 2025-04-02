```mermaid
title: SettingsService Class
---
classDiagram
    class SettingsService {
        +boolean isEnabled
        +String language
        +int volume
        +String theme
        +setLanguage(language: String)
        +setVolume(volume: int)
        +setTheme(theme: String)
        +toggleSetting()
        +getSettings()
    }
```