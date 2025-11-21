public class Universidad {

    public static void main(String[] args) {

        //Crear un objeto de la clase Alumno
        Alumno alumno = new Alumno();
        alumno.incripcionCurso();
        alumno.inscripcionTaller();

        System.out.println("Mensualidad:  " + alumno.pagoMensualidad());

        //Crear un segundo alumno
        Alumno alumno2 = new Alumno();
        alumno2.incripcionCurso();
        alumno2.pagoMensualidad();
        alumno2.inscripcionTaller();

        //
        Docente docente = new Docente();
        docente.asignarCalificacion();

    }
}

