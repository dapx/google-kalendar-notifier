plugins {
  kotlin("multiplatform") version "1.5.10"
}

repositories {
  mavenCentral()
}

kotlin {
  linuxX64("native") {
    val main by compilations.getting
    val interop by main.cinterops.creating {
      defFile(project.file("src/nativeInterop/cinterop/libnotify.def"))
    }

    binaries {
      executable()
    }
  }
}

tasks.withType<Wrapper> {
  gradleVersion = "7.1"
  distributionType = Wrapper.DistributionType.BIN
}
