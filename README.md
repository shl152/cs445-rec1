# CS 445 Recitation 1: Java from CLI, Git; Now with Gradle!

## Introduction

In this recitation exercise, you will practice compiling and executing Java
programs from the command line interface (CLI), also known as the terminal or
command prompt. It is important that you test your assignment submissions from
the CLI, as this is the standard environment in which your code will be
evaluated. You will also see examples of the differences between objects and the
references that point to them. This is an important distinction in data
structures.

**NEW:** This branch has been updated with the gradle build tool for easy
execution.

In some assignments, you will be required to organize your code in packages.
This is a standard way of organizing large collections of code that comprise
different components. Packages also allow you more fine-grained control over
access of member variables and methods in your classes, as we discussed in
lecture. This technique of modularization is very important for large-scale
programming projects, and is ubiquitous in both industry and open source
development.

## Java CLI

1) Download the provided code by cloning this [Recitation 1
repository](https://github.com/2217-cs445/cs445-rec1). You will find the
following Java files:

    - `Rec1A.java` demonstrates basic CLI input and output, plus objects and
      references.
    - `Rec1B.java` demonstrates command line arguments.
    - `Rec1C.java` demonstrates a class in a package.

2) Read through `Rec1A.java` and consider what will happen when it is run.
Predict what you'll see output from each of the print statements.

3) Use `cd` to navigate to your local directory that contains these files. To
ensure you are able to compile and run Java programs from the CLI, compile and
run `Rec1A`. Check your predictions regarding each print statement.

   **NEW:** To run this part with gradle, use the command `./gradlew runA` (on
   Unix-like systems) or `gradle.bat runA` (on DOS-like systems).

4) Change line 69 of `Rec1A.java` to make `custom` point to a separate object
from `matilda`. Compile and run the code again and observe the changes.

5) Check which files have changed using `git status`. Commit your changes to
your local clone of the git repository using `git add Rec1A.java` and `git
commit`. Note that, even after doing so, your changes are not reflected in the
online version on GitHub. Your TA will demonstrate what happens when changes are
pushed (they will use their own *fork* of the repository where they have write
access).

6) Read through `Rec1B.java` and consider what will happen when it is run.

7) To ensure you understand command line arguments, compile and run `Rec1B`. Try
running it with different numbers of command line arguments. Try wrapping
multiple words in quotes, and note the difference in the output of the program.

   **NEW:** To run this part with gradle, use the command `./gradlew runB` (on
   Unix-like systems) or `gradle.bat runB` (on DOS-like systems). You can use
   `--args` to pass command line arguments through gradle. Wrap all arguments in
   double quotes; use escaped double quotes (`\"`) to group arguments. For
   instance:

       ./gradlew runB --args "one two three"
       ./gradlew runB --args "\"first argument\" \"second argument\" third"

8) Read through `Rec1C.java` and consider the first line; note that this class
is labeled as belonging to package `cs445.rec1`.

9) Try compiling and running `Rec1C` in the same way you did `Rec1A` and
`Rec1B`. Note that it doesn't work! This is because Java expects to find the
code inside a *package folder*.

   **NEW:** The source file has already been moved into package folders in this
   branch, so the next step is no longer necessary.

10) ~~Create nested package folders `cs445/rec1/` using `mkdir`. Then, move
`Rec1C.java` into `cs445/rec1/` using `git mv`.~~

11) **Remaining outside of the package folders** (that is, *without* using `cd`
to navigate into `cs445/rec1/`), compile and run `Rec1C.java`.

    **NEW:** To run this part with gradle, use the command `./gradlew runC` (on
    Unix-like systems) or `gradle.bat runC` (on DOS-like systems).

12) ~~Commit your change of location for `Rec1C.java` using `git commit`.~~

13) Use `git log` to observe the changes that have been made since this
repository was created. If you want to undo a commit, try `git revert` followed
by the first few characters of the commit id. If you want to see details of what
changed in a commit, use `git show` (again followed by the beginning of the id).

## Conclusion

More importantly than just following these steps, the goal of these exercises is
to prepare you for your programming assignments. If you have trouble completing
these steps, or you do not understand them, ask your TA or come to office hours!
Understanding these concepts will be crucial to success in your assignments!

