package com.example.proyectocasifull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_calc_panels extends AppCompatActivity {

    Bundle bundle;
    TextView verm;
    boolean mostrarPaneles = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calc_panels);
        ///Extrae el dato calculado de la otra activity
        verm=(TextView)findViewById(R.id.textViewVerMas);
        bundle = getIntent().getExtras();
        String dato1 = bundle.getString("mes1P");
        String dato2 = bundle.getString("mes2P");
        String dato3 = bundle.getString("mes3P");
        double info = Double.parseDouble(dato1);
        double info2 = Double.parseDouble(dato2);
        double info3 = Double.parseDouble(dato3);

        double calcular = (info+info2+info3)/3;

        if (calcular<=360){
            ImageView imageView = findViewById(R.id.imgpanel1); // Obtener la referencia al ImageView del diseño XML
            imageView.setImageResource(R.drawable.panel1); // Asignar la imagen al ImageView
            TextView pnel1 = (TextView)findViewById(R.id.primerPanel);
            pnel1.setText("Panel 1: "+panel1());
            verm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mostrarPaneles) {
                        // mostrar los paneles

                        TextView pnel2 = (TextView)findViewById(R.id.segundoPanel);
                        pnel2.setVisibility(View.VISIBLE);
                        ImageView img2=(ImageView)findViewById(R.id.imgpanel2);
                        img2.setVisibility(View.VISIBLE);
                        ImageView imageView = findViewById(R.id.imgpanel2);
                        imageView.setImageResource(R.drawable.panel2);
                        pnel2.setText("Panel 2: "+panel2());

                        TextView pnel3 = (TextView)findViewById(R.id.tercerPanel);
                        pnel3.setVisibility(View.VISIBLE);
                        pnel3.setText("Panel 3: "+panel3());
                        ImageView img3=(ImageView)findViewById(R.id.imgpanel3);
                        img3.setVisibility(View.VISIBLE);
                        ImageView imageView3 = findViewById(R.id.imgpanel3);
                        imageView3.setImageResource(R.drawable.panel3);

                        TextView pnel4 = (TextView)findViewById(R.id.cuartoPanel);
                        pnel4.setVisibility(View.VISIBLE);
                        pnel4.setText("Panel 4: "+panel4());
                        ImageView img4=(ImageView)findViewById(R.id.imgpanel4);
                        img4.setVisibility(View.VISIBLE);
                        ImageView imageView4 = findViewById(R.id.imgpanel4);
                        imageView4.setImageResource(R.drawable.panel4);

                        TextView pnel5 = (TextView)findViewById(R.id.quintoPanel);
                        pnel5.setVisibility(View.VISIBLE);
                        pnel5.setText("Panel 5: "+panel5());
                        ImageView img5=(ImageView)findViewById(R.id.imgpanel5);
                        img5.setVisibility(View.VISIBLE);
                        ImageView imageView5 = findViewById(R.id.imgpanel5);
                        imageView5.setImageResource(R.drawable.panel5);

                        // cambiar el texto del botón
                        verm.setText("Ocultar opciones");

                        // actualizar el estado de la variable
                        mostrarPaneles = false;
                    } else {
                        // ocultar los paneles
                        TextView pnel2 = (TextView)findViewById(R.id.segundoPanel);
                        pnel2.setVisibility(View.GONE);
                        ImageView img2=(ImageView)findViewById(R.id.imgpanel2);
                        img2.setVisibility(View.GONE);
                        TextView pnel3 = (TextView)findViewById(R.id.tercerPanel);
                        pnel3.setVisibility(View.GONE);
                        ImageView img3=(ImageView)findViewById(R.id.imgpanel3);
                        img3.setVisibility(View.GONE);
                        TextView pnel4 = (TextView)findViewById(R.id.cuartoPanel);
                        pnel4.setVisibility(View.GONE);
                        ImageView img4=(ImageView)findViewById(R.id.imgpanel4);
                        img4.setVisibility(View.GONE);
                        TextView pnel5 = (TextView)findViewById(R.id.quintoPanel);
                        pnel5.setVisibility(View.GONE);
                        ImageView img5=(ImageView)findViewById(R.id.imgpanel5);
                        img5.setVisibility(View.GONE);

                        // cambiar el texto del botón
                        verm.setText("Ver más opciones");

                        // actualizar el estado de la variable
                        mostrarPaneles = true;
                    }


                }
            });
            
        } else if (calcular>360 && calcular<=720 ) {

            ImageView imageView = findViewById(R.id.imgpanel1);
            imageView.setImageResource(R.drawable.panel2);
            TextView pnel1 = (TextView)findViewById(R.id.primerPanel);
            pnel1.setText("Panel 1: "+panel2());

            verm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mostrarPaneles) {
                        //mostrar img de los paneles
                        ImageView img1=(ImageView)findViewById(R.id.imgpanel2);
                        img1.setVisibility(View.VISIBLE);
                        ImageView imageView = findViewById(R.id.imgpanel2);
                        imageView.setImageResource(R.drawable.panel1);
                        ImageView img3=(ImageView)findViewById(R.id.imgpanel3);
                        img3.setVisibility(View.VISIBLE);
                        ImageView imageView3 = findViewById(R.id.imgpanel3);
                        imageView3.setImageResource(R.drawable.panel3);
                        ImageView img4=(ImageView)findViewById(R.id.imgpanel4);
                        img4.setVisibility(View.VISIBLE);
                        ImageView imageView4 = findViewById(R.id.imgpanel4);
                        imageView4.setImageResource(R.drawable.panel4);
                        ImageView img5=(ImageView)findViewById(R.id.imgpanel5);
                        img5.setVisibility(View.VISIBLE);
                        ImageView imageView5 = findViewById(R.id.imgpanel5);
                        imageView5.setImageResource(R.drawable.panel5);

                        // mostrar info de los paneles
                        TextView pnel2 = (TextView)findViewById(R.id.segundoPanel);
                        pnel2.setVisibility(View.VISIBLE);
                        pnel2.setText("Panel 2: "+panel1());
                        TextView pnel3 = (TextView)findViewById(R.id.tercerPanel);
                        pnel3.setVisibility(View.VISIBLE);
                        pnel3.setText("Panel 3: "+panel3());
                        TextView pnel4 = (TextView)findViewById(R.id.cuartoPanel);
                        pnel4.setVisibility(View.VISIBLE);
                        pnel4.setText("Panel 4: "+panel4());
                        TextView pnel5 = (TextView)findViewById(R.id.quintoPanel);
                        pnel5.setVisibility(View.VISIBLE);
                        pnel5.setText("Panel 5: "+panel5());


                        // cambiar el texto del botón
                        verm.setText("Ocultar opciones");

                        // actualizar el estado de la variable
                        mostrarPaneles = false;
                    } else {
                        //ocultar imagenes
                        ImageView img1=(ImageView)findViewById(R.id.imgpanel2);
                        img1.setVisibility(View.GONE);
                        ImageView img3=(ImageView)findViewById(R.id.imgpanel3);
                        img3.setVisibility(View.GONE);
                        ImageView img4=(ImageView)findViewById(R.id.imgpanel4);
                        img4.setVisibility(View.GONE);
                        ImageView img5=(ImageView)findViewById(R.id.imgpanel5);
                        img5.setVisibility(View.GONE);
                        // ocultar los paneles
                        TextView pnel2 = (TextView)findViewById(R.id.segundoPanel);
                        pnel2.setVisibility(View.GONE);
                        TextView pnel3 = (TextView)findViewById(R.id.tercerPanel);
                        pnel3.setVisibility(View.GONE);
                        TextView pnel4 = (TextView)findViewById(R.id.cuartoPanel);
                        pnel4.setVisibility(View.GONE);
                        TextView pnel5 = (TextView)findViewById(R.id.quintoPanel);
                        pnel5.setVisibility(View.GONE);

                        // cambiar el texto del botón
                        verm.setText("Ver más opciones");

                        // actualizar el estado de la variable
                        mostrarPaneles = true;
                    }


                }
            });

        } else if (calcular>720 && calcular<=1152) {
            TextView pnel1 = (TextView)findViewById(R.id.primerPanel);
            pnel1.setText("Panel 1: "+panel3());
            ImageView imageView = findViewById(R.id.imgpanel1);
            imageView.setImageResource(R.drawable.panel3);
            verm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mostrarPaneles) {
                        //mostrar img de los paneles
                        ImageView img1=(ImageView)findViewById(R.id.imgpanel2);
                        img1.setVisibility(View.VISIBLE);
                        ImageView imageView = findViewById(R.id.imgpanel2);
                        imageView.setImageResource(R.drawable.panel1);
                        ImageView img2=(ImageView)findViewById(R.id.imgpanel3);
                        img2.setVisibility(View.VISIBLE);
                        ImageView imageView3 = findViewById(R.id.imgpanel3);
                        imageView3.setImageResource(R.drawable.panel2);

                        ImageView img4=(ImageView)findViewById(R.id.imgpanel4);
                        img4.setVisibility(View.VISIBLE);
                        ImageView imageView4 = findViewById(R.id.imgpanel4);
                        imageView4.setImageResource(R.drawable.panel4);
                        ImageView img5=(ImageView)findViewById(R.id.imgpanel5);
                        img5.setVisibility(View.VISIBLE);
                        ImageView imageView5 = findViewById(R.id.imgpanel5);
                        imageView5.setImageResource(R.drawable.panel5);
                        // mostrar los paneles
                        TextView pnel2 = (TextView)findViewById(R.id.segundoPanel);
                        pnel2.setVisibility(View.VISIBLE);
                        pnel2.setText("Panel 2: "+panel1());
                        TextView pnel3 = (TextView)findViewById(R.id.tercerPanel);
                        pnel3.setVisibility(View.VISIBLE);
                        pnel3.setText("Panel 3: "+panel2());
                        TextView pnel4 = (TextView)findViewById(R.id.cuartoPanel);
                        pnel4.setVisibility(View.VISIBLE);
                        pnel4.setText("Panel 4: "+panel4());
                        TextView pnel5 = (TextView)findViewById(R.id.quintoPanel);
                        pnel5.setVisibility(View.VISIBLE);
                        pnel5.setText("Panel 5: "+panel5());

                        // cambiar el texto del botón
                        verm.setText("Ocultar opciones");

                        // actualizar el estado de la variable
                        mostrarPaneles = false;
                    } else {
                        //ocultar imagenes
                        ImageView img1=(ImageView)findViewById(R.id.imgpanel2);
                        img1.setVisibility(View.GONE);
                        ImageView img2=(ImageView)findViewById(R.id.imgpanel3);
                        img2.setVisibility(View.GONE);
                        ImageView img4=(ImageView)findViewById(R.id.imgpanel4);
                        img4.setVisibility(View.GONE);
                        ImageView img5=(ImageView)findViewById(R.id.imgpanel5);
                        img5.setVisibility(View.GONE);
                        // ocultar los paneles
                        TextView pnel2 = (TextView)findViewById(R.id.segundoPanel);
                        pnel2.setVisibility(View.GONE);
                        TextView pnel3 = (TextView)findViewById(R.id.tercerPanel);
                        pnel3.setVisibility(View.GONE);
                        TextView pnel4 = (TextView)findViewById(R.id.cuartoPanel);
                        pnel4.setVisibility(View.GONE);
                        TextView pnel5 = (TextView)findViewById(R.id.quintoPanel);
                        pnel5.setVisibility(View.GONE);

                        // cambiar el texto del botón
                        verm.setText("Ver más opciones");

                        // actualizar el estado de la variable
                        mostrarPaneles = true;
                    }


                }
            });
            
        } else if (calcular>1152 && calcular<=2304) {
            TextView pnel1 = (TextView)findViewById(R.id.primerPanel);
            pnel1.setText("Panel 1: "+panel4());
            ImageView imageView = findViewById(R.id.imgpanel1);
            imageView.setImageResource(R.drawable.panel4);
            verm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mostrarPaneles) {
                        //mostrar img de los paneles
                        ImageView img1=(ImageView)findViewById(R.id.imgpanel2);
                        img1.setVisibility(View.VISIBLE);
                        ImageView imageView = findViewById(R.id.imgpanel2);
                        imageView.setImageResource(R.drawable.panel1);
                        ImageView img2=(ImageView)findViewById(R.id.imgpanel3);
                        img2.setVisibility(View.VISIBLE);
                        ImageView imageView3 = findViewById(R.id.imgpanel3);
                        imageView3.setImageResource(R.drawable.panel2);
                        ImageView img3=(ImageView)findViewById(R.id.imgpanel4);
                        img3.setVisibility(View.VISIBLE);
                        ImageView imageView4 = findViewById(R.id.imgpanel4);
                        imageView4.setImageResource(R.drawable.panel3);
                        ImageView img5=(ImageView)findViewById(R.id.imgpanel5);
                        img5.setVisibility(View.VISIBLE);
                        ImageView imageView5 = findViewById(R.id.imgpanel5);
                        imageView5.setImageResource(R.drawable.panel5);
                        // mostrar los paneles
                        TextView pnel2 = (TextView)findViewById(R.id.segundoPanel);
                        pnel2.setVisibility(View.VISIBLE);
                        pnel2.setText("Panel 2: "+panel1());
                        TextView pnel3 = (TextView)findViewById(R.id.tercerPanel);
                        pnel3.setVisibility(View.VISIBLE);
                        pnel3.setText("Panel 3: "+panel2());
                        TextView pnel4 = (TextView)findViewById(R.id.cuartoPanel);
                        pnel4.setVisibility(View.VISIBLE);
                        pnel4.setText("Panel 4: "+panel3());
                        TextView pnel5 = (TextView)findViewById(R.id.quintoPanel);
                        pnel5.setVisibility(View.VISIBLE);
                        pnel5.setText("Panel 5: "+panel5());

                        // cambiar el texto del botón
                        verm.setText("Ocultar opciones");

                        // actualizar el estado de la variable
                        mostrarPaneles = false;
                    } else {
                        //ocultar imagenes
                        ImageView img1=(ImageView)findViewById(R.id.imgpanel2);
                        img1.setVisibility(View.GONE);
                        ImageView img2=(ImageView)findViewById(R.id.imgpanel3);
                        img2.setVisibility(View.GONE);
                        ImageView img3=(ImageView)findViewById(R.id.imgpanel4);
                        img3.setVisibility(View.GONE);
                        ImageView img5=(ImageView)findViewById(R.id.imgpanel5);
                        img5.setVisibility(View.GONE);
                        // ocultar los paneles
                        TextView pnel2 = (TextView)findViewById(R.id.segundoPanel);
                        pnel2.setVisibility(View.GONE);
                        TextView pnel3 = (TextView)findViewById(R.id.tercerPanel);
                        pnel3.setVisibility(View.GONE);
                        TextView pnel4 = (TextView)findViewById(R.id.cuartoPanel);
                        pnel4.setVisibility(View.GONE);
                        TextView pnel5 = (TextView)findViewById(R.id.quintoPanel);
                        pnel5.setVisibility(View.GONE);

                        // cambiar el texto del botón
                        verm.setText("Ver más opciones");

                        // actualizar el estado de la variable
                        mostrarPaneles = true;
                    }


                }
            });
        } else if (calcular>2304) {
            TextView pnel1 = (TextView)findViewById(R.id.primerPanel);
            pnel1.setText("Panel 1: "+panel5());
            ImageView imageView = findViewById(R.id.imgpanel1);
            imageView.setImageResource(R.drawable.panel5);
            verm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mostrarPaneles) {
                        //mostrar img de los paneles
                        ImageView img1=(ImageView)findViewById(R.id.imgpanel1);
                        img1.setVisibility(View.VISIBLE);
                        ImageView imageView = findViewById(R.id.imgpanel2);
                        imageView.setImageResource(R.drawable.panel1);
                        ImageView img2=(ImageView)findViewById(R.id.imgpanel2);
                        img2.setVisibility(View.VISIBLE);
                        ImageView imageView3 = findViewById(R.id.imgpanel3);
                        imageView3.setImageResource(R.drawable.panel2);
                        ImageView img3=(ImageView)findViewById(R.id.imgpanel3);
                        img3.setVisibility(View.VISIBLE);
                        ImageView imageView4 = findViewById(R.id.imgpanel4);
                        imageView4.setImageResource(R.drawable.panel3);
                        ImageView img4=(ImageView)findViewById(R.id.imgpanel4);
                        img4.setVisibility(View.VISIBLE);
                        ImageView imageView5 = findViewById(R.id.imgpanel5);
                        imageView5.setImageResource(R.drawable.panel4);
                        // mostrar los paneles
                        TextView pnel2 = (TextView)findViewById(R.id.segundoPanel);
                        pnel2.setVisibility(View.VISIBLE);
                        pnel2.setText("Panel 2: "+panel1());
                        TextView pnel3 = (TextView)findViewById(R.id.tercerPanel);
                        pnel3.setVisibility(View.VISIBLE);
                        pnel3.setText("Panel 3: "+panel2());
                        TextView pnel4 = (TextView)findViewById(R.id.cuartoPanel);
                        pnel4.setVisibility(View.VISIBLE);
                        pnel4.setText("Panel 4: "+panel3());
                        TextView pnel5 = (TextView)findViewById(R.id.quintoPanel);
                        pnel5.setVisibility(View.VISIBLE);
                        pnel5.setText("Panel 5: "+panel4());

                        // cambiar el texto del botón
                        verm.setText("Ocultar opciones");

                        // actualizar el estado de la variable
                        mostrarPaneles = false;
                    } else {
                        //ocultar imagenes
                        ImageView img1=(ImageView)findViewById(R.id.imgpanel1);
                        img1.setVisibility(View.GONE);
                        ImageView img2=(ImageView)findViewById(R.id.imgpanel2);
                        img2.setVisibility(View.GONE);
                        ImageView img3=(ImageView)findViewById(R.id.imgpanel3);
                        img3.setVisibility(View.GONE);
                        ImageView img4=(ImageView)findViewById(R.id.imgpanel4);
                        img4.setVisibility(View.GONE);
                        // ocultar los paneles
                        TextView pnel2 = (TextView)findViewById(R.id.segundoPanel);
                        pnel2.setVisibility(View.GONE);
                        TextView pnel3 = (TextView)findViewById(R.id.tercerPanel);
                        pnel3.setVisibility(View.GONE);
                        TextView pnel4 = (TextView)findViewById(R.id.cuartoPanel);
                        pnel4.setVisibility(View.GONE);
                        TextView pnel5 = (TextView)findViewById(R.id.quintoPanel);
                        pnel5.setVisibility(View.GONE);

                        // cambiar el texto del botón
                        verm.setText("Ver más opciones");

                        // actualizar el estado de la variable
                        mostrarPaneles = true;
                    }


                }
            });
        }


    }
    public String panel1(){
        String info = "panel: (144<360 Kwh)\n\n" +
                "El panel solar que te recomendamos para tu hogar es:\n" +
                "KIT 144KWH SISTEMA FOTOVOLTAICO EN RED\n" +
                "Precio: $1999.99\n" +
                "Detalles:\n" +
                "• Genera hasta 144kWh/mes\n" +
                "• 2 Panel LED 400W Mono\n" +
                "• Inversor Solar 1000 Watts\n" +
                "• Incluye 5 años garantía\n" +
                "• Incluye instalación básica\n" +
                "• Rieles y accesorios para montaje de techo con anclas\n" +
                "• Documentación cambio medidor\n";
        return info;
    }
    public String panel2(){
        String info="(360<720 kwh)\n\n"+

                "KIT 360KWH SISTEMA FOTOVOLTAICO EN RED\n"+
                "Precio: $3637.99\n"+
                "Detalles:\n"+
                "• Genera hasta 360kWh/mes\n"+
                "• Panel LED 400W Mono\n"+
                "• Inversor Solar 2000 Watts\n "+
                "• Incluye 5 años garantía\n"+
                "• Incluye instalación básica\n"+
                "• Rieles y accesorios para montaje de techo con anclas\n";
        return info;
    }
    public String panel3(){
        String info="(720<1152 kwh)\n\n"+

                "KIT 720KWH SISTEMA FOTOVOLTIACO EN RED\n"+
                "Precio: $6769.99\n"+
                "Detalles:\n"+
                "• Genera hasta 720kWh/mes\n"+
                "• Panel LED 400W Mono\n"+
                "• Inversor Solar 3600 Watts\n "+
                "• Incluye 5 años garantía\n"+
                "• Incluye instalación básica\n"+
                "• Rieles y accesorios para montaje de techo con anclas\n";
        return info;
    }
    public String panel4(){
        String info="(1152<2304 kwh)\n\n"+

                "KIT 1152KWH SISTEMA FOTOVOLTAICO EN RED\n"+
                "Precio: $11,113.99\n\n"+
                "Detalles:\n"+
                "• Genera hasta 1152kWh/mes\n"+
                "• Panel LED 400W Mono\n"+
                "• Inversor Solar 6000 Watts\n "+
                "• Incluye 5 años garantía\n"+
                "• Incluye instalación básica\n"+
                "• Rieles y accesorios para montaje de techo con anclas\n";
        return info;
    }
    public String panel5(){
        String info ="(2304<infinito)\n\n"+
                "KIT 2304KWH SISTEMA FOTOVOLTAICO EN RED\n"+
                "Precio: $23,439.99\n\n"+
                "Detalles:\n"+
                "• Genera hasta 2304kWh/mes\n"+
                "• Panel LED 400W Mono\n"+
                "• Inversor Solar 3600 Watts\n "+
                "• Incluye 5 años garantía\n"+
                "• Incluye instalación básica\n"+
                "• Rieles y accesorios para montaje de techo con anclasn\n";
        return info;
    }

   /* public void mostrarImagen2(Context context, ImageView imageView) {
        // Código para obtener la imagen
        Drawable drawable = context.getResources().getDrawable(R.drawable.panel2);

        // Código para establecer la imagen en el ImageView
        imageView.setImageDrawable(drawable);

    }
    private void showImage() {
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.panel2);

        setContentView(imageView);
    }

    public void mostrarImagen1() {
        String var="";
        ImageView imageView = findViewById(R.id.imgpanel1); // Obtener la referencia al ImageView del diseño XML
        imageView.setImageResource(R.drawable.panel1); // Asignar la imagen al ImageView
    }
    public void mostrarImagen2() {

        ImageView imageView = findViewById(R.id.imgpanel1); // Obtener la referencia al ImageView del diseño XML
        imageView.setImageResource(R.drawable.panel2); // Asignar la imagen al ImageView
    }
    public void mostrarImagen3() {
        ImageView imageView = findViewById(R.id.imgpanel3); // Obtener la referencia al ImageView del diseño XML
        imageView.setImageResource(R.drawable.panel3); // Asignar la imagen al ImageView
    }
    public void mostrarImagen4() {
        ImageView imageView = findViewById(R.id.imgpanel4); // Obtener la referencia al ImageView del diseño XML
        imageView.setImageResource(R.drawable.panel4); // Asignar la imagen al ImageView
    }
    public void mostrarImagen5() {
        ImageView imageView = findViewById(R.id.imgpanel5); // Obtener la referencia al ImageView del diseño XML
        imageView.setImageResource(R.drawable.panel5); // Asignar la imagen al ImageView
    }*/


}