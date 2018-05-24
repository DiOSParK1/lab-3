import javax.swing.*;
/**
*метод для выбора параметров TitlesFrame
*/
class TitlesFrame extends JFrame
{
  private TitlesFrame()
  {
    initUI();
  }
  
  private void initUI()
  {
    setTitle("Кривые фигуры");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    add(new TitlesPanel(17));
    setSize(350, 350);
    setLocationRelativeTo(null);
  }
  /**
  * Метод main для запуска программы
  */
  public static void main(String[] args)
  {
    javax.swing.SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        TitlesFrame ps = new TitlesFrame();
        ps.setVisible(true);
      }
    });
  }
}
