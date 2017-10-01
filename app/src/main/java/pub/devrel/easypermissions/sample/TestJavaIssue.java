package pub.devrel.easypermissions.sample;

import android.support.annotation.NonNull;

import java.util.List;

import pub.devrel.easypermissions.EasyPermissions;

public class TestJavaIssue {

    public interface TestJavaCallbacks extends EasyPermissions.PermissionCallbacks {

        void onPermissionsGranted(int requestCode, List<String> perms);

        void onPermissionsDenied(int requestCode, List<String> perms);
    }

    public static void onRequestPermissionsResult(int requestCode,
                                                  @NonNull String[] permissions,
                                                  @NonNull int[] grantResults,
                                                  @NonNull Object... receivers) {
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, receivers);
    }
}
