package local.exercises;

class FibonacciNumber {
  private int indexOfSequence = 0;

  public FibonacciNumber(int index) {
    this.indexOfSequence = index;
  }

  public int evaluteByIndex() {
    if (this.indexOfSequence == 0 || this.indexOfSequence == 1) return this.indexOfSequence;

    int fnd = 0, snd = 1, currentIndex = 1;

    while (currentIndex++ < this.indexOfSequence) {
      int sum = fnd + snd;
      fnd = snd;
      snd = sum;
    }

    return snd;
  }
}
