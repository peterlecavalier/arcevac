<!-- <h1>Welcome to SvelteKit</h1>
<p>Visit <a href="https://kit.svelte.dev">kit.svelte.dev</a> to read the documentation</p> -->

<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Jura" />
  <div class="page">
    <header class="g-heading">ArcEvac</header>
    <body class="grid-container">
    </body>
  </div>
  
  <style lang="scss">
    .page {
      position: fixed;
      width: 100%;
      height: 100%;
      left: 0;
      top: 0;
      background-image: linear-gradient(180deg, #FF4747, #FFFF00) ;
      font-family: 'Jura';
    }

    .g-heading {
      display: flex;
      justify-content: center;
      padding: 1rem;

      font-weight: 100;
      font-size: 42px;
      color: white;
    }

    .grid-container {
      //padding: 6rem;
      display: grid;
      gap: 8rem;
      grid-template-columns: 1fr 1fr 1fr;
      grid-template-rows: 25rem 25rem;
      grid-template-areas: 
        "a b c"
        "d e f";
      //background-color: pink;
      //overflow: hidden;
    }

    .grid-item {
      background-color: white;
      border-color: white;
      border-radius: 8px;
      border-style: solid;

      font-family: "Jura";

      &:hover {
        cursor: pointer;
      }
    }
      
    #a { grid-area: "a"; }

    #b { grid-area: "b"; }

    #c { grid-area: "c"; }

    #d { grid-area: "d"; }

    #e { grid-area: "e"; }

    #f { grid-area: "f"; }

  </style>
