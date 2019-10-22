1. A list consisting of reminders the users want to be aware of. The application must allow
users to add reminders to a list, delete reminders from a list, and edit the reminders in
the list.

	-To realize this requirement, I added class ReminderGroup, with add, delete, rename(edit), methods.

2. The application must contain a database (DB) of reminders and corresponding data.

	-To realize this requirement, I added a model of a database, storing reminders and reminderType, with methods to look through the db for any duplicates of reminder names if any, and if there is no similar match found then it will create and store the new reminder.

3. Users must be able to add reminders to a list by picking them from a hierarchical list,
where the first level is the reminder type (e.g., Appointment), and the second level is the
name of the actual reminder (e.g., Dentist Appointment).

	-To realize this requirement, the first level is determined by the ReminderType class and the second level is determined by the Reminder class.

4. Users must also be able to specify a reminder by typing its name. In this case, the
application must look in its DB for reminders with similar names and ask the user
whether that is the item they intended to add. If a match (or nearby match) cannot be
found, the application must ask the user to select a reminder type for the reminder, or
add a new one, and then save the new reminder, together with its type, in the DB.

	-To realize this requirement, similarly explained in requirement #2, search methods to find match in database, and if a similar match isnt found the user will be asked to create/select a reminderType and any changes made to reminderType will automatically save (the new reminder and the reminderType as well).

5. The reminders must be saved automatically and immediately after they are modified.

	-To realize this requirement, method autoSave() was made, which saves the reminder during any modification.

6. Users must be able to check off reminders in the list (without deleting them).

	-To realize this requirement, class CheckedOff was made which has attributes of the check box called checkedOff with type boolean.

7. Users must also be able to clear all the check-off marks in the reminder list at once.

	-To realize this requirement, method in class CheckedOff which is named clearAllMarks() fulfills this requirement, where it will clear all reminders with the checkedOff box checked.

8. Check-off marks for the reminder list are persistent and must also be saved immediately.

	-To realize this requirement, both classes, of ReminderGroup and CheckedOff, contain public autoSave() methods, making the check-off marks persistent.

9. The application must present the reminders grouped by type.

	-To realize this requirement, reminder has a reminderType which belongs to a reminderGroup, therefore reminders can be grouped by type.

10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”,
“Kid’s Reminders”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete reminder lists.

	-To realize this requirement, my reminder list is actually called ReminderGroup, with methods to add/edit/select/delete functionalities, which can produce multiple groups which can run at the same.

11. The application should have the option to set up reminders with day and time alert. If this
option is selected allow option to repeat the behavior.

	-To realize this requirement, in Reminder class, attributes of time and date are included when a reminder is created, also method repeatReminder(date, time) parameters of date and time are passed, with the type of boolean.

12. Extra Credit: Option to set up reminder based on location.

	-To realize this requirement, in the reminder class, attribute location is private as well as in the Database class, Location class was created with adress and coordinates attributes, as well as methods byGPS() for possibly phone app and byIPadress for possible website, in Database class the method getLocation() to aquire from Reminder class.

13. The User Interface (UI) must be intuitive and responsive.

	-Not considered because it does not affect the design directly.

