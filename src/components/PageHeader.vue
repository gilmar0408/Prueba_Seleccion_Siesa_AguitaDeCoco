<template>
     <!-- Sección 1 -->
    <div class="seccion-superior">
        <header class="header">
            <div class="barra">

                <nav class="contenedor-menu navbar navbar-expand-lg sticky-top navbar-dark bg-dark">

                    <div class="titulo-principal">
                        <a class="bg-dark w-100 navbar-brand " href="# ">
                            <img src="../assets/logo.png" width="30 " height="30
                            " class="d-inline-block align-top " alt=" " loading="lazy "> Aguita de Coco
                        </a>
                    </div>
                    <div class="collapse navbar-collapse justify-content-end " id="navbarNav ">

                        <ul class="menu-principal navbar-nav">
                            <li class="menu-principal__item nav-item"><a class="nav-link" href="">Inicio</a></li>
                           
                            <li class="menu-principal__item nav-item"><a class="nav-link" href="#api">API</a></li>
                        </ul>
                    </div>
                </nav>

            </div>

            <div class="banner">
                
                <img class="banner__imagen w-100" src="../assets/banner_coco_2.png" alt="Imagen banner" width="1200px"
                    height="350px">
            </div>

        </header>
    </div>
    <!-- Fin Sección 1 -->
</template>

<script>
export default {
    name: "PageHeader"
    
}
</script>

<style scoped>

</style>