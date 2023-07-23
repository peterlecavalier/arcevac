<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet'>
<script>
  import MapView from "@arcgis/core/views/MapView";
  import esriConfig from "@arcgis/core/config";
  import ScaleBar from "@arcgis/core/widgets/Scalebar";
  import Legend from "@arcgis/core/widgets/Legend";
  import FeatureLayer from "@arcgis/core/layers/FeatureLayer"
  import "@arcgis/core/assets/esri/themes/light/main.css";

  esriConfig.apiKey = "AAPK80848b2e603341559f0b825f203064c4jjuOzGRGwi6Nt2iDESThlpvLccJ_t8DeEUrNEh60gEDc8Oz7TcxE6vCBVIAB5st6";

  const baseUrl = "https://services8.arcgis.com/LLNIdHmmdjO2qQ5q/arcgis/rest/services/Denver_First_Floor_1110/FeatureServer";

  const createMap = (domNode) => {
    const view = new MapView({
      container: domNode,
      map: {
        basemap: "streets-night-vector",
      },
      zoom: 19,
      center: [-105.12133, 39.97018]
      // zoomed center: [-105.12132251901546, 39.97027048328751]
    });

    const evacueeLayer = new FeatureLayer({
      url: baseUrl + "/0"
    });
    const exitsLayer = new FeatureLayer({
      url: baseUrl + "/1"
    });
    const initialRouteLayer = new FeatureLayer({
      url: baseUrl + "/3"
    });
    const initialRoutePlusLayer = new FeatureLayer({
      url: baseUrl + "/5"
    });
    const editedRouteLayer = new FeatureLayer({
      url: baseUrl + "/2"
    });
    const editedRoutePlusLayer = new FeatureLayer({
      url: baseUrl + "/4"
    });
    const pathwaysLayer = new FeatureLayer({
      url: baseUrl + "/6"
    });
    const hallwayBlockedLayer = new FeatureLayer({
      url: baseUrl + "/7"
    });
    const geofenceLayer = new FeatureLayer({
      url: baseUrl + "/8"
    });
    const roomsLayer = new FeatureLayer({
      url: baseUrl + "/9"
    });

    view.map.add(geofenceLayer, 0);
    view.map.add(pathwaysLayer, 0);
    view.map.add(exitsLayer);
    view.map.add(evacueeLayer);
    view.map.add(initialRouteLayer);
    view.map.add(initialRoutePlusLayer);
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

  <input id="next" type="button" value=">" onclick="">
    <button class="btn-next"> </button>
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