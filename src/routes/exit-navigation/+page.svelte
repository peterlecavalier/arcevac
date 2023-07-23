<!-- <h1>Welcome to SvelteKit</h1>
<p>Visit <a href="https://kit.svelte.dev">kit.svelte.dev</a> to read the documentation</p> -->

<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Jura" />
  <body class="page">
    <div class="placeholder">
      Map goes here
    </div>
    <!-- <div class="router"> 
      <img src="src/assets/right-arrow.svg" alt=""/> 
      Turn right
    </div> -->

    <button class="btn">
      I need help
    </button>

    <button class="btn">
      I evacuated
    </button>
  </body>

  
  <style lang="scss">

    .placeholder {
      background-color: rgb(196, 196, 196);
      height: 90%;

      display: flex;
      flex-wrap: wrap;
      align-content: center;
      justify-content: center;
    }

    .router {
      background-color: white;
      height: 30%;

      font-size: 30px;
      font-weight: 700;

      display: flex;
      flex-direction: row;
      align-items: center;
      text-align: center;
    }

    .page {
      position: absolute;
      width: 100vw;
      height: 100vh;
      left: 0;
      top: 0;
      margin: 0;
      background-size: cover;
      background-repeat: no-repeat;
      
      background-image: linear-gradient(180deg, #010025, #FF2B2B) ;
      font-family: 'Jura';
    }

    .g-heading {
      display: flex;
      justify-content: center;
      text-align: center;
      padding: 1rem;

      font-weight: 100;
      font-size: 30px;
      color: white;
    }

  .img {
    justify-content: space-between;
    margin-left: auto;
    margin-right: auto;
  }

  .btn {
    background-color: black;
    color: white;
    font-family: "Jura";
    font-size: 20px;
    border-radius: 30px;
    border: none;
    box-shadow: none;
    height: 3rem;
    width: 12rem;
  }

  </style>
