plugins {
  kotlin("multiplatform") version "1.5.10"
}

repositories {
  mavenCentral()
}

kotlin {
  linuxX64("native") {
    binaries {
      executable()
    }
  }
}

tasks.withType<Wrapper> {
  gradleVersion = "7.1"
  distributionType = Wrapper.DistributionType.BIN
}
