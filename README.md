# Case classes for the diabetic

This repository will help you to understand all the syntax sugar that we get
by just preprending `case` to the definition of a class or object.

## Usage instructions

1. Prepare your local environment by either installing
   [Intellij with its Scala plugin][intellijsetup] or [sbt][sbtsetup] and your
   favourite editor.
2. Read `LabelledPoint` and `Module` and their tests.
3. Remove the `case` keyword in both declarations.  I recommend you to comment
   test not compiling until you can focus on them.
   Alternatively checkout the `exercise` branch.
4. Add code until tests pass again!

[intellijsetup]: https://www.jetbrains.com/help/idea/2016.1/creating-and-running-your-scala-application.html
[sbtsetup]: http://www.scala-sbt.org/0.13/docs/Setup.html

## How this will help my understanding?

By handwriting the code that `scalac` would otherwise generate automatically you
will be able to better understand what case classes do for you and how to use it.
