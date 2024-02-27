pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ConventionPluginsPractice"
include(":app")
include(":feature:feature1")
include(":feature:feature2")
include(":feature:feature3")
include(":data")
include(":network")
include(":database")
include(":domain")
