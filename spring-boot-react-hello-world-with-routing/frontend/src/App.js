import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import HelloWorldApp from './component/HelloWorldApp';

class App extends Component {
  render() {
    return (
      <div className="App">
        <HelloWorldApp />
      </div>
    );
  }
}

export default App;
