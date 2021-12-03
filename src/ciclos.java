public class ciclos {
    //Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros números impares.
    public static void main(String[] args) {


        long producto = 1;

        for (int i=1 ; i<=20 ; i+=2){
                producto = 1;
            producto *=i;
        }

        System.out.println("El producto es:"+producto);

    }

}
