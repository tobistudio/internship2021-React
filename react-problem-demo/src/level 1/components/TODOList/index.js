import React from "react";
import "./styles.css";
import TODOItem from "../TODOItem";

// hardcoded list of initial tasks
const taskList = [
  { task: "Make doc appointment @ 2pm this Friday" },
  { task: "Take out the trash" },
  { task: "Clean the windows" },
];

export default function TODOList() {
  return (
    <div className="todo-list__container">
      <div className="todo-list__header">Today's Tasks</div>

      <div className="todo-list__content">
        {/* render for each element in the taskList a new component */}
        {taskList.map((e, index) => {
            // Keys help React identify which items have changed, are added, or are removed
            // Keys should be given to the elements inside the array to give the elements a stable identity
          return <TODOItem key={index} task={e.task} />; 
        })}
      </div>
      
      <div className="todo-list__footer"></div>
    </div>
  );
}
