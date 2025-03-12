```mermaid
---
title: Location Class
---
classDiagram
    class Location {
        - double latitude
        - double longitude
        - string address
        - string city
        - string country
        - string postalCode
        + getCoordinates(): string
        + getFullAddress(): string
    }
