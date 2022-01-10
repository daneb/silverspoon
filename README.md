# Silverspoon

An micro-web framework written in Clojure

### Current Functionality

1. A router
2. Views in Clojure
3. View rendered to HTML (with binding)
4. Route matching
5. All verb support and filtering (GET, PUT, POST, DELETE)
6. Bootstrap to run locally
7. Template binding with Semler

### TODO

1. Middleware integration
2. Template binding through requests

### Development

Run project

```sh
❯ lein run
2022-01-10 10:36:33.887:INFO::main: Logging initialized @1563ms to org.eclipse.jetty.util.log.StdErrLog
2022-01-10 10:36:34.967:INFO:oejs.Server:main: jetty-9.4.42.v20210604; built: 2021-06-04T17:33:38.939Z; git: 5cd5e6d2375eeab146813b0de9f19eda6ab6e6cb; jvm 11.0.12+0
2022-01-10 10:36:35.052:INFO:oejs.AbstractConnector:main: Started ServerConnector@3a0896b3{HTTP/1.1, (http/1.1)}{0.0.0.0:8080}
```

Hit test endpoint

```sh
❯ lein run
2022-01-10 10:36:33.887:INFO::main: Logging initialized @1563ms to org.eclipse.jetty.util.log.StdErrLog
2022-01-10 10:36:34.967:INFO:oejs.Server:main: jetty-9.4.42.v20210604; built: 2021-06-04T17:33:38.939Z; git: 5cd5e6d2375eeab146813b0de9f19eda6ab6e6cb; jvm 11.0.12+0
2022-01-10 10:36:35.052:INFO:oejs.AbstractConnector:main: Started ServerConnector@3a0896b3{HTTP/1.1, (http/1.1)}{0.0.0.0:8080}
```

Hit non-existent endpoint

```sh
❯ curl http://localhost:8080/moo
Not Found%
```

### Tests

Run tests with Lein or Cider.

```sh
❯ lein test
```

`
