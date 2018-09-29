-------------------------------------------------

​							                          Customer

------------

​		              	Responsibility                                 |                 		  Collaborator

-----------

​                         Send reply message.                            |                		 MsgManager 

---------



-----------

​							                          TableManager

------

​		              	Responsibility                                 |                		   Collaborator

-----

​               		Ask for customers. 				  | 					WaitList

​			Assign table.						  |				

​			Send message.					  |				     MsgManager

​			Get message.					  | 				     MsgManager

------



-------

​							                          WaitList

------

​		              	Responsibility                                 |                		   Collaborator

------

​		Add customer to waitlist.				  |           			     

​		Remove customer from waitlist.		  |				

Find a customer the table can accommodate. 	  | 

​		           Send message.					  |				MsgManager

​			   Get Message.					  | 				MsgManager

--------



----------

​							                          MsgManager

------

​		              	Responsibility                                 |                		   Collaborator

------

​			Send message.					  |		  Customer or TableManager or Waitlist					

​			Get message.					  |		  Customer or TableManager or Waitlist			

---------





The pattern I use is Mediator. 

In relationship between WaitList, Customer and TableManager, WaitList is as a mediator who coordinate TableManager and Customer. Using mediator can change the many to many mapping of table and customer into two many-to-one mapping, thus promoting loose coupling .

In relationship between MsgManager, WaitList, TableManager and Customer, MsgManager is as a mediator who is responsible for sending message between WaitList and Customer(or between TableManager and Customer). The reason using this pattern is the same.