<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet'>
<script>
  // ADD these 2 lines:
  import MapView from "@arcgis/core/views/MapView";
  import "@arcgis/core/assets/esri/themes/light/main.css";

  // ADD this function:
  const createMap = (domNode) => {
    const view = new MapView({
      container: domNode,
      map: {
        basemap: "streets-vector",
      },
      zoom: 15,
      center: [-90.1928, 38.6226], // longitude, latitude
    });
  };
</script>

<main>
  <div class="view" use:createMap></div>
  <a href="/close">
    <button class="btn-safe"> I am safe </button>
  </a>

  <a href="/stuck">
    <button class="btn-stuck"> I am stuck</button>
  </a>
  
  
</main>

<style>
  /* ADD this section: */
  .view {
    height: 1800px;
    width: 800px;
  }

  .btn-safe {
    background-color: black;
    color: white;

    font-family: "Montserrat";
    font-size: 44px;
    font-weight: 800;

    border-radius: 120px;
    border: none;
    box-shadow: none;

    position: fixed;
    bottom: 70px;
    left: 150px;

    height: 8rem;
    width: 32rem;
    margin: auto;
  }

  .btn-stuck {
    background-color: #FF2B2B;
    color: white;

    font-family: "Montserrat";
    font-size: 44px;
    font-weight: 800;

    border-radius: 120px;
    border: none;
    box-shadow: none;

    position: fixed;
    bottom: 220px;
    left: 150px;

    height: 8rem;
    width: 32rem;
    margin: auto;
  }
</style>