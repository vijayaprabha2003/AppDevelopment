import React from 'react'
import './UserDocument.css'
import { useNavigate } from 'react-router-dom'


const UserDocument = () => {
      const navigate = useNavigate() ;
      const HandleHome = () => {
            navigate("/homeinsurance")
      }
      const HandleLife = () => {
            navigate("/lifeinsurance")
      }
      const HandleHomes = () => {
            navigate("/homelog")
      }
  return (
    <div>
      <div className="document-main">
            <div className="documentList">
                  <h1>INSURANCE TYPES DOCUMENT</h1>
                  <div className="buttoninsurance">
                        <button onClick={HandleHome}>Home Insurance</button>
                        <button onClick={HandleLife}>Life Insurance</button>
                        <button onClick={HandleHomes}>BACK</button>
                        
                  </div>
            </div>
      </div>
    </div>
  )
}

export default UserDocument