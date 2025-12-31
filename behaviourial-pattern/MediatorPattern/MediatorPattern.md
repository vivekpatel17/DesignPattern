


We can not have LoginButton extends AbstractButtons and implements IComponent because it will create a diamond problem when we inticiate the Object of LoginButton class.

So to solve this we can have AbstractButtons extends IComponent and LoginButton extends AbstractButtons.


### Wrong way to implement the mediator pattern

    AbstractButtons                 IComponent
        |                               |
        | ============================= |
            extends     |   implements
                    LoginButton 

### Right way to implement the mediator pattern

    IComponent
        |
        |   implements
        |
    AbstractButtons
        |
        |   extends
        |
    LoginButton