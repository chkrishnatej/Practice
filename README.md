## Learn Java

This repo contains  small example programs of Java. I have created this for my learning purposes.

### Prerequisites
I have personally used this on **Mac OS 10.15 (Catalina)** with `zsh` on **Visual Studio Code**
- Java 8+
- Makefile
- `envsubst`



## Makefile
The Makefile is created to simplify the repeated actions. 

The reason for using Makefile instead of using `tasks.json` is, I didn't feel it to be very intutive. Lot of keystrokes were required. And chaining bash commands are hard to put in. `Makefile` is a simple way to go and is natively supported in **Linux** and **Mac**. With `Makefile` I can be comfortable chaining commands and using it on terminal per se.

This serves the following purposes:

* Create a Java boilerplate code to start writing the programs
* Compile the Java files, run it and clean the `*.class` files
* Running any Java program from the `cwd` without any extra steps

### Variables
* `JF` -  The main folder name. Specification of folder name for creating boilerplate code and running

Other variables are automatically generated

### Commands
All the programs can be run from the `root` of the directory
* `default` - Compiles, runs and cleans the Java program
    
    * **Example**  <br>
        `make JF=HelloWorld`
* `create` - Creates simple boilerplate code with `HelloWorld` program

    * **Example** <br>
        `make JF=HelloWorld create`


