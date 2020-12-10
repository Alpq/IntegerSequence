// Thank you to Reng Zheng and Steven Lei for helping with Test Cases!
import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    currentIndex = 0;
    data = other;
  }
  public ArraySequence(IntegerSequence other){
    currentIndex = 0;
    data = new int[other.length()];
    int i = 0;
    other.reset();
    while (other.hasNext())
    {
      data[i] = other.next();
      i ++;
    }
    other.reset();
  }
  public boolean hasNext()//does the sequence have more elements?
  {
    return this.currentIndex < this.data.length;
  }
  public int next()         //return the current value in the sequence and advances to the next element
  {
    if (this.hasNext()) {currentIndex ++;}
    else {throw new NoSuchElementException();}
    return data[currentIndex - 1];
  }
  public int length()     //returns the total length of the sequence
  {
    return this.data.length;
  }
  public void reset()     //start over from the start of the sequence
  {
    this.currentIndex = 0;
  }
}
