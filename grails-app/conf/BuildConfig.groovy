grails.project.work.dir = 'target'
grails.project.docs.output.dir = "docs"

grails.project.repos.default = "snapshots"
grails.project.repos.snapshots.url = "https://maven.co.pierce.wa.us/nexus/content/repositories/snapshots"
grails.project.repos.releases.url = "https://maven.co.pierce.wa.us/nexus/content/repositories/releases"

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenRepo "https://maven.co.pierce.wa.us/nexus/content/groups/public"
//        mavenCentral()
    }

    plugins {
        compile ":rest-client-builder:2.1.1"
    }

    dependencies {
        compile("org.apache.maven:maven-ant-tasks:2.1.4-pc-SNAPSHOT") {
            excludes "commons-logging", "xml-apis", "groovy"
        }
        test("org.gmock:gmock:0.8.3") {
            excludes "org.codehaus.groovy:groovy-all", "groovy-all", "groovy"
            export = false
        }
    }
}
