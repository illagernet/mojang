# Mojang API Wrapper

Spigot plugin that serves as a wrapper for the Mojang API

## Usage

This plugin has no inate functionality.

## Project Structure

    .
    ├── build.sh                      # Build script
    ├── classes                       # Java class argfile
    ├── src                           # Java source files
    │   └── net/illager/template      # Package namespace
    ├── (lib)                         # Downloaded libraries. Generated on build
    ├── (bin)                         # Compiled output. Generated on build
    └── (doc)                         # Javadoc documentation. Generated on build

## Building

1. List the relative paths to all class source files in `classes`. E.g.:
```
src/net/illager/mojang/MojangAPIPlugin.java
...
```
2. Run the build script with Bash:
```
$ ./build.sh
```
3. Dependencies will be downloaded under `lib`.
4. Source files and resources will be compiled under `bin`.
5. Documentation will be generated under `doc`.
6. The packaged jar will appear in the project root.

## License

![Creative Commons Zero v1.0 Universal](https://licensebuttons.net/l/zero/1.0/88x31.png)

To the extent possible under law, Illager Net has dedicated all copyright and related and neighboring rights to this software to the public domain worldwide. This software is distributed without any warranty.

See [Creative Commons Zero v1.0 Universal](LICENSE.txt) for the full license.
