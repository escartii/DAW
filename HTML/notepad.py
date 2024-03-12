import tkinter as tk
from tkinter import filedialog

def guardar_archivo():
    archivo = filedialog.asksaveasfile(mode='w', defaultextension=".txt")
    if archivo is None:
        return
    texto = str(entry.get(1.0, tk.END))
    archivo.write(texto)
    archivo.close()

def abrir_archivo():
    archivo = filedialog.askopenfile(mode='r')
    if archivo is not None:
        contenido = archivo.read()
        entry.delete(1.0, tk.END)
        entry.insert(1.0, contenido)

# Crear la ventana principal
ventana = tk.Tk()
ventana.title("Mi Notepad") 
ventana.configure(bg='#111111')  # Fondo negro oscuro

# Estilo de la fuente
font_family = "Cascadia Code"
font_size = 14

# Crear el widget de texto
entry = tk.Text(ventana, bg='#111111', fg='white', font=(font_family, font_size))
entry.pack(expand=True, fill='both')

# Menú
barra_menu = tk.Menu(ventana)
ventana.config(menu=barra_menu)

archivo_menu = tk.Menu(barra_menu, tearoff=0)
barra_menu.add_cascade(label="Archivo", menu=archivo_menu)
archivo_menu.add_command(label="Abrir", command=abrir_archivo)
archivo_menu.add_command(label="Guardar", command=guardar_archivo)
archivo_menu.add_separator()
archivo_menu.add_command(label="Salir", command=ventana.quit)

# Ejecutar la ventana
ventana.mainloop()
