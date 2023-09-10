# MAD_PRACTICAL5_21012011118

An "Intent" is a messaging object used in various platforms to request an action from another component of an application, often across different modules or even applications. It serves as a way for different parts of a program to communicate with each other, conveying information about a desired operation or task to be performed. They facilitate communication between different activities and services within an application. 

There are two main types of intents:

Explicit Intent:

Explicit intents are used to start a specific component within your application. For example, if you want to start a new activity (screen) within your Android app, you would use an explicit intent to do so. Explicit intents explicitly define the target component (e.g., activity or service) that should be invoked.
Implicit Intent:

Implicit intents do not specify a specific component to start but instead declare an action to be performed. The Android system looks for all the components that are registered to handle the specified action and gives the user the option to choose which one to use. For instance, if you want to share a piece of text, you can send an implicit intent to request an action (like sharing) and let the system handle it. Implicit intents are useful for tasks that can be performed by multiple components.
Intent Actions define the purpose of the intent. Here are some common Intent Actions:

1) ACTION_VIEW: This action is used to view data, such as opening a web page or displaying an image.
2) ACTION_EDIT: This action is used to edit existing data, such as modifying a contact in the address book.
3) ACTION_SEND: This action is used to send data, such as sharing a piece of text or an image.
4) ACTION_DIAL: This action is used to dial a phone number.
5) ACTION_CALL: This action is used to initiate a call.
6) ACTION_PICK: This action is used to pick an item from a list, like selecting a contact from the address book.
7) ACTION_GET_CONTENT: This action is used to retrieve content from another source, like picking a file from the device.
8) ACTION_SENDTO: This action is used to send data to a specific recipient, like sending an email to a particular address.
9) ACTION_SEARCH: This action is used to perform a search operation.
10) ACTION_VIEW_MAP: This action is used to view a location on a map.
