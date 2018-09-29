# CRC Cards

`Customer`

| Responsibility | Collaborator |
| ---- | ---- |
| Send reply message | MessageManager |

`Table`

| Responsibility | Collaborator |
| ---- | ---- |
| Obey the scheduling of TableManager | TableManager |

`TableManager`

| Responsibility | Collaborator |
| ---- | ---- |
| Request customer with accommodatable party size | Waitlist |
| Accomadate customers | |
| Send message | MessageManager |
| Get response | MessageManager |

`MessageManager`

| Responsibility | Collaborator |
| ---- | ---- |
| Receive message | Waitlist, TableManager, Customer |
| Send message | Waitlist, TableManager, Customer |

`Waitlist`

| Responsibility | Collaborator |
| ---- | ---- |
| Add customer to waitlist | Customer |
| Remove customer from waitlist | Customer, TableManager |
| Find next customer for table | TableManager |
| Assign customer to TableManager | TableManager |
| Get message | MessageManager |
| Send message | MessageManager |

# WHICH Pattern And WHY

The pattern used here is **Mediator**. 

The initial requirement can be viewed as assigning appropriate customer to the appropriate table. This is a "many(customers) -to-many(tables)" mapping. **Mediator** pattern is  designed for handling exatcly this scenario, by adding a mediator in between as a bridge to connect both ends. Benefit of this is both ends are now weakly instead of strongly coupled with each other. Each is only directly coupled with the mediator, making it easy to change  behavior of each independently and simplified the N-to-N convoluted network to a cleaner N-to-one-to-N network.

In my implementation, I assign a `TableManager` for each `Table`, so it could have more communicating / scheduling functions. The `Customer`s are producers (producing information like size of party, name, telephone number) and `TableManager`s are consumers (trying to fetch the appropriate customer information and assign the table for that customer, if it's vacant). The `Waitlist` here serves as the mediator coordinating both the `TableManager`s and `Customer`s.

The message sending process can also be viewed as another "many(`TableManager`s or `WaitList`)-to-many(`Customer`s). I introduced `MessageManager` as the mediator here, passing messages (confirmation message, table-ready message, customer's reply message) between all three parties involved.