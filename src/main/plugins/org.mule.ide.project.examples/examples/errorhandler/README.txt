+-----------------------+
| Error Handler Example |
+-----------------------+
The Error handler example demonstrates using Spring as the container to provide
the objects managed by Mule and how to publish events to multiple outbound 
endpoints.  The example consists of two components: ExceptionManager and 
BusinessErrorManager.

For more information, refer to http://www.muledocs.org/Examples

+----------------------+
| Building the example |
+----------------------+
First, make sure you have set the MULE_HOME environment variable as recommended 
in INSTALL.txt

Depending on the build tool you are using (Ant or Maven), you can build the 
example by simply running "ant" or "mvn".  This will download any additional 
libraries, compile the example classes, produce a jar file, and copy everything 
to $MULE_HOME/lib/user, which is where your custom classes and configuration 
files should go.

(If you are unable to download the libraries it may be because you are behind a 
firewall and have not configured your build tool to use your HTTP proxy.  Please 
refer to the following information.)
    Ant users:     http://ant.apache.org/manual-beta/proxy.html
    Maven users:   http://maven.apache.org/guides/mini/guide-proxies.html

+---------------------+
| Running the example |
+---------------------+
You will need two shell windows in order to run this application.

In the first window, use the shell script (Unix/Linux) or batch file (Windows) 
provided in this directory to run the example.

Alternatively, if you have added Mule to your executable path as recommended in
INSTALL.txt, you can run the example from the command line as follows:

    Linux / Unix
    ------------
    ./errorhandler

    Windows
    -------
    ./errorhandler.bat

In the second window, copy the files (one by one so you can see the results) 
from the ./test-data/out directory to the ./test-data/in directory.  Note that 
for the FatalException.xml file, Mule will attempt to construct and send an 
alert email using the SMTP configuration as specified in ./conf/email.properties.
