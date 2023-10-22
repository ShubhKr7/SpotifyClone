console.log('welcome to translater');

// Initialize the Variables
let songIndex=0;
let k=0;
let audioElement = new Audio('1.mp3');
let masterPlay=document.getElementById('masterPlay');
let gif=document.getElementById('gif');
let masterSongName=document.getElementById('masterSongName');
let myProgressBar=document.getElementById('myProgressBar');


let songs = [
    {songName: "All Of Me", filePath: "Spotify_Clone/06-all-of-me.mp3", coverPath: "Song_Cover.jpg"},
    {songName: "Cheating On You", filePath: "Spotify_Clone/Charlie-Puth-Cheating-On-You.mp3", coverPath: "Song_Cover.jpg"},
    {songName: "Goodbyes", filePath: "Spotify_Clone/dark-netflix-theme-song.mp3", coverPath: "Song_Cover.jpg"},
    {songName: "Faded", filePath: "Spotify_Clone/Faded.mp3", coverPath: "Song_Cover.jpg"},
    {songName: "Without Me", filePath: "Spotify_Clone/Halsey_Without_Me.mp3", coverPath: "Song_Cover.jpg"},
    {songName: "S.T.A.Y.", filePath: "Spotify_Clone/Hans-Zimmer-Stay.mp3", coverPath: "Song_Cover.jpg"},
    {songName: "Heaven", filePath: "Spotify_Clone/heaven walkmen.mp3", coverPath: "Spotify_Clone/HeavenCover.png"},
    {songName: "Kaho Na Kaho", filePath: "Spotify_Clone/Kaho Na Kaho.mp3", coverPath: "Song_Cover.jpg"},
    {songName: "Playdate", filePath: "Spotify_Clone/Playdate.mp3", coverPath: "Song_Cover.jpg"},
    {songName: "Ready For It", filePath: "Spotify_Clone/Ready For It.mp3", coverPath: "Song_Cover.jpg"}
]

//Handle play/pause click
masterPlay.addEventListener('click', () => {
    if(audioElement.paused || audioElement.currentTime<=0){
        audioElement.play();
        masterPlay.classList.remove('fa-play-circle');
        masterPlay.classList.add('fa-pause-circle');
        gif.style.opacity=1;
    }
    else{
        audioElement.pause();
        masterPlay.classList.remove('fa-pause-circle');
        masterPlay.classList.add('fa-play-circle');
        gif.style.opacity=0; makeAllPlay();
    }
});

// Listen to Events
audioElement.addEventListener('timeupdate', () => {
    //Update Seek Bar
   progress = parseInt((audioElement.currentTime/audioElement.duration)* 100);
    myProgressBar.value = progress;
});

myProgressBar.addEventListener('change', ()=>{
    audioElement.currentTime = (myProgressBar.value * audioElement.duration)/100;
});

const makeAllPlay = ()=>{
    Array.from(document.getElementsByClassName('songItemPlay')).forEach((element)=>{
        element.classList.remove('fa-pause-circle');
        element.classList.add('fa-play-circle');
    });
};

Array.from(document.getElementsByClassName('songItemPlay')).forEach((element)=>{
    element.addEventListener('click', (e)=>{
        makeAllPlay();
       //Play/Pause Song from Button of each song
        if(e.target.id==k){ 
            if(audioElement.paused==false){
            audioElement.pause();
            e.target.classList.remove('fa-pause-circle');
        e.target.classList.add('fa-play-circle');
        masterPlay.classList.remove('fa-pause-circle');
        masterPlay.classList.add('fa-play-circle');
        gif.style.opacity=0;
        masterSongName.innerText = '';}
    else{
        audioElement.play();
        e.target.classList.remove('fa-play-circle');
    e.target.classList.add('fa-pause-circle');
    masterPlay.classList.remove('fa-play-circle');
        masterPlay.classList.add('fa-pause-circle');
    gif.style.opacity=1;
    masterSongName.innerText = songs[songIndex-1].songName;
    }}
        
        else{
        e.target.classList.remove('fa-play-circle');
        e.target.classList.add('fa-pause-circle');
        audioElement.currentTime=0;
        songIndex = parseInt(e.target.id);
        audioElement.src = songIndex+'.mp3';
        audioElement.play();
        gif.style.opacity=1;
        masterPlay.classList.remove('fa-play-circle');
        masterPlay.classList.add('fa-pause-circle');
        masterSongName.innerText = songs[songIndex-1].songName;
     k=e.target.id;}
    })
})

// Previous Button Function
document.getElementById('previous').addEventListener('click', ()=>{
    if(songIndex<2) {songIndex=10;}
    else {
        songIndex-=1;
    } 

    audioElement.src = songIndex+'.mp3';
        audioElement.play();
        masterPlay.classList.remove('fa-play-circle');
        gif.style.opacity=1;
        masterPlay.classList.add('fa-pause-circle');
        masterSongName.innerText = songs[songIndex-1].songName;
})

// Next Button Function
document.getElementById('next').addEventListener('click', ()=>{
    if(songIndex>9) {songIndex=1;}
    else {
        songIndex+=1;
    } 
    audioElement.src = songIndex+'.mp3';
        audioElement.play();
        masterPlay.classList.remove('fa-play-circle');
        gif.style.opacity=1;
        masterPlay.classList.add('fa-pause-circle');
        masterSongName.innerText = songs[songIndex-1].songName;
})
