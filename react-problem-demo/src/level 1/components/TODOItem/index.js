import React from "react";
import "./styles.css";

export default function TODOItem(props) {
  return <div className="todo-item__container">{props.task}</div>;
}
