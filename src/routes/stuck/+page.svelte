<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet'>
  <body class="page">
    <div class="content">
      <img src="src/assets/alert.svg" alt="" class="img"/>
      <header class="g-heading">Your location has been sent to the administrator</header>
      <a href="/map">
        <button id="a" class="btn"> OK </button>
      </a>
    </div>
  </body>

  
  <style lang="scss">
    .content {
      display: flex;
      flex-wrap: wrap;
      align-content: center;
      justify-content: center;
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
      font-family: 'Montserrat';
    }

    .g-heading {
      display: flex;
      justify-content: center;
      text-align: center;
      padding: 1rem;

      font-weight: 800;
      font-size: 35px;
      color: white;
    }

    .img {
      margin-top: 6rem;
      justify-content: space-between;
      margin-left: auto;
      margin-right: auto;
    }

    .btn {
      background-color: black;
      color: white;

      font-family: "Montserrat";
      font-size: 22px;
      font-weight: 800;

      border-radius: 30px;
      border: none;
      box-shadow: none;

      height: 4rem;
      width: 9rem;
      margin-top: 8rem;
    }

  </style>
