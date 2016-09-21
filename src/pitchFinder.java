import java.util.Scanner;

public class pitchFinder
{
    private static final double[] ratios = {0.5946035, 0.6299605, 0.66742, 0.707107, 0.7491535, 0.7937005,
            0.8408965, 0.8908985, 0.9438745, 1.0, 1.059463, 1.122462};
    private static final double REFERENCE = 440;

    private static final double REFERENCE_OCTAVE = 4;

    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("Please enter the note you'd like to see the pitch of: e.g. A_4");

            Scanner noteEntered = new Scanner(System.in);

            String note = noteEntered.next();

            String noteName = note.substring(0, 2);

            String noteOctave = note.substring(2);

            double freqMultiple = 0;

            switch (noteName)
            {
                case "C_":
                    freqMultiple = ratios[0];
                    break;
                case "C#":
                    freqMultiple = ratios[1];
                    break;
                case "D_":
                    freqMultiple = ratios[2];
                    break;
                case "D#":
                    freqMultiple = ratios[3];
                    break;
                case "E_":
                    freqMultiple = ratios[4];
                    break;
                case "F_":
                    freqMultiple = ratios[5];
                    break;
                case "F#":
                    freqMultiple = ratios[6];
                    break;
                case "G_":
                    freqMultiple = ratios[7];
                    break;
                case "G#":
                    freqMultiple = ratios[8];
                    break;
                case "A_":
                    freqMultiple = ratios[9];
                    break;
                case "A#":
                    freqMultiple = ratios[10];
                    break;
                case "B_":
                    freqMultiple = ratios[11];
                    break;
            }

            double octaveMultiple = 0;

            octaveMultiple = Math.pow(2, Double.parseDouble(noteOctave) - REFERENCE_OCTAVE);

            double frequency = REFERENCE * freqMultiple * octaveMultiple;

            System.out.println("Note frequency is: " + frequency);
        }
    }
}