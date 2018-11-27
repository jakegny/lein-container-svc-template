# {{raw-name}}

FIXME

## Getting Started

1. Start the application: `lein run`
2. Go to [localhost:8080](http://localhost:8080/) to see: `Hello World!`
3. Read your app's source code at src/{{sanitized}}/service.clj. Explore the docs of functions
   that define routes and responses.
4. Run your app's tests with `lein test`. Read the tests at test/{{sanitized}}/service_test.clj.
5. Learn more! See the [Links section below](#links).

## Configuration

To configure logging see config/logback.xml. By default, the app logs to stdout and logs/.
To learn more about configuring Logback, read its [documentation](http://logback.qos.ch/documentation.html).

## Testing

#### Coverage

`lein cloverage`

#### Test watching (with auto)

`lein auto test`

## Developing your service

1. Start a new REPL: `lein repl`
2. Start your service in dev-mode: `(def dev-serv (run-dev))`
3. Connect your editor to the running REPL session.
   Re-evaluated code will be seen immediately in the service.

#### [Docker](https://www.docker.com/) container support

1. Build an uberjar of your service: `lein uberjar`
2. Build a Docker image: `sudo docker build -t {{name}} .`
3. Run your Docker image: `docker run -p 8080:8080 {{name}}`

#### Code formatting and Linting

This is a formatter that conforms to the [The Clojure Style Guide](https://github.com/bbatsov/clojure-style-guide#source-code-layout--organization)

1. Check, verify but don't change: `lein cljfmt check`
2. Fix, make it right: `lein cljfmt fix`

#### Scan Dependencies

Uses the [National Vulnerability Database](https://nvd.nist.gov/)

`lein nvd check`

#### Manage Dependencies

See which of your dependencies are outdated with [lein-ancient](https://github.com/xsc/lein-ancient)

Usage:

To check dependencies: `lein ancient`

To upgrade dependencies: `lein ancient upgrade`, or interactively `lein ancient upgrade :interactive`

#### Dead Code Analysis

Scans your project for any unused code.

`lein yagni`

NOTE (11/26/18): Currently seeing 'build.server/run-dev' but that is used for development. Working on a fix.

#### Code Recommendations

For more idiomatic clojure code we recommend [kibit](https://github.com/jonase/kibit)

Usage:

For suggestions: `lein kibit`

Watching files: `lein auto kibit`

To fix: `lein kibit --replace`

## Links

- [Other examples](https://github.com/pedestal/samples)
