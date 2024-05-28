package hellocucumber;

import org.example.ToDoList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {
    private ToDoList toDoList;

    @Given("I have an empty to-do list")
    public void i_have_an_empty_to_do_list() {
        toDoList = new ToDoList();
    }

    @When("I add {string} to the to-do list")
    public void i_add_to_the_to_do_list(String task) {
        toDoList.addTask(task);
    }

    @Then("the to-do list should contain {string}")
    public void the_to_do_list_should_contain(String task) {
        Assertions.assertTrue(toDoList.getTasks().contains(task));
    }

    @Given("I have a to-do list with {string}")
    public void i_have_a_to_do_list_with(String task) {
        toDoList = new ToDoList();
        toDoList.addTask(task);
    }

    @When("I remove {string} from the to-do list")
    public void i_remove_from_the_to_do_list(String task) {
        toDoList.removeTask(task);
    }

    @Then("the to-do list should not contain {string}")
    public void the_to_do_list_should_not_contain(String task) {
        Assertions.assertFalse(toDoList.getTasks().contains(task));
    }
}