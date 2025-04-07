---
title: PrintService Diagram
---
classDiagram
    class PrintService {
        - String printerName
        - List~PrintJob~ printQueue
        - String status
        - int maxQueueSize
        - String lastError
        - List~String~ errorQueue
        - Map~GameEntity, String~ userRoles
        - List~PrintJob~ completedJobs
        + void initialize()
        + void addJob(PrintJob job)
        + void removeJob(int jobId)
        + void processQueue()
        + void clearQueue()
        + String getStatus()
        + void configure(PrinterSettings settings)
        + void pause()
        + void resume()
        + void logError(String error)
        + void resolveError(String error)
        + boolean authenticate(GameEntity entity, String action)
        + void scheduleJobs()
        + PrintJob getNextJob()
        + void archiveJob(PrintJob job)
        + List~PrintJob~ getJobHistory()
    }

    class PrintJob {
        - int jobId
        - String content
        - String type
        - GameEntity createdBy
        - Date timestamp
        - int priority
        + void execute()
        + void cancel()
        + void setPriority(int priority)
    }

    class PrinterSettings {
        - String resolution
        - String colorMode
        - String paperSize
        + void applySettings()
    }

    class GameEntity {
        - int id
        - String name
        - String entityType
        + void requestPrint(String content, String type)
    }

    PrintService --> PrintJob : manages
    PrintService --> PrinterSettings : configures
    PrintJob --> GameEntity : createdBy
```