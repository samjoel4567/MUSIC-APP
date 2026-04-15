async function getPlaylist() {
    const mood = document.getElementById("mood").value;
    
    try {
        const response = await fetch(`/playlist/${mood}`);
        const data = await response.json();
        const resultDiv = document.getElementById("playlistResult");
        resultDiv.innerHTML = "";
        
        const heading = document.createElement("h2");
        heading.textContent = data.mood.toUpperCase() + " Playlist";
        resultDiv.appendChild(heading);
        
        data.songs.forEach(song => {
            const songCard = document.createElement("div");
            songCard.className = "song-card";
            songCard.innerHTML = `
                <p><strong>${song.title}</strong></p>
                <iframe
                    width="100%"
                    height="200"
                    border-radius="10px"
                    src="https://www.youtube.com/embed/${song.videoId}"
                    frameborder="0"
                    allowfullscreen>
                </iframe>
            `;
            resultDiv.appendChild(songCard);
        });
    } catch (error) {
        console.error("Error fetching playlist:", error);
    }
}
