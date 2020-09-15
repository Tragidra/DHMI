/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

class Rectangle{
    public int rectNum;
    public double lx;
    public double ly;
    public double rx;
    public double ry;
   public Rectangle(int rN, double lx, double ly, double rx, double ry) {
       this.rectNum = rN;
       this.lx = lx;
       this.ly = ly;
       this.rx = rx;
       this.ry = ry;
      
   }
   
}
public class Rab {
private static String anno = "Привет! Спасибо, что решил воспользоваться приложением Прямоугльный Мир от компании LogSys! Только в нашем приложении на основе инновационных технологий наших западных партнёров и собственных прогрессивных отечественных разработок была реализована возможность моментального анализа любой точки пространства и её проверка на принадлежность к прямоугольникам!";
private static String pomoch = "Доступные параметры:"
        + "-h - вывод краткой справки"
        + " -help - вывод развёрнутой справочной информации"
        + " /? – аналог -help"
        + " Коордиаты точек/вершин прямоугольника вводятся в формате Значение координаты X | Значение координаты Y"
        + " Перед использованием программы Автор настоятельно рекомендует просмотреть Рисунок к программе, который находится в приложении.";
    public static void main(String[] args){
     double x = 0;
     double y = 0;
     if(args.length == 0){
         System.out.println(anno);
     }
     for (int i = 0; i < args.length; i++){
        System.out.println(args[i]);
        if(i < 1){
        System.out.println(anno);
        }
     if( args[i].equals("-help") || args[i].equals("/?")){
        System.out.println(pomoch);
     }
     if(args[i].toLowerCase().equals("-x")){
                try {
                    x = Double.parseDouble(args[i+1]);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка ввода числа x: " + args[i+1] + "задан неверно, десятичные числа вводятся через точку");
                    return;
                }
            }
            
            if(args[i].toLowerCase().equals("-y")){
                try {
                    y = Double.parseDouble(args[i+1]);
                } catch (NumberFormatException e) {
                     System.out.println("Ошибка ввода числа y: " + args[i+1] + "задан неверно, десятичные числа вводятся через точку");
                    return;
                }   
            }
        }   
     Rectangle[]z = new Rectangle[3];
     z[0] = new Rectangle(0,0,0,100.0,100.0);
     z[1] = new Rectangle(1,1.0,1.0,7.0,8.0);
     z[2] = new Rectangle(2,1.5,2.5,10.5,10.5);
     for(int i = z.length-1; i>-1; i--){
         if(x>=z[i].lx && x<=z[i].rx && y>=z[i].ly && y <=z[i].ry){
                 System.out.println("Точка лежит в прямоугольнике" + z[i].rectNum);
                 return;
         }else{
          System.out.println("Точка не лежит в прямоугольнике" + z[i].rectNum);
         }
    }
}
}

