# DailyPulse

Cross-platform news reader built with **Kotlin Multiplatform Mobile (KMM)**, sharing business logic between Android and iOS while keeping native UI on each platform.

## Features

- Browse news articles from multiple sources
- Select and manage your preferred news sources
- Native Android UI (Jetpack Compose) and iOS UI (SwiftUI)
- Shared data/domain layer across platforms

## Tech Stack

- **Kotlin Multiplatform Mobile** (KMM)
- **Jetpack Compose** — Android UI
- **SwiftUI** — iOS UI
- **SQLDelight** — shared local database
- **Ktor** — shared HTTP client
- **Koin** — dependency injection

## Structure

```
├── androidApp/   # Android-specific UI (Compose)
├── iosApp/       # iOS-specific UI (SwiftUI)
└── shared/       # Common business logic (Kotlin)
```

## Getting Started

- **Android**: open in Android Studio and run `androidApp`
- **iOS**: open `iosApp/iosApp.xcodeproj` in Xcode

