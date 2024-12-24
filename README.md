# Uncommon Scala Bug: Improper Exception Handling in Setter

This repository demonstrates a subtle bug in Scala related to exception handling within a custom setter method.  The code uses a private `var` for a mutable field, provides a public getter and setter. However, the setter lacks robust error handling, specifically when negative values are provided. 

The `bug.scala` file contains the buggy code, showcasing the issue.  The `bugSolution.scala` file presents a corrected version which includes better exception handling. This illustrates how to use the `Try` monad to handle exceptions more gracefully.  For larger applications you might want to use something like a custom exception type.