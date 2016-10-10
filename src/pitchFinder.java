import java.util.Scanner;

public class pitchFinder
{
    private static final double REFERENCE = 440;

    private static final double REFERENCE_OCTAVE = 4;

    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("Please enter the note you'd like to see the pitch of: e.g. A_4");

            Scanner noteEntered = new Scanner(System.in);

            String note = noteEntered.next();

            String noteName = note.substring(0, 2);

            String noteOctave = note.substring(2);

            double numerator = 0;

            switch (noteName)
            {
                case "C_":
                    numerator = 3;
                    break;
                case "C#":
                    numerator = 4;
                    break;
                case "D_":
                    numerator = 5;
                    break;
                case "D#":
                    numerator = 6;
                    break;
                case "E_":
                    numerator = 7;
                    break;
                case "F_":
                    numerator = 8;
                    break;
                case "F#":
                    numerator = 9;
                    break;
                case "G_":
                    numerator = 10;
                    break;
                case "G#":
                    numerator = 11;
                    break;
                case "A_":
                    numerator = 12;
                    break;
                case "A#":
                    numerator = 1;
                    break;
                case "B_":
                    numerator = 2;
                    break;
            }

            double octaveMultiple = Math.pow(2, Double.parseDouble(noteOctave) - REFERENCE_OCTAVE);

            double frequency = Math.pow(2, numerator / 12) / 2 * REFERENCE * octaveMultiple;

            System.out.println("Note frequency is: " + frequency);
        }
    }
}