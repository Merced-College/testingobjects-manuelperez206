[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22624026)

# Testing Objects Lab

In this lab I have developed classes as we have built them in steps (fields → constructors → `toString()` → encapsulation) and tested all of these things in `Main.java`.

---

## Checkpoints

### Q1) What does printing an object with no `toString()` display, and why?

An object with no `toString()` will print out something such as `Dog@1b6d3586` (the class name + `@` + a hex hash). This is Java's default `Object.toString()` output when you have not overridden it.

### Q2) List the default values for each of your fields and indicate whether they are primitives or reference types.

**Dog**

- `name` (String, reference) → `null`
- `age` (int, primitive) → `0`
- `breed` (String, reference) → `null`


**Quokka**

- `name` (String, reference) → `null`
- `ageMonths` (int, primitive) → `0`
- `location` (String, reference) → `null`
- `happiness` (int, primitive) → `0`
- `hungry` (boolean, primitive) → `false`


### Q3) In what ways did constructors affect the initialization of an object, as opposed to simply using default values?

Constructors allow the object to be initialized with meaningful values from the very beginning. Additionally, if you create a constructor with parameters, then Java will no longer provide a no-arg constructor by default. Therefore, `new Dog()` will fail, unless you create a new no-arg constructor.


### Q4) What changes occurred in `toString()` after you created your own version of `toString()`, and how is `@Override` helpful?

When you created your own version of `toString()`, when you printed the object, you were able to see the readable field values (such as name, age, breed) instead of `Class@hash`. `@Override` is helpful because it informs the compiler that you want to replace a parent method with your own version of that method. This allows you to prevent errors (such as typos or incorrect method signatures).

### Q5) Why would you rather use private fields along with their corresponding getter and setter methods than public fields? Provide one rule you could enforce with the getter and/or setter methods.

You would rather use private fields along with their corresponding getter and/or setter methods to prevent other pieces of code from changing the values of the fields in ways that could damage the object. However, using getter and/or setter methods also provides a means to control who can modify the object and when, as well as to implement additional rules. 
For example, you could implement a rule that prevents users from assigning a negative value to an object's age (`reject age < 0 in setAge`).

---

## Reflection (2)

### 1) Prior to implementing `toString()`, what was printed when you printed an object? Why?

Prior to implementing `toString()`, when you printed an object, it printed `ClassName@hashcode` because Java uses the default `Object.toString()` method.

### 2) What differences did you notice in the object creation process after you added the default constructor? After you added the parameterized constructor?

Adding the default constructor provided my objects with a safe starting point, without having to manually assign the fields. Adding the parameterized constructor allowed me to create fully constructed objects in one statement, which greatly increased the speed at which I could test.
