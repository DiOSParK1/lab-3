import javax.swing.JFrame;
/**
*метод для выбора параметров TitlesFrame
*/
public class TitlesFrame extends JFrame
{
  public TitlesFrame()
  {
    initUI();
  }
  
  private void initUI()
  {
    setTitle("Кривые фигуры");
    setDefaultCloseOperation(3);
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
