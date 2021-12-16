import React, { Component } from "react";
import { Link } from "react-router-dom";

class MenuComponent extends Component {
  componentDidMount() {}
  render() {
    return (
      <header>
        <nav className="navbar navbar-expand-md navbar-dark bg-dark">
          <div>
            <a href="http://www.alanbinu.com" className="navbar-brand">
              alanbinu
            </a>
          </div>
          <ul className="navbar-nav">
            <li>
              <Link className="nav-link" to="/hello-world-string">
                Hello World String
              </Link>
            </li>
            <li>
              <Link className="nav-link" to="/hello-world-bean">
                Hello World Bean
              </Link>
            </li>
          </ul>
        </nav>
      </header>
    );
  }
}

export default MenuComponent;
