# lil-kt

## auto reload

edit application conf
```
ktor {
    development = true // add
    deployment {
        port = 8080
        port = ${?PORT}
        watch = [ classes, resources, config, src, test ] // add
    }
    application {
        modules = [ com.example.ApplicationKt.module ]
    }
}

```
after than, run this command
```shell
gradlew -t build
```
then run main.kt