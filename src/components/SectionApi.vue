<template >

        
    <div class="row mt-md-3 mt-sm-3 mt-xs-3 mb-md-3 mb-sm-3 mb-xs-3 text-white bg-info">
        <div class="col-lg-6 col-xs-12" v-for="(product,index) of products" :key="index">
                <div class="d-flex justify-content-center" >
                    <div class="p-3">
                        <div class="imagen">
                            <img :src="product.image" alt="image" heigth="200px" width="220px">
                        </div>
                        
                    </div>
                    <div class="p-2">
                        <div class="titulo-product">
                            <h3>{{product.title}}</h3>
                        </div>
                        <p class="text-justify">
                            
                            <span></span> {{product.some_description}}
                            <br>
                            <span>Precio: ${{product.price}} COP</span> 
                            <br>
                            <span>Solo por hoy: </span>
                            <br>
                            <span>{{product.discount}} % de descuento</span> 
                            <br>
                            <br>
                            <button type="button" target="_blank" class="btn btn-light ">Comprar</button>
                    
                
                        </p>
                    </div>
                </div>
                
                
    </div>
</div>

    
</template>

<script>

import axios from "axios"
export default {
    name: "SectionApi",
    data(){
        return{
            products:null
        }
    },
    mounted(){
        axios.get(`http://localhost:8080/api/list`)
        .then(response=>{
            (this.products = response.data);
            console.log(this.products);
        })
    }
}
</script>
<style scoped>
    
</style>