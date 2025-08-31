# MyKMPHelloWorldApp

A Kotlin Multiplatform project targeting Android, iOS, and Desktop (JVM) using Compose Multiplatform. Share business logic and UI across platforms with a single codebase.

---

## Table of Contents
- [Features](#features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Build & Run](#build--run)
    - [Android](#android)
    - [iOS](#ios)
    - [Desktop (JVM)](#desktop-jvm)
- [Contributing](#contributing)
- [License](#license)
- [Resources](#resources)

---

## Features
- Shared business logic and UI with Kotlin Multiplatform
- Compose Multiplatform for Android, iOS, and Desktop
- Platform-specific code for native integrations

## Project Structure

```
/composeApp/         # Shared code and UI (Kotlin Multiplatform + Compose)
  └─ src/
      ├─ commonMain/ # Code shared across all platforms
      ├─ androidMain/ # Android-specific code
      ├─ iosMain/     # iOS-specific code
      ├─ jvmMain/     # Desktop (JVM)-specific code
      └─ ...
/iosApp/             # iOS application (entry point, SwiftUI integration)
  └─ iosApp/
      ├─ ContentView.swift
      └─ ...
```

- **composeApp**: Shared code for all Compose Multiplatform applications.
  - `commonMain`: Code common to all targets.
  - `androidMain`, `iosMain`, `jvmMain`: Platform-specific code.
- **iosApp**: iOS application entry point. Add SwiftUI code here if needed.

## Getting Started

> **Important:** This project requires a macOS operating system to build and run, due to iOS development dependencies (Xcode, CocoaPods, etc).

### Prerequisites
- [macOS](https://www.apple.com/macos/) (required for iOS development)
- [JDK 17+](https://adoptium.net/)
- [Android Studio](https://developer.android.com/studio) (for Android/Desktop)
- [Xcode](https://developer.apple.com/xcode/) (for iOS)
- [CocoaPods](https://cocoapods.org/) (for iOS integration)

### Build & Run

#### Android
1. Open the project in Android Studio.
2. Select the `androidApp` run configuration.
3. Click **Run**.

#### iOS
1. Open `/iosApp/iosApp.xcodeproj` in Xcode.
2. Select a simulator or device.
3. Build and run.

#### Desktop (JVM)
1. In Android Studio or via terminal, run:
   ```sh
   ./gradlew :composeApp:run
   ```

## Contributing
Contributions are welcome! Please open issues or submit pull requests.

## License
[MIT](LICENSE) (or specify your license here)

## Resources
- [Kotlin Multiplatform Documentation](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)
- [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform)

---
