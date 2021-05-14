## Technology requirements

With the following exceptions, you may use any libraries, platforms, and tools to complete this project.

### Architecture

1. REST (Representational State Transfer)

### Languages

1. Kotlin or Java

## Product requirements

1. A team of software engineers can productively collaborate on this codebase.
2. A client application can input an Instagram handle and receive a JSON response that contains:
  1. Datetime data last retrieved from Instagram.
  2. Instagram account's biography
  3. Instagram account's full name
  4. Instagram account's followers count
  5. Instagram account's most recent post, including its:
    1. Media URL
    2. Number of likes
    3. Number of comments
    4. Post type, e.g. carousel, image, or video

Note: Data may be cached for up to 1 hour, but clients must be provided with a method to request the latest data.

### Hint

Instagram has a public, rate-limited API that returns a JSON response. To retrieve an account, for instance, append `?__a=1` to the URL.

- Account: https://www.instagram.com/mavrckco/?__a=1
- Post: https://www.instagram.com/p/CL-IAeIMD0O/?__a=1

# How do I get set up?

This project was set up with IntelliJ IDEA Community Edition, but you may use any IDE to complete this project. It was set up with the Spring Boot framework.

## Dependencies
* Runtime: Java 11
* Language: Kotlin 1.4.31
* Application: See `build.gradle.kts`.

## Development
* To test, run `./gradlew test`.
* To start the app, run `./gradlew bootRun`.
* To view the app, browse to `http://localhost:8080/greeting`.
