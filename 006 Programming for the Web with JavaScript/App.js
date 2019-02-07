import React, {Component} from 'react';
import Dogs from './components/Dogs';
import AddDog from './components/AddDog';
import './App.css';

class App extends Component {
    constructor(props) { ... }
    handleAddDog(dog) { ... }
    handleDeleteDog(dog) { ... }

    render() {
        return (
            <div className="App">
                <Dogs dogs={this.state.dogs} onDelete={this.handleDeleteDog.bind(this)} />
                <AddDog onAddDog={this.handleAddDog.bind(this)} />
                <hr />
            </div>
        );
    }
}