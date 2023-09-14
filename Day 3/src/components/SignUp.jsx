import React from "react";
import '../assets/css/SignUp.css'

const SignUp = () =>
{
      const [signupData, setSignUpData] = React.useState({
            firstname:"",
            lastname:"",
            username:"",
            email:"",
            password:"",
            confirmpassword:""
      })

      const handleOnChange = (e) =>
      {
            const [name, value] = [e.target.name, e.target.value] ;
            setSignUpData({
                  ...signupData,
                  [name]:value
            })
      }

      const onSubmit = (e) => {
            e.preventDefault() ;
            console.log(signupData) ;
      }

      return(
            <form onSubmit={onSubmit}>
                  <div className="main">
                        
                        <div className="container-sign">
                              <h1><strong>SIGN</strong> UP</h1>
                              <input type="text" placeholder="FIRSTNAME" name="firstname" onChange={handleOnChange}></input>
                              <input type="text" placeholder="LASTNAME" name="lastname" onChange={handleOnChange}></input>
                              <input type="text" placeholder="USERNAME" name="username" onChange={handleOnChange}></input>
                              <input type="email" placeholder="EMAIL ID" name="email" onChange={handleOnChange}></input>
                              <input type="password" placeholder="PASSWORD" name="password" onChange={handleOnChange}></input>
                              <input type="password" placeholder="CONFIRM PASSWORD" name="confirmpassword" onChange={handleOnChange}></input>
                              <button type="submit">SIGNUP</button>
                        </div>    
                  </div>
                   
            </form>
      )
}

export default SignUp