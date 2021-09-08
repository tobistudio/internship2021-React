import React, { useState } from "react";
import "./styles.css";

export default function TODOItem(props) {
  const [completed, setCompleted] = useState(false);

  const toggleCompleted = () => {
    setCompleted(!completed);
  };
  
  return (
    <div
      className={
        completed
          ? "todo-item__container completed"
          : "todo-item__container"
      }
      onClick={toggleCompleted}
    >
      {props.task}
    </div>
  );
}
