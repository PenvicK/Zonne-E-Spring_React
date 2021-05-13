import React from 'react';
import './avatar.css';

const Avatar = ({ url }) => {
    return (
      <div className="box-avatar">
        <img src={url} alt="Avatar" className="avatar" />
      </div>
    )
}

export default Avatar;