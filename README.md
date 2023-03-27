# Url#HashCode Inspection Plugin

![Build](https://github.com/MusinaPolina/UrlHashCodeInspectionPlugin/workflows/Build/badge.svg)


<!-- Plugin description -->
This IntelliJ inspection plugin helps to identify the usage of the java.net.Url#hashCode() method in
Java code. It warns about the potential performance problems that may occur when this method is
called, as it tries to resolve the host of the URL to compute the hash code. The plugin scans the
Java code for instances where this method is called, and flags them as warnings to alert the
developers. By highlighting the usage of this method, the plugin encourages developers to use other
alternatives to compute the hash code, or handle the performance impact of this method correctly.
<!-- Plugin description end -->


### To run the plugin, follow these steps:

1. Install the plugin in IntelliJ IDEA.
2. Open a Java project in IntelliJ IDEA.

## Installation

- Manually:

  Download
  the [latest release](https://github.com/MusinaPolina/UrlHashCodeInspectionPlugin/releases/latest)
  and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from
  disk...</kbd>

---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template

[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
