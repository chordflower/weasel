[![GitHub license](https://img.shields.io/github/license/chordflower/weasel?color=yellow)](https://github.com/chordflower/weasel/blob/develop/LICENSE)
[![GitHub issues](https://img.shields.io/github/issues/chordflower/weasel?color=yellow)](https://github.com/chordflower/weasel/issues)
![GitHub Workflow Status (branch)](https://img.shields.io/github/workflow/status/chordflower/weasel/build/develop?color=yellow)
![GitHub top language](https://img.shields.io/github/languages/top/chordflower/weasel?color=yellow)
![Snyk Vulnerabilities for GitHub Repo](https://img.shields.io/snyk/vulnerabilities/github/chordflower/weasel?color=yellow)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/chordflower/weasel?color=yellow)
![GitHub repo size](https://img.shields.io/github/repo-size/chordflower/weasel?color=yellow)
![GitHub issues](https://img.shields.io/github/issues/chordflower/weasel?color=yellow)
![GitHub pull requests](https://img.shields.io/github/issues-pr/chordflower/weasel?color=yellow)

# Weasel

A set of java 17+ annotation processors.

## Features

- Utilities for JavaFX;
- Generates standalone code;
- Multiple modules, use what you need;

## Documentation

- [Documentation/Website](https://chordflower.github.io/weasel) - TODO

## Installation

Weasel uses maven as a build system and is written in Java 17 (the latest LTS).

### Github Packages

You may use a version published using github packages, by including the following repository in your pom:

```xml
<repository>
  <id>github</id>
  <name>GitHub Apache Maven Packages</name>
  <url>https://maven.pkg.github.com/chordflower/weasel</url>
  <snapshots>
    <enabled>true</enabled>
  </snapshots>
</repository>
```

And then add the following dependency:

```xml
<dependency>
  <groupId>cc.chordflower.weasel</groupId>
  <artifactId>YOUR_WANTED_MODULE</artifactId>
  <version>0.1.0</version>
</dependency>
```

Where YOUR_WANTED_MODULE is the name of the module you want to pull.

### Building

In order to build the product you need:

- maven >= 3.8.1;
- java >= 17;

Then in your terminal run:

```bash
mvn clean install
```

To install the product, into your **local** maven repository.

## Contributing

Contributions are always welcome!

See `contributing.md` for ways to get started.

Please adhere to this project's `code of conduct`.


## Authors

- [@carddamom](mailto:%63%61%72%64%64%61%6D%6F%6D%40%63%68%6F%72%64%66%6C%6F%77%65%72%2E%63%63)


## License

[Apache-2.0](https://www.apache.org/licenses/LICENSE-2.0)

