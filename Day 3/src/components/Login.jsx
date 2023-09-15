import React from "react";
import '../assets/css/Login.css'
import {Link } from 'react-router-dom'


const Login = () =>{
      const [data, setData] = React.useState({
            username:"",
            password:""
      })
      const handleOnChange = (e) => {
            const [name, value] = [e.target.name, e.target.value] ;
            setData({
                  ...data,
                  [name]:value
            })
      }
      const onSubmit = (e) => {
            e.preventDefault() ;
            console.log(data) ;
      }
      return(
            <form onSubmit={onSubmit}>
                  <div className="main">
                        <div className="container">
                              <h1>LOGIN</h1><br></br>
                              <label>UserName</label>
                              <input type="text" placeholder="Type your username" name="username" onChange={handleOnChange}></input>
                              <label>Password</label>
                              <input type="password" placeholder="Type your password" name="password" onChange={handleOnChange}></input>
                              <a href="#">Forget Password?</a>
                              <button type="submit">LOGIN</button>
                              <Link to='/signup'>Already don't have account? SignUp</Link>
                        </div>    
                  </div>
                   
            </form>
      )
}
export default Login