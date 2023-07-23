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
</main>

<style>
  /* ADD this section: */
  .view {
    height: 1800px;
    width: 800px;
  }
</style>