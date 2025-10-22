import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class tankDriveTutorial extends OpMode {

    DcMotor leftFront;
    DcMotor rightFront;
    DcMotor leftBack;
    DcMotor rightBack;

    @Override
    public void init() {
        leftFront = hardwareMap.get(DcMotor.class,"leftFront");
    }

    @Override
    public void loop() {

    }
}
