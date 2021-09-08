import React, { useState } from "react";
import "./styles.css";
import TODOItem from "../TODOItem";

export default function TODOList() {
  // Give a state to taskList in order to modify it
  const [taskList, setTaskList] = useState([
    { task: "Make doc appointment @ 2pm this Friday" },
    { task: "Take out the trash" },
    { task: "Clean the windows" },
  ]);
  const [newTask, setNewTask] = useState({
    task: "",
  });

  const handleChange = (event) => {
    setNewTask({
      task: event.target.value,
    });
  };

  const handleSubmit = (event) => {
    if (newTask.task === "") alert("The task has no text!");
    else {
      // Spread operator(...) allows an iterable to expand in places where 0+ arguments are expected
      setTaskList((prevTaskList) => [...prevTaskList, newTask]);

      // Reset the newTask state so that the value is removed from input field after submit
      setNewTask({
        task: "",
      });
    }

    // Prevents the page from refreshing and resetting the taskList
    event.preventDefault();
  };

  return (
    <div className="todo-list__container">
      <div className="todo-list__header">Today's Tasks</div>

      <div className="todo-list__content">
        {taskList.map((e, index) => {
          return <TODOItem key={index} task={e.task} />;
        })}
      </div>

      <div className="todo-list__footer">
        <form>
          <input
            id="new-task"
            className="new-task__input"
            type="text"
            placeholder="New task..."
            name="task"
            value={newTask.task} // shows the current value of newTask in the input box
            onChange={handleChange} // updates the current value of newTask
          />
          <input
            className="new-task__submit"
            type="submit"
            value="Submit"
            onClick={handleSubmit}
          />
        </form>
      </div>
    </div>
  );
}
