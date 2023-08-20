echo - Output any text that we provide
whoami - Find out what user we're currently logged in as!
ls - listing
cd - change directory
cat	- concatenate
pwd	- print working directory
find - name passwords.tx
find - name *.txt
wc - word count
grep - search text from file
& - This operator allows you to run commands in the background of your terminal.
fg - This command is being used to bring the background process back into use on the terminal.
&& - This operator allows you to combine multiple commands together in one line of your terminal.
> - This operator is a redirector - meaning that we can take the output from a command (such as using cat to output a file) and direct it elsewhere.
>> - This operator does the same function of the > operator but appends the output rather than replacing (meaning nothing is overwritten).
touch - touch	Create file
mkdir - make directory	Create a folder
cp - Copy a file or folder
cp -r - Copy all file or folder
mv - move Move a file or folder
rm - remove Remove a file or folder
file - file Determine the type of a file
ps - command to provide a list of the running processes as our user's session
ps aux - To see the processes run by other users and those that don't run from a session
top - It gives you real-time statistics about the processes running on your system update every 10 second
kill - Kill command and the associated PID will kill the command for that session like (kill 46)
SIGTERM - Kill the process, but allow it to do some cleanup tasks beforehand
SIGKILL - Kill the process - doesn't do any cleanup after the fact
SIGSTOP - Stop/suspend a process
systemctl start apache2 - to tell apache to start up (Can be used with (Start, Stop, Enable, Disable))

# Automation
MIN - What minute to execute at
HOUR - What hour to execute at
DOM	- What day of the month to execute at
MON	- What month of the year to execute at
DOW	- What day of the week to execute at
CMD	- The actual command that will be executed.
