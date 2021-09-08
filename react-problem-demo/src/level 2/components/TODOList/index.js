import React from "react";
import "./styles.css";
import TODOItem from "../TODOItem";

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
        {taskList.map((e, index) => {
          return <TODOItem key={index} task={e.task} />;
        })}
      </div>

      <div className="todo-list__footer"></div>
    </div>
  );
}
