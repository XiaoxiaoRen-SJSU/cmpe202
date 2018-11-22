
# Summary

## Comparison between FeatureIDE GumballMachine with AspectJ and Lab1 GumballMachine

### 1. Lab1 GumballMachine

* In lab 1, if we want to have different types of gumball machine which includes "single quarter crank gumball machine", "double quarter crank gumball machine" and "any quarter slot gumball machine", we need to implement three class for them.

* To test three gumball machines, we have to write three test function to test them separately.

### 2. FeatureIDE GumballMachine with AspectJ

* In feature IDE project of gumball machine, we can use different aspects to stands for crank model, slot model and cost of gumball, etc.

  * Advantage: We do not have to implement all classes for each type of gumball machine. Instead we implement just one GumballMachine and some aspects of it and configure gumball machine by using feature model.

* To test gumball machine, we use feature model to configure different model for gumball machine.

  * Advantage: No need to write different testing code. Testing can be done by configure different model.

### 3. Feature model and output results

* Feature Mode

  ![Feature model](./image/model.png)

* Output Results

  * Choose CRANKMODEL, COST25 and ONEQTR

    ![Config for crank25](./image/crank25.png)

    ![Result for crank25](./image/crank25output.png)

  * Choose CRANKMODEL, COST50 and TWOQTR

    ![Config for crank25](./image/crank50.png)

    ![Result for crank25](./image/crank50output.png)

  * Choose SLOTMODEL, COST25 and ONEQTR

    ![Config for crank25](./image/slot25.png)

    ![Result for crank25](./image/slot25output.png)

  * Choose SLOTMODEL, COST25 and ONEQTR

    ![Config for crank25](./image/slot50.png)

    ![Result for crank25](./image/slot50output.png)
