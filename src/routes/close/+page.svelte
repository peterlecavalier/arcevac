<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet'>
  <body class="page">
    <div class="content">
      <img src="src/assets/safe.svg" alt="" class="img"/>
      <header class="g-heading">Evacuated safely!</header>

      <a href="/landing">
        <button id="a" class="btn"> Close </button>
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
      
      background-image: linear-gradient(180deg, #010025, #2B99FF) ;
      font-family: 'Montserrat';
    }

    .g-heading {
      display: flex;
      justify-content: center;
      text-align: center;
      padding: 1rem;

      font-weight: 800;
      font-size: 45px;
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
      width: 16rem;
      margin-top: 8rem;
    }
  </style>
