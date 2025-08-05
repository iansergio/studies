import profilePicture from "./assets/profile.png"

function Card(){
    return(
        <div className="card">
            <img className="card-image" src={profilePicture} alt="Profile picture"></img>
            <h2 className="card-title">Ian Sergio Helfenberger</h2>
            <p className="card-text">I am studying software engineering</p>
        </div>
    );
}

export default Card