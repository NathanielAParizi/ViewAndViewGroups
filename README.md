# ViewAndViewGroups

ViewAndViewGroups application will allow the user to input text into an EditText which will then be stored into a 
Person object's member variables, such as name and address. When the user pressed the Button, the inputed text will
then populate the TextViews directly from the person object's member variables. 

***************

Research



1. The Singleton pattern will restrict the instantiation of a class to just one single object. It is useful when we only need one
instance of our class. A common use of the Singleton pattern is with handling a single database connection which may see
multiple objects trying to access the database. 

Factory pattern creates an object without needing to require specifications from a separate class which refers
to objects using a common interface.

The Builder pattern aims to create an instance of a complex object which are built off of simple objects.

2. Dalvic is a software stack on the Android OS. It's primary use is for efficient storage of memory as a interpret-only Virtual Machine. Java source code when compiled turns into byte-code which then will become Dalvic bytecode which lastly becomes DVM. It's based off a Just In Time compilation, every time an app is runned, only a portion of code required for exeuction will be translated into machine code for that given moment. The format for a Dalvic file is a called a ".dex" file. ART, Android RunTime compiles the Dalvik bytecode itself to system-dependent binary. All source code will be precompiled before instalation allowing for better speed when launching the app without the need of JIT compilation. ART is used for translation of bytecode into native instructions that will be executed afterwards in the runtime environment.

3. Android manifest is used to define the structure, specific requirements, and user permissions of the application. It is in XML and found in the root directory of the project hierarchy.

4. Runtime is executing the source code and launching the application, in Android's case it would be the executable .apk file. 
Compile time is during compilation of source code as it becomes an executable file.

5. sp, dp, px, pt, in, mm

Scaler-Independent Pixels = sp    - refers to the amount the font is sized in terms of the resolution and size of device. 
Density Pixels = dp             -  refers to the physical density of the screen, 1dp is equal to 1 pixel on a 160dpi screen.
Pixels = px .                      - refers to amount of actual individual pixels.
Point = pt                          - refers to 1/72 of an inch of physical size of screen.
inch = in                           - refers to an actual inch of the device screen
milimeter = mm                      = refers to an actual inch of the device screen


Application Layer is where the apks are hosted, there are a range of common applications such as clock, browser, dialer, etc. 

Application Framework Layer provides functionality for higher level services to developers to manage components such as Activity Manager, Content Providers as well as Location Manager.

Libraries Layer has everything needed to develop an app, recourse files, source code, and an Android manifest, SQLite.

Linux Kernel is responsible for peripheral hardware device communication that applications can use such as Camera, Wifi Driver, etc. 

8. Gradle is Android JVM build system which will produce the .apk file after compilation. 
