import './App.css';
import Counter from './components/counter/Counter'

function App() {
  return (
    <div className="App">
        <Counter/>
        <Counter by={2}/>
        <Counter by={5}/>
    </div>
  );
}

function Props({property1, property2}){

  console.log(property1)
  console.log(property2)

  return (
    <div>Props</div>
  )
}

export default App;
