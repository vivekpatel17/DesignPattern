
# Command Pattern Definition
Command Pattern turns the request into a standalone object that contains all information about the request.
This let's you pass the request as a argument, delay, queue, or request execution.

## Command Pattern Components
Command Pattern has four components:
1. Command -> interface with an execute method
2. Client -> creates the concrete command(SwitchLightOnCommand, SwitchLightOffCommand) and sets the receiver(Light) and then pass the command to the invoker(Room).
3. Invoker -> asks the command to be executed and delegate the request to the receiver(Light) via execute method from command.
4. Receiver -> knows how to perform the operations associated with carrying out a request

### Reference to Implementation
Light -> Receiver
</br>
SwitchLightOnCommand, SwitchLightOffCommand -> Concrete Command
</br>
Room -> Invoker
</br>
CommandPattern -> Client

## Real World Example
* Queue/Retry System
* Transaction Log
